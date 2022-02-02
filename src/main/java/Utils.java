import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public static String getOddNames(List<String> inputList) {
        return inputList.stream()
                .map(s -> inputList.indexOf(s) + ". " + s)
                .filter(s -> Integer.parseInt(s.substring(0, s.indexOf('.'))) % 2 != 0)
                .collect(Collectors.joining(", "));
    }

    public static List<String> getUpperCaseReversedList(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static String getAllSortedNumbers(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::strip)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public static Stream<Long> getRandomNumbersStream(long a, long c, long m) {
        return Stream.iterate(1L, x -> (a * x + c) % m);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secontList = second.collect(Collectors.toList());
        Stream.Builder<T> resultingStream = Stream.builder();

        for(int i = 0; i < Math.min(firstList.size(), secontList.size()); i++) {
            resultingStream
                    .add((firstList.stream().skip(i).findFirst()).get())
                    .add((secontList.stream().skip(i).findFirst()).get());
        }

        return resultingStream.build();
    }
}
