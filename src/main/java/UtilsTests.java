import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UtilsTests {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Bryan");
        list.add("Charles");
        list.add("David");
        list.add("Evan");
        list.add("Frank");
        list.add("Gregory");
        list.add("Jack");

        System.out.println("Utils.getOddNames(list) = " + Utils.getOddNames(list));

        System.out.println("Utils.getUpperCaseReversedList(list) = " + Utils.getUpperCaseReversedList(list));

        String[] inputArray = new String[] {"1, 2, 0", "4, 5"};
        System.out.println("Utils.getAllSortedNumbers(inputArray) = " + Utils.getAllSortedNumbers(inputArray));

//        Utils.getRandomNumbersStream(25214903917l, 11, 2 ^ 48).forEach(System.out::println);

        Utils.zip(list.stream(), Stream.of("0","1","2","3","4","5")).forEach(System.out::println);

    }

}
