package lab3_2;

import java.util.Scanner;

public class LAB3_2 {

    public static void main(String[] args) {
        Stos stos = new Stos(5);
        Scanner scn = new Scanner(System.in);
        int wybor = 1;
        while (wybor != 0) {
            wybor = scn.nextInt();
            switch (wybor) {
                case 1:
                    stos.wyswietl();
                    break;
                case 2:
                    stos.dodaj(scn.nextInt());
                    break;
                case 3:
                    stos.zdejmij(scn.nextInt());
                    break;
            }

        }

    }

}
