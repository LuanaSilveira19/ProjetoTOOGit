package br.edu.ifsul.bcc.too.questao2;

import br.edu.ifsul.bcc.too.questao1.model.Cliente;
import br.edu.ifsul.bcc.too.questao1.model.Funcionario;
import br.edu.ifsul.bcc.too.questao1.model.Orcamento;
import br.edu.ifsul.bcc.too.questao1.model.Pessoa;
import br.edu.ifsul.bcc.too.questao1.model.Veiculo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Questao_2_3_4 {

    public Questao_2_3_4() {
        inicializaListaPessoas();
        imprimeListaPessoas(inicializaListaPessoas());
        inicializaListaOrcamentos();
        imprimeListaOrcamentos(inicializaListaOrcamentos());
    }

    private List<Pessoa> inicializaListaPessoas() {

        List<Pessoa> lst = new ArrayList();
        Collection<Veiculo> veiculo = new ArrayList();
        Veiculo v1 = new Veiculo();
        v1.setPlaca("igd1903");
        v1.setModelo("vectra");
        v1.setAno(1997);
        v1.setData_ultimo_servico("01/02/2022");
        veiculo.add(v1);

        Pessoa p = new Funcionario();
        p.setCpf("11111357788");
        p.setNome("Zé Chaves");
        p.setData_nascimento_string("01/05/1983");

        p.setCep("99052250");
        p.setComplemento("apartamento 400");
        ((Funcionario) p).setNumero_ctps("123");
        ((Funcionario) p).setData_adm("20/10/1999");

        lst.add(p);

        p = new Cliente();
        p.setCpf("11111357788");
        p.setNome("Zé Chaves");
        p.setData_nascimento_string("01/05/1983");
        p.setCep("99052250");
        p.setComplemento("apartamento 400");
        ((Cliente) p).setObservacoes("cliente que paga em dia");
        ((Cliente) p).setVeiculo(veiculo);
        lst.add(p);

        return lst;
    }

    private List<Orcamento> inicializaListaOrcamentos() {
        List<Orcamento> orc = new ArrayList();
        Orcamento o1 = new Orcamento();
        Orcamento o2 = new Orcamento();

        o1.setId(1);
        o1.setObservacoes("carro em péssimas condições");
        o1.setData("14/12/2022");

        for (Pessoa p : inicializaListaPessoas()) {
            if (p instanceof Cliente) {
                Cliente c = (Cliente) p;
                o1.setCliente(c); //da erro pois o cliente retorna como NULL
                
            }
        }

        orc.add(o1);
        o2.setId(2);
        o2.setObservacoes("carro em péssimas condições");
        o2.setData("15/12/2022");
        o2.setCliente(null);

        orc.add(o2);

        return orc;
    }

    private void imprimeListaPessoas(List<Pessoa> lista) {
        for (Pessoa p : lista) {
            if (p instanceof Funcionario) {
                Funcionario f = (Funcionario) p;
                System.out.println("====================FUNCIONÁRIO====================");
                System.out.println(f.toString());
            } else {
                Cliente c = (Cliente) p;
                System.out.println("====================CLIENTE====================");
                System.out.println(c.toString());
            }

        }
    }

    private void imprimeListaOrcamentos(List<Orcamento> lista) {
        for (Orcamento o : lista) {
            System.out.println("====================ORÇAMENTO====================");
            System.out.println(o.toString());
        }
    }

    public static void main(String args[]) {

        new Questao_2_3_4();
    }
}
