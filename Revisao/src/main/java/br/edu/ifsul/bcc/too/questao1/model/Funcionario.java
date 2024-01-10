
package br.edu.ifsul.bcc.too.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.text.MaskFormatter;

public class Funcionario extends Pessoa {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //ok
    private String numero_ctps;
    private Calendar data_adm;
    private Cargo cargo;

    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_adm() {
        return data_adm;
    }

   public void setData_adm(Calendar data_adm) {
        this.data_adm = data_adm;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
     public String setData_adm(String data_adm) {//sobrecarga 
     
            try {
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(sdf.parse(data_adm).getTime());
                this.data_adm = c;
            } catch (Exception e) {
                this.data_adm = null;
            }
        
        return null;
    }
     
     @Override//sobreposição 
     public String toString() {
         try{
                MaskFormatter mask=new MaskFormatter("###.###.###-##");
                    mask.setValueContainsLiteralCharacters(false);
        return "CPF: " +mask.valueToString(this.getCpf()) + " Nome: "+ this.getNome()+" CTPS:"+ this.getNumero_ctps()+" Data ADM: "+ sdf.format(this.getData_adm().getTime());
          }catch (Exception e){}
      return null;
    }
    
}
