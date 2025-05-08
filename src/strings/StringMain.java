package strings;

public class StringMain {
    public static void main(String[] args) {
        // method 1
        String college="TCS College"; // string literal
        String s1=new String("Hello World"); // string object
        System.out.println(college);
        System.out.println(s1);

        System.out.println(20 == 20); // true

        System.out.println("------String Compare-----");
        String s2=new String("Hello World");
        String s3=new String("Hello World");
        System.out.println(s2 == s3); //false
        System.out.println(s2.equals(s3)); //true

        String s4="Hello World";
        String s5="Hello World";
        System.out.println(s4 == s5); // true
        System.out.println(s4.equals(s5)); //true

    }
}
