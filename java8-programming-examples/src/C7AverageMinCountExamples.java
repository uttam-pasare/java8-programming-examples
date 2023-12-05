import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C7AverageMinCountExamples {
    public static void main(String[] args) {
        List<Course> courses = new Course().getCourses();
        System.out.println("----------- All Courses -----------");
        System.out.println(courses);

        System.out.println("----------- Average of students -----------");
        System.out.println(
                courses.stream()
                        .collect(Collectors.averagingInt(Course::getStudents))
        );

        Predicate<Course> frameworkPredicate = c -> c.getCategory().equalsIgnoreCase("Framework");
        System.out.println("----------- sum of students -----------");
        System.out.println(
                courses.stream().filter(frameworkPredicate)
                        .mapToInt(Course::getStudents)
                        .sum()
        );

        System.out.println("----------- average of students -----------");
        System.out.println(
                courses.stream().filter(frameworkPredicate)
                        .mapToInt(Course::getStudents)
                        .average()
        );

        System.out.println("----------- count of students -----------");
        System.out.println(
                courses.stream().filter(frameworkPredicate)
                        .mapToInt(Course::getStudents)
                        .count()
        );
    }
}
