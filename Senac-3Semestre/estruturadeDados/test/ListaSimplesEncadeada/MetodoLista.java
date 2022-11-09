/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimplesEncadeada;

/**
 *
 * @author erick.nsilva2
 */
public class MetodoLista {

    private static Elemento inicio = null, atual, aux;

    /**
     * Insere objetos na lista encadeada.
     *
     * @param obj Object
     */
    public static void inserir(Object obj) {
        if (inicio == null) {//verifica se a lista esta vazia
            //lista vazia, se a lista vor fazia faça isso
            inicio = new Elemento(obj, null);
            aux = inicio;
        } else {
            atual = new Elemento(obj, null);
            //aux.setProximo(atual) deixa de receber o inicio e agora receber o objeto atual que vor inserido
            aux.setProximo(atual);//faz o ligamento da lista para se tornar encadeada
            aux = atual;
        }
    }

    /**
     * Exibe o conteudo da lista simplesmente ligada/encadeada
     */
    public static void exibir() {
        Elemento e = inicio; // e = inicio = o primeiro objeto inserido
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProximo();// recebe o proximo objeto da lista
        }
    }

    /**
     * Pesquisa em uma lista simplesmente ligada.
     *
     * @param nome String
     * @return Object
     */
    public static Object pesquisar(String nome) {
        Elemento e = inicio;
        Pet pet;
        while (e != null) {
            //converte a classe object para o Tipo Pet para dar acesso aos getters e setter de pet
            pet = (Pet) e.getObjeto();
            if (nome.equalsIgnoreCase(pet.getNome())) {//se o pet pesquisado vor encontrado
                return pet;//retorna pet
                //coloca o if dentro da classe main para testa
            }
            e = e.getProximo();//chama os proximo pet da lista
        }
        return null;
    }

    /**
     * Elemento para a operacao de remover um elemento na lista simplesmente
     * encadeada.
     *
     * @param pet Pet
     * @return Object[]
     */
    private static Object[] pesquisar(Pet pet) {
        Elemento r = inicio; //remover
        Elemento ar = inicio;//anterior ao remover
        Object[] v = new Object[2];
        Pet pesDePesquisar;//variavel para fazer o cast de Object para Pet, para poder fazer a comparacao

        while (r != null) {
            pesDePesquisar = (Pet) r.getObjeto();

            if (pet.getNome().equals(pesDePesquisar.getNome())) {
                v[0] = r; //guarda na posicao o endereco do objeto removido
                v[1] = ar; //guarda na posicao o endereco do anterior do removido
                return v;
            }
            ar = r;//recebe o anterior de r
            r = r.getProximo();//anda as casas
        }
        return null;
    }

    public static boolean remover(Pet pet) {
        Object[] vetor = pesquisar(pet); //guarda os valores retornado pelo objeto pesquisar

        if (vetor != null) {//diferente de null faça algo
            Elemento remover = (Elemento) vetor[0];//guarda o valor do objeto removido
            Elemento anterior = (Elemento) vetor[1];//guarda o valor do objeto anterior de remover

            //existem tres condicoes de remocao comeco, meio e fim
            if (remover == inicio) {//condicao do inicio
                inicio = remover.getProximo();//inicio sai do primeiro objeto e agora recebe o segundo
                remover.setProximo(null);//corta a ligacao da lista encadeada

            } else if (remover == atual) {//condicao do fim
                atual = anterior;//atual é o fim da lista, e vai receber agora uma casa anterior ao fim da lista
                aux = anterior;//aux é o fim da lista, e vai receber agora uma casa anterior ao fim da lista lista
                anterior.setProximo(null);

            } else {//condicao do meio
                anterior.setProximo(remover.getProximo());//anterior, aponta! para uma casa a mais de remover
                remover.setProximo(null);//corta a ligacao da lista encadeada
            }
            return true;
        }
        return false;
    }

}
