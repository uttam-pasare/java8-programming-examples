import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class C9FilesExamples {
    public static void main(String[] args) throws IOException {
        System.out.println("---------- Print distinct text from file -------------");
        Files.lines(Paths.get("resources/sample.txt"))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------- Print name of only directories ----------");
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
