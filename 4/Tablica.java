/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4;

import java.util.Random;

/**
 *
 * @author Hubii
 */
public class Tablica {

    public int[] wartosci;

    public Tablica(int n) {
        wartosci = new int[n];

    }

    public void wypelnij() {
        Random rand = new Random();
        for (int i = 0; i < wartosci.length; i++) {
            wartosci[i] = (rand.nextInt(5) + 1);
        }

    }

    public int licznosc(Tablica tab) {
        int licznosc = wartosci.length + tab.wartosci.length;
        return licznosc;

    }

}
