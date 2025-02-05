package oops.problem.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Objective: To understand and implement sorting using the Comparable interface in Java.
//
//Exercise Description:
//
//Create a Class:
//Define a class Student with the following fields:
//int id
//String name
//int marks
//Implement Comparable:
//Implement the Comparable<Student> interface in the Student class.
//Override the compareTo method to sort Student objects by their id in ascending order.
//Create a List:
//Create a list of Student objects with at least 5 entries.
//Sort the List:
//Use the Collections.sort method to sort the list of Student objects.
//Display the Sorted List:
//Print the sorted list of Student objects.

public class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student)
    {
        return this.name.compareTo(student.name);
    }

    public static void main(String[] args) {
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student(1161, "achal", 90));
        listOfStudent.add(new Student(1163, "sonu", 95));
        listOfStudent.add(new Student(221, "tina", 60));
        listOfStudent.add(new Student(8881, "manu", 80));

        System.out.println("List before sorting:" + listOfStudent);
        Collections.sort(listOfStudent);
        System.out.println("List of student after sorting:" + listOfStudent);
    }
}
