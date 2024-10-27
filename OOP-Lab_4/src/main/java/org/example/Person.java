package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Person {
private String name;
private String address;
private int age;
private String country;

public Person(String name, String address) {
    this.name = name;
    this.address = address;
}

public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return this.address;
}

public void setAddress(String address) {
    this.address = address;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getCountry() {
    return country;
}

public void setCountry(String country) {
    this.country = country;
}

@Override
public String toString() {
    return this.name + "\n" + this.address + "\nAge: " + this.age + "\nCountry: " + this.country;
}
}

class Student extends Person {
    private int credits = 0;
    private String student_id;              // New private field for student ID
    private List<Integer> grades = new ArrayList<>(); // New private field for grades

    Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }

    public String getStudentId() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please enter a value. Must be between 0 and 100.");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

class Teacher extends Person{
    private float salary = 0;

    Teacher(String name, String address, float salary){
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getName() + "\n" + this.getAddress() + "\n" + this.salary;
    }
}

