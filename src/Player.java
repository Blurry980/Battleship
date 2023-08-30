import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    Board board = new Board();
    ArrayList<Integer> coordinatesUsed = new ArrayList<>();
    int lives = 5;
    Scanner scnr = new Scanner(System.in);



    public Board placeShips(){
        int i = 0;
        while (i != 3){
            System.out.println("Coordinates: ");
            int coordinates = Integer.valueOf(scnr.nextLine());
            if(coordinates < 0 || coordinates >= 55 || (coordinatesUsed.contains(coordinates))) {

                System.out.println("Invalid coordinates");

            } else {
                board.placeShips(coordinates);
                i += 1;
                coordinatesUsed.add(coordinates);
                System.out.println(coordinatesUsed);
                board.printBoard();

            }


        }
        return board;
    }

    public void takeTurn(Board board1, Board board2) { //Working on turn taking. See Board as well
        System.out.println("Enter coordinates to fire upon.");
        System.out.println("Example: Typing '23' means row 2, column 3.");
        int coordinates = scnr.nextInt();
        if(coordinates < 0 || coordinates >= 55) {

            System.out.println("Invalid coordinates");

        } else {
            int row = coordinates / 10;  // Extract the first digit
            int col = coordinates % 10;  // Extract the second digit

            System.out.println(row);
            System.out.println(col);
            System.out.println("Board1");
            board1.printBoard();
            System.out.println("board2");
            board2.printBoard();

           board2.checkIfHit(row,col,board2);


        }
    }
}
