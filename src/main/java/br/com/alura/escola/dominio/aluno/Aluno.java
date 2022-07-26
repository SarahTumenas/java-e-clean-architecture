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

    public CPF getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }


}
