/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploradorfinal.img;

import static exploradorfinal.img.telasIntroducao.histFases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mmart
 */
public class classeRandom {
    
    // Este método recorda fases na ArrayList e é chamado por telasFeedbackPositivo e telasIntroducao
    public static void recordaFases(int n) {
        histFases.add(n); // Usado para armazenar a fase no ArrayList
    }
    
    // Este método serve para consultar as fases no ArrayList, usando BinarySearch
    public static boolean consultaFases(ArrayList<Integer> arrayList, final int chave) {
        Collections.sort(arrayList);
        return Collections.binarySearch(arrayList, chave) >= 0; // Retorna true ou false
    }
    
    // Este método sorteia a próxima fase usando Random, e chama o método acima para checar
    public static int defineFase() {
        Random rnd = new Random();
        int proxFase = rnd.nextInt(5); // Sorteia um número de 0 a 4
        boolean fasePassada = consultaFases(histFases, proxFase); // Usa o ArrayList e o número sorteado como parâmetros

        boolean passou = false; // Usado para saber se todas as fases passaram
        int size = histFases.size(); // Variável para armazenar o tamanho do ArrayList
        
        // Se o tamanho do ArrayList for 5, a variável se torna verdadeira e isso vai, posteriormente, direcionar ao menu
        if (size == 5) {
            passou = true;
        }
        
        // Se o ArrayList não estiver 'cheio', ele checa se fasePassada retornou true ou false. Se false, executa o while.
        if (passou == false) {
            while (fasePassada == true) {
                proxFase = rnd.nextInt(5);
                fasePassada = consultaFases(histFases, proxFase);
            }
            return proxFase; // Caso o ArrayList ainda não esteja 'cheio', retorna a próxima fase
        } else {
            return 7; // Caso esteja, retorna 7 para encaminhar à tela final (talvez poderia ter usado default no switch?)
        }
    }
}
