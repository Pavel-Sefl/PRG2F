package oopIntro;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void printArea() {
        System.out.println(this.getArea());
    }

    public double getCircumference() {
        return Math.PI * this.radius * 2;
    }

    public void printCircumference() {
        System.out.println(this.getCircumference());
    }
}
