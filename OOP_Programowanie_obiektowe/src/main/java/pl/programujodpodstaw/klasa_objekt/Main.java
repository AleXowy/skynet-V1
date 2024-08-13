package pl.programujodpodstaw.klasa_objekt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

                                                                                                                        //  CRTR + N i wyszykuje `Object`- Object to klasa po której dziedziczną wszyske klasy w języku java co oznacza że ma wszystkie metody klasy Object(CTRL + F12 kiedy przeglądamy klase Object.java)
        User user = new User();
//          Object user = new User();                                                                                     // zamiast `User` możemy użyć `Object
        System.out.println(user.getClass());

        Developer developer = new Developer();
//
//        List<Object> people = new ArrayList<>();                                                                      // dzięki klase Object możemy dodawać na listy objekty różnego typu na raz na naszej listy
//        people.add(developer);
//        people.add(user);
//
//        List<User , Developer> people2 = new ArrayList<>();
//        people2.add(developer);
//        people2.add(user);
//
   }
}
