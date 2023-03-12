package com.test_amigo.student;

public class Student {
    private String name;
    private int age;
    private int roll;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    // this works as serializer
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
