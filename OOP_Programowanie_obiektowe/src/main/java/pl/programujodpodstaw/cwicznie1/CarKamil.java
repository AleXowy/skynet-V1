package pl.programujodpodstaw.cwicznie1;

import java.util.Scanner;

public class CarKamil {
//                                                                                                                      //  Cwiczenie rozwiązane w kursie przez autora

    String make;
    String model;
    int year;
    String color;
    int mileage;
    int maxSpeed;
    int rage;


    public CarKamil(String make, String model, int year, String color) {                                                // alt + insert skrót do tworzenia konstroktora
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarKamil(String make, String model, int year, String color, int mileage, int maxSpeed, int rage) {
        this(make, model, year, color);
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
        this.rage = rage;

    }

//
//    public void drive() {
//        System.out.println("Podaj przejechany dystatns");
//        Scanner scanner = new Scanner(System.in);
//        int drivenDistance = scanner.nextInt();
//        mileage = mileage + drivenDistance;
//        rage = rage - drivenDistance;
//        System.out.println("Przejechany dystans to " + mileage + " zasięg to " + rage);
//        scanner.close();
//    }


    //    public CarKamil(String make, String model, String color) {
//       this(make , model , 2023 , color);                                                                         // aby uniknąc duplikowania kodu, urzywamy slowa kloczowego this.
//    }


    public void CarInformation() {
        System.out.println("Marka auta: " + make + "\nModel auta: " + model + "\nKolor auta: " + color +
                "\nRok produkcji " + year);
    }

}





