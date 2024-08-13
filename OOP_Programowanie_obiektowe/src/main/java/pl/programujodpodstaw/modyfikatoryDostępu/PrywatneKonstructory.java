package pl.programujodpodstaw.modyfikatoryDostępu;

public class PrywatneKonstructory {
         private static PrywatneKonstructory INSTANCE;                                                                  // Prywatne pole które będzie przechowywało instancje klasy `PrywatneKonstructory` WAŻNE ABY POLE OZNACZYĆ JAKI STATIC (STATYCZNE) BO MUSI BYĆ POWĄZANY Z CAŁA KLASĄ (TO SAMO W LINI 7)
         private PrywatneKonstructory() {}                                                                              // Konstruktor prywatyn, stosowany jest so do stworzenia tak zwanego Singleton (wzorzec projektowy) to klasa która może mieć tylko jedną instanceje

         public static PrywatneKonstructory getInstance() {                                                             // tworzymy metode publiczną, której zadaniem jest zwrócenie instancji tej klasy
             if (INSTANCE == null) {                                                                                    // sprawdzamy czy pole `INSTANCE` zostało zainicjalizowane
                 INSTANCE = new PrywatneKonstructory();                                                                 // jeżeli `INSTANCE` równa sie `null` to znaczy że pole NIE zostało zainicjalizowane to tworzymy nawą instancje klasy `PrywatneKonstructory` PRZYPOMINAM O METODA PUBLICZNA

             }
             return INSTANCE;

         }
}
