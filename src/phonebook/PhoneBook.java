package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.printf("The contact %s already exists in the phone book.\n", contact.getName());
            return;
        }

        contacts.add(contact);
    }

    public Contact find(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    public List<Contact> findAll(String name) {
        List<Contact> contactsByName = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactsByName.add(contact);
            }
        }

        if (!contactsByName.isEmpty()) {
            return contactsByName;
        }

        return null;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        for (Contact contact : contacts) {
            stringJoiner.add(contact.toString());
        }

        return stringJoiner.toString();
    }
}
