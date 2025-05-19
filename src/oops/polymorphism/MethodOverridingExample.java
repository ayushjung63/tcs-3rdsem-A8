package oops.polymorphism;

class Parent{
    public void hello(){
        System.out.println("Namaste");
    }
}

class Child extends Parent{
    public void hello(){
        System.out.println("Hi Hello");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {

        Parent p = new Child();
        p.hello();

        p=new Parent();
        p.hello();
    }
}
