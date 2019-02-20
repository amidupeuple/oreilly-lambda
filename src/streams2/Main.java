package streams2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("rain", "harvest", "oak", "illusion", "appointment", "delight", "ear", "mountains", "disclosure");

        System.out.println(words.stream().reduce("", (x, y) -> x.toUpperCase().concat(y.toUpperCase())));
        System.out.println(words.stream().reduce((x, y) -> x.concat("," + y)).get());
        System.out.println(words.stream().mapToInt(String::length).sum());
        System.out.println(words.stream().filter(x -> x.contains("h")).count());
    }
}
