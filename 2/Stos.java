package lab3_2;

import java.util.Scanner;

public class Stos {

    private int rozmiar;
    private int czubek;
    private int[] dane;

    public Stos(int rozmiar) {
        this.rozmiar = rozmiar;
        czubek = rozmiar - 1;
        dane = new int[rozmiar];

    }

    public void wyswietl() {
        for (int i = 0; i < rozmiar; i++) {
            if (i == czubek) {

                System.out.println("   <---CZUBEK");

            } else {
                if (dane[i] != 0) {
                    System.out.println(dane[i]);
                }
            }
        }
    }

    public void dodaj(int ile) {
        Scanner scn = new Scanner(System.in);
        try {
        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj wartość do stosu: ");
            dane[czubek] = scn.nextInt();
            czubek--;
        }}
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Stos osiagnał maksymalny rozmiar.");
        }
    }

    public void zdejmij(int ile) {

        try {
            for (int i = 0; i < ile; i++) {
                int foo=dane[czubek + 1];
                dane[czubek + 1] = 0;
                System.out.println("Usunięto "+ foo+" ze stosu");
                czubek++;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Brak elementow w stosie.");
        }
    }
}
