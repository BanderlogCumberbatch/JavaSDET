package lection_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Student> students = getStudents();

        printStudents(students);

        printStudents(students, 3);

        students = passTheSession(students);

        printStudents(students);

        printStudents(students, 3);

    }

    public static List<Student> passTheSession (List<Student> students) {
        List<Student> result = students.stream()
                .filter(s -> s.scores.stream()
                        .mapToDouble(s1 -> s1) // преобразуем Integer в double
                        .average()
                        .orElse(Double.NaN) >= 3.0)
                .toList();

        result.forEach(s1 -> s1.course += 1);

        return result;
    }

    public static void printStudents (List<Student> arr) {
        for (Student s : arr) {
            System.out.println("Студент: " + s.name + ", Курс: " + s.course + ", Оценки: " + s.scores); // преобразуем Integer в double .average()
        }
        System.out.println();
    }

    public static void printStudents (List<Student> arr, int course) {
        List<Student> students =  arr.stream()
                .filter(s -> s.course.equals(course))
                .toList();
        System.out.println("Студенты " + course + "-го курса: ");
        for (Student s : students) {
            System.out.println(s.name);
        }
        System.out.println();
    }

    private static List<Student> getStudents() {
        Student student0 = new Student("Андрей", "МОАИС", 3, Arrays.asList(2, 3 ,2, 3));
        Student student1 = new Student("Сергей", "ПРИ", 4, Arrays.asList(5, 4 ,4, 5));
        Student student2 = new Student("Александр", "ПРИ", 4, Arrays.asList(3, 3 ,4, 4));
        Student student3 = new Student("Артур", "ПРИ", 4, Arrays.asList(5, 5 ,5, 5));
        Student student4 = new Student("Дмитрий", "МОАИС", 2, Arrays.asList(3, 3 ,3, 3));
        Student student5 = new Student("Артём", "МОАИС", 1, Arrays.asList(2, 3 ,3, 3));

        List<Student> students = new ArrayList<>();
        students.add(student0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    }

}
