import java.util.Arrays;

public class Board {
    public final static int BOARD_SIZE = 15;
    public final static String INDENT = "    ";

    private Point[][] _points = new Point[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        for(Point[] row: _points) {
            Arrays.fill(row, Point.NONE);
        }
    }

    public void printBoard() {

        printHorizontalLabel();

        int rowCount = 0;
        for(Point[] row: _points) {
            String indentSpace = rowCount < 10 ? INDENT.substring(1)
                                                : INDENT.substring(2);
            System.out.print(rowCount + indentSpace);
            rowCount++;

            for (Point p: row) {
                System.out.print(p == Point.NONE ?
                                "+" : p == Point.BLACK ?
                                "X" : "O");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printHorizontalLabel() {
        System.out.print(INDENT);
        char label = 'A';

        for (int i = 0; i < BOARD_SIZE ; i++ ) {
            System.out.print(label);
            label++;
        }
        System.out.println();
    }
}
