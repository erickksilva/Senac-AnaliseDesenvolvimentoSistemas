/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22;

/**
 *
 * @author erick.nsilva2
 */
public class ClienteBanco {

    private String nome, endereco;
    private String cpf;

    public ClienteBanco() {
    }

    public ClienteBanco(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {

        String r = String.format("O Sr. %S portador do cpf n: %S, \nresidente"
                + " e domiciliado ao endereço: %S vem por desta, \nsolicitar "
                + "o encerramento de sua conta corrente.", this.nome, this.cpf, this.endereco);
        return r;
    }

}
