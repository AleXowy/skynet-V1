package pl.programujodpodstaw.cwicznie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Car car = new Car("Skoda", "Octavia", "Red", 2010);
//
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.color);
//        System.out.println(car.year);
//
////
////        Car car2 = new Car("BWM", "M4", "Black");
////        System.out.println(car2.make);
////        System.out.println(car2.model);
////        System.out.println(car2.color);
////        System.out.println(car2.year);
//
//        Car car1V2 = new Car("Skoda", "Octavia", "Red", 2010);
//        car1V2.CarInformation();
//
//        System.out.println("---------------------------------------------------------");
//
//        Car car2V2 = new Car("BWM", "M4", "Black");
//
//

//                                                                                                                           // Cwiczenie rozwiązane w kursie przez autora
//                                                                                                                          // donosi sie do CarKamil.java

////
//        CarKamil carKamil1 = new CarKamil("Ford", "Focus", 2020, "black");
//
//        CarKamil carKamil2 = new CarKamil("McLaren", "420s evo", 2020, "White,grean,red", 100, 280, 200);  // Cwicznie 4,02
//

//       CarKamil carKamil2 = new CarKamil("Ford", "Mondeo", "white");

//        System.out.println(carKamil1.make);
//        System.out.println(carKamil1.model);
//        System.out.println(carKamil1.year);
//        System.out.println(carKamil1.color);
//        System.out.println();
//        carKamil1.CarInformation();
       // carKamil1.color = "yelow";                                                                                      // zmiana wartości color i year
       // carKamil1.year = 2010;    // zakomentowałem w celu wykonania ćwicznia 4.02
       // System.out.println(carKamil1.color);
       // System.out.println(carKamil1.year);
//       carKamil2.CarInformation();
//       carKamil2.drive();

//                                                                                                                      // ćwiczenie wykonane przez AleXowego
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aby stworzyć nowy samochód podaj następujące parametry! \nMarka?");
        String make = scanner.nextLine();

        System.out.println("Model?");
        String model = scanner.nextLine();

        System.out.println("Rok producji?");
        int year = Integer.parseInt(scanner.nextLine());                                                                 // patrzy (scratch klakulator.java linijka 9)

        System.out.println("Kolor?");
        String color = scanner.nextLine();

        System.out.println("Prędkość maxymalna");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        System.out.println("Zasięg");
        int rage = Integer.parseInt(scanner.nextLine());

        Car_Czwicznie4_02 carCzwicznie402 = new Car_Czwicznie4_02(make, model, year, color, maxSpeed, rage);

       System.out.println("Marka: " + make + "\nModel: " + model + "\nRok Produkcji: " + year + "\nKolor: " + color + "\nPrędkość maxymalna: " + maxSpeed + "\nZasięg: " + rage);

        System.out.println("Kamil");                                                                                    // Kamil wykonał to ćwicznie używajć gettreów

       System.out.println("Marka: " + carCzwicznie402.getMake() + "\nModel: " + carCzwicznie402.getModel() + "\nRok Produkcji: " + carCzwicznie402.getYear() +
        "\nKolor: " + carCzwicznie402.getColor() + "\nPrędkość maxymalna: " + carCzwicznie402.getMaxSpeed() + "\nZasięg: " + carCzwicznie402.getRage());
    }


}

