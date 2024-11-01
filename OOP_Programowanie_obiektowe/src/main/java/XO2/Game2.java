package XO2;

import java.util.Objects;
import java.util.Scanner;


public class Game2 {
    public boolean gameStart2() {
        Scanner scannerGame = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    XO menu!
                     1.SinglePlayer (Player vs AI)
                     2.Multiplayer (Player vs Player)
                     8.Back to main menu!
                     9.Exit!""");

            String userChoiceTicTacTie = scannerGame.nextLine();


                    if (!Objects.equals(userChoiceTicTacTie, "1") &&
                        !Objects.equals(userChoiceTicTacTie, "2") &&
                        !Objects.equals(userChoiceTicTacTie, "8") &&
                        !Objects.equals(userChoiceTicTacTie, "9")) {                        // Checks if user input is valid !
                    System.out.println("Wrong input! " + StatusCodes.NOT_FOUND + " " + StatusCodes.NOT_FOUND.getCode());
                   continue;  // sprawdz continue
                } switch (userChoiceTicTacTie) {
                        case "1" -> {
                            SinglePlayer singlePlayer = new SinglePlayer();
                            singlePlayer.singlePlayerXO();
                            return true;// temp
                        }
                        case "2" -> {
                            System.out.println("User choice 2!");
                            return true;// temp
                        }
                        case "8" -> {
                            System.out.println("User choice 8!");
                            return false;
                        }
                        case "9" -> System.exit(1);


                    }

                }
            }
        }









