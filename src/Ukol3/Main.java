package Ukol3;

public class Main {
    /*
        Tohle jsem kdysi programoval v C++ na mobilu lol
     */

    public static void main(String[] args) {
        /* Square */
        Square stveresek = new Square(15);
        Square smallBox = new Square(6, false);

        stveresek.drawShape();
        System.out.println();

        smallBox.drawShape();
        System.out.println("\n\r");

        /* Triangle */
        Triangle lTri = new Triangle(5);
        Triangle rTri = new Triangle(5, TriangleAlignment.RIGHT);
        Triangle cTri = new Triangle(12, TriangleAlignment.CENTER);

        lTri.drawShape();
        System.out.println();

        rTri.drawShape();
        System.out.println();

        cTri.drawShape();
    }
}
