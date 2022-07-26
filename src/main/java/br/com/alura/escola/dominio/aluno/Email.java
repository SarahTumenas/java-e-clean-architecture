package br.com.alura.escola.dominio.aluno;

public class Email {
 //Value Objects
    private String endereco;

    public Email(String endereco) {

        if (endereco ==null || !endereco.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
