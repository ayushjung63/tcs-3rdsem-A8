package oops.inheritance.multiple;

public class MultipleMain {
    public static void main(String[] args) {
        A grandChild=new A();
        grandChild.hello();

        B parent=new B();
        parent.hello();

        C grandParent=new C();
        grandParent.hello();
    }
}
