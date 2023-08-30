public class Board {
    String [][] array = new String[5][5];
    public Board() {
        for(int row = 0; row < array.length; row++){

            for (int col = 0; col < array[row].length; col++){
                array[row][col] = "-";
            }
        }


    }

    public void printBoard() {
        int index =0;
        System.out.println();
        System.out.println("\t0\t1\t2\t3\t4");
        System.out.println();
        for (String[] a : array) {
            System.out.print(index+"\t");
            index++;
            for (String i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

    }


    public void placeShips(int coordinates) {

            //int row = String.valueOf(coordinates).charAt(0);
            //System.out.println(row);
        int row = coordinates / 10;  // Extract the first digit
        int col = coordinates % 10;  // Extract the second digit
            array[row][col] = "@";

    }

    public boolean checkIfHit(int row, int col, Board enemyBoard){//Might not need this.
        boolean hit = false;

        if()
    }
}
