package phonebook;

import java.util.*;

public class PhoneBookTester {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[]{
                new Contact("Ronaldo"),
                new Contact("Ronaldo"),
                new Contact("Messi"),
                new Contact("Suarez")
        };
        PhoneBook phoneBook = new PhoneBook();

        contacts[0].addPhone("+380 96 677 44 10");
        contacts[0].addPhone("+380 96 610 44 10");
        contacts[1].addPhone("+380 63 610 44 10");
        contacts[2].addPhone("+380 63 310 46 21");
        contacts[3].addPhone("+380 63 000 46 09");

        for (Contact contact : contacts) {
            phoneBook.add(contact);
        }

        System.out.println(phoneBook);
        System.out.println();

        Contact ronaldo = phoneBook.find("ronaldo");
        System.out.println(ronaldo);

        System.out.println();

        List<Contact> allRonaldo = phoneBook.findAll("ronaldo");
        System.out.println(allRonaldo);
    }
}
