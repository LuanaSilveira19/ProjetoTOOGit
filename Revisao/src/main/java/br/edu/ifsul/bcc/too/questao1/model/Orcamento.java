
package br.edu.ifsul.bcc.too.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

public class Orcamento {
    //ok
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer id;
    private String observacoes;
    private Calendar data;
    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;
    private Collection<MaoObra>maoObra; 
    private Collection<Peca>peca; 

    public Orcamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Collection<MaoObra> getMaoObra() {
        return maoObra;
    }

    public void setMaoObra(Collection<MaoObra> maoObra) {
        this.maoObra = maoObra;
    }

    public Collection<Peca> getPeca() {
        return peca;
    }

    public void setPeca(Collection<Peca> peca) {
        this.peca = peca;
    }
    
     public String setData(String data) {//sobrecarga 
          try {
               
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(sdf.parse(data).getTime());
                this.data = c;
            } catch (Exception e) {
                this.data = null;
            }
         
        return null;
    }
    
     @Override//sobreposição 
     public String toString() {
         if(getCliente()!=null)
             return "ID: "+ getId() +" Obs: "+ getObservacoes() +" Data: "+ sdf.format(getData().getTime())+" Cliente: "+ getCliente().toString();
         else 
        return "ID: "+ getId() +" Obs: "+ getObservacoes() +" Data: "+ sdf.format(getData().getTime())+" Cliente: Sem cadastro";
    }

  
    
}
