package tridy;

import java.util.ArrayList;

public class Classroom {
    String name;
    Teacher teacher;
    ArrayList<Student> students;

    public Classroom(String initialName, Teacher teacher) {
        this.name = initialName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }
}
