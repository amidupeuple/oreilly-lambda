package lambdas3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] wordsArr = {"tree", "book", "stone", "ocean", "eternity", "conception"};
        List<String> words = Arrays.asList(wordsArr);

        /*List<String> shortWords = Utils.allMatches(words,s -> s.length() < 4);
        System.out.println("shortWords: " + shortWords);
        List<String> wordsWithB = Utils.allMatches(words, s -> s.contains("b"));
        System.out.println("wordsWithB: " + wordsWithB);
        List<String> evenLengthWords = Utils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println("evenLengthWords: " + evenLengthWords);

        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        List<Integer> bigNums = Utils.allMatches(nums, n -> n>500);
        System.out.println("bigNums: " + bigNums);*/

        List<String> excitingWords = Utils.transformedList(words, s -> s + "!");
        System.out.println("excitingWords: " + excitingWords);
        List<String> eyeWords = Utils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println("eyeWords: " + eyeWords);
        List<String> upperCaseWords = Utils.transformedList(words, String::toUpperCase);
        System.out.println("upperCaseWords: " + upperCaseWords);

        List<Integer> wordLengths = Utils.transformedList(words, String::length);
        System.out.println("wordLengths: " + wordLengths);
    }
}
