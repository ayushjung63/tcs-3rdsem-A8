public class Employee {

    String name;
    String dept;
    int salary;

    public void printDetails() {
        System.out.println("Name: " + name + " Dept: " + dept + " Salary: " + salary);
    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    public Employee() {
    }


}


