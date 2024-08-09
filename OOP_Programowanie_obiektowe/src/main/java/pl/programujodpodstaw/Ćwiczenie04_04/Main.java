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

        System.out.println("Przewidywany Zasięg (w kilometrach- Km) (opcjonalne)");
        int range = Integer.parseInt(scanner.nextLine());

        System.out.println("Pojemność zrobiornika paliwa (w Litrach- L)");
        double tank = Double.parseDouble(scanner.nextLine());

        System.out.println("Spalanie w litrach na 100km");
        double fuelUsage = Double.parseDouble(scanner.nextLine());


        System.out.println();

    Car_Ć04_04 car_Ć04_04 = new Car_Ć04_04(make, model, year, color, maxSpeed,range ,fuelUsage,tank);
        car_Ć04_04.setActualRange((tank / fuelUsage) * 100);

       System.out.println("Marka: " + car_Ć04_04.getMake() + "\nModel: " + car_Ć04_04.getModel() + "\nRok Produkcji: " + car_Ć04_04.getYear() +
                       "\nKolor: " + car_Ć04_04.getColor() + "\nPrędkość maxymalna: " + car_Ć04_04.getMaxSpeed() + " K/h" + "\nPrzewidawalny zasięg: " + car_Ć04_04.getRange()
                       + " Km " + "\nZasięg na podstawie średniego spalania: " + Math.round(car_Ć04_04.getActualRange()) + "Km" + "\nSpalanie: " + car_Ć04_04.getFuelUsage() + "Litrów na 100km" + "\nPojemność zrobiornika paliwa:\n" + Math.round(car_Ć04_04.getTankcapacity()));

     while (true){
     System.out.println("Wybierz jedną z poniższy opcji:\n1.Jedź!\n2.Uzupełnij benzynę!\n3.Zakończ!");
     String menu = scanner.nextLine();
           switch (menu){
               case "1" -> {
                  System.out.println("Podaj dystans który chcesz przejechać kilometrach!");
                  car_Ć04_04.drive(Integer.parseInt(scanner.nextLine()));
                 // System.out.println("Aktualny przebieg to:"+ Car_Ć04_04.getMileage() + "KM\nPozostały zasięg to:" + Car_Ć04_04.getRage());
               }
               case "2" -> car_Ć04_04.addFule();
               case "3" -> System.exit(0);
              }
               System.out.println("\nAktualny przebieg to " + car_Ć04_04.getMileage() + "Km\nPozostały zasięg to:" +  Math.round(car_Ć04_04.getRange())+ "Km" + "\nPozostało " + Math.round(car_Ć04_04.getTank())+ "L/\n" + Math.round(car_Ć04_04.getTankcapacity()));
          }
    }
}

