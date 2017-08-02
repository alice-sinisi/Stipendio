/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stipendio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alice
 */
public class Main {
    //creazione ArrayList
       static ArrayList<Stipendio> stipendio = new ArrayList<Stipendio> ();
       
       
       public static void main(String[] args) {
        // TODO code application logic here
        Premio p1 = new Premio(new Date(2017,05,12),1000.00);
        Premio p2 = new Premio(new Date("20 March 2017"),2000.00);
        Premio p3 = new Premio(new Date("20 March 2017"),2000.00);
        
        //inserimento dati stipendio
        Stipendio stip1 = new StipendioPartime (10000.50,14,6);
        Stipendio stip2 = new StipendioFulltime (25000.50,14);
        stip2.add(p1);
        stip2.add(p2);
        stip2.add(p3);
        
       
        //aggiungo gli stipendi all'ArrayList
        stipendio.add(stip1); 
        stipendio.add(stip2);
//        premi.add(p1);
//        premi.add(p2);
        
       // Visualizzare dati ArrayList
       int meseCorrente = 2;
       
        for (Integer i=0; i<stipendio.size();i++){
           Stipendio s= stipendio.get(i);
           ArrayList <Premio> p= s.getPremi(meseCorrente);
           for (Integer j=0; j<p.size();j++){
               
               System.out.println(p.get(j).importo);
               p.get(j).importo =0;
               
           }
           String msg = "La mia RAL è " + s.RAL + ", le mensilità sono "+ s.mensilita + " e il mio Stipendio mensile del " + meseCorrente +"° mese è " + s.stipMensile(meseCorrente)+"; Nell'anno il totale dei miei premi è: "+ s.totPremiMensili(meseCorrente);
           
           System.out.println(msg);
          
        }
               // Visualizzare dati ArrayList
       meseCorrente = 13;
        for (Integer i=0; i<stipendio.size();i++){
           Stipendio s= stipendio.get(i);
           ArrayList <Premio> p= s.getPremi(meseCorrente);
             for (Integer j=0; j<p.size();j++){
               
               System.out.println(p.get(j).importo);
           }
           String msg = "La mia RAL è " + s.RAL + ", le mensilità sono "+ s.mensilita + " e il mio Stipendio mensile del " + meseCorrente +"° mese è " + s.stipMensile(meseCorrente)+"; Nell'anno il totale dei miei premi è: "+ s.totPremiMensili(meseCorrente);
           System.out.println(msg);
         
        }
        // modifica mensilità pos 1 elemento 2
        stipendio.get(1).mensilita=12; 
        

        
    }
}
