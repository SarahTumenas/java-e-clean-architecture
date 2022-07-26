package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    //entidade:
    //JPA
    //CLEAN Architecture

    private String nome;
    private CPF cpf;

    private Email email;

    private String senha;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String numero, String ddd) {
        this.telefones.add(new Telefone(numero, ddd));
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public String getSenha() {
        return senha;
    }
}
