package finalandstatic;

final class A{
    public final void print(){
        System.out.println("Lets Print");
    }
}
/*B cannot extend A since A is final class*/
//class B extends A{

    /* cannot ovveride this due to final*/
    /**
   public void print(){
        System.out.println("Lets Print");
   }
   **/
//}


public class FinalMain {
    public static void main(String[] args) {
        final int num=10;
//        cannot change value of num after assignment since it is final
//        num=20;
    }
}
