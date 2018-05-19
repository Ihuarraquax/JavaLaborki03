/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

import static java.lang.Math.pow;

/**
 *
 * @author Hubii
 */
public class Wielomian {

    public int[] wsp;

    
// Nalezy wprowadzic odwrócony wielomian ( od najmniejszej potegi x )
    public Wielomian(int[] w) {
        wsp = w;
    }
// {1 4 7 5}
    public void wypisz() {
        for (int i = wsp.length - 1; i >= 0; i--) {

            if (wsp[i] >= 0) {
                System.out.print("+" + wsp[i] + "x^" + i);
            } else {
                System.out.print(wsp[i] + "x^" + i);
            }

        }
        System.out.println("");
    }

    public Wielomian dodaj(Wielomian wlm) {
        int dlugosc = wsp.length;
        //sprawdzenie czy wielomian z parametru jest dluzszy jesli tak to true i zmiana int dlugosc.
        boolean dluzszy = false;
        if (wsp.length < wlm.wsp.length) {
            dlugosc = wlm.wsp.length;
            dluzszy = true;
        }
        int[] wyn = new int[dlugosc];
//     4 4 5 6 8   this
// 8 3 4 2 4 5 6   arg
// -------------
//8 3 8 6 9 11 14  wynik
        for (int i = 0; i < dlugosc; i++) {
            try {
                wyn[i] = wlm.wsp[i] + wsp[i];
            } catch (Exception ex) {

                if (dluzszy == true) {
                    wyn[i] = wlm.wsp[i];
                    //mimo exc petla idzie dalej
                } else {
                    wyn[i] = wsp[i];
                    //mimo exc petla idzie dalej
                }
            }
        }
        Wielomian wynik = new Wielomian(wyn);
        return wynik;
    }

    public Wielomian odejmij(Wielomian wlm) {
        int dlugosc = wsp.length;
        boolean dluzszy = false;
        if (wsp.length < wlm.wsp.length) {
            dlugosc = wlm.wsp.length;
            dluzszy = true;
        }
        int[] wyn = new int[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            try {
                wyn[i] = wsp[i] - wlm.wsp[i];
            } catch (Exception ex) {

                if (dluzszy == true) {
                    wyn[i] = wlm.wsp[i] * -1;
                } else {
                    wyn[i] = wsp[i];
                }
            }
        }

        Wielomian wynik = new Wielomian(wyn);
        return wynik;
    }

    public Wielomian iloczyn(Wielomian w) {
        int dlg = wsp.length + w.wsp.length - 1;

        int[] w1 = wsp;
        int[] w2 = w.wsp;

        int[] iloczyn = new int[dlg];

        for (int i = 0; i < w1.length; i++) {
            for (int j = 0; j < w2.length; j++) {
                iloczyn[i + j] = iloczyn[i + j] + w1[i] * w2[j];
            }
        }

        return new Wielomian(iloczyn);
    }
    public void oblicz(int x) throws WynikWiekszyOd100Exception{
        int wynik=0;
        for(int i=wsp.length-1;i>=0;i--){
            wynik = (int) (wynik + pow(x,i)*wsp[i]); 
        }
        if (wynik>100){
            throw new WynikWiekszyOd100Exception("Wynik wiekszy niz 100");
        }
        System.out.println(wynik);
    }
}
