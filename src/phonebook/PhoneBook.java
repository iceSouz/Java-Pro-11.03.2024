package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public boolean add(Record record) {
        //Primitive implementation
        for (Record contact : records) {
            if (contact.getPhone().equals(record.getPhone())) {
                System.out.println("This number(" + record.getPhone() + ") is already in use, so it cannot be added.");

                return false;
            }
        }
        records.add(record);

        return true;
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }

        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> allRecordsByName = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                allRecordsByName.add(record);
            }
        }

        if (!allRecordsByName.isEmpty()) {
            return allRecordsByName;
        }

        return null;
    }
}
