package pl.programujodpodstaw.Ćwiczenie04_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aby stworzyć nowy samochód podaj następujące parametry! \nMarka?");
        String make = scanner.nextLine();

        System.out.println("Model?");
        String model = scanner.nextLine();

        System.out.println("Rok producji?");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Kolor?");
        String color = scanner.nextLine();

        System.out.println("Prędkość maxymalna (w kilometrach na godzinę- K/h)");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        System.out.println("Przewidywany Zasięg (w kilometrach- Km)");
        int rage = Integer.parseInt(scanner.nextLine());

        System.out.println("Pojemność zrobiornika paliwa (w Litrach- L)");
        double tank = Double.parseDouble(scanner.nextLine());

        System.out.println("Spalanie w litrach na 100km");
        double fuelUsage = Double.parseDouble(scanner.nextLine());
        System.out.println();

     Car_Ć04_04 Car_Ć04_04 = new Car_Ć04_04(make, model, year, color, maxSpeed, rage,fuelUsage,tank);

       System.out.println("Marka: " + Car_Ć04_04.getMake() + "\nModel: " + Car_Ć04_04.getModel() + "\nRok Produkcji: " + Car_Ć04_04.getYear() +
                       "\nKolor: " + Car_Ć04_04.getColor() + "\nPrędkość maxymalna: " + Car_Ć04_04.getMaxSpeed() + " K/h" + "\nZasięg: " + Car_Ć04_04.getRage()
                       + " Km" + "\nSpalanie: " + Car_Ć04_04.getFuelUsage() + "Litrów na 100km" + "\nPojemność zrobiornika paliwa:" + Car_Ć04_04.getTankcapacity());
        System.out.println();

     while (true){
     System.out.println("Wybierz jedną z poniższy opcji:\n1.Jedź!\n2.Uzupełnij benzynę!\n3.Zakończ!");
     String menu = scanner.nextLine();
           switch (menu){
               case "1" -> {
                  System.out.println("Podaj dystans który chcesz przejechać kilometrach!");
                  Car_Ć04_04.drive(Integer.parseInt(scanner.nextLine()));
                 // System.out.println("Aktualny przebieg to:"+ Car_Ć04_04.getMileage() + "KM\nPozostały zasięg to:" + Car_Ć04_04.getRage());
               }
               case "2" -> Car_Ć04_04.addFule();
               case "3" -> System.exit(0);
              }
               System.out.println();
               System.out.println("Aktualny przebieg to " + Car_Ć04_04.getMileage() + "Km\nPozostały zasięg to:" +  Math.round(Car_Ć04_04.getRage())+ "Km" + "\nPozostało " + Math.round(Car_Ć04_04.getTank())+ "L/" + Car_Ć04_04.getTankcapacity());
               System.out.println();
          }
    }
}

