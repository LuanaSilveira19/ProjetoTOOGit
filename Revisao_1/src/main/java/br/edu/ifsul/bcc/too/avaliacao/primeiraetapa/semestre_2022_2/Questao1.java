package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.util.Collections;

public class Questao1 {

    private String raw_data = "123,b,22,f,e,7,1,2,3";

    private java.util.List<Integer> dados = new java.util.ArrayList();

    public void converteDados() {

        int i = 0;
        String d[] = raw_data.split(",");

        while (i < d.length) {
            try {
                String num = d[i].substring(0);//rever certinho esse aqui
                Integer item = Integer.parseInt(num);
                dados.add(item);

            } catch (Exception e) {
                dados.add(0);
            }
            i++;
        }
    }
    
    public void mostrar(){
        Collections.sort(dados);
        System.out.println(dados);
        
    }
    public Questao1() {
        converteDados();
        mostrar();
    }

    public static void main(String args[]) {
        new Questao1();
    }
}
