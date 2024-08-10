package pl.programujodpodstaw.zmienneMetodyStatyczneUtilitiClassesStałe;

public class Main {
    public static void main(String[] args) {

        User user = new User();                                                                                         // po każdym wywołaniu konstruktora user statyczna zmienna counter zostanie zwiękosza o 1.
        System.out.println(User.coutner);                                                                               // print 1

        User user2 = new User();
        System.out.println(User.coutner);                                                                               // print 2

        User user3 = new User();
        System.out.println(User.coutner);                                                                               //print 3


        System.out.println(user.coutner);
        System.out.println(user2.coutner);
        System.out.println(user3.coutner);

        System.out.println(User.coutner);                                                                               // odwołanie się do `User` jest możliwe tylko po dodaniu `static` do zmiennej counter (linia 5 User.java) ponieważ teraz odwołujemy się do całej klasy, a nie tylko do instancji klasy

        User.hello();                                                                                                   // to samo możemy zrobić z metodami, odwołujem sie do clasy User (user linijka 11)

      User.passwordValidator("hasło");                                                                                  // Utiliti classes przykład to uzycie metody statycznej dla passwordValidatora z lekcji o interfajsach

        System.out.println(unitConverter.unitConverterMetersToFeats(10));                                               // Unikamy tworzenia instancji klasy używając metody static


    }
}
