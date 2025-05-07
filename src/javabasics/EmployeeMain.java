package javabasics;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="John";
        e1.dept="Engineering";
        e1.salary=2000;
        e1.printDetails();

        Employee e2=new Employee("Ram","IT",2000);
        e2.printDetails();
    }
}

/*
* Create a javabasics.Student class with name and faculty
* use both default and parametrized constructor to create object
* print details
*
*
* */
