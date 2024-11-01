package pl.programujodpodstaw.Ćwiczenie04_04;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Car_Ć04_04 {
    DecimalFormat decimalFormat = new DecimalFormat("####,#");

    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    private double range;
    private final int maxRange;
    private double fuelUsage;
    private double fuelUsedInLiters;
    private double tank;
    private final double tankcapacity;
    private double rageInLiters;
    private double actualRange;

    public Car_Ć04_04(String make, String model, int year, String color, int maxSpeed, int range, double fuelUsage , double tank) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange = range;
        this.fuelUsage = fuelUsage;
        this.tank = tank;
        this.tankcapacity = tank;
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

    public double getRange() {
        return range;
    }

    public int getMileage() {
        return mileage;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public double getTankcapacity() {
        return tankcapacity;
    }

    public double getActualRange() {
        return actualRange;
    }

    public void setActualRange(double actualRange) {
        this.actualRange = actualRange;
    }

    public void drive(int distance) {
           if (range > 0 && range >= distance && tank > 0){
            mileage += distance;
               range = (tank / fuelUsage) * 100;
               range -= distance;
            fuelUsedInLiters = ((double) distance / 100) * fuelUsage;
            tank -= fuelUsedInLiters;
         } else {
            System.out.println("Za mało paliwa!");
         }
    }

    public void addFule() {
        System.out.println("Podaj ile litrów paliwa dolewasz?");
        Scanner scanner = new Scanner(System.in);
        double fuel = Double.parseDouble(scanner.nextLine());
        if (tank < tankcapacity) {
            rageInLiters += (fuel / fuelUsage) * 100;
            tank += fuel;
            range += (fuel / fuelUsage) * 100;
        } else {
            System.out.println("Bak pełny!");
        }


//        System.out.println("Podaj na ile kilometrów dolewasz paliwa?");
//        Scanner scanner = new Scanner(System.in);
//        int fuel = Integer.parseInt(scanner.nextLine());
//
//        if ((fuel + rage) < maxRange) {
//            rage += fuel;
//        } else {
//            System.out.println("Bak pełny!\n" + maxRange+"/" + maxRange + "Km!");
//            rage = maxRange;
//        }

   }



}








