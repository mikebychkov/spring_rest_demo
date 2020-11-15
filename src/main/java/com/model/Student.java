package com.model;

public class Student {

    private int id;
    private String firstName;
    private String lastName;

    public static Student of(String firstName, String lastName) {
        Student rsl = new Student();
        rsl.setFirstName(firstName);
        rsl.setLastName(lastName);
        return rsl;
    }

    public static Student of(int id, String firstName, String lastName) {
        Student rsl = of(firstName, lastName);
        rsl.setId(id);
        return rsl;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
