package pl.zmienne_finalne;

public class User {

private final String name;                                                                                              // dodajemy "final"
private final int age;

    public User(String name, int age) {                                                                                 // tworzymy konsruktor (alt+insert)
        this.name = name;
        this.age = age;
    }

    public String getName() {                                                                                           // tworzymy gettery (tylko gettery, bo nie da sie utworzyć setterów dlatego że działamy na zmiennej finale)
        return name;
    }

    public int getAge() {
        return age;
    }
}
