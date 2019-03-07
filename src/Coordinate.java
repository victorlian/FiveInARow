/**
 * The coordinate class values should match the coordinates stored in the board class,
 * that is starting index = 0.
 */
public class Coordinate {
    private int row;
    private int col;

    public Coordinate(String coAsString) {
        coAsString = coAsString.toUpperCase();

        char firstLetter = coAsString.charAt(0);
        //ASCII 65=A.

        row = (int) firstLetter - 65;

        try {
            col = Integer.parseInt(coAsString.substring(1)); //throws NumberFormatException
        } catch (NumberFormatException nfex){
            throw new IllegalArgumentException("Bad Input");
        }

        if (row < 0 || row >= Board.BOARD_SIZE
            || col < 0 || col >= Board.BOARD_SIZE) {
            throw new IllegalArgumentException("Bad Input");
        }


    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}
