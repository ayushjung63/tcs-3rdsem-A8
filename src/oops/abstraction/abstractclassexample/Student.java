package oops.abstraction.abstractclassexample;

public abstract class Student {

    /* non-abstract method */
    public void read(){
        System.out.println("Every student must read");
    }

    /* abstract method */
    public abstract void code();
    public abstract void submitAssignment();
}
