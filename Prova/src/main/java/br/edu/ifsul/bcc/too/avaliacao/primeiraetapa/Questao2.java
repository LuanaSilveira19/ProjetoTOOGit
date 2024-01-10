
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.Collection;
import java.util.TreeSet;

public class Questao2 {
 private String[] dados = {"80", "1500", "b", "-2", "c", "-50", "22", "6"};
 public Questao2(){
     classificacao();
 }

 private void classificacao(){
     int i=0;
     Collection<Integer> st = new TreeSet();
     while(i<dados.length){
         try {
             Integer num=Integer.valueOf(dados[i]);
             st.add(num);
             
         } catch (Exception e) {
             st.add(0);
         }       
         i++;
     }
     System.out.println("Elementos: "+ st);
 }

 public static void main(String[] args) {
     new Questao2();
 }
}
