package com.example;

public class App {
    public static void main(String[] args) {
        Student student = new Student(101, "Pradeep");

        System.out.println("Student ID : " + student.getId());
        System.out.println("Student Name : " + student.getName());
    }
}
