package pl.Enkapsulacja;

public class PasswordValidator {

 public void ValidatePassword (String password) {                                                                       // tu używamy public void, aby urzytkownik miał dostep do tej metody
 validateLenght(password);
 valitadeSpecialCharacters(password);
 }
 private void validateLenght (String password){                                                                         // używamy private void zamiast public, aby uzytkownik nie miał dostępu do tej klay
 if (!(password.length()>8)) {
     System.out.println("Hasło jest za krótkie");
 }
 }

 private void valitadeSpecialCharacters(String password){                                                               // to samo co wyżej
 if (!(password.contains("#")) || password.contains("%")){
     System.out.println("Znak specjalny wymagany");
 }
 }
}

