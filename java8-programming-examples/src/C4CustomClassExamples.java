import java.util.List;

public class C4CustomClassExamples {
    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Framework", "Framework", 9, 1000),
                new Course("Spring Boot", "Framework", 7, 1000),
                new Course("Hibernate", "Framework", 6, 3000),
                new Course("Jenkins", "DevOps", 8, 2000),
                new Course("Angular", "FullStack", 7, 5000));

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


class Course{
    private String name;
    private String category;
    private int rating;
    private int students;

    public Course(){}

    public Course(String name, String category, int rating, int students) {
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name,rating,category, students);
    }
}