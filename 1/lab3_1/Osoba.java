/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

import Exceptions.DlugoscException;
import Exceptions.WiekException;
import java.util.Scanner;

/**
 *
 * @author Hubii
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    
    public void setOsoba() throws DlugoscException, WiekException{
        Scanner scn = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie = scn.nextLine();
        if(imie.length()<4){
            throw new DlugoscException("Imię jest za krótkie.");
        }
        System.out.println("Podaj nazwisko: ");
        nazwisko = scn.nextLine();
        if(nazwisko.length()<4){
            throw new DlugoscException("Nazwisko jest za krótkie.");
        }
        System.out.println("Podaj wiek: ");
        wiek = scn.nextInt();
        if(wiek>100||wiek<0){
            throw new WiekException("Wiek nie nalezy do przedzialu 0-100");
        }
    }
    
}
