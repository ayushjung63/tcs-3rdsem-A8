package streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiFirst {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("blue");

        colors.stream()
                .filter(color->color.equals("blue"))
                .forEach(color->System.out.println(color));

        List<String> filteredColors=colors.stream()
                .filter(color->color.equals("blue"))
                .collect(Collectors.toList());

    }

}
