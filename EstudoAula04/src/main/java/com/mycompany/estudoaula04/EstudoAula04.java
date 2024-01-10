package com.mycompany.estudoaula04;

public class EstudoAula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);

        // c1.setModelo("Bic");
        //c1.modelo= "Bic";
        // c1.setPonta(0.5f);//dessa maneira funciona normal
        //c1.ponta=0.5f; é privado e da erro
        //  System.out.println("Tenho uma caneta "+ c1.getModelo()+ " de ponta " + c1.getPonta());
        c1.status();
        Caneta c2=new Caneta("KKK", "Laranja", 2.3f);
        c2.status();
    }
}
