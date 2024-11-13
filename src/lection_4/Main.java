package lection_4;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Student> students = getStudents();

        List<Student> accepted = passTheSession(students);

        printStudents(students);

        printStudents(accepted);

        printStudents(students, 3);

        printStudents(accepted, 3);

    }

    public static List<Student> passTheSession (List<Student> arr) {
        List<Student> students = arr.stream()
                .map(Student::new)
                .filter(s -> s.score >= 3)
                .toList();

        students.forEach(s1 -> s1.course += 1);

        return students;
    }

    public static void printStudents (List<Student> arr) {
        for (Student s : arr) {
            System.out.println("Студент: " + s.name + ", Курс: " + s.course + ", Средний балл: " + s.score);
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
        Student student0 = new Student("Андрей", "МОАИС", 3, 2.3);
        Student student1 = new Student("Сергей", "ПРИ", 4, 4.2);
        Student student2 = new Student("Александр", "ПРИ", 4, 3.5);
        Student student3 = new Student("Артур", "ПРИ", 4, 5.0);
        Student student4 = new Student("Дмитрий", "МОАИС", 2, 3.0);
        Student student5 = new Student("Артём", "МОАИС", 1, 2.9);

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
