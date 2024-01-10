
package com.mycompany.polimorfismo_1;

public class Polimorfismo_1 {
    //Polimorfismo de sobreposição: Tem a mesma assinatura em classes diferentes
  
    public static void main(String[] args) {
       //Animal n= new Animal(); da erro pois animal é abstrato e não pode ser instanciada
       Mamifero m= new Mamifero();
       Reptil r= new Reptil();
       Peixe p= new Peixe();
       Ave a= new Ave();
       Canguru c= new Canguru();
       Cachorro k= new Cachorro();
       Cobra j= new Cobra();
       Tartaruga t= new Tartaruga();
       GoldFish g=new GoldFish();
       Arara e= new Arara();
       
       m.setPeso(35.4f);
       m.setCorPelo("Marrom");
       m.alimentar();
       m.emitirSom();
       m.locomover();//correndo
       
       
       a.locomover();//voando
       p.locomover();//nadando
       r.locomover();//rastejando
       
       c.locomover();//saltando
       k.locomover();//correndo
       k.emitirSom();//au au
       
       
       
       
       
    }
}
