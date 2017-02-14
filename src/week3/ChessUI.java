package week3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChessUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessBoard myBoard = new ChessBoard();
        int turn = 0;
        boolean gameover = false;

        System.out.println(myBoard);

        while (!gameover) {
            if (turn % 2 == 0) {
                System.out.println("White Player's Turn: ");
                System.out.println("Piece Position: (Row) (Column)");
                int rowFrom = sc.nextInt();
                int colFrom = sc.nextInt();

                System.out.println("Move To: (Row) (Column)");
                int rowTo = sc.nextInt();
                int colTo = sc.nextInt();
                System.out.println("");
                    myBoard.move(rowFrom, colFrom, rowTo, colTo);
                    System.out.println(myBoard);

                System.out.println("Do you want to keep playing?");
                System.out.println("Type Yes or No: ");
                String quit = sc.next();
                if (quit.equals("No")) {
                    gameover = true;
                    System.out.println("The game is over.");
                } else if (quit.equals("Yes")) {
                    
                    turn++;
                }
            } else {
                System.out.println("Black Player's Turn: ");
                System.out.println("Piece Position: (Row) (Column)");
                int rowFrom = sc.nextInt();
                int colFrom = sc.nextInt();

                System.out.println("Move To: (Row) (Column) ");
                int rowTo = sc.nextInt();
                int colTo = sc.nextInt();
                System.out.println("");
                myBoard.move(rowFrom, colFrom, rowTo, colTo);
                System.out.println(myBoard);
                System.out.println("Do you want to keep playing?");
                System.out.println("Type Yes or No");
                String quit = sc.next();
                if (quit.equals("No")) {
                    gameover = true;
                    System.out.println("The game is over.");
                } else if (quit.equals("Yes")) {

                    turn++;
                }
            }

        }

    }
}
