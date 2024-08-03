import java.text.DecimalFormat;
import java.util.Scanner;
public class Car {

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
    private final double tankCapacity;
    private double rageInLiters;

    public Car(String make, String model, int year, String color, int maxSpeed, int range, double fuelUsage, double tank) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange = range;
        this.fuelUsage = fuelUsage;
        this.tank = tank;
        this.tankCapacity = tank;
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

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void drive(int distance) {
        if (range > 0 && range >= distance && tank > 0) {
            mileage += distance;
            range = (tank / fuelUsage) * 100;
            range -= distance;
            fuelUsedInLiters = ((double) distance / 100) * fuelUsage;
            tank -= fuelUsedInLiters;
        } else {
            System.out.println("Za mało paliwa!");
        }
    }
    public void addFuel() {
        System.out.println("Podaj ile litrów paliwa dolewasz?");
        Scanner scanner = new Scanner(System.in);
        double fuel = Double.parseDouble(scanner.nextLine());
        if ((tank + fuel) < tankCapacity) {
            rageInLiters += (fuel / fuelUsage) * 100;
            tank += fuel;
            range += (fuel / fuelUsage) * 100;
        } else {
            System.out.println("Bak pełny!");
        }
    }
}












