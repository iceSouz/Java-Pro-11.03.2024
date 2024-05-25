package org.example;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class AnimalService {
    private List<Animal> animals;
    private AnimalSerializer animalSerializer;
    private File file;

    public AnimalService(AnimalSerializer animalSerializer, File file) {
        this.animalSerializer = animalSerializer;
        this.file = file;
        this.animals = new ArrayList<>(animalSerializer.deserialize(file));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Add a pet");
            System.out.println("2. View all pets");
            System.out.println("3. Remove a pet");
            System.out.println("4. Exit");
            System.out.print("Choose a menu option: ");

            int answer = getValidIntegerInput(scanner);

            switch (answer) {
                case 1 -> {
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal breed: ");
                    String breed = scanner.nextLine();
                    System.out.print("Enter animal age: ");
                    int age = getValidIntegerInput(scanner);
                    addPet(new Animal(name, breed, age));
                }
                case 2 -> showAllPets();
                case 3 -> {
                    System.out.print("Enter the name of the animal to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (removePet(nameToRemove)) {
                        System.out.println("Animal " + nameToRemove + " removed from the shelter.");
                    } else {
                        System.out.println("Animal with name " + nameToRemove + " not found in the shelter.");
                    }
                }
                case 4 -> {
                    saveChanges();
                    isRunning = false;
                }
                default -> System.out.println("Unknown option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }

    private int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    public boolean addPet(Animal animal) {
        return animals.add(animal);
    }

    public void showAllPets() {
        if (animals == null || animals.isEmpty()) {
            System.out.println("There are no animals in the shelter.");
        } else {
            System.out.println("List of all animals in the shelter:");
            animals.forEach(System.out::println);
        }
    }

    public boolean removePet(String name) {
        return animals.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
    }

    public void saveChanges() {
        animalSerializer.serialize(file, animals);
    }
}
