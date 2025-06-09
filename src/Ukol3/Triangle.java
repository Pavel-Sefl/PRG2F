package Ukol3;

public class Triangle extends Shape {
    /* Attributes */
    private int height;
    private TriangleAlignment alignment = TriangleAlignment.LEFT;

    /* Get/Setters */

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = Math.abs(height); }

    public TriangleAlignment getAlignment() { return alignment; }
    public void setAlignment(TriangleAlignment alignment) { this.alignment = alignment; }

    /* Constructors */
    public Triangle(int height) {
        this.setHeight(height);
    }

    public Triangle(int height, TriangleAlignment alignment) {
        this.setHeight(height);
        this.setAlignment(alignment);
    }

    /* Method Overrides */
    @Override
    public void drawShape() {
        if (this.alignment == TriangleAlignment.CENTER) { // Tohle byla zábava :D 👍
            for (int y = this.height; y < 2 * this.height; y++) {
                for (int x = 1; x < 2 * this.height; x++) {
                    if (x % 2 == y % 2
                            && x <= y
                            && 2 * this.height - x <= y + 1 ) {
                        System.out.print(this.fillChar);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.height; x++) {
                    switch (this.alignment) {
                        case LEFT -> {
                            if (x <= y) { System.out.print(this.fillChar + " "); }
                        }
                        case RIGHT -> {
                            if (this.height - x <= y + 1) { System.out.print(this.fillChar + " "); }
                            else { System.out.print("  "); }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
