/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eric
 */
public class MetodosArrays {

    private static Pessoa[] lista = new Pessoa[4];//criar um array do tipo pessoa

    private static int indiceAtual = 0;//variavel para inserir incrementar os valores da (array lista)

    public MetodosArrays() {
    }

    //metodo para implementar os valores no array lista
    //recebe um objeto da classe Pessoa e insere no objeto
    /*Quando coloca o static em um metodo está definindo que ele é um metodo da 
    classe e pode ser chamado sem precisar usar um objeto para chamar
    Exemplo: System.out.print o metodo out.print é um metodo static da classe System
    no Casso do metodo acima pode ser chamado pelo nome da classe seguido pelo nome
    Exemplo: MetodosArrays.inserir(obj);
     */
 /*
    Metodo para inserir a pessoa
    @param obj Pessoa
     */
    public static void inserir(Pessoa obj) {
        if (indiceAtual == lista.length) {
            lista = alocarNovoArray(); //chama o metodo alocarNovoArray
        }
        lista[indiceAtual++] = obj; //incrementa toda vez que vor usado
    }

    //metodo para aumentar o tamanho da lista 
    /*
    Aloca uma nova lista de array de tamanho 4 indices maor do que o anterios.
    Aloca uma nova lista de array com o tamanho maior e e copiando o valor da 
    lista antiga e sendo estendida automaticamente
    toda vez que o limite for atingido.
    @return Pessoa[]
     */
    public static Pessoa[] alocarNovoArray() {
        //cria uma nova array para receber aumentar o tamanho da lista e receber
        //e receber o valor da array antiga
        Pessoa[] novaLista = new Pessoa[indiceAtual + 5];
//        copiando os objeto para o novo array;
//        for (int i = 0; i < lista.length; i++) {//li
//            newList[i] = lista[i];
//        }
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

    public static void exibir() {
//        for (Pessoa r : lista) {
//            System.out.println(r);
//        }
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(lista[i]);
        }
    }
}
