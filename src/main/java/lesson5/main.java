package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    List<Student> students = new ArrayList<>();
    students.add(new Student(....))

    students.stream()
            .filter(student -> student.getSpecialty().equls("Информатика"))
            .filter(student -> student.getAvergeGrade() > 4.5)
            .sorted(Collections.reverseOrder(getAvergeGrade()))
            .limit(5)
            .forEach(System.out::println);
}
