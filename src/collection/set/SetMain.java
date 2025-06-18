package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> colors=new HashSet<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);

        System.out.println(colors.contains("blue"));
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
