import java.util.List;

public class C4MachesExamples {
    public static void main(String[] args) {
        List<Course> courses = new Course().getCourses();

        courses.forEach(System.out::println);
        System.out.println("-------------All Match---------------");
        System.out.println(courses.stream()
                .allMatch(c -> c.getRating() > 5));

        System.out.println("-------------Any Match---------------");
        System.out.println(courses.stream()
                .anyMatch(c -> c.getCategory().equals("Framework")));

        System.out.println("-------------None Match---------------");
        System.out.println(courses.stream()
                .noneMatch(c -> c.getCategory().equals("xxx")));
    }
}


