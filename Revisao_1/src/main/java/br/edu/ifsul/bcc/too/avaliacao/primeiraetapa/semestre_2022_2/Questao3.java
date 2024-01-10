package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.util.Collections;

public class Questao3 {

    private java.util.List<Integer> lista = new java.util.ArrayList();
    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};

    private void maniula() {
        int i = 0;
        while (i < dados.length) {
            lista.add(dados[i]);
            i++;
        }
         Collections.sort(lista);
         System.out.println(lista);
    }

    public Questao3() {
        maniula();
    }

    public static void main(String args[]) {

        new Questao3();
    }
}
