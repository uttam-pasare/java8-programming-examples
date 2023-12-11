import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C8GroupingExamples {
    public static void main(String[] args) {
        List<Course> courses = new Course().getCourses();
        System.out.println("----------- All Courses -----------");
        System.out.println(courses);

        System.out.println("---------------- group by category ------------");
        System.out.println(courses.stream().collect(
                Collectors.groupingBy(Course::getCategory)
        ));

        System.out.println("---------------- count by category ------------");
        System.out.println(courses.stream().collect(
                Collectors.groupingBy(Course::getCategory, Collectors.counting())
        ));

        System.out.println("---------------- count by category with its max rating------------");
        System.out.println(courses.stream().collect(
                Collectors.groupingBy(Course::getCategory,
                        Collectors.maxBy(Comparator.comparingInt(Course::getRating)))
        ));

        System.out.println("---------------- group by category and print names------------");
        System.out.println(courses.stream().collect(
                Collectors.groupingBy(Course::getCategory,
                        Collectors.mapping(Course::getName, Collectors.toList()))
        ));
    }
}
