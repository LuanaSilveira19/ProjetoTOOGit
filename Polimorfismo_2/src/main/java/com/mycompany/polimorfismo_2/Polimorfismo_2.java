
package com.mycompany.polimorfismo_2;
  //Polimorfismo de sobrecarga: Tem assinaturas diferentes na mesma classe
public class Polimorfismo_2 {

    public static void main(String[] args) {
        
        Cachorro c= new Cachorro();
        
        c.reagir("Olá");
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        
        
        
    }
}
