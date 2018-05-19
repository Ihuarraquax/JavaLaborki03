/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hubii
 */
public class Data {

    private int dzien;
    private int miesiac;
    private int rok;

    public Data() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Data: ");
        System.out.print("Podaj dzien: ");
        dzien = scn.nextInt();
        System.out.println();
        System.out.print("Podaj miesiac: ");
        miesiac = scn.nextInt();
        System.out.println();
        System.out.print("Podaj rok: ");
        rok = scn.nextInt();
        if (rok==2013){
            try {
                throw new Rok2013Exception("");
            } catch (Rok2013Exception ex) {
                System.out.println("Podano rok 2013.");
            }
        }
        System.out.println();

    }

    public void segreguj(Data[] tab) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                if (tab[i + 1].rok < tab[i].rok) {
                    Data buf = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = buf;
                }
                if (tab[i + 1].rok == tab[i].rok) {
                    if (tab[i + 1].miesiac < tab[i].miesiac) {
                        Data buf = tab[i];
                        tab[i] = tab[i + 1];
                        tab[i + 1] = buf;
                    }
                    if (tab[i + 1].miesiac == tab[i].miesiac) {
                        if (tab[i + 1].dzien < tab[i].dzien) {
                            Data buf = tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = buf;
                        }
                    }
                }

            }
        }
    }

    public void wyswietl(Data[] tab) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Data nr " + (i + 1) + ": " + tab[i].dzien + "." + tab[i].miesiac + "." + tab[i].rok);
        }
    }
}
