package Ukol2;

public class Person {
    /* Attributes */
    private String name;
    private int age;

    /* Get/Setters */
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    /* Constructors */
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    /* Public Methods */
    public void introduce() { System.out.printf("Jméno: %s\n\rVěk: %d\n\r", this.name, this.age); }
}
