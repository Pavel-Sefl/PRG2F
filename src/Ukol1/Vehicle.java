package Ukol1;

public class Vehicle {
    /* Attributes */
    private double speed;

    /* Get/Setters */
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    /* Constructors */
    public Vehicle() {
        this.speed = 0;
    }

    public Vehicle(double speed) {
        this.setSpeed(speed);
    }

    /* Public Methods */
    public void move() {
        System.out.println("Vozidlo se pohybuje.");
    }
}
