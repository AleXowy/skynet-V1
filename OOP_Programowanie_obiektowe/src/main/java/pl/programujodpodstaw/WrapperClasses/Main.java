package pl.programujodpodstaw.WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   int[] numbers = new int[] {1 , 2 , 3 , 4};
        System.out.println(numbers[0]);

    //List <int> numbers2 = new ArrayList<>();                                                                          // Arraylist w miejscu `<int` oczekuje obiektu, zamiast zmiennej prmitywnej
    List<Integer> numbers2 = new ArrayList<>();                                                                         // Integer to trb obiektowy dla int, zamienia zmienna primitywną `int` w obiekt który możemy użyć w arrayliscie
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        System.out.println(numbers2.get(1));



    int aPrimitywny = 3;
    Integer aObiektowy = 2;

    Integer a = 2;                                                                                                      // nie używamy operatora `new` do przypisawnia wartości to autoboxing, java automatycznie opakowuje ją w tryb osłonowy wrapperClass
    int b = a;                                                                                                          // unboxing java bierze obiekt typu Intiger `a` wyciąga z niej wartość `2` i przypisuje to typu prymitywnego int `b`




    }
}