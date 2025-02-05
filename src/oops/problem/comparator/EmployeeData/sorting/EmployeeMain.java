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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Yami",3600.1));
        employeeList.add(new Employee("Achal",26000.5));
        employeeList.add(new Employee("Zunera",6000.5));
        employeeList.add(new Employee("Siraj",6000.5));

        System.out.println("Sorted Employee Data based on salary in ascending order");
        Comparator<Employee>sortingBasedOnSalary=new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                if(o1.getSalary()== o2.getSalary())
                {
                    return o1.getEmpName().compareTo(o2.getEmpName());
                }
                else
                {
                    return (int) (o1.getSalary() - o2.getSalary());
                }
            }
        };
        Collections.sort(employeeList,sortingBasedOnSalary);
        System.out.println(employeeList);

        System.out.println("-----------------------------------------------");

//        System.out.println("Sorted employee data based on empName:");
//        Comparator<Employee>sortingBasedOnName=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2)
//            {
//                return o1.getEmpName().compareTo(o2.getEmpName());
//            }
//        };
//        Collections.sort(employeeList,sortingBasedOnName);
//
//        System.out.println(employeeList);
    }
}
