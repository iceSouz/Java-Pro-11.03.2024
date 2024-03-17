package oop.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(
            String firstName, String lastName, String patronymic, String position,
            String email, String phone, int age
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "\nLast Name: " + lastName + "\nPatronymic: " + patronymic +
                "\nPosition: " + position + "\nEmail: " + email + "\nPhone: " + phone + "\nAge: " + age;
    }
}
