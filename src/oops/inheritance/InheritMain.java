package oops.inheritance;

public class InheritMain {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.name="John";
        System.out.println(p1.name);
        p1.hello();

        Child c1=new Child();
        c1.name="John ko Son";
        System.out.println(c1.name);
        c1.hello();
    }
}
