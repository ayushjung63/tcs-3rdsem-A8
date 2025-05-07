public class StudentMain {
    public static void main(String[] args) {
        /*
        * ClassName variable_name = new ClassName();
        * */

        Student s1= new Student(); // object of student class
        s1.name="Ram";
        s1.faculty="BSCIT";

        System.out.println("Name: "+s1.name);
        System.out.println("Faculty: "+s1.faculty);

        s1.read();
    }
}
