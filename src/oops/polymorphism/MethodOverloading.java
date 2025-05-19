package oops.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ex1=new MethodOverloading();
        int result = ex1.add(1, 2);
        System.out.println("Result is: "+result);

        int result1 = ex1.add(1, 2, 3);
        System.out.println("Result1 is: "+result1);

        int result2 = ex1.add(1, 2, 3, 4);
        System.out.println("Result2 is: "+result2);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b,int c) {
        return a + b + c;
    }

    public int add(int a, int b,int c,int d) {
        return a + b + c + d;
    }

}
