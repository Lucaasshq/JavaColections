package comparableXcomparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public int compareTo(Livro livro) {
        return titulo.compareTo(livro.titulo);
    }


    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    // Classe para comparar Livro por autor
    class CompararAutor implements Comparator<Livro> {

        @Override
        public int compare(Livro l1, Livro l2) {
             return l1.getAutor().compareTo(l2.getAutor());
        }
    }

    class CompararAno implements Comparator<Livro> {

        @Override
        public int compare(Livro l1, Livro l2) {
            return Integer.compare(l1.getAno(), l2.getAno());
        }
    }

    class CompararAnoAutorTitulo implements Comparator<Livro> {

        @Override
        public int compare(Livro l1, Livro l2) {
            int ano = Integer.compare(l1.getAno(), l2.getAno());
            if (ano != 0) {
                return ano;
            }
            int autor = l1.getAutor().compareTo(l2.getAutor());
            if (autor != 0) {
                return autor;
            }
            return l1.getTitulo().compareTo(l2.getTitulo());
        };
    }


}
