package oops.abstraction.interfacexample2;

public class StudentCoderMain {
    public static void main(String[] args) {
        StudentCoder ram=new JavaStudentCoder();
        ram.codes();

        ram=new JSStudentCoder();
        ram.codes();
    }
}
