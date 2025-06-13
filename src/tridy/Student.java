package tridy;

public class Student extends Human {
    float knowledge;

    public Student (String newForename, String newSurname, int newAge, float initialKnowledge) {
        super(newForename, newSurname, newAge);

        this.knowledge = initialKnowledge;
    }
}
