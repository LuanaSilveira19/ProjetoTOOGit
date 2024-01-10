package com.mycompany.estudoaula02;

public class EstudoAula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();//instância o objeto 
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta=0.5f; da erro pois ela é privada
        c1.carga = 80;//deixa mexer em um protegido pois está dentro de 
        //uma classe que utiliza a classe Caneta
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
                
                
    }
}
