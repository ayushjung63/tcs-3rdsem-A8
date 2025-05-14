package oops.inheritance.task;

public class TaskMain {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee();
        f1.name="Ram";
        f1.dept="IT";
        f1.paidLeave=20;

        System.out.println(f1.name);
        System.out.println(f1.paidLeave);

        PartTimeEmployee p1=new PartTimeEmployee();
        p1.name="Shyam";
        p1.dept="IT";
        System.out.println(p1.name);
    }
}
