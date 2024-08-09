package pl.programujodpodstaw.Enkapsulacja;

public class Class1 {

//                                                                                                                      // Enkapsulacja 

     private String name;                                                                                                // private- oznacza że będzie zmenna dostepna tylko w danej classie (tu "Class1")
     private int age;                                                                                                   // Patrz Klasa (Class2) Linijka 8
                                                                                                                          // Skrót do tworzenia (Na przykał konstruktora) alt + Insert
    public Class1(String name, int age) {
        this.name = name;
        this.age = age;
    }


                                                                                                                          // Gettery i Settery Skrót do tworzenia (To getter i setter) alt + Insert

                                                                                                                                                                    // GETTER!!!
    public String getName() {                                                                                            // Utworzone zostały metody publiczne do którego dostępn ma każda klassa, następnie zwaracamy typ, następnie get+nazwa
        return name;
    }
                                                                                                                                                                    // SETTER!!
    public void setName(String name) {                                                                                  // Utworzone zostały metody publiczne do którego dostępn ma każda klassa, następnie void bo nic nie zwracamy, następnie set+nazwa
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   



}


