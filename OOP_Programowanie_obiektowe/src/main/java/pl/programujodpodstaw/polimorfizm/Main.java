package pl.programujodpodstaw.polimorfizm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        User user = new User();                                                                                         // Przykłady dziedziczenia,
        user.addPost("Nowy post");

        Mod mod = new Mod();
        mod.editPost("Nowszy post" , 0);

        Admin admin = new Admin();
        admin.deletePost(0);

        ArrayList <User> users = new ArrayList<>();                                                                     // klasa mod, oraz admin są również instatcjami klasy user. Czyli admin i mod są również userami( mod i admin "odziedziczyły" wszystko po klasie user)
        users.add(user);
        users.add(mod);                                                                                                 // dlatego jesteśmy w stanie dodać admina i moda do listy users
        users.add(admin);
    }
}

