package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<String> phones;

    public Contact(String name) {
        this.name = name;
        this.phones = new ArrayList<>();
    }

    public void addPhone(String phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
            return;
        }

        System.out.printf("The number %s already exists in the contact list for %s.\n", phone, name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", phones = " + phones;
    }
}
