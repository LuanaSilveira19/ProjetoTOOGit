package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class Pesagem {

    private java.util.Date c;
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
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public String setData_string(String data) {//usar assim se precisar formatar data
        try {
            this.data = sdf.parse(data);
        } catch (Exception e) {
            this.data = null;
        }

        return null;
    }
    
    /* public Pesagem(String data, Float peso) { se tiver outro parecido
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            this.data = sdf.parse(data);
        } catch (ParseException ex) {
            this.data = null;
        }
        this.peso = peso;
    }*/

    @Override
    public String toString() {
        return "Data: " + sdf.format(getData()) + " Peso: " + getPeso();
    }

}
