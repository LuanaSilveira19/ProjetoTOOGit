
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.util.Calendar;
import java.util.Collection;

public class Venda {
    private Funcionario funcionario;
    private Cliente cliente;
    private Collection<Bovino>bovino; 
    private Integer id ; 
    private Float valor ;
    private Calendar data ;

    public Venda() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Bovino> getBovino() {
        return bovino;
    }

    public void setBovino(Collection<Bovino> bovino) {
        this.bovino = bovino;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    
    
}
