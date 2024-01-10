
package br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2;

import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Bovino;
import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Cliente;
import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Funcionario;
import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Raca;
import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Situacao;
import br.edu.ifsul.bcc.too.reavaliacao.semestre_2023_2.modelo.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Questoes {

    public Questoes() {
        inicializaListaVenda();
        imprimeListaVenda(inicializaListaVenda());
    }
    
    private Collection<Venda> inicializaListaVenda() {
        // (envolvendo todas as classes) rever certo
        Collection<Venda> V = new ArrayList();
        
        Venda V1= new Venda();
        Venda V2= new Venda();
        Venda V3= new Venda();
        
        Cliente c= new Cliente();
        c.setNome("Jorge");
        c.setData_nascimento_string("02/02/1978");
        c.setData_ultima_compra_string("12/03/2021");
        c.setCep("966400000");
        c.setCnpj("88222362");
        c.setValor_compras(230f);
        c.setCpf("928371921291");
        c.setRg("39873264");
        c.setNumero("6543456789");
        c.setComplemento("aaaa");
        
        Funcionario f= new Funcionario();
        f.setData_admissão_string("01/04/2022");
        f.setData_demssão_string("12/01/2023");
        f.setNome("Carol");
        f.setNumero_ctps("243");
        f.setData_nascimento_string("20/01/2000");
        f.setCpf("2457891231");
        f.setRg("987654567821");
        f.setCep("3244444442");
        f.setNumero("2882228121");
        f.setComplemento("xxxxx");
        
        Collection<Bovino> bov = new ArrayList();
        Bovino b= new Bovino();
        b.setId(1);
        b.setData_inicio_string("01/03/2022");
        b.setData_fim_string("01/10/2022");
        b.setSituacao(Situacao.VIVO);
        b.setPeso_chegada(150.10f);
        b.setValor_kg_compra(14.20f);
        b.setValor_kg_venda(9.10f);
        b.setPeso_atual(350f);
        Raca r = new Raca(1, "Devon");
        b.setRaca(r);
        b.setCusto_diario(1.00f);
        b.setValor_liquido(1327f);
        bov.add(b);
        
        V1.setData_String("20/01/2022");
        V1.setId(1);
        V1.setCliente(c);
        V1.setFuncionario(f);
        V1.setValor(270f);
        V1.setBovino(bov);
        
        V.add(V1);
        
        
        Collection<Bovino> bov2 = new ArrayList();
        Cliente c2= new Cliente();
        c2.setNome("Caetano");
        c2.setData_nascimento_string("02/02/1970");
        c2.setData_ultima_compra_string("12/03/2021");
        c2.setCep("916400000");
        c2.setCnpj("88352362");
        c2.setValor_compras(30f);
        c2.setCpf("9423432192");
        c2.setRg("3245664545");
        c2.setNumero("3726542");
        c2.setComplemento("bbbbb");
        
        Funcionario f2= new Funcionario();
        f2.setData_admissão_string("01/04/2017");
        f2.setData_demssão_string("12/01/2023");
        f2.setNumero_ctps("23");
        f2.setNome("Joana");
        f2.setData_nascimento_string("20/01/1970");
        f2.setCpf("43442445435");
        f2.setRg("3121315");
        f2.setCep("3121321");
        f2.setNumero("9821812812");
        f2.setComplemento("yyyyyyy");
        
       
        Bovino b2= new Bovino();
        b2.setId(2);
         b2.setPeso_atual(650f);
        b2.setData_inicio_string("01/03/2022");
        b2.setData_fim_string("01/12/2022");
        b2.setSituacao(Situacao.VIVO);
        b2.setPeso_chegada(170.10f);
        b2.setValor_kg_compra(15.20f);
        b2.setValor_kg_venda(10.10f);
         b2.setValor_liquido(2327f);
    
        b2.setRaca(r);
        b2.setCusto_diario(2.00f);
        bov2.add(b2);
        
        V2.setData_String("20/01/2022");
        V2.setId(2);
        V2.setCliente(c2);
        V2.setFuncionario(f2);
        V2.setValor(210f);
        V2.setBovino(bov2);//ver se não da erro
        
        V.add(V2);
        
        Collection<Bovino> bov3 = new ArrayList();
        Cliente c3= new Cliente();
        c3.setNome("Luana");
        c3.setData_nascimento_string("02/02/1990");
        c3.setData_ultima_compra_string("12/03/2017");
        c3.setCep("443400000");
        c3.setCnpj("12238352362");
        c3.setValor_compras(430f);
        c3.setCpf("134543212");
        c3.setRg("456789021");
        c3.setNumero("93871231");
        c3.setComplemento("bbbbb");
        
        Funcionario f3= new Funcionario();
        f3.setData_admissão_string("03/04/2017");
        f3.setData_demssão_string("17/01/2023");
        f3.setNumero_ctps("322");
        f3.setNome("Carlos");
        f3.setData_nascimento_string("20/01/1975");
        f3.setCpf("43234842");
        f3.setRg("312321");
        f3.setCep("2199292");
        f3.setNumero("92817212");
        f3.setComplemento("zzzzzz");
        
       
        Bovino b3= new Bovino();
        b3.setId(3);
        b3.setData_inicio_string("01/03/2021");
        b3.setData_fim_string("01/12/2022");
        b3.setSituacao(Situacao.VIVO);
        b3.setPeso_chegada(470.10f);
        b3.setValor_kg_compra(15.20f);
        b3.setValor_kg_venda(10.10f);
        b3.setRaca(r);
        b3.setPeso_atual(750f);
        b3.setCusto_diario(3.00f);
        b3.setValor_liquido(367f);
        bov3.add(b3);
        
        V3.setData_String("10/04/2022");
        V3.setId(3);
        V3.setCliente(c3);
        V3.setFuncionario(f3);
        V3.setValor(310f);
        V3.setBovino(bov3);//ver se não da erro
        
        V.add(V3);
        
        
        return V;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private void imprimeListaVenda(Collection<Venda> vend) {
         Collections.sort((ArrayList)vend);
         for (Venda v : vend) {
            System.out.println("====================Vendas====================");
           
             System.out.println("Valor: "+ v.getValor());
             System.out.println("Id: "+ v.getId());
             System.out.println("Data: "+ sdf.format(v.getData().getTime()));
             
             System.out.print("CLIENTE: "+ v.getCliente().getNome());
             System.out.print(", Data ultima compra: "+sdf.format(v.getCliente().getData_ultima_compra().getTime()));
             System.out.print(", Data Nascimento: "+sdf.format(v.getCliente().getData_nascimento().getTime()));
             System.out.print(", Valor da compra: "+v.getCliente().getValor_compras()+ ", CEP: "+v.getCliente().getCep()+ ", CNPJ: "+v.getCliente().getCnpj());
             System.out.println(", CPF: "+ v.getCliente().getCpf()+", RG: "+ v.getCliente().getRg()+", Numero: "+ v.getCliente().getNumero()+", Complemento: "+ v.getCliente().getComplemento());
             
             System.out.print("FUNCIONARIO: "+ v.getFuncionario().getNome()+", CTPS: "+v.getFuncionario().getNumero_ctps());
             System.out.print(", Data ADM: "+sdf.format(v.getFuncionario().getData_admissão())+ ", Data DEM: "+ sdf.format(v.getFuncionario().getData_demssão())+ ", Data nascimento: "+ sdf.format(v.getFuncionario().getData_nascimento().getTime()));
             System.out.println(", CPF: "+ v.getFuncionario().getCpf()+", RG: "+ v.getFuncionario().getRg()+", Numero: "+ v.getFuncionario().getNumero()+", Complemento: "+ v.getFuncionario().getComplemento());
             
             System.out.println("BOVINO: "+v.getBovino().toString());
         }
    
    }
    
    
    
    
    
    
    
    
    
     public static void main(String[] args) {
        new Questoes();
    }
}
