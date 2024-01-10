
package br.edu.ifsul.bcc.too.questao1.model;

import java.util.Calendar;
import java.util.Collection;

public class Servico {
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    private Equipe equipe;
    private Orcamento orcamento;
    private StatusServico ststusServico;
    private Collection<Pagamento>pagamento; 

    public Servico() {
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

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public StatusServico getStstusServico() {
        return ststusServico;
    }

    public void setStstusServico(StatusServico ststusServico) {
        this.ststusServico = ststusServico;
    }

    public Collection<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(Collection<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
    
    
}
