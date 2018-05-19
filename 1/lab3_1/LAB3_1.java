
package lab3_1;

import Exceptions.DlugoscException;
import Exceptions.WiekException;

public class LAB3_1 {

    public static void main(String[] args) {
        try {
            Osoba osoba = new Osoba();
            osoba.setOsoba();
        } catch (DlugoscException ex) {
            System.out.println(ex.getMessage());
        } catch (WiekException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
