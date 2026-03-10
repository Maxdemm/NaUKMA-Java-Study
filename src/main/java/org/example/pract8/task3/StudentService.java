package org.example.pract8.task3;

import java.util.HashSet;
import java.util.Set;

public class StudentService {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Student s1 = new Student("1", "Max", "max@gmail.com");
        Student s2 = new Student("2", "Ivan", "ivan@gmail.com");
        Student s3 = new Student("3", "Oleg", "max@gmail.com");

        System.out.println("Add s1: " + registry.addStudent(s1));
        System.out.println("Add s2: " + registry.addStudent(s2));
        System.out.println("Add s3: " + registry.addStudent(s3));

        System.out.println("Find by id=1: " + registry.findById("1"));
        System.out.println("Contains email max@gmail.com: " + registry.containsEmail("max@gmail.com"));

        System.out.println("Remove id=1: " + registry.removeById("1"));
        System.out.println("Find by id=1 after remove: " + registry.findById("1"));
        System.out.println("Contains email max@gmail.com after remove: " + registry.containsEmail("max@gmail.com")); // false

        Student s4 = new Student("4", "Andrii", "max@gmail.com");
        System.out.println("Add s4 with reused email: " + registry.addStudent(s4));

        System.out.println("All students:");
        for (Student student : registry.getStudents()) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println();
        //---------
        Set<Student> students = new HashSet<>();
        Student s11 = new Student("1", "Max11111", "max11111@gmail.com");
        Student s22 = new Student("1", "Max", "max@gmail.com");

        students.add(s11);
        students.add(s22);

        System.out.println("Size: " + students.size());
    }
}
