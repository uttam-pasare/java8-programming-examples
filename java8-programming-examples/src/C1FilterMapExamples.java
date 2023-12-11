import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C1FilterMapExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 5, 7, 10, 20, 4, 7, 10);
        System.out.println("-------------// get sum of all numbers using reduce//-------------------");
        System.out.println(numbers.stream().reduce(0, Integer::sum));

        System.out.println("-------------// get MIN of all numbers using reduce//-------------------");
        System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, Integer::min));

        System.out.println("-------------// get MAX of all numbers using reduce//-------------------");
        System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, Integer::max));

        System.out.println("-------------// square all numbers in list//-------------------");
        numbers.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println("-------------// find sum of odd numbers in list//-------------------");
        Integer total = numbers.stream().filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println(total);

        System.out.println("-------------// collect list of squares of all even numbers//-------------------");
        List<Integer> evenSquaresList = numbers.stream().filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(evenSquaresList);

        System.out.println("-------------// sort distinct numbers natural order//-------------------");
        numbers.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("-------------// sort distinct numbers in reverse order//-------------------");
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> courses = List.of("Spring", "Java", "Spring Boot", "Python");

        System.out.println("-------------// Get courses contains Spring in it//----------");
        courses.stream().filter(c -> c.contains("Spring"))
                .forEach(System.out::println);

        System.out.println("-------------// sort courses with length of the course //-------------------");
        courses.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        System.out.println("------- flattens the two lists ---------------");
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> courses1 = List.of(1,2,3);
        List<Integer> courses2 = List.of(4,5,6);
        results.add(courses1);
        results.add(courses2);
        System.out.println(results.stream().flatMap(Collection::stream).collect(Collectors.toList()));

    }
}
