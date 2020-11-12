import java.util.HashMap;
import java.util.Optional;

public class Course {
    private HashMap<Long, Student> studentMap = new HashMap<>();

    public void addStudent(Student student){
        this.studentMap.put(student.getId(), student);
    }

    public Optional<Student> findStudent(Long studentId){
        Student student = studentMap.get(studentId);
        return Optional.ofNullable(student);
    }
}