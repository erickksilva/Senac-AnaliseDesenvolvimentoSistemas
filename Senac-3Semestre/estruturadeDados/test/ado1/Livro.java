package ado1;

/**
 *
 * * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class Livro {

    private int id;
    private String titulo, autor;
    private double preco;

    public Livro() {
    }

    public Livro(String autor, String titulo, double preco) {

        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return this.preco;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String imprimir = String.format("Id: %d, Titulo: %s, Autor: %s, "
                + "Preco R$ %.2f", id, titulo, autor, preco);
        return imprimir;
    }

}
