
package ado1;

import java.util.Random;

/**
 *
 * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class MetodosDeLivro {

    public static Livro[] livro = new Livro[4];
    private static int indiceAtual = 0;

//   static int t = (int) Math.random() * 10;
    public static int gerarId() {
        Random rd = new Random();
        int iD = 1 + rd.nextInt(15);
        return iD;
    }

    public static int gerarId2(Livro[] obj) {
        int contador, id;
        id = 0;
        boolean condicao = false;

        while (condicao == false) {
            contador = 0;
            id = gerarId();
            int i = 0;
            while (i < indiceAtual) {
                if (id != livro[i].getId()) {
                    contador++;
                }
                i++;
            }
            if (contador == indiceAtual) {
                condicao = true;
            }

        }
        return id;
    }

    public static void criarLivro(Livro obj) {
        Random rd = new Random();
        if (indiceAtual == livro.length) {
            livro = novaLista();
        }
        if (indiceAtual > 0) {
            obj.setId(gerarId2(livro));

            livro[indiceAtual++] = obj;
        } else {
            obj.setId(gerarId());
            livro[indiceAtual++] = obj;
        }
//        livro[indiceAtual++] = obj;
//        obj.setId((obj.getId() + indiceAtual) * indiceAtual);
    }

    public static boolean removerPorId(int id) {
        try {

            int procurar = organizar(id);
            System.out.println("Removendooo " + livro[organizar(id)].toString());
            System.out.println("\t\tRemovido com sucesso.");

            if (procurar != 1) {
                for (int i = procurar; i < indiceAtual - 1; i++) {
                    livro[i] = livro[i + 1];//SOBRESCREVER O LUGAR DO VALOR DO INDICE QUE FOI REMOVIDO
                }
                indiceAtual--;//DECREMENTA A LISTA PORQUE FOI REMOVIDO UM ID
                return true;
            }
        } catch (Exception e) {
            System.out.println("\t\tId não encontrado!");
        }

        return false;
    }

    /**
     * Metodo para expandi a lista de array toda vez que estiver cheia
     *
     * @return vetor
     */
    private static Livro[] novaLista() {
        Livro[] livros2 = new Livro[indiceAtual + 10];
        for (int i = 0; i < livro.length; i++) {
            livros2[i] = livro[i];
        }
        return livros2;
    }

    public static int organizar(int id) {
        int inicio = 0;
        int meio;
        int fim = indiceAtual - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (id == livro[meio].getId()) {
                return meio;
            }
            if (id < livro[meio].getId()) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

    public static Livro buscarTitulo(String titulo) {
        mSort(0, indiceAtual, livro);
        int inicio = 0;
        int fim = indiceAtual - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (titulo.equalsIgnoreCase(livro[meio].getTitulo())) {
                System.out.println(livro[meio].toString());

                return livro[meio];
            } else if (titulo.compareToIgnoreCase(livro[meio].getTitulo()) <= 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return null;
    }

    public static void exibirLivros() {
//        mSort(0, indiceAtual, livro); para imprimir a lista ordenada
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(livro[i]);
        }
    }

    public static void livrosOrdemAlfabetica() {
        mSort(0, indiceAtual, livro);
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(livro[i]);
        }

    }

    private static void mSort(int inicio, int fim, Livro[] livros) {
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mSort(inicio, meio, livros);
            mSort(meio, fim, livros);
            qSort(livros, inicio, meio, fim);
        }
    }

    private static void qSort(Livro[] livro, int i, int m, int fim) {
        Livro livro2[] = new Livro[fim];

        int inicio = i;
        int meio = m;
        int temp = 0;

        while (inicio < m && meio < fim) {
            if (livro[inicio].getTitulo().compareToIgnoreCase(livro[meio].getTitulo()) <= 0) {
                livro2[temp] = livro[inicio];
                temp = temp + 1;
                inicio = inicio + 1;
            } else {
                livro2[temp] = livro[meio];
                temp = temp + 1;
                meio = meio + 1;
            }
        }

        while (inicio < m) {
            livro2[temp] = livro[inicio];
            temp = temp + 1;
            inicio = inicio + 1;
        }

        while (meio < fim) {
            livro2[temp] = livro[meio];
            temp = temp + 1;
            meio = meio + 1;
        }
        for (temp = 0, inicio = i; inicio < fim; inicio++, temp++) {
            livro[inicio] = livro2[temp];
        }
    }

}
