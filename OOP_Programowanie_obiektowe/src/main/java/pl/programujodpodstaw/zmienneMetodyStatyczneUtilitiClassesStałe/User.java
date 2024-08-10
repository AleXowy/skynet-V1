package pl.programujodpodstaw.zmienneMetodyStatyczneUtilitiClassesStałe;

public class User {

    static int coutner;                                                                                                     // Przed dodanie `static` printy w Main.java dawały 1,1,1. Po dodaniu static printy drukuja 3,3,3. Dzieje sie to dlatego że static sprawia że zmienna staje sie globalna

    public User() {
        coutner++;
    }

    public static void hello() {
        System.out.println("hello");
    }


    public static boolean passwordValidator(String password) {
        return password.length() > 8;
    }
}