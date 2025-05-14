package oops.encapsulation;

/*
* Create a Employee class with id,name,dept and salary fields
* Make the fields private
* Create public getter and setter to set values to fields and get the value
*
* Create a Main method and create object of Employee class
* set values using Setter
* print values using Getter
* */


public class EncapMain {
    public static void main(String[] args) {
        Student s1=new Student();

//        s1.id=11;
//        s1.id=12;
//        s1.id=13;
//        s1.id=14;

        //s1.id="1";
//        s1.setName("Ram");
//        s1.setName("Shyam");
//        s1.setName("Hari");
//        s1.setName("Gita");
//
//        s1.setAge(12);


        Employee e1=new Employee();
        e1.setId(10);
        e1.setName("Ram");

        System.out.println(e1.getName());
        System.out.println(e1.getId());



//        //System.out.println(s1.id);
//
//        System.out.println(s1.getName());
    }
}
