package XO2;

import java.util.Scanner;

public class SinglePlayer {
    String scannerMovesXOChose;
    Board board = new Board();                  // tu trzeba jjutro ogarnic kurwa ;/

    public boolean singlePlayerXO() {


        System.out.println("Chose X or O!");

        Scanner scannerSP = new Scanner(System.in);
        scannerMovesXOChose = scannerSP.nextLine();
        scannerMovesXOChose = scannerMovesXOChose.toUpperCase();

        if (scannerMovesXOChose.equals("X")) {
            singlePlayerXOMoves();
        } else if (scannerMovesXOChose.equals("O")) {
            singlePlayerXOMoves();
        } else {
            System.out.println("Wrong input! " + StatusCodes.NOT_FOUND + " " + StatusCodes.NOT_FOUND.getCode());
            return singlePlayerXO();
        } return true;
    }

    boolean test = false;

    public boolean singlePlayerXOMoves() {
        System.out.println("Make move!");
        board.showBoard();
        Scanner scannerMoves = new Scanner(System.in);
        String userMove = scannerMoves.nextLine();
     while (true){             // here put boolen returnig wining condition 
        switch (userMove.toLowerCase()) {
            case "a1" -> {
                GameArea.A1.setArea(scannerMovesXOChose + " ");
                board.showBoard();
                //.replace("a1" , scannerMoves + " ");
            }
            case "a2" -> {
                GameArea.A2.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "a3" -> {
                GameArea.A3.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "b1" -> {
                GameArea.B1.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "b2" -> {
                GameArea.B2.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "b3" -> {
                GameArea.B3.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "c1" -> {
                GameArea.C1.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "c2" -> {
                GameArea.C2.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
            case "c3" -> {
                GameArea.C3.setArea(scannerMovesXOChose + " ");
                board.showBoard();                                                       //.replace("a1" , scannerMoves + " ");
            }
        }
//        if (test) {
//            System.out.println("Wygrna");
//            return false;
//        } else {
//            singlePlayerXOMoves();
        }
        return new Game2().gameStart2();

    }

}


