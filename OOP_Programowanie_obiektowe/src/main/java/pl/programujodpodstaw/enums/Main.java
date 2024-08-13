package pl.programujodpodstaw.enums;

public class Main {
 public static void main(String[] args){
//                                                                                                                      // Enmumy to to specjalne klasy przechowujące stałe, nie da sie utworzyć instancji kalsy enuma, możemy przypisać do zmiennej pole enmua (nazwaEnuma.ZawartośćPolaEnuma)

//     DaysOfWeek day = DaysOfWeek.MONDAY;
//
//     if ( day == DaysOfWeek.MONDAY){                                                                                    // to porówywania enumów używamy `==` zamiast equles!
//         System.out.println("To początek tygodnia");
//     }


     RequestHandler requestHandler = new RequestHandler();                                                              // instancja klasy `RequestHandler`
//     System.out.println(requestHandler.handleRequest());                                                                // wywołainie metody handleRequest
//
     StatusCode statusCode = requestHandler.handleRequest();                                                            // możemy równiez utworzyć instancje klasy RequestHandler (która zwraca enuma)
//     System.out.println(statusCode);

     int code = statusCode.getCode();                                                                                   // przypisujemy gttera `getCode` do zmiennej `code`
     System.out.println(code);                                                                                          // i następnie wyśietlamy go
     System.out.println(statusCode.name());                                                                             // wyśwoetl nazwe enuma
     StatusCode[] values = StatusCode.values();                                                                         // tablica setingów wyświetla zawetrosć całej klasy(niżej jest samo wyśietlnie pętlą for each

     for (StatusCode value : values){
         System.out.println(value);
     }
 }
}
