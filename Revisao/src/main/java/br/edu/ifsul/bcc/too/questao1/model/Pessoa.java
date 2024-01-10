package br.edu.ifsul.bcc.too.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Pessoa {

    private String cpf;
    private String nome;
    private String cep;
    private String complemento;
    private Calendar data_nascimento;

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String setData_nascimento_string(String data_nascimento) {//sobrecarga 

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(sdf.parse(data_nascimento).getTime());
            this.data_nascimento = c;
        } catch (Exception e) {
            this.data_nascimento = null;
        }

        return null;

    }

}
