package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.ArrayList;
import java.util.Collection;

public class Questao1 {

    public Questao1(String param) {
        extracaoInteiros(param);
        imprimir(extracaoInteiros(param));
    }

    private Collection<Integer> extracaoInteiros(String param) {
        int i = 0;
        String d[] = param.split(",");
        Collection<Integer> lst = new ArrayList();
        while (i < d.length) {
            try {
                String num = d[i].substring(d[i].indexOf(":") + 2, d[i].indexOf("}"));
                Integer item = Integer.parseInt(num);
                lst.add(item);

            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }

        return lst;
    }

    public void imprimir(Collection<Integer> extracaoInteiros) {
        System.out.println("Elementos: " + extracaoInteiros);
    }

    public static void main(String[] args) {
        String json = "[{codigo: 123}, {codigo: 0}, {codigo: 59}]";
        new Questao1(json);
    }
}
