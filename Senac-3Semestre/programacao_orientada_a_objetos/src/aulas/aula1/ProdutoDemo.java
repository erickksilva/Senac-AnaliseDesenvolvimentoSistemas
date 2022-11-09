/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula1;

import java.util.Scanner;

/**
 *
 * @author erick.nsilva2
 */
public class ProdutoDemo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        InserirProdutos.inserProduto(new Produto(1, "Iphone", 3789.98));
        InserirProdutos.inserProduto(new Produto(2, "Notebook", 3500.98));
        InserirProdutos.inserProduto(new Produto(3, "Ferrari", 2500.98));
        InserirProdutos.inserProduto(new Produto(4, "Vacina da covid", 10235.98));

        InserirProdutos.pesqProduto(2);

        entrada.close();
    }
}
