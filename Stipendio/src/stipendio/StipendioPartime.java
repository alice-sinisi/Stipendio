/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stipendio;

/**
 *
 * @author alice
 */
public class StipendioPartime extends Stipendio{
    
    int hourG;
    public StipendioPartime(double r, int m, int hG) {
        super(r, m);
        hourG=hG;
    }
    
    /**
     *
     * @return
     */
    @Override
     public double stipMensile(int meseCorrente) {
        double stipMese = 0;
        double totPremi=0;
        
         
        stipMese=(RAL/mensilita)+totPremiMensili(meseCorrente);

        
       return stipMese;
    }
    
}
