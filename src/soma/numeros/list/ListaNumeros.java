package soma.numeros.list;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {

    List<Integer> listNumber;

    public ListaNumeros() {
        this.listNumber = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
      this.listNumber.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listNumber)
            soma += numero;
        return soma;
    }

    public int econtrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listNumber.isEmpty()) {
            for(Integer numero : listNumber) {
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public  void exibirNumero() {
        if (!listNumber.isEmpty()) {
            System.out.println(this.listNumber);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        ListaNumeros saida = new ListaNumeros();


        saida.adicionarNumero(5);
        saida.adicionarNumero(4);
        saida.adicionarNumero(5);

        saida.exibirNumero();

        System.out.println("A soma total e : " + saida.calcularSoma());
    }
}
