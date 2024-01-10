
package br.edu.ifsul.bcc.too.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Collection;
import javax.swing.text.MaskFormatter;


public class Cliente extends Pessoa {
    //ok
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String observacoes;
    private Collection<Veiculo>veiculo; 

    public Cliente() {
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Collection<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Collection<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    
     @Override//sobreposição 
     public String toString() {
          try{
                MaskFormatter mask=new MaskFormatter("###.###.###-##");
                    mask.setValueContainsLiteralCharacters(false);
        return "CPF: " +mask.valueToString(this.getCpf())+ " Nome:"+getNome()+" Data de Nascimento:"+ sdf.format(getData_nascimento().getTime())+" Veiculo: "+getVeiculo();
        }catch (Exception e){}
      return null;
    }
}
