package pl.programujodpodstaw.modyfikatoryDostępu;

public class User {

 public String name;                                                                                                    //`public` sprawi że dostęp do danyc będzie wszędzie (w innej klasie, pakiecie)
 private String name2;                                                                                                  //`private` dostęp jest ogranicznay tylko do klasy danej kalsy (User.java)
 String name3;                                                                                                          //`package private` jest modyfikatorem domyślnym (czyli kiedy nie uzyjemy zadnego z modyifukatorów) ogarnicza dostęp do danego pakietu (modyfikatoryDostępu)
 protected String name4;                                                                                                //`protected` dostęp jest ograniczony do klas z danego pakietum, oraz to klasy które dziedziczą po tej klasie (patrz-polimorfizm)
}
