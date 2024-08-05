

                                                                               // PODSTAWY   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


                                                                               import java.util.Scanner;

                                                                               public class Main {                             // klasa publiczna main musi zgadać się nazwą z nazwą w drzewku po lewej stronie
    public static void main(String[] args) {                                                                                   // Zmienne w java musimy określić odrazu! (możenym zadeklarować zmienne i określić ją w innej linijce)
       // String imie = "Michal";                                                                                              // "String określamy tekst który trzeba umieścić w nawiasach "".
       // int wiek = 27;                                                                                                       // Intger (int) określamy liczby całkowietę.




        Scanner scanner = new Scanner(System.in);                                                                              // Druga meteoda na utworzenie instacji (szybsza). Piszemy tylko prawą strone, czyli = new Scanner(System.in) Następnie Ctrl+alt+V.


      //  Scanner scanner = new Scanner(System.in);                                                                            // Scanner to instacja, potem nazwa(ważen żeby była dokładna) = new(słowo kluczowe) nazwa klasy(scaner z małej litery) System.in(argument) Patrz wyżej na "import java.util.Scanner" jest o auto import class, aby zrobić to ręcznie ALT+ENTER
      //  scanner = name;

        System.out.println("Jak masz na imię");
        String name = scanner.nextLine();                                                                                      // scanner.nextLine cała linna którą podał nam użytkowniek przpisana do zmiennej którą deklarujemy (tutaj to "name") String potem nazwa = scanner.nextLine

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();


        System.out.println("Cześć " + name + "! Masz " + age + " lat");                                                     // sout wyświetla w konsoli




    }
}