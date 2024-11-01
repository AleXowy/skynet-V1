package pl.programujodpodstaw.polimorfizm;

public class Mod extends User{                                                                                          // extends + nazwa klasy aby skorzystać z dzieczicenia
 public void editPost(String post, int id) {
     System.out.println("Edytowanie posta o ID:" + id);
 }

}


