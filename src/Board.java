import java.util.Arrays;

public class Board {
    public final static int BOARD_SIZE = 15;

    private Point[][] _points = new Point[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        for(Point[] row: _points) {
            Arrays.fill(row, Point.NONE);
        }
    }
}
