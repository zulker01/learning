package com.example.mysql_crud_gradle.demo.entity;

import jakarta.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private  int userId;

    @Column(name = "name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name = "salary")
    private float salary;

    public User(){
        super();
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public User(int userId, String name, int age, float salary) {
        super();
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
