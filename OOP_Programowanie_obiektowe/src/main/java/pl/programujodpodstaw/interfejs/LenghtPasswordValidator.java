package pl.programujodpodstaw.interfejs;

public class LenghtPasswordValidator implements PasswordValidator {                                                     // dodaje implements, potem alt+tab i implement methods

    @Override
    public boolean validate(String password) {
        if (password.length() > 8){                                                                                     // sprawdzanie długości hasło, oraz zwracanie boolean'a true/fales do metdoy valitade która przyjmuje string password (to samo sprawdzenie wykonaliśmy w klasnie SpecialCharacterPasswordValidator
            return true;
        } else {
            System.out.println("Hasło ma mniej niż 8 znaków");
            return false;
        }

    }
}