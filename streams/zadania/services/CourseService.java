package zadania.services;




import zadania.model.Course;
import zadania.model.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Created by surja on 31.10.2020
 */
public class CourseService {
    private List<Course> courses;

    public CourseService() {

        initCourses();
    }

    private void initCourses() {
        Course ANALIZA = new Course("Analiza");
        ANALIZA.addStudent(new Student("Jan", "Nowak", 21));
        ANALIZA.addStudent(new Student("Kasia", "Kowalska", 18));

        Course WDI = new Course("WDI");
        WDI.addStudent(new Student("Kamil", "Nowak", 21));
        WDI.addStudent(new Student("Jarek", "Kowal", 24));

        Student asia = new Student("Asia", "Lis", 11);
        Course ASD = new Course("ASD");
        ASD.addStudent(new Student("Jarek", "Kowal", 24));
        ASD.addStudent(new Student("Asia", "Lis", 11));
        ASD.addStudent(new Student("Piotr", "F", 28));

        Course ASD2 = new Course("ASD");
        ASD2.addStudent(new Student("Jarek", "Kowal", 24));
        ASD2.addStudent(new Student("Asia", "Lis", 11));

        Course BD = new Course("BD");

        Course PO = new Course("PO");
        PO.addStudent(new Student("Adam", "Mickiewicz", 21));

        this.courses = Arrays.asList(ANALIZA, WDI, ASD, BD, PO, ASD2);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
