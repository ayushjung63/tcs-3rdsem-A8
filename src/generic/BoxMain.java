package generic;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        String data = stringBox.getData();
        System.out.println(data);


        Box<Integer> intBox=new Box<>();
        intBox.add(10);
        Integer intData = intBox.getData();
        System.out.println(intData);
    }
}
