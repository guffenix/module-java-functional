package functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> professors = getList("Luis", "Fernando", "Kely");

        Consumer<String> printer = text -> System.out.println(text);
        professors.forEach(printer);
        System.out.println("//////////////////////////");
        professors.forEach(System.out::println);
    }

    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
