package ordenacao.comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()) {
            Collections.sort(pessoaPorIdade);
            return pessoaPorIdade;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura (){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas saida = new OrdenacaoPessoas();

        saida.adicionarPessoas("Alisson", 27, 1.80);
        saida.adicionarPessoas("Carlos", 20, 1.70);
        saida.adicionarPessoas("Kaio", 18, 1.60);

        System.out.println(saida.pessoaList);

        System.out.println("\nOrdem por altura: " + saida.ordenarPorAltura());

        System.out.println("\nOrdem por idade: " + saida.ordenarPorIdade());
    }




}
