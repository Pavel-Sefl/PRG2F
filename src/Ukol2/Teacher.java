package Ukol2;

public class Teacher extends Person {
    /* Attributes */
    private String assignedClass;

    /* Get/Setters */
    public String getAssignedClass() { return assignedClass; }
    public void setAssignedClass(String assignedClass) { this.assignedClass = assignedClass; }

    /* Constructors */
    public Teacher(String name, int age, String assignedClass) {
        super(name, age);
        this.assignedClass = assignedClass;
    }

    /* Method Overrides */
    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("Třída: %s\n\r", this.assignedClass);
    }
}
