import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C5SortingExamples {
    public static void main(String[] args) {
        List<Course> courses = new Course().getCourses();

        System.out.println("-------------------- Comparing by rating ascending --------------------------");
        Comparator<Course> compairingByRatingAscending = Comparator.comparing(Course::getRating);
        System.out.println(courses.stream().sorted(compairingByRatingAscending).collect(Collectors.toList()));

        System.out.println("-------------------- Comparing by rating descending --------------------------");
        Comparator<Course> compairingByRatingDescending = Comparator.comparing(Course::getRating).reversed();
        System.out.println(courses.stream().sorted(compairingByRatingDescending).collect(Collectors.toList()));

    }
}
