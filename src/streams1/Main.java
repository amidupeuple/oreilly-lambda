package streams1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("rain", "harvest", "oak", "illusion", "appointment", "delight", "ear", "mountains", "disclosure");

        /*words.stream().forEach(x -> System.out.println("  " + x));
        System.out.println("- - - - -");
        words.stream().forEach(System.out::println);
        System.out.println("- - - - -");
        words.stream().map(x -> x + "!").forEach(System.out::println);
        System.out.println("- - -");
        words.stream().map(x -> x.replace("i", "eye")).forEach(System.out::println);
        System.out.println("- - -");
        words.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("- - - - -");*/

        words.stream().map(String::toUpperCase).filter(x -> x.length() < 4).filter(x -> x.contains("E")).forEach(System.out::println);
    }
}
