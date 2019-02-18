package lambdas3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Utils {
    public static <T> List<T> allMatches(List<T> inputList, Predicate<T> matcher) {
        List<T> resultList = new ArrayList<>();
        for (T e: inputList) {
            if (matcher.test(e)) {
                resultList.add(e);
            }
        }
        return  resultList;
    }

    public static <T, R> List<R> transformedList(List<T> inputList, Function<T, R> transformer) {
        List<R> resultList = new ArrayList<>();
        for (T e: inputList) {
            resultList.add(transformer.apply(e));
        }
        return resultList;
    }
}
