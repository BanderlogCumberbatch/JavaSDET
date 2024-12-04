package lection_4;

import java.util.List;

public class Student {
    String name, group;
    Integer course;
    List<Integer> scores;


    Student(String name, String group, Integer course, List<Integer> scores) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.scores = scores;
    }

    Student(Student student) {
        this.name = student.name;
        this.group = student.group;
        this.course = student.course;
        this.scores = student.scores;
    }
}
