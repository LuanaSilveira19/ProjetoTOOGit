package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Questao2 {
     SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd"); 
     SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy"); 
    private Map<Integer, java.util.Calendar> mapDados = new HashMap();
    private String dadosString = "{codigo:10, data:'2022-01-31'};{codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";

    public Questao2() {

        manipulacaoStrings();
        imprimir();
    }

    private void manipulacaoStrings() {

        String d[] = dadosString.split(";");//split é só usado para strings
        int i = 0;
        while (i < d.length) {

            try {
                String codigo = d[i].substring(d[i].indexOf(":") + 1,d[i].indexOf(","));
                Integer cod=Integer.parseInt(codigo);
                
                String data = d[i].substring(d[i].indexOf(":",d[i].indexOf(",")) + 2, d[i].indexOf("'}"));
                
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(stf.parse(data).getTime());
         
                mapDados.put(cod,c);
            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
    }
    public void imprimir(){
        for (Map.Entry<Integer, Calendar> m : mapDados.entrySet()) { 
            System.out.println("Codigo: "+m.getKey() + ", Data: "+ form.format(m.getValue().getTime()));    
        }
    }

    public static void main(String args[]) {
        new Questao2();
    }
}
