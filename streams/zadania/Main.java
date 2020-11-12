package zadania;

import zadania.services.CourseService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by surja on 01.11.2020
 */
public class Main {
    public static void main(String[] args) {
        //code
        CourseService courseService = new CourseService();
//       Tworzenie streamy kursów - courseService.getCourses().stream()

        // - Wypisz nazwę każdego kursu na konsolę.
         courseService.getCourses().stream().map(course -> course.name).forEach(System.out::println);

        // - Wypisz imię każdego studenta na konsolę. (Wykorzystaj `flatMap()`)
         courseService.getCourses().stream().flatMap(course -> course.getStudents().stream()).forEach(student -> System.out.println(student.firstName));

        // - Przelicz ile jest unikalnych studentów we wszystkich kursach. (Aby byli oni unikalni potrzebna będzie metoda `equals` w klasie Student
        long count = courseService.getCourses().stream()
                .flatMap(course -> course.getStudents().stream())
                .distinct()
                .count();
        System.out.println(count);

        // - Zbuduj Listę imion studentów których wiek jest mniejszy niż 20 lat. Potem wypisz tą listę na ekran.
        List<String> names = courseService.getCourses().stream().flatMap(course -> course.getStudents().stream()).distinct().filter(student -> student.age < 20).map(student -> student.firstName).collect(Collectors.toList());
        System.out.println(names);

//         - Posortuj studentów według wieku i wypisz ich na konsolę, zwróć uwagę gdzie należy użyć funkcji `distinct` (chcemy unikalnych studentów a nie unikalny wiek)
        courseService.getCourses().stream().flatMap(course -> course.getStudents().stream()).distinct().sorted((s1, s2) -> s1.age - s2.age).map(student -> student.firstName).forEach(System.out::println);
    }
}
