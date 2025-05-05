package lista.convidados;


import java.util.HashSet;

import java.util.Set;

public class ConjuntoConvidados {

    public Set<Convidado> listInvite;

    public ConjuntoConvidados() {
        this.listInvite = new HashSet<>();
    }

    public void adicionarConvidado(String nome, long codigoConvite) {
        listInvite.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(long codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!listInvite.isEmpty()) {
            for (Convidado c : listInvite) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            listInvite.remove(convidadoParaRemover);
        } else  {
            throw new RuntimeException("O Conjunto esta vazio!");
        }
    }

    public int contarConvidados() {
        return listInvite.size();
    }

    public void exibirConvidados() {
        if (!listInvite.isEmpty()) {
            System.out.println(listInvite);
        } else {
            System.out.println("O conjunto esta vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados list = new ConjuntoConvidados();

        list.adicionarConvidado("Alisson", 444455555);
        list.adicionarConvidado("Caio", 444466666);
        list.adicionarConvidado("Leandro", 444477777);

        System.out.println(list.contarConvidados());

        list.exibirConvidados();

        list.removerConvidadoPorCodigo(444466666);

        list.exibirConvidados();
    }


}
