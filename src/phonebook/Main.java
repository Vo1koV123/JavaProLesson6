package phonebook;

public class Main {
    public static void main(String[] args) {
        Record record = new Record("Bob", "123");
        Record record2 = new Record("Bob", "1232345");


        PhoneDirectory phoneDirectory = new PhoneDirectory();


        phoneDirectory.add(record);
        phoneDirectory.add(record2);


        phoneDirectory.find("Bob");
        phoneDirectory.findAll("Bob");


    }
}