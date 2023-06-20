package phonebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SplittableRandom;

public class PhoneDirectory {

    private static List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record1 : records) {
            if (record1.getName().equals(name)) {
                System.out.println(record1.getName() + " " + record1.getPhone());
                return record1;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> all = new ArrayList<>();
        for (Record record1 : records) {
            if (record1.getName().equals(name)) {
                all.add(record1);
            }
        }
        System.out.println(all);
        return all;
    }
}
