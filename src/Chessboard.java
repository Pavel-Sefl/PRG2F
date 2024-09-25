public class Chessboard {
    private final char[][] board;
    private final int size;
    public Chessboard(int size) {
        board = new char[size][size];
        this.size = size;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                this.board[x][y] = ((x+y)%2==0) ? '■' : '□';
            }
        }
    }

    public void printBoard(boolean useNumbering) {
        if (useNumbering) {
            for (int i = 0; i < size ; i++) System.out.print((char) (65+ i));
            System.out.println();
        }
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                System.out.print(this.board[x][y]);
            }
            if (useNumbering) System.out.print(" "+(x+1));
            System.out.println();
        }
    }
}
