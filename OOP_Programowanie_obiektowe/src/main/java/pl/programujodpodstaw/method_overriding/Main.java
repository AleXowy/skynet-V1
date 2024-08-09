package pl.programujodpodstaw.method_overriding;

public class Main {
    public static void main(String[] args) {
        User user = new User();                                                                                         // tworze instancje klass user i mod
        Mod mod = new Mod();

       user.hello();
       mod.hello();                                                                                                     // skorzystaliśmy z dziedziczenia (klasa Mod) aby skorzystać z metody .hello


    }

}

