package finalandstatic;
class Student{
    String name;
    static String college="TCS College";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void code(){
        hello();
        System.out.println("Student is coding");
    }

    public static void hello(){
        System.out.println("Hello from students");
    }
}

public class StaticMain {
    public static void main(String[] args) {
        Student s1= new Student("Ram");

        s1.code();
        Student.hello();

        System.out.println(s1.name);
        System.out.println(Student.college);
    }
}
