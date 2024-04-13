package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public boolean add(Record record) {
        return records.add(record);
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
