package XO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<String> gameArea = new ArrayList<>();
        gameArea.add("A1");
        gameArea.add("A2");
        gameArea.add("A3");
        gameArea.add("B1");
        gameArea.add("B2");
        gameArea.add("B3");
        gameArea.add("C1");
        gameArea.add("C2");
        gameArea.add("C3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witam w dupie!!! I zapraszam!\n" +
         " 1.XO \n" +
         " 9.Wyjście");
         int userChoiceMainMenu = Integer.parseInt(scanner.nextLine());
         switch (userChoiceMainMenu) {
             case 1 -> System.out.println();
             case 9 -> System.exit(1);
         }
        System.out.println("1.Wykonaj ruch!");
        boolean playerMove = true;
        while (playerMove){
            System.out.println("Pole gry wygląda następując:\n" +
                    "     " + gameArea.get(0) + " " + "|" + " " + gameArea.get(1) + " |"  + " " + gameArea.get(2) + "\n" +
                    "     --------------\n" +
                    "     " + gameArea.get(3) + " " + "|" + " " + gameArea.get(4) + " |"  + " " + gameArea.get(5) + "\n" +
                    "     --------------\n" +
                    "     " + gameArea.get(6) + " " + "|" + " " + gameArea.get(7) + " |"  + " " + gameArea.get(8) + "\n");

            String userChoice = scanner.nextLine();
        switch (userChoice) {
              case "A1" -> {
                 String a1 = gameArea.get(0).replace("A1", "X ");
                 gameArea.set(0, a1);
                 playerMove = false;
             }
              case "A2" -> {
                 String a2 = gameArea.get(1).replace("A2", "X ");
                 gameArea.set(1, a2);
                 playerMove = false;
             }
              case "A3" -> {
                 String a3 = gameArea.get(2).replace("A3", "X ");
                 gameArea.set(2, a3);
                  playerMove = false;
                          }
              case "B1" -> {
                 String b1 = gameArea.get(3).replace("B1", "X ");
                 gameArea.set(3, b1);
                  playerMove = false;
             }
              case "B2" -> {
                 String b2 = gameArea.get(4).replace("B2", "X ");
                 gameArea.set(4, b2);
                 playerMove = false;
            }
              case "B3" -> {
                  String b3 = gameArea.get(5).replace("B3" , "X ");
                  gameArea.set(5, b3);
                  playerMove = false;
            }

              case "C1" -> {
                  String c1 = gameArea.get(6).replace("C1", "X ");
                  gameArea.set(6, c1);
                  playerMove = false;
           }
              case "C2" -> {
                String c2 = gameArea.get(7).replace("C2", "X ");
                gameArea.set(7, c2);
                  playerMove = false;
            }
              case "C3" -> { String c3 = gameArea.get(8).replace("C3" , "X ");
              gameArea.set(8, c3);
               playerMove = false;
            }
             case "9" -> System.exit(1);
         }
            if (gameArea.get(0).contains("X") && gameArea.get(1).contains("X") && gameArea.get(2).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(0).contains("X") && gameArea.get(4).contains("X") && gameArea.get(8).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(0).contains("X") && gameArea.get(3).contains("X") && gameArea.get(6).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(1).contains("X") && gameArea.get(4).contains("X") && gameArea.get(7).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(2).contains("X") && gameArea.get(5).contains("X") && gameArea.get(8).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(2).contains("X") && gameArea.get(4).contains("X") && gameArea.get(6).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(3).contains("X") && gameArea.get(4).contains("X") && gameArea.get(5).contains("X")) {
                System.out.println("Gracz wygrywa!");
                return;
            } else if (gameArea.get(0).contains("O") && gameArea.get(1).contains("O") && gameArea.get(2).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            } else if (gameArea.get(0).contains("O") && gameArea.get(4).contains("O") && gameArea.get(8).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            } else if (gameArea.get(0).contains("O") && gameArea.get(3).contains("O") && gameArea.get(6).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            }  else if (gameArea.get(1).contains("O") && gameArea.get(4).contains("O") && gameArea.get(7).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            }  else if (gameArea.get(2).contains("O") && gameArea.get(5).contains("O") && gameArea.get(8).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            }  else if (gameArea.get(2).contains("O") && gameArea.get(4).contains("O") && gameArea.get(6).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            }  else if (gameArea.get(3).contains("O") && gameArea.get(4).contains("O") && gameArea.get(5).contains("O")) {
                System.out.println("Komputer wygrywa!");
                return;
            } else if (!gameArea.get(0).contains("A1") && !gameArea.get(1).contains("A2") && !gameArea.get(2).contains("A3")
                    && !gameArea.get(3).contains("B1") && !gameArea.get(4).contains("B2") && !gameArea.get(5).contains("B3")
                    && !gameArea.get(6).contains("C1") && !gameArea.get(7).contains("C2") && !gameArea.get(8).contains("C3")) {
                System.out.println("Remis!:\n" +
                        "     " + gameArea.get(0) + " " + "|" + " " + gameArea.get(1) + " |"  + " " + gameArea.get(2) + "\n" +
                        "     --------------\n" +
                        "     " + gameArea.get(3) + " " + "|" + " " + gameArea.get(4) + " |"  + " " + gameArea.get(5) + "\n" +
                        "     --------------\n" +
                        "     " + gameArea.get(6) + " " + "|" + " " + gameArea.get(7) + " |"  + " " + gameArea.get(8) + "\n");
                        break;
            }
            boolean skynetMove = true;
         while (skynetMove){
         int randomMove = random.nextInt(9);
             if ((!gameArea.get(2).contains("X")) && !(gameArea.get(2)).contains("O") &&
             gameArea.get(0).equals("X") && gameArea.get(1).equals("X")) {
                 gameArea.set(2, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(6).contains("X")) && !gameArea.get(6).contains("O") &&
              gameArea.get(0).contains("X") && gameArea.get(3).contains("X")) {
                 gameArea.set(6, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(8).contains("X")) && !gameArea.get(8).contains("O") &&
              gameArea.get(0).contains("X") && gameArea.get(4).contains("X")) {
                 gameArea.set(8, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(7).contains("X")) && !gameArea.get(7).contains("O") &&
              gameArea.get(1).contains("X") && gameArea.get(4).contains("X")) {
                 gameArea.set(7, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(0).contains("X")) && !gameArea.get(0).contains("O") &&
              gameArea.get(1).contains("X") && gameArea.get(2).contains("X")) {
                 gameArea.set(0, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(6).contains("X")) && !gameArea.get(6).contains("O") &&
              gameArea.get(2).contains("X") && gameArea.get(4).contains("X")) {
                 gameArea.set(6 , "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(8).contains("X")) && !gameArea.get(8).contains("O") &&
              gameArea.get(2).contains("X") && gameArea.get(5).contains("X")) {
                 gameArea.set(8, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(5).contains("X")) && !gameArea.get(5).contains("O") &&
              gameArea.get(3).contains("X") && gameArea.get(4).contains("X")) {
                 gameArea.set(5, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(1).contains("X")) && !gameArea.get(1).contains("O") &&
              gameArea.get(4).contains("X") && gameArea.get(7).contains("X")) {
                 gameArea.set(1, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(3).contains("X")) && !gameArea.get(3).contains("O") &&
              gameArea.get(4).contains("X") && gameArea.get(5).contains("X")) {
                 gameArea.set(3, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(0).contains("X"))&& !gameArea.get(0).contains("O") &&
              gameArea.get(4).contains("X") && gameArea.get(8).contains("X")) {
                 gameArea.set(0, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(2).contains("X"))&& !gameArea.get(2).contains("O") &&
              gameArea.get(4).contains("X") && gameArea.get(6).contains("X")) {
                 gameArea.set(2, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(2).contains("X"))&& !gameArea.get(2).contains("O") &&
              gameArea.get(5).contains("X") && gameArea.get(8).contains("X")) {
                 gameArea.set(2, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(8).contains("X")) && !gameArea.get(8).contains("O") &&
              gameArea.get(6).contains("X") && gameArea.get(7).contains("X")) {
                 gameArea.set(8, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if ((!gameArea.get(0).contains("X")) && !gameArea.get(0).contains("O") &&
              gameArea.get(6).contains("X") && gameArea.get(3).contains("X")) {
                 gameArea.set(0, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else if (!gameArea.get(randomMove).contains("X") && !gameArea.get(randomMove).contains("O")) {
                 gameArea.set(randomMove, "O ");
                 skynetMove = false;
                 playerMove = true;
             } else {
                skynetMove = true;
             }
            }
           }


    }
}
