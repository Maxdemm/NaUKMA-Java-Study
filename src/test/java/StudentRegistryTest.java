import org.example.pract8.task3.Student;
import org.example.pract8.task3.StudentRegistry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistryTest {

    @Test
    void removeById_shouldMakeFindByIdReturnNull() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "Max", "max@gmail.com");

        registry.addStudent(student);
        registry.removeById("1");

        assertNull(registry.findById("1"));
    }

    @Test
    void removeById_shouldRemoveEmailFromSet() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "Max", "max@gmail.com");

        registry.addStudent(student);
        registry.removeById("1");

        assertFalse(registry.containsEmail("max@gmail.com"));
    }

    @Test
    void afterRemove_emailCanBeUsedAgain() {
        StudentRegistry registry = new StudentRegistry();
        Student student1 = new Student("1", "Max", "max@gmail.com");
        Student student2 = new Student("2", "Ivan", "max@gmail.com");

        registry.addStudent(student1);
        registry.removeById("1");

        assertTrue(registry.addStudent(student2));
    }
}
