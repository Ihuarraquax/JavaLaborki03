package lab3_3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3_3 {

    public static void main(String[] args){
        Wielomian wielomian = new Wielomian(new int[]{1,4});
        Wielomian wielomian2 = new Wielomian(new int[]{1,2,4,6});
        wielomian.wypisz();
        wielomian2.wypisz();

        Wielomian wynik;
        wynik = wielomian.dodaj(wielomian2);
        wynik.wypisz();
        try {
            wielomian.oblicz(15);
        } catch (WynikWiekszyOd100Exception ex) {
            System.out.println("Wynik wiekszy od 100");
        }
    }
}
