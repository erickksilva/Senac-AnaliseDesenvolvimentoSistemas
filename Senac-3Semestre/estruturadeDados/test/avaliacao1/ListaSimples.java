/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1;

import java.text.DecimalFormat;

/**
 *
 * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class ListaSimples {

    private static Elemento inicio = null, atual, aux;
    private static Produto p;

    public static void inserir(Object obj) {
        if (inicio == null) {
            inicio = new Elemento(obj, null);
            aux = inicio;

        } else {
            atual = new Elemento(obj, null);
            aux.setProximo(atual);
            aux = atual;

        }
    }

    public static void produtoGratis() {
        double valor;
        Elemento e = inicio;
        DecimalFormat df = new DecimalFormat("##.00");
        String res;
        double somaTotal;
        while (e != null) {
            Produto p;
            p = (Produto) e.getObjeto();

            if (p.getQuantidade() > 2) //
            {
                valor = p.getPreco() * (p.getQuantidade() - 1);
                res = df.format(valor).replace(",", ".");
                somaTotal = Double.parseDouble(res);

                p.setPreco(somaTotal);
            } else {

                valor = p.getPreco() * (p.getQuantidade());

                res = df.format(valor).replace(",", ".");
                somaTotal = Double.parseDouble(res);

                p.setPreco(valor);
            }
            e = e.getProximo();
        }
    }

    public static double calcularTotal() {
        DecimalFormat df = new DecimalFormat("##.00");
        Elemento e = inicio;
        Produto p;
        double valorF = 0;
        double soma = 0;
        double rt = 0;
        while (e != null) {
            p = (Produto) e.getObjeto();
            soma += p.getPreco();
            e = e.getProximo();
        }
        String res = df.format(soma).replace(",", ".");
        double somaTotal = Double.parseDouble(res);
        return somaTotal;
    }

    public static void exibir() {
        System.out.println("\t\t\tExibindo produtos");
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProximo();
        }

    }

    public static void gerarNotaFiscal() {

        produtoGratis();
        System.out.println("\n\t\t\tNota fiscal da compra realizada.\n");
        Elemento e = inicio;
        while (e != null) {
            Produto p = (Produto) e.getObjeto();
            double total = 0;

            if (p.getQuantidade() > 2 && p.getMarca().equalsIgnoreCase("Nike")) {
                System.out.println(p.toString() + ", desconto de 5% aplicado e ganhou produto gratis.");
                total = total + p.getPreco();
                System.out.println("\t\t\tTotal a pagar: " + total + "\n");
            } else if (p.getQuantidade() > 2) {
                System.out.println(p.toString() + ", ganhou um produto gratis.");
                total = total + p.getPreco();
                System.out.println("\t\t\tTotal a pagar: " + total + "\n");
            } else {
                System.out.println(p.toString());
                total = total + p.getPreco();
                System.out.println("\t\t\tTotal a pagar: " + total + "\n");
            }
            e = e.getProximo();
        }

        System.out.println("\t\t\tValor total da compra: " + calcularTotal());
    }

    public static boolean remover(int id) {
        Object[] vetor = pesquisar(id);
        System.out.print("\nRemovendo Id: " + id + " ...removido com sucesso.\n");

        if (vetor != null) {
            Elemento remover = (Elemento) vetor[0];
            Elemento anterior = (Elemento) vetor[1];

            if (remover == inicio) {
                inicio = remover.getProximo();
                remover.setProximo(null);

            } else if (remover == atual) {
                atual = anterior;
                aux = anterior;
                anterior.setProximo(null);

            } else {//condicao do meio
                anterior.setProximo(remover.getProximo());//anterior, aponta! para uma casa a mais de remover
                remover.setProximo(null);//corta a ligacao da lista encadeada
            }
            return true;
        }

        return false;
    }

    private static Object[] pesquisar(int id) {
        Elemento r = inicio; //remover
        Elemento ar = inicio;//anterior ao remover
        Object[] v = new Object[2];
        Produto pesDePesquisar;

        while (r != null) {
            pesDePesquisar = (Produto) r.getObjeto();

            if (id == pesDePesquisar.getId()) {
                v[0] = r;
                v[1] = ar;
                return v;
            }
            ar = r;
            r = r.getProximo();
        }
        return null;
    }

    public static Produto getP() {
        return p;
    }

    public static void setP(Produto p) {
        ListaSimples.p = p;
    }

    public static Elemento getInicio() {
        return inicio;
    }

    public static void setInicio(Elemento inicio) {
        ListaSimples.inicio = inicio;
    }

    public static Elemento getAtual() {
        return atual;
    }

    public static void setAtual(Elemento atual) {
        ListaSimples.atual = atual;
    }

    public static Elemento getAux() {
        return aux;
    }

    public static void setAux(Elemento aux) {
        ListaSimples.aux = aux;
    }

}
