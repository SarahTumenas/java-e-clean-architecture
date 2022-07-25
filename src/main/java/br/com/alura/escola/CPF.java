package br.com.alura.escola;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("^(([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})|([0-9]{11}))$")){
            throw new IllegalArgumentException("CPF invalido");
        }
        this.numero = numero;
    }
}
