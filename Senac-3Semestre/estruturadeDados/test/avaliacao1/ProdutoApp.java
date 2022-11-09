package avaliacao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class ProdutoApp {

    public static void main(String[] args) {

        ListaSimples.inserir(new Produto("Adidas", "Camisa da adidas", 255.54, 7));
        ListaSimples.inserir(new Produto("Polo", "Camisa da polo", 65.54, 3));
        ListaSimples.inserir(new Produto("Kappa", "Chuteira", 154.30, 4));
        ListaSimples.inserir(new Produto("Nike", "Camisa da nike", 100, 5));
        ListaSimples.inserir(new Produto("Nike", "Blusa da nike", 50, 3));
        ListaSimples.inserir(new Produto("Adidas", "Esporte", 125.54, 2));

        ListaSimples.exibir();

        ListaSimples.remover(5002);
        ListaSimples.remover(5003);

        System.out.println();
        ListaSimples.exibir();

        ListaSimples.gerarNotaFiscal();
    }

}
