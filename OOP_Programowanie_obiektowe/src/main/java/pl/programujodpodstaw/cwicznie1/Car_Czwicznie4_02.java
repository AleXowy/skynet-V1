package pl.programujodpodstaw.cwicznie1;

import java.util.Scanner;
//                                                                                                                      to rozwiązanie
public class Car_Czwicznie4_02 {
//                                                                                                                        // dodajemy private final oraz tworzymymy kolejne zmienne
    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    private int rage;                       // alt+enter (add constructor to paramiter)
    private final int maxRange;             //pole przpisuje w konstruktorze patrz linijka 23
//                                                                                                                       // nie dodajemy mileage do konstrukotra bo na początku ma chcemy żeby miało wartość domyślną 0, dodajemy maxSpeed następnie alt+enter i (Assing paraneter ti fuekd 'maxSpeed')
    public Car_Czwicznie4_02(String make, String model, int year, String color, int maxSpeed, int rage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.rage = rage;
        this.maxRange = rage;                                                                                           // to co podamy w konsrukotrze jako zasięg (rage) to będzie nasz aktulany zasięg i na początku nasz maxymalny zasięg
    }
    public Car_Czwicznie4_02(String make , String model , String color , int maxSpeed, int rage){
    this(make , model , 2023 , color , maxSpeed, rage);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRage() {
        return rage;
    }


    public void drive(int distance) {
        mileage += distance;                                                                                            // mileage += distance to skócona wersja wyrażnie mileage = mileage + distance
        rage -= distance;
}
    public  void addFule (){
        rage = maxRange;
    }

}