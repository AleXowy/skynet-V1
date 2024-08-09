package pl.programujodpodstaw.podstawyOOP;                                                                                                    // Informacja w jakim pakiecie znajduje się dana klasa
//                                                                                                                      // Clasa skłąda sie z Pul Classy oraz metod classy
//                                                                                                                      // Classa jest skrukturą która może przechowywać dane. Jeżeli mamy urzytkownika, możemy zebrać wszstkie infomracje które go dotyczną w klasie i potem tworzyć kolejne instacje tej klasy dla kolejnych urzytkowników.
public class User {                                                                                                     // możemy również przeprwadzać operacje na Classach, za pomocą metod. żeby przeprwadz operację na Classie tworzymy metode
//
//    String name = "Imię";                                                                                               //Pomiędzy nasiasami kwadratowymi przechowujemy informacje, nazywamy to pola klasy. Każde z nich to osobne pole klasy
//    int age = 20;                                                                                                       // możemy przypisać wartośći domyśle wedle naszego uznania
//    boolean isActive = false;

    //                                                                                                                      ////Metoda to funkcja wykonywana na instancji danej klasy calssy
//    String name;
//    int age;
//    boolean isActive;
//    String email;

//    public User() {
//    }                                                                                                         // poniewaz niżej stworzyliśmy konstruktor z argumentami name, oraz age, java nie użyła konstróktora bezargumentowego. Dlageo sam go stworzyłem
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.isActive = true;
//    }
//
////                                                                                                                      // Jeśli w konskruktorzę, czyli w nawiasach nie podamy nic, utworzymy kklasę bezargumentową
//        //}
//    public User(String name, int age, boolean isActive) {
//        this.name = name;
//        this.age = age;
//        this.isActive = isActive;
//
//    }
//
//    //}
//    public User(String name, int age, boolean isActive , String email) {     //skopiowałem ten konstruktor z lini 27    // tak samo jak z jeden metody możemy wywoływać drugą, z jedneo konstruktora możemy wywoływać inny
//
//        this(name, age, isActive);                                                                                      // tu korzystam w tym konstruktorze z konstruktora z lini 27
////        this.name = name;
////        this.age = age;
////        this.isActive = isActive;
//        this.email = email;                                                                                             // dodaje w polu classy że email=email (wcześniej odałem go w argumencie tego konstuktora)
//    }
//
//    public User(String name) {
//        this.name = name;
//    }
//
//
//        public void hello() {
//                                                                                                           //public (modyfikator dostępu) void (typ który zostanie zwrócony) ello to nazwa
//            System.out.println("Hello");                                                                                        //  etoda o nazwie hello wyświetli nm tekst Hello(zostanie użyty w main.java
//
//        }
//
//        public void printUserInformation(){                                                                             // tworzymy nową metode printUserInfomration.
//            System.out.println("Imimę: " + name);                                                                       // zwraca ona nam text który możemy wyświetlić w main.java
//            System.out.println("Wiek: " + age);
//            System.out.println("Czy aktywny: " + isActive );
//            System.out.println("Czy może kupować: " + canBuyProduct());                                                 // w metodzie printUserInformation, używamy innej metody canBuyProduct
//        }
//
//       public boolean canBuyProduct () {
////           if (this.age >= 18) {                                                                                      // jeśli wartos age jest więkasz lub równa 18 zwracamy true
////               return true;
////           } else {
////               return false;                                                                                          // w przeciwnym razie flase
////           }                                                                                                          // uproszczona wersja zapisu niżej
//
//           return this.age >= 18;                                                                                       // to jest prosta wiersja zapisu
//      }
//
//      public void sendEmail(String body) {                                                                              // tworze metode .sendEmail, z argumentem typu string o nazwie body, która drukuje text drukuje nam text
//          System.out.println("Wysyłam maila o treści " + body + " na adres " + this.email);                             // email/this.email odnosi się do Stringa utowrzoneo w linijcie 14
//      }
//
//      public void sendEmail(String body, String subject) {                                                              // tak samo jak konstruktory, możemy przeciążyć metode (argumenty metody muszą być różne)
//          System.out.println("Wysyłam maila o treści: " + body + " I temacie: "
//                  + subject + " na adres: " + this.email);
//      }






}













