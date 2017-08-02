/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stipendio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alice
 */
public class StipendioFulltime extends Stipendio{
    
    
    public StipendioFulltime(double r, int m) {
        super(r, m);
    }

    @Override
        public double stipMensile(int meseCorrente) {
        double stipMese = 0;
        double totPremi=0;
        
        if (meseCorrente > 0 && meseCorrente<11)
            stipMese=(RAL/mensilita)+totPremiMensili(meseCorrente);
        else 
            System.out.println("Non funziona");
      

        return stipMese;
    }

}
    

