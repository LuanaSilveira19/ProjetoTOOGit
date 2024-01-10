package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

public class Bovino implements Comparable<Bovino>{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private Float peso_chegada;
    private Float peso_atual;
    private Float valor_kg_compra;
    private Float valor_kg_venda;
    private Float custo_diario;
    private Float valor_liquido;
    private Collection<Pesagem> pesagem;
    private Raca raca;
    private Situacao situacao;

    public Bovino() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public Float getPeso_chegada() {
        return peso_chegada;
    }

    public void setPeso_chegada(Float peso_chegada) {
        this.peso_chegada = peso_chegada;
    }

    public Float getPeso_atual() {
        return peso_atual;
    }

    public void setPeso_atual(Float peso_atual) {
        this.peso_atual = peso_atual;
    }

    public Float getValor_kg_compra() {
        return valor_kg_compra;
    }

    public void setValor_kg_compra(Float valor_kg_compra) {
        this.valor_kg_compra = valor_kg_compra;
    }

    public Float getValor_kg_venda() {
        return valor_kg_venda;
    }

    public void setValor_kg_venda(Float valor_kg_venda) {
        this.valor_kg_venda = valor_kg_venda;
    }

    public Float getCusto_diario() {
        return custo_diario;
    }

    public void setCusto_diario(Float custo_diario) {
        this.custo_diario = custo_diario;
    }

    public Float getValor_liquido() {
        
        return valor_liquido;
    }

    public void setValor_liquido(Float valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    public Collection<Pesagem> getPesagem() {
        return pesagem;
    }

    public void setPesagem(Collection<Pesagem> pesagem) {
        this.pesagem = pesagem;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String setData_inicio_string(String data_inicio) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(sdf.parse(data_inicio).getTime());
            this.data_inicio = c;
        } catch (Exception e) {
            this.data_inicio = null;
        }

        return null;
    }

    public String setData_fim_string(String data_fim) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(sdf.parse(data_fim).getTime());
            this.data_fim = c;
        } catch (Exception e) {
            this.data_fim = null;
        }

        return null;
    }
 @Override
    public int compareTo(Bovino t) {
        return this.data_inicio.compareTo(t.data_inicio);//aqui se coloca o que  quer ordenar ex: id, nome, valor...
    }
    @Override//sobreposição 
     public String toString() {   
     return "ID: "+ getId()+ " Valor liquido: "+ getValor_liquido() + " Data inicio: "+sdf.format(getData_inicio().getTime());
     }

}
