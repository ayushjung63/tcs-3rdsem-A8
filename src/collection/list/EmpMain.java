package collection.list;

import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    String dept;

    public Employee(){}
    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}


public class EmpMain {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<Employee>();

        Employee emp1=new Employee("Ram","IT");
        Employee emp2=new Employee("Shyam","IT");
        Employee emp3=new Employee("Hari","Account");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for (Employee emp :employeeList){
            System.out.println(emp.name);
        }
    }
}
