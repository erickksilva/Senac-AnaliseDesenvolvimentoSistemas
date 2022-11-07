/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula1;

/**
 *
 * @author erick.nsilva2
 */
public class Produto {

    private int codProduto;
    private String nomeProduto;
    private double preco;

    public Produto() {
    }

    public Produto(int codProduto, String nome, double preco) {
        this.codProduto = codProduto;
        this.nomeProduto = nome;
        this.preco = preco;
    }

    String getNomeProduto() {
        return this.nomeProduto;
    }

    int getCodProduto() {
        return this.codProduto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto" + "codProduto= " + codProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco;
    }

    public String pesquisarProduto(int i) {
        if (i == codProduto) {
            return toString();
        }
        return toString();
    }

}
