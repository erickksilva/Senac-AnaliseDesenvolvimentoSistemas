/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

/**
 *
 * @author erick.nsilva2
 */
public class FornecedorEmpresa extends Fornecedor {

    public FornecedorEmpresa(String ie, String cnpj, String nome, String fone) {
        super(nome, fone);
        this.ie = ie;
        this.cnpj = cnpj;
    }
    private String ie, cnpj;

}
