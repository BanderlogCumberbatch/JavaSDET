package lection_4;

public class Student {
    String name, group;
    Integer course;
    Double score;

    Student(String name, String group, Integer course, Double score) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.score = score;
    }

    Student(Student student) {
        this.name = student.name;
        this.group = student.group;
        this.course = student.course;
        this.score = student.score;
    }
}
