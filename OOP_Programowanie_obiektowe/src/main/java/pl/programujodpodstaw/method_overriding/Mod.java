package pl.programujodpodstaw.method_overriding;

public class Mod extends User {
//                                                                                                                      // CTRL + insert następnie method overriting
    @Override                                                                                                           // słowo kluczowe @Override oznacza że przesłoniolismy metode
    public void hello() {
       // super.hello();                                                                                                  // domyślnie prze intellij przesłowniona metoda to super.
//                                                                                                                      // super. to słowo kluczowę które ozncz że odwołujemy sie to klasy pierwotnej (w tym przypadku user)
        System.out.println("jestem mod");
    }
}
