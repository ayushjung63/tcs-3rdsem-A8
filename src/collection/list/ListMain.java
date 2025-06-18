package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> stringList =new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Ram");
        stringList.add("Shyam");

        System.out.println(stringList);

        System.out.println("Value at Index 0: "+ stringList.get(0));

        int size = stringList.size();
        System.out.println("Size of list: "+ size);

        boolean containsRam = stringList.contains("Ram");
        System.out.println("Contains Ram: "+ containsRam);

        boolean containsNamaste= stringList.contains("Namaste");
        System.out.println("Contains Namaste: "+ containsNamaste);

        for (String str:stringList){
            System.out.println(str);
        }

        for (int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
    }
}
