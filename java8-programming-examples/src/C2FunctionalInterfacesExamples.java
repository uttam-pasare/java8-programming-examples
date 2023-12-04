import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class C2FunctionalInterfacesExamples {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 2, 10, 5, 4, 2);

        System.out.println("------------------- Functional ");

        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        Function<Integer, Integer> squareFunction = number -> number * number;
        Consumer<Integer> printer = System.out::println;

        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(printer);

        numbers.stream().sorted(Comparator.comparingInt(n -> n))
                .forEach(System.out::println);

        printByCriteria(numbers, x -> x%2 == 0);
        printByCriteria(numbers, x -> x%2 != 0);

        numbers.stream().map(x -> x*x).forEach(System.out::println);
        square(numbers, x-> x*x*x);

        Supplier<Integer> numberSupplier = () -> new Random().nextInt();
        System.out.println(numberSupplier.get());
    }

    public static void square(List<Integer> numbers,Function<Integer, Integer> squareFunction){
        numbers.stream().map(squareFunction).forEach(System.out::println);
    }

    public static void printByCriteria(List<Integer> numbers, Predicate<Integer> criteria){
        numbers.stream().filter(criteria).forEach(System.out::println);
    }
}
