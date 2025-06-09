package Ukol2;

public class Student extends Person {
    /* Attributes */
    private String school;

    /* Get/Setters */
    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }

    /* Constructor */
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    /* Method Overrides */
    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("Škola: %s\n\r", this.school);
    }
}
