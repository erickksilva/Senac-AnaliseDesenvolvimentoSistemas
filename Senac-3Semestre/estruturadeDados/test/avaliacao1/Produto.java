/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1;

/**
 *
 * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class Produto {

    String marca, categoria;
    double preco;
    int quantidade;
    int id;
    static int num = 5000;

    public Produto(String marca, String categoria, double p, int quantidade) {
        this.marca = marca;
        this.categoria = categoria;
        this.preco = p;
        this.quantidade = quantidade;
        this.id = num++;
        setPreco(calcularDesconto(marca));
    }

    /**
     * Metodo para calcular o desconto
     *
     * @return
     */
    private double calcularDesconto(String marca) {
        if (marca.equals("Nike")) {
            double valorFinal = preco - (preco * 5) / 100;
            return valorFinal;
        }
        return preco;
    }

    @Override
    public String toString() {
        String retorno = String.format("Id: %d, Marca: %s, Categoria: %s, Preco: %.2f, Quantidade %d",
                getId(), getMarca(), getCategoria(), getPreco(), getQuantidade());
//        return "Id: " + id + ", Marca: " + marca + ", Categoria: " + categoria + ", Preco: " + preco
//                + ", Quantidade: " + quantidade;
        return retorno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
