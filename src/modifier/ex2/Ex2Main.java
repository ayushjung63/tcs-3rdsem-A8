package modifier.ex2;

import modifier.ex1.Person;

public class Ex2Main {
    public static void main(String[] args) {
        Person p1=new Person();

        // default so not accessible from another package
        //p1.name="Ram";
        p1.age=18;
    }
}
