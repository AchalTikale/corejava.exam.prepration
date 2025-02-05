package oops.problem.comparator.EmployeeData.sorting;

import java.util.Comparator;

//Problem Statement
//
//You are given a list of Employee objects, where each Employee has a name and a salary. Your task is to sort this list based on the following criteria:
//
//Primary Sort: By salary in ascending order.
//
//Secondary Sort: If two employees have the same salary, sort them by name in alphabetical order.
//
//comparator
//
public class Employee
{
    private String empName;
    private  double salary;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }


}
