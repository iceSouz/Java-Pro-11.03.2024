package org.example;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;

public class App {
    public static void main(String[] args) {
        AnimalService service = new AnimalService(
                new AnimalSerializer(new JsonMapper()),
                new File("src/main/resources/animals.json")
        );

        service.run();
    }
}
