/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimplesEncadeada;

/**
 *
 * @author erick.nsilva2
 */
public class UsarLista {

    public static void main(String[] args) {

        MetodoLista.inserir(new Pet("Canino", "Blade", 1));
        MetodoLista.inserir(new Pet("Canino", "Betovem", 10));
        MetodoLista.inserir(new Pet("Felina", "Mustafa", 7));
        MetodoLista.inserir(new Pet("Felina", "Nani", 4));
        MetodoLista.inserir(new Pet("Felina", "Tcha", 6));
        MetodoLista.inserir(new Pet("Felina", "Tutu", 3));
//        MetodoLista.exibir();
        System.out.println();

//        Object obj = MetodoLista.pesquisar("Nani");
//        if(obj != null){
//            System.out.println(obj);
//        }else{
//            System.out.println("Não encontrado.");
//        }
        Pet pet = new Pet("Nani");
        if (MetodoLista.remover(pet)) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Não removido.");
        }
        pet = null;
        MetodoLista.exibir();
    }
}
