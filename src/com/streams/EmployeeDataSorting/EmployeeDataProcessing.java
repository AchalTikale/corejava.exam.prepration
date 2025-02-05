package com.streams.EmployeeDataSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Problem Statement: Employee Data Processing
//
//You are given a list of Employee objects, each containing the following fields:
//
//int id
//
//String name
//
//String department
//
//double salary
//
//Your task is to perform the following operations using Java Streams:
//
//Filter: Find all employees who belong to the “Engineering” department.
//
//Sort: Sort the employees by their salary in descending order.
//
//Map: Create a list of employee names.
//
//Reduce: Calculate the total salary of all employees.
//
//Collect: Group employees by their department.
//
public class EmployeeDataProcessing

{
    public static void main(String[] args)
    {
        List<Employee>employeeList= Arrays.asList(
                new Employee(1, "Alice", "Engineering", 75000),
                new Employee(2, "Bob", "HR", 50000),
                new Employee(3, "Charlie", "Engineering", 80000),
                new Employee(4, "David", "Sales", 60000)
        );

        List<Employee> engineering = employeeList.stream().filter(x -> x.getDepartment().equals("Engineering")).toList();
        System.out.println("List of employees with ENgineering department:");
        System.out.println(engineering+"\n");

        System.out.println("List of employees with descending order of their salaries :");
        List<Employee> collect = employeeList.stream().sorted((y, x) -> (int) (x.getSalary() - y.getSalary())).collect(Collectors.toList());
        System.out.println(collect+"\n");

        double sum = employeeList.stream().mapToDouble(x -> x.getSalary()).sum();
        System.out.println("the total salary of all employees :"+sum);


        System.out.println(" ");
        System.out.println("List of Employees by department");
        Map<String, List<Employee>> collect1 = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
        System.out.println(collect1);
    }
}
