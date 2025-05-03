package catalogo.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
       listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervalor(int anoInicial, int anoFinal) {
       List<Livro> livrospPorIntervaloAnos = new ArrayList<>();
       if (!listLivros.isEmpty()) {
           for (Livro l : listLivros) {
               if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                   livrospPorIntervaloAnos.add(l);
               }
           }
           return livrospPorIntervaloAnos;
       } else  {
           throw new RuntimeException("A lista esta vazia!");
       }
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if(!listLivros.isEmpty()) {
            for(Livro l : listLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros livroList = new CatalogoLivros();

        livroList.adicionarLivro("Historia da vida", "Nicolal", 2019);

        livroList.adicionarLivro("Testando modulos", "Carlos", 2022);

        System.out.println(livroList.pesquisarPorAutor("Carlos"));

       // System.out.println(livroList.listLivros);
    }
}
