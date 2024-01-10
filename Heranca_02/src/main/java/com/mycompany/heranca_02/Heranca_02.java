
package com.mycompany.heranca_02;

public class Heranca_02 {

    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa(); //por ser abstrata não pode ser instanciada
        Visitante v1= new Visitante();
        v1.setNome("Luana");
        v1.setIdade(22);
        System.out.println(v1.toString());
        
        Aluno a1= new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(111);
        a1.setCurso("Informatica");
        a1.setIdade(19);
        a1.setSexo("m");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1= new Bolsista();
        b1.setNome("Ana");
        b1.setMatricula(222);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
