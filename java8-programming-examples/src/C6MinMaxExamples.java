import java.util.Comparator;
import java.util.List;

public class C6MinMaxExamples {
    public static void main(String[] args) {
        List<Course> courses = new Course().getCourses();
        System.out.println("----------- All Courses -----------");
        System.out.println(courses);

        System.out.println("----------- Max by Ratings -----------");
        Comparator<Course> compareByRatings = Comparator.comparingInt(Course::getRating);
        System.out.println(
                courses.stream().max(compareByRatings)
        );

        System.out.println("----------- Min by ratings -----------");
        System.out.println(
                courses.stream().min(compareByRatings)
        );

        System.out.println("----------- Or Else -----------");
        System.out.println(courses.stream().filter(c -> c.getRating() > 10)
                .min(compareByRatings)// returns Optional.empty()
                .orElse(null)); // or else null
    }
}
