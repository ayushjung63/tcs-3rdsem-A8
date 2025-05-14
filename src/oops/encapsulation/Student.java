package oops.encapsulation;

public class Student {

     // attributes
     int age;
     private String name;

     public String getName(){
         return name;
     }

     public void setName(String name){
         System.out.println("Changing name to "+name);
         this.name = name;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
         if (age < 18) {
             System.out.println("Cannot set age less than 18");
         }else {
             this.age = age;
         }
    }

    // behaviour
    public void printDetails() {
        System.out.println("Name: " + name +" ID: " + age);
    }

    // behaviour
    public void read(){
        System.out.println("Student Reads");
    }
}
