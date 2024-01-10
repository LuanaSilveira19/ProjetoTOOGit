
package br.edu.ifsul.bcc.too.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Veiculo {
    //ok
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String placa;
    private String modelo;
    private Integer ano;
    private Calendar data_ultimo_servico;

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }
    public String setData_ultimo_servico(String data_ultimo_servico) {//sobrecarga 
       
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(sdf.parse(data_ultimo_servico).getTime());
                this.data_ultimo_servico = c;
            } catch (Exception e) {
                this.data_ultimo_servico = null;
            }
         
        return null;
    }
    
     @Override//sobreposição 
     public String toString() {
        return "Placa: "+ getPlaca()+" Modelo: "+getModelo()+ " Ano: "+getAno()+ " Data do ultimo serviço: "+sdf.format(getData_ultimo_servico().getTime());
    }
}
