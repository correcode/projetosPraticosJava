package carrinho.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "carrinho.compras.CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 4d, 4);
        carrinhoDeCompras.adicionarItem("caderno", 8d, 10);

        carrinhoDeCompras.calcularValorTotal();

        System.out.println("O valor total da compra e = " + carrinhoDeCompras.calcularValorTotal());
    }
}