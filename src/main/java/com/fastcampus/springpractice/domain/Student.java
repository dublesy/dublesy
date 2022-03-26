package com.fastcampus.springpractice.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private Integer age;
    private Grade grade;


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    private Student(String name, Integer age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {
    }

    public static Student of(String name, Integer age, Grade grade) {
        return new Student(name, age, grade);
    }



    public enum Grade {
        A, B, C, D, E, F
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
