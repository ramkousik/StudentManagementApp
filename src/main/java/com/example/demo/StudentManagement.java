package com.example.demo;



import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class StudentManagement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> students = new ArrayList<Student>();
            int choice;
            do {
                System.out.println("1. Add Student");
                System.out.println("2. View Student");
                System.out.println("3. View All Students");
                System.out.println("4. View Random Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = sc.next();
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Student Marks: ");
                        int marks = sc.nextInt();
                        Student student = new Student(name, id, marks);
                        students.add(student);
                        break;
                    case 2:
                        System.out.print("Enter Student ID: ");
                        id = sc.nextInt();
                        for (Student s : students) {
                            if (s.getId() == id) {
                                System.out.println("Student Name: " + s.getName());
                                System.out.println("Student ID: " + s.getId());
                                System.out.println("Student Marks: " + s.getMarks());
                                System.out.println("Student Grade: " + s.getGrade());
                            }
                        }
                        break;
                    case 3:
                        for (Student s : students) {
                            System.out.println("Student Name: " + s.getName());
                            System.out.println("Student ID: " + s.getId());
                            System.out.println("Student Marks: " + s.getMarks());
                            System.out.println("Student Grade: " + s.getGrade());
                        }
                        break;
                    case 4:
                        Random random = new Random();
                        int index = random.nextInt(students.size());
                        Student s = students.get(index);
                        System.out.println("Student Name: " + s.getName());
                        System.out.println("Student ID: " + s.getId());
                        System.out.println("Student Marks: " + s.getMarks());
                        System.out.println("Student Grade: " + s.getGrade());
                        break;
                    case 5:
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            } while (choice != 5);
        }
    }
}
