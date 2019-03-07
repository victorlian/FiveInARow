import java.util.Arrays;

public class Board {
    public final static int BOARD_SIZE = 15;

    private Point[][] _points = new Point[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        for(Point[] row: _points) {
            Arrays.fill(row, Point.NONE);
        }
        _points[8][8] = Point.BLACK;
        _points[9][9] = Point.WHITE;
        _points[9][8] = Point.WHITE;
        _points[8][7] = Point.BLACK;
    }

    public void printBoard() {
        for(Point[] row: _points) {
            for (Point p: row) {
                System.out.print(p == Point.NONE ?
                                "+" : p == Point.BLACK ?
                                "X" : "O");
            }
            System.out.println();
        }
    }
}
