
package br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo;

import java.util.Date;

public class Pesagem {
      private Date data;
      private Float peso;
      private Bovino bovino;

    public Pesagem() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
      
   

}
