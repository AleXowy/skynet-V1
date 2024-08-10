package pl.programujodpodstaw.zmienneMetodyStatyczneUtilitiClassesStałe;

public class unitConverter {

 private static final double METER_TO_FOOT = 3.28084;                                                                     // aby zachować czytelnośc kodu unikamy tzw"magic number" czyli liczba które są opisane i nie wiadomo co oznaczją, dlatego tworzymy stałą. Konwencja jest aby użyć wielkich liter
 public static double unitConverterMetersToFeats (double meters) {
  return meters * METER_TO_FOOT;                                                                                        // zamiast `3.28084` uzywamy stałej `3.28084`
 }
}
