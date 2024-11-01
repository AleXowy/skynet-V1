package XO2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Game2 game2 = new Game2();
       Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Welcome!\nMain menu!\n" +

                   " 1.XO \n" +
                   " 9.Wyjście");


           int userChoiceMainMenu = scanner.nextInt();
           switch (userChoiceMainMenu) {
               case 1 -> { game2.gameStart2();


               }


               case 9 -> System.exit(1);
           }




       }
    }
}