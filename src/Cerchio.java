/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
public class Cerchio {
    
    public double raggio;
    

    public void setRaggio (double r){
        raggio=r;
       
                
    }
    
    public double area(){
        return(raggio*raggio*Math.PI);
    }
    
}
