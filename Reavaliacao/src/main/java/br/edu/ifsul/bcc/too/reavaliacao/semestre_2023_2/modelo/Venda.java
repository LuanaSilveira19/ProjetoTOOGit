
package br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

public class Venda implements Comparable<Venda>{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer id;
    private Float valor;
    private Calendar data;
    private Funcionario funcionario;
    private Cliente cliente;
    private Collection<Bovino> bovino;

    public Venda() {
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

    
    public String setData_String(String data) {
         try {
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(sdf.parse(data).getTime());
            this.data = c;
        } catch (Exception e) {
            this.data = null;
        }

           return null;
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
    
    @Override
    public int compareTo(Venda v) {
       //ascendente pelo nome
        return this.valor.compareTo(v.valor);
       
    }
     /*@Override//sobreposição 
     public String toString() {   
     return "Valor: "+ getValor()+", Cliente: "+getCliente();
     }*/
    
}
