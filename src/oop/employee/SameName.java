package oop.employee;

public class SameName {
    public static void main(String[] args) {
        Employee john = new Employee("John","Doe", "Michael", "Manager",
                "john.doe@example.com", "+1234567890", 35);
        System.out.println(john);
    }
}
