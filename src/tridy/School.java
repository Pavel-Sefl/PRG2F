package tridy;

import java.util.ArrayList;

public class School {
    String name;
    ArrayList<Classroom> classrooms;

    public School(String newName) {
        this.name = newName;
        this.classrooms = new ArrayList<>();
    }

    public void addClassroom(Classroom newClassroom) {
        this.classrooms.add(newClassroom);
    }

    public Classroom getClassroomByName(String query) {
        for (Classroom iteratedClass : classrooms) {
            if (iteratedClass.name.equals(query)) return iteratedClass;
        }
        return null;
    }
}
