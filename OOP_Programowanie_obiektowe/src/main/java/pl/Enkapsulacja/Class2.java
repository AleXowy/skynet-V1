package pl.Enkapsulacja;

public class Class2 {


    public Class2() {
        Class1 user = new Class1("AleXowy", 27);

//        user.age = 20;                                                                                                  // ten kod nie będzie działać, poniewaz po dodaniu "private" ta klasa nie ma dostępu do klasy Class1
//        user.name = "AleX";


          user.setAge(20);                                                                                              // Ustawiamy warotś Age na 20
          user.setName("AleX");                                                                                         // Imimę na AleX




        System.out.println(user.getAge() + user.getName());                                                             // tu drukujemy oba gettery
    }



    }




