import org.example.Animal;
import org.example.AnimalSerializer;
import org.example.AnimalService;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AnimalServiceTest {

    private AnimalService animalService;
    private AnimalSerializer animalSerializer;
    private File file;

    @Before
    public void setUp() {
        animalSerializer = mock(AnimalSerializer.class);
        file = mock(File.class);
        when(animalSerializer.deserialize(file)).thenReturn(new ArrayList<>());
        animalService = new AnimalService(animalSerializer, file);
    }

    @Test
    public void testAddPet() {
        Animal animal = new Animal("Buddy", "Golden Retriever", 3);
        boolean added = animalService.addPet(animal);
        assertTrue(added);
        assertEquals(1, animalService.getAnimals().size());
        assertEquals("Buddy", animalService.getAnimals().get(0).getName());
    }

    @Test
    public void testShowAllPetsEmpty() {
        animalService.showAllPets();
    }

    @Test
    public void testShowAllPets() {
        Animal animal = new Animal("Buddy", "Golden Retriever", 3);
        animalService.addPet(animal);
        animalService.showAllPets();
    }

    @Test
    public void testRemovePet() {
        Animal animal = new Animal("Buddy", "Golden Retriever", 3);
        animalService.addPet(animal);
        boolean removed = animalService.removePet("Buddy");
        assertTrue(removed);
        assertTrue(animalService.getAnimals().isEmpty());
    }

    @Test
    public void testRemoveNonExistentPet() {
        boolean removed = animalService.removePet("Buddy");
        assertFalse(removed);
    }

    @Test
    public void testSaveChanges() {
        Animal animal = new Animal("Buddy", "Golden Retriever", 3);
        animalService.addPet(animal);
        animalService.saveChanges();
        verify(animalSerializer, times(1)).serialize(file, animalService.getAnimals());
    }
}