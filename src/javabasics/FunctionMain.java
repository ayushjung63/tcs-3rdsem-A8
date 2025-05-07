package javabasics;

public class FunctionMain {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int result=sum(num1,num2);
        System.out.println(result);
        int num4=20;
        int num5=30;
        int result2=sum(num4,num5);
        System.out.println(result2);

        int num6=20;
        int num7=30;
        int result3 = substract(num6, num7);
        int result4=sum(num6,num7);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int substract(int a,int b){
        return a-b;
    }
}
