/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4;

/**
 *
 * @author Hubii
 */
public class LAB3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Licznosc1lub2Exception {
        Tablica tab = new Tablica(1);
        Tablica tab2 = new Tablica(1);
        tab.wypelnij();
        tab.wypelnij();
        int licznosc = tab.licznosc(tab2);
        if (licznosc == 1 || licznosc == 2) {
            throw new Licznosc1lub2Exception("Licznosc wyniosła 1 lub 2.");
        }

    }

}
