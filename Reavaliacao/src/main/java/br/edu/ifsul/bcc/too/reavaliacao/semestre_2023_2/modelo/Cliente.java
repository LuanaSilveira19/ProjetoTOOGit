
package br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente extends Pessoa {
    private String cnpj;
    private Calendar  data_ultima_compra;
    private Float valor_compras;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }
     public String setData_ultima_compra_string(String data_ultima_compra) {
         try {
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(sdf.parse(data_ultima_compra).getTime());
            this.data_ultima_compra = c;
        } catch (Exception e) {
            this.data_ultima_compra = null;
        }

        return null;
    }

    public Float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(Float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
   /* @Override//sobreposição 
     public String toString() {   
     return "Nome: "+ getNome()+", Data nascimento: "+ sdf.format(getData_nascimento().getTime());
     }*/
    
    
}
