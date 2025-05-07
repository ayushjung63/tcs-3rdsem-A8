package javabasics;

public class TypesOfVariable {
    String name; // instance variable or class level variable

    public void hello1(){
        int a=10; // local variable
        // only accessible within method scope
        System.out.println(a);
        System.out.println(name);
    }

    public void hello2(){
        int b=10;
        System.out.println(b);
        System.out.println(name);

    }
}
