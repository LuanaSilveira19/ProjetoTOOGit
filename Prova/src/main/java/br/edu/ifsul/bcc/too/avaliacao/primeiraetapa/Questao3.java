package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Questao3 {

    public Questao3() {
        datas();
    }

    public void datas() {
        SimpleDateFormat h = new SimpleDateFormat("HH:mm:ss");
        Collection<Calendar> lista = new TreeSet();
        String horas[] = {"17:20:00", "18:20:00", "19:20:00", "06:00:00", "02:59:00"};
        int i = 0;
        while (i < horas.length) {
            try {
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(h.parse(horas[i]).getTime());
                lista.add(c);

            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
        
        /* alternativa 1:  
       Calendar temp = null; 
       for(Calendar cld : lista){  
           temp = cld;
       }
        */
       // temp vai ser a ultima data (é a maior)
          List<Calendar> a = new ArrayList();
            a.addAll(lista);
            
         System.out.println("Maior data: "+ h.format(a.get(a.size() - 1).getTime()));
         System.out.println("Menor data: "+ h.format(a.get(a.size() - 5).getTime()));
  

    }

    public static void main(String[] args) {
        new Questao3();
    }
}
