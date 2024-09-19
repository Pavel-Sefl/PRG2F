public class Chessboard {
    public char[][] board;
    private int size;
    public Chessboard(int size) {
        this.board = new char[][] {};
        this.size = size;

        for (int x = 0; x < size; x++) {
            this.board[x] = new char[] {};
            for (int y = 0; y < size; y++) {
                this.board[x][y] = ((x+y)%2==0) ? '#' : ' ';
            }
        }
    }

    public void printBoard() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                System.out.println(this.board[x][y]);
            }
        }
    }
}
