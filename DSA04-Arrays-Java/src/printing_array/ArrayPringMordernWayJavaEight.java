package printing_array;

import java.util.Arrays;

public class ArrayPringMordernWayJavaEight {
    public static void main(String[] args) {
        // TODO:- Arrays.stream() with forEach
        String[] colors = { "Red", "Green", "Blue" };
        Arrays.stream(colors).forEach(color -> System.out.println(color));
        System.out.println("======================================================");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
