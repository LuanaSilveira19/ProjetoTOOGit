
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

public class Raca {
    private Integer id;
    private String nome;

    public Raca() {
    }

    public Raca(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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
    
}
