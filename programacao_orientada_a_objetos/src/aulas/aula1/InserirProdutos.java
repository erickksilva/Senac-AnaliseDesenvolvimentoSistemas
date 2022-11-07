/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula1;

/**
 *
 * @author erick.nsilva2
 */
public class InserirProdutos {

    private static Produto[] lista = new Produto[4];

    private static int indiceAtual = 0;

    public InserirProdutos() {
    }

    public static void inserProduto(Produto obj) {
        if (indiceAtual == lista.length) {
            lista = alocarNovoProduto();
        }
        lista[indiceAtual++] = obj;
    }

    public static Produto[] alocarNovoProduto() {
        Produto[] newProduto = new Produto[indiceAtual + 5];

        for (int i = 0; i < lista.length; i++) {
            newProduto[i] = lista[i];
        }
        return newProduto;
    }

    public static void pesqProduto(int ob) {

        for (int i =  0; i < lista.length; i++) {
            if (ob == lista[i].getCodProduto()) {
                String res = String.format("Codigo produto: %d \nNome produto: %s \nPreco %.2f ",
                        lista[i].getCodProduto(), lista[i].getNomeProduto(), lista[i].getPreco());
                System.out.println(res);
                break;
            }

        }
    }

}
