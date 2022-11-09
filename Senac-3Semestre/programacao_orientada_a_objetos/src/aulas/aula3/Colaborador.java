/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula3;

import java.util.Date;

/**
 *
 * @author erick.nsilva2
 */
public class Colaborador {

    private String funcionalColab, nomeColab, endereco, dataAdmissaoColab;

    public Colaborador() {
    }

    public Colaborador(
            String funcional, String nomeColab, String endereco, String dataAdmissao)// 
    {
        this.funcionalColab = funcional;
        this.nomeColab = nomeColab;
        this.endereco = endereco;
        this.dataAdmissaoColab = dataAdmissao;
    }

    //Metodos getter 
    public String getFuncional() {
        return funcionalColab;
    }

    public String getNomeColab() {
        return nomeColab;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataAdmissaoColab() {
        return dataAdmissaoColab;
    }

    //Metodos Setters
    public void setFuncional(String funcional) {
        this.funcionalColab = funcional;
    }

    public void setNomeColab(String nomeColab) {
        this.nomeColab = nomeColab;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataAdmissaoColab(String dataAdmissaoColab) {
        this.dataAdmissaoColab = dataAdmissaoColab;
    }

    public void calcularSalario() {
        System.out.printf("Funcional: %S\n", funcionalColab);
        System.out.printf("Nome: %S, Data admissão: %S\n", nomeColab, dataAdmissaoColab);

    }
}
