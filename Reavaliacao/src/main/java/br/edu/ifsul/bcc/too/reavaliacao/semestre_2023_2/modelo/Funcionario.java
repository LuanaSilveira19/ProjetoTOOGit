
package br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
    private String numero_ctps;
    private Date data_admissão;
    private Date data_demssão;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Date getData_admissão() {
        return data_admissão;
    }

    public void setData_admissão(Date data_admissão) {
        this.data_admissão = data_admissão;
    }
    
     public String setData_admissão_string(String data_admissão) {
          try {
            this.data_admissão= sdf.parse(data_admissão);
        } catch (Exception e) {
            this.data_admissão = null;
        }

        return null;

    }


    public Date getData_demssão() {
        return data_demssão;
    }

    public void setData_demssão(Date data_demssão) {
        this.data_demssão = data_demssão;
    }
    
     public String setData_demssão_string(String data_demssão) {
        try {
            this.data_demssão= sdf.parse(data_demssão);
        } catch (Exception e) {
            this.data_demssão = null;
        }
          return null;
    }
    
    
}
