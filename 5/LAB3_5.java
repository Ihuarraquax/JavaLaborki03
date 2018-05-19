/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_5;

/**
 *
 * @author Hubii
 */
public class LAB3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data[] daty= new Data[5];
        for(int i=0;i<5;i++){
            daty[i]= new Data();
        }
        daty[1].segreguj(daty);
        daty[1].wyswietl(daty);
        
    }
    
}
