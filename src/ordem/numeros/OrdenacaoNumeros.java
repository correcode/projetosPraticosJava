package ordem.numeros;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros {

    public List<Integer> listNumber;

    public int number;

    public OrdenacaoNumeros() {
        this.listNumber = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "number=" + number +
                '}';
    }

    public void adicionarNumero(int numero){
        this.listNumber.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.listNumber);
        if (!listNumber.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.listNumber);
        if (!listNumber.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirNumeros(){
        if (!listNumber.isEmpty()) {
            System.out.println(this.listNumber);
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();

        lista.adicionarNumero(3);
        lista.adicionarNumero(5);
        lista.adicionarNumero(6);
        lista.adicionarNumero(2);

        System.out.println(lista.ordenarDescendente());
    }
}
