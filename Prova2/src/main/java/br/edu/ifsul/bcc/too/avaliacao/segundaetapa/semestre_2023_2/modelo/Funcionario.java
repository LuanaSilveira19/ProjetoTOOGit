
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.util.Date;

public class Funcionario extends Pessoa {
     private String numero_ctps;
    private Date data_adm;
    private Date data_demissao;

    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Date getData_adm() {
        return data_adm;
    }

    public void setData_adm(Date data_adm) {
        this.data_adm = data_adm;
    }

    public Date getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    
}
