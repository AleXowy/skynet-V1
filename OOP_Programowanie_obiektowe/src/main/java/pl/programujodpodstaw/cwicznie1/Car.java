package pl.programujodpodstaw.cwicznie1;

public class Car {

 String  make;
 String model;
 int year = 2023;
 String color;

 public Car(){}



 public Car(String make , String model , String color) {
   this.make = make;
   this.model = model;
   this.color = color;

 }

 public Car(String make , String model , String color, int year) {
        this(make, model, color);
        this.year = year;


 }

    public void CarInformation(){
        System.out.println("Marka auta: " + make + "\nModel auta: " + model + "\nKolor auta: " + color +
                "\nRok produkcji " + year);


    }










}


