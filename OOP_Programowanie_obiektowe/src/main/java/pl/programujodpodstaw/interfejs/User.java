package pl.programujodpodstaw.interfejs;

public class User {
      public void setPassword(String password, PasswordValidator validator){                                            // Tworzymy metode setPassword przekazujemy do niej password oraz interface PasswordValidator
      validator.validate(password);                                                                                     // wywołuję metode z PasswordValidator i w argumence password
      // "PasswordValidator jest tylko interfejscem który mówi że chce żeby prawdziwy validator zawierał metode valitade która przyjmie hasło i zwróci true albo flase
 }
}
