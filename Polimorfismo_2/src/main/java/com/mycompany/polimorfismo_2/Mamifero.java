
package com.mycompany.polimorfismo_2;

public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
}
