package com.company;

import model.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student("Tom", 23, "M", "A123123123");
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
        System.out.println("Gender:"+student.getGender());
        System.out.println("ID Number:"+student.getIdNumber());
    }
}
