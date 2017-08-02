/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stipendio;

import static java.io.FileDescriptor.in;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import static javax.management.Query.in;

/**
 *
 * @author alice
 */

//classe astratta
public abstract class Stipendio {

    double RAL;
    int mensilita;
    ArrayList<Premio> premi = new ArrayList<Premio> ();
    
    
    
    //costruttore
    Stipendio (double r, int m){
        RAL=r;
        mensilita=m;
    }
 
    //funzione astratta
    public abstract double stipMensile(int meseCorrente);
    
    //funzione concreta
    public double totPremiMensili(int meseCorrente){
           double totPremi=0;

            for (int i=0; i<premi.size(); i++){
                Premio p= premi.get(i);
                if (p.data.getMonth() == meseCorrente) 
                    totPremi= totPremi + p.importo;
            } 
            
            return totPremi;
    }
    
   
    public void add(Premio premio){
     
        premi.add(premio);
    }

    public ArrayList<Premio> getPremi(int meseCorrente) {
       
        ArrayList <Premio> pippo= new ArrayList<Premio> ();
        
        for (int i = 0; i<premi.size();i++){   
        Premio p= premi.get(i);
            if (p.data.getMonth() == meseCorrente){
                pippo.add(p);
            }
        } 
           return pippo;
       }
        
    
    }
    
  
    
//    public double getTotalePremi(){
//        double tot = 0;
//       
//        for (int i=0; i<premi.size(); i++){
//           Premio p= premi.get(i);
//           tot= tot + p.importo;
//           p.toString();
//        } 
//        return tot;
//    }
       
       
    
    


