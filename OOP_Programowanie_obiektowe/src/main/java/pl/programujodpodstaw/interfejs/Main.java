package pl.programujodpodstaw.interfejs;

public class Main {
    public static void main(String[] args) {

        User user = new User();                                                                                         // tworzymy nowego urzytkownika

//
//        LenghtPasswordValidator validator = new LenghtPasswordValidator();                                              // tworzymy zmienna o nazwie validator aby przekazać ją niżej
//        SpecialCharactersPasswordValidator validator2 = new SpecialCharactersPasswordValidator();                       // tworzymy zmienna validator 2

         PasswordValidator validator = new LenghtPasswordValidator();                                                   // możemy zadeklarować te zmienne validator oraz validator 2 za pomocą PasswortdValidator
         validator = new SpecialCharactersPasswordValidator();                                                          // do zmiennej validator mozemy przypisywać inne implementacje (w tym przpadku validator sprawdzić znaki specjalne

         user.setPassword("Hasło" , validator);                                                                 // korzystamy z metody setPassword z klasy User wprowadzić hasło, a następnie przekazać jeden z Validatorów które ktoś stworzył na podstawie interfejscu

                                                                                                                        // w prsoty sposób mogę zmienic  jeden validator na drugi zmieniajać argumnt (linia 11) Nie zmieniamy nic w metodzie .setPassword bo ona oczekuje interface

                                                                                                                        // Programing to a interface @@@@@!!@@@@

                                                                                                                        // Kiedy porojektujemy nasz system, tworzymy metody, zmienne itp poinnimmśmy starać sie operawać nie na konkretnych klasach tylko na interface to zrobiliśmy w metodzie setPassword bo w argumentach nie oczekiwaliśmy żedanej konkretnej
                                                                                                                        // implementacji tylko interface

    }
}