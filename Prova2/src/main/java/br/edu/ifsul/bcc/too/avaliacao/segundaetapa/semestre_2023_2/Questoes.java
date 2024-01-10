package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2;
//subir o modelo, nao é o mesmo pacote, ver como fazer um nivel a cima

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Bovino;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Pesagem;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Raca;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Situacao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*ID: 3 Valor liquido: 1560.4 Data inicio: 01/01/2022
====================BOVINO====================
ID: 2 Valor liquido: 1114.9 Data inicio: 01/02/2022
====================BOVINO====================
ID: 1 Valor liquido: 839.5801 Data inicio: 01/03/2022*/
public class Questoes {

    public Questoes() {
        inicializaListaBovino();
        imprimeListaBovino(inicializaListaBovino());
    }

    private Collection<Bovino> inicializaListaBovino() {
        //ver a questão do peso atual do bovino depois
        Collection<Bovino> bov = new ArrayList();//se não pede classificação usar o basico, ArrayList() não elimina duplicados e não classifica
        Collection<Pesagem> pesagem = new ArrayList();
        Pesagem p1 = new Pesagem();
        Pesagem p2 = new Pesagem();
        Bovino b1 = new Bovino();
        b1.setId(1);
        b1.setData_inicio_string("01/03/2022");
        b1.setData_fim_string("01/10/2022");
        b1.setSituacao(Situacao.VIVO);
        b1.setPeso_chegada(150.10f);
        b1.setValor_kg_compra(14.20f);
        b1.setValor_kg_venda(9.10f);
        Raca r = new Raca(1, "Devon");
        b1.setRaca(r);
        b1.setCusto_diario(1.00f);

        p1.setData_string("01/05/2022");
        p1.setPeso(190.00f);
        p2.setData_string("01/10/2022");
        p2.setPeso(350.00f);

        pesagem.add(p1);
        pesagem.add(p2);
        /* b.setPesagem(new Pesagem("01/05/2022", 190f));
            b.setPesagem(new Pesagem("01/10/2022", 350f));
            b.setPeso_atual( ((Pesagem) ((ArrayList) b.getPesagens()).get(b.getPesagens().size() - 1)).getPeso());*/
       
        for (Pesagem P : pesagem) {
            b1.setPeso_atual(p2.getPeso());
        }

        b1.setPesagem(pesagem);
        float VL;
        VL = (b1.getPeso_atual() * b1.getValor_kg_venda()) - (((b1.getData_fim().get(Calendar.DAY_OF_YEAR)- b1.getData_inicio().get(Calendar.DAY_OF_YEAR)) * b1.getCusto_diario()) + b1.getPeso_chegada() * b1.getValor_kg_compra());
        b1.setValor_liquido(VL);

        bov.add(b1);

        Pesagem p3 = new Pesagem();
        Pesagem p4 = new Pesagem();

        Bovino b2 = new Bovino();
        b2.setId(2);
        b2.setData_inicio_string("01/02/2022");
        b2.setData_fim_string("01/10/2022");
        b2.setSituacao(Situacao.VIVO);
        b2.setPeso_chegada(175.10f);
        b2.setValor_kg_compra(10.00f);
        b2.setValor_kg_venda(9.00f);
        b2.setRaca(r);
        b2.setCusto_diario(0.95f);

        p3.setData_string("01/04/2022");
        p3.setPeso(200.00f);
        p4.setData_string("01/10/2022");
        p4.setPeso(345.50f);

        Collection<Pesagem> pesagem2 = new ArrayList();
        pesagem2.add(p3);
        pesagem2.add(p4);
        b2.setPesagem(pesagem2);

        for (Pesagem P : pesagem2) {
            
            b2.setPeso_atual(p4.getPeso());
        }

        float VL2;
        VL2 = ((b2.getPeso_atual() * b2.getValor_kg_venda()) - ((b2.getData_fim().get(Calendar.DAY_OF_YEAR) - b2.getData_inicio().get(Calendar.DAY_OF_YEAR) * b2.getCusto_diario()) + (b2.getPeso_chegada() * b2.getValor_kg_compra())));
     
        b2.setValor_liquido(VL2);

        bov.add(b2);

        Pesagem p5 = new Pesagem();
        Pesagem p6 = new Pesagem();

        Bovino b3 = new Bovino();
        b3.setId(3);
        b3.setData_inicio_string("01/01/2022");
        b3.setData_fim_string("01/10/2022");
        b3.setSituacao(Situacao.VIVO);
        b3.setPeso_chegada(150.10f);
        b3.setValor_kg_compra(10.00f);
        b3.setValor_kg_venda(9.00f);
        b3.setRaca(r);
        b3.setCusto_diario(0.90f);

        //b.setPesagem(new Pesagem("01/05/2022", 190f)); assim ficaria usando o modelo do professor
        p5.setData_string("01/03/2022");
        p5.setPeso(170.00f);
        p6.setData_string("01/10/2022");
        p6.setPeso(370.50f);

        Collection<Pesagem> pesagem3 = new ArrayList();
        pesagem3.add(p5);
        pesagem3.add(p6);
        b3.setPesagem(pesagem3);
        for (Pesagem P : pesagem3) {

            b3.setPeso_atual(p6.getPeso());
        }

        float VL3;
        VL3 = ((b3.getPeso_atual() * b3.getValor_kg_venda()) - ((b3.getData_fim().get(Calendar.DAY_OF_YEAR) - b3.getData_inicio().get(Calendar.DAY_OF_YEAR) * b3.getCusto_diario()) + (b3.getPeso_chegada() * b3.getValor_kg_compra())));
     
        b3.setValor_liquido(VL3);
        bov.add(b3);

        return bov;
    }

    private void imprimeListaBovino(Collection<Bovino> bov) {

        Collections.sort((ArrayList)bov);
        for (Bovino b : bov) {
            System.out.println("====================BOVINO====================");
            System.out.println(b.toString());
        }
        // Por fim, implemente uma rotina na classe Questoes para chamar os métodos
        //codificações nas questões 2 e 3. 
        //essa rotina é no construtor?
    }

    public static void main(String[] args) {
        new Questoes();
    }
}
