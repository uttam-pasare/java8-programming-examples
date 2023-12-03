import java.util.List;

public class C1FilterExamples {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Java", "Spring Boot", "Python");

        // Get courses contains Spring in it
        courses.stream().filter(c -> c.contains("Spring"))
                .forEach(System.out::println);

        List<Integer> numbers = List.of(12, 5, 10, 20, 4);
        // get sum of all numbers using reduce
        System.out.println(numbers.stream().reduce(0, Integer::sum));

        // get MIN of all numbers using reduce
        System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, Integer::min));

        // get MAX of all numbers using reduce
        System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, Integer::max));
    }
}
