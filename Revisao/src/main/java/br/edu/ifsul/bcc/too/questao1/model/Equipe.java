
package br.edu.ifsul.bcc.too.questao1.model;

import java.util.Collection;

public class Equipe {
    //ok
    private Integer id;
    private String nome;
    private String especilidades;
    private Collection<Funcionario>funcionario; 

    public Equipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecilidades() {
        return especilidades;
    }

    public void setEspecilidades(String especilidades) {
        this.especilidades = especilidades;
    }

    public Collection<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Collection<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
