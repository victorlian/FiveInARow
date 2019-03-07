import java.io.BufferedReader;
import java.util.Scanner;

public class Game {
    private Board _board;
    private Player currentPlayer = Player.BLACK;

    public Game() {
        _board = new Board();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }

    public void play() {
        while (!finished()) {
            _board.printBoard();
            Coordinate co;
            try {
                co = getInput();
            } catch (IllegalArgumentException iaex) {
                printErrorInput();
                continue;
            }
            System.out.print(co.getRow() + " " + co.getCol());
        }
    }

    public boolean finished() {
        return false;
    }

    public void printErrorInput() {
        System.out.println("Invalid move, please try again.");
    }

    public void printNextToPlay() {
        System.out.print("It's " + currentPlayer.toString() + " To Move: ");
    }

    //Throws IllegalArgumentException if input wasn't correct
    public Coordinate getInput() {
        printNextToPlay();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().trim();
        return new Coordinate(input);
    }
}
