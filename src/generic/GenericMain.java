package generic;

public class GenericMain {
    public static void main(String[] args) {
        GenericMain g1=new GenericMain();
        g1.print(10);
        g1.print(20.11);
        g1.print("Hello");
    }

    public <T> void print(T data){
        System.out.println(data);
    }
}
