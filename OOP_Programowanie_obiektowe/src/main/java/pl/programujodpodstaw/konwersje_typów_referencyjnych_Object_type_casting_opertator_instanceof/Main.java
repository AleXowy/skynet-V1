package pl.programujodpodstaw.konwersje_typów_referencyjnych_Object_type_casting_opertator_instanceof;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

     List<User> users = new ArrayList<>();                                                                              // jeśli w liście przechowujemy typu `User` więc zwraceać będzie również typ `User`

        User user1 = new User();
        Moderator moderator = new Moderator();
        Admin admin = new Admin();

     users.add(user1);  //intex 0
     users.add(moderator); // intex 1
     users.add(admin); // index 2

//        User user1 = users.get(1);                                                                                    // pobieramy z list moderatora, i przypisujemy go do zmiennej user1 (my wiemy ze to moderator)
//        user1.editPost();                                                                                             // nie możemy użyć metody `editPost` bo jest to metdoa z klasy `Moderator`, pomimo że wiemy że pobraliśmi wcześniej z list moderatora
//      Moderator user1 = (Moderator) users.get(1);                                                                       //  uzywamy TYPE CASTINGU (konwersje typów) czyli zmieniam klase do której sie odwołujemy na `Moderator` a następnie po `=` `(Moderator). Klasy na którą robimy konwersje musi dziedziczyć po klanie głownej
//      user1.editPost();                                                                                                 // teraz metdoa z klasy Moderator `.editPost` jest dostępna

//        Admin user2 = (Admin) users.get(1);                                                                           // błąd ClassCastException bo próbowaliśmy użyć metody z klasy admin, odwołując sie to klasy mod
//        user2.deletePost();

                                                                                                                        //type casint(UP-CASTING) dokonuje sie automatycznie. Tworzymy instancje klasy potomnej `Moderator` ale jako typ podajemy klase bazową `User`

     User moderatorUpCasting = new Moderator();                                                                               // przykład UP-CASTINGU

                                                                                                                        // type casting (DOWN CASTING) dokonujemy ręcznie dokonanie konwersji na typ klasy potomnej `Moderator`
     Moderator user3 = (Moderator) users.get(1);                                                                        // pobieramy z klasy User


//                                                                                                                      // @@@@@@@@@@@@ Operator instanceof

    for (User user : users){                                                                                             
        if (user instanceof Admin) {
            ((Admin) user).deletePost();
        } else if
            (user instanceof  Moderator) {
                ((Moderator) user).editPost();
            } else {
                user.hello();

            }
        }



    }
}