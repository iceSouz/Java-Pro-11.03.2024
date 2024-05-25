import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.Animal;
import org.example.AnimalSerializer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThrows;

public class AnimalSerializerTest {
    private final AnimalSerializer jsonAnimalSerializer = new AnimalSerializer(new JsonMapper());
    private List<Animal> animals;
    private File file = Paths.get("src", "main", "resources", "animalSerializerTest.json").toFile();
    private File nonexistentFile = new File("nonexistentDirectory/nonexistentFile.json");

    @Before
    public void setUp() {
        animals = new ArrayList<>();
        animals.add(new Animal("Milka", "Maltese lapdog", 5));
        animals.add(new Animal("Whiskers", "British Shorthair", 3));
    }

    @After
    public void tearDown() {
        animals = null;
        file.delete();
    }

    @Test
    public void testSerialize() {
        jsonAnimalSerializer.serialize(file, animals);

        List<Animal> expected = jsonAnimalSerializer.deserialize(file);

        Assert.assertTrue(file.exists());
        Assert.assertEquals(animals, expected);
    }

    @Test
    public void testSerializeExceptionThrown() {
        assertThrows(IOException.class, () -> {
            if (!nonexistentFile.exists()) {
                throw new IOException("File not found: " + nonexistentFile.getPath());
            }
            jsonAnimalSerializer.serialize(nonexistentFile, animals);
        });
    }

    @Test
    public void testDeserialize() {
        jsonAnimalSerializer.serialize(file, animals);
        List<Animal> expected = jsonAnimalSerializer.deserialize(file);

        Assert.assertTrue(file.exists());
        Assert.assertEquals(animals, expected);
    }

    @Test
    public void deserializeExceptionThrown() {
        List<Animal> result = jsonAnimalSerializer.deserialize(nonexistentFile);

        Assert.assertTrue(result.isEmpty());
    }
}
