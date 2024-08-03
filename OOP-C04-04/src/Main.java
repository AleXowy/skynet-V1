import java.util.Scanner;
public class Main {
    // Stwórz klasę Car, która będzie miała następujące atrybuty:
    //  make (marka)
    //  model (model)
    // year (rok produkcji)
    // color (kolor)

    // Stwórz dwa konstruktory- pierwszy z nich powinien przyjmować wszystkie argumenty, drugi z nich powinien
    // przyjmować markę model i kolor. W drugim przypadku rok produkcji za każdym razem ustawiaj jako 2023.


    // Oznacz odpowiednie pola jako finalne, dodaj gettery i settery do tych pól, gdzie uznasz to za stosowne.

    // Dodaj nowe pola:
    //  mileage (przebieg)
    //  maxSpeed (prędkość maksymalna)
    //  range (zasięg)

    // Zaktualizuj konstruktory o nowe parametry.

    // Stwórz dwie nowe metody:
    // drive, która będzie przyjmować przejechany dystans, a następnie będzie zwiększać przebieg i zmniejszać zasięg
    // addFuel która ustawi zasięg na maksymalny (zadbaj również o ustawienie maksymalnego zasięgu podczas tworzenia
    // instancji klasy)

    // Rozwiń program z poprzedniego ćwiczenia, dodając pętle po utworzeniu samochodu, w której będziesz dawać
    // użytkownikowi trzy opcje do wyboru:

    //  1.Jedź
    //  2.Uzupełnij benzynę
    //  3.Zakończ

    // Wybierając opcję nr 1 użytkownik zostanie zapytany o dystans, który chc przejechać, a następnie wywołana
    // zostanie metoda drive.

    // Wybierając opcję nr 2 wywołana zostanie metoda addFuel.

    // Wybierając opcję nr 3 program zakończy się.

    //Po wybraniu opcji nr 1 lub nr 2 wyświetl w konsoli informacje o aktualnym przebiegu i pozostałym zasięgu. Zadbaj
    // o to, by pozostały zasięg nie mógł osiągnąć wartości ujemenj

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aby stworzyć nowy samochód, podaj następujące parametry! \nMarka?");
        String make = scanner.nextLine();

        System.out.println("Model?");
        String model = scanner.nextLine();

        System.out.println("Rok produkcji?");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Kolor?");
        String color = scanner.nextLine();

        System.out.println("Prędkość maksymalna (w kilometrach na godzinę- km/h?)");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        System.out.println("Przewidywany zasięg (w kilometrach- km)");
        int range = Integer.parseInt(scanner.nextLine());

        System.out.println("Pojemność zbiornika paliwa (w litrach- L)?");
        double tank = Double.parseDouble(scanner.nextLine());

        System.out.println("Spalanie w litrach na 100km?");
        double fuelUsage = Double.parseDouble(scanner.nextLine());
        System.out.println();

        Car car = new Car(make, model, year, color, maxSpeed, range,fuelUsage,tank);

        System.out.println("Marka: " + car.getMake() + "\nModel: " + car.getModel() + "\nRok produkcji: " + car.getYear() +
                "\nKolor: " + car.getColor() + "\nPrędkość maksymalna: " + car.getMaxSpeed() + " km/h" + "\nZasięg: " + Math.round(car.getRange())
                + " km" + "\nSpalanie: " + car.getFuelUsage() + "litrów na 100km" + "\nPojemność zbiornika paliwa:" + Math.round(car.getTankCapacity()));
        System.out.println();

        while (true){
            System.out.println("Wybierz jedną z poniższych opcji:\n1.Jedź!\n2.Uzupełnij paliwo!\n3.Zakończ!");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" -> {
                    System.out.println("Podaj dystans, który chcesz przejechać kilometrach!");
                    car.drive(Integer.parseInt(scanner.nextLine()));
                }
                case "2" -> car.addFuel();
                case "3" -> System.exit(0);
            }
            System.out.println();
            System.out.println("Aktualny przebieg to " + car.getMileage() + "km\nPozostały zasięg to:" +  Math.round(car.getRange())+ "km" + "\nPozostało " + Math.round(car.getTank())+ "L/" + car.getTankCapacity());
            System.out.println();
        }
    }
}

