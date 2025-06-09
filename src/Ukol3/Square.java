package Ukol3;

public class Square extends Shape {
    /* Attributes */
    private int size;
    private boolean filled;

    /* Get/Setters */
    public int getSize() { return size; }
    public void setSize(int size) { this.size = Math.abs(size); }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    /* Constructors */
    public Square(int size) {
        this.setSize(size);
        this.filled = true;
    }

    public Square(int size, boolean filled) {
        this.setSize(size);
        this.filled = filled;
    }

    /* Method Overrides */
    @Override
    public void drawShape() {
        for (int y = 0; y < this.size; y++) {
            for (int x = 0; x < this.size; x++) {
                if (filled
                        || y == 0
                        || y == this.size - 1
                        || x == 0
                        || x == this.size - 1) {
                    System.out.print(this.fillChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
