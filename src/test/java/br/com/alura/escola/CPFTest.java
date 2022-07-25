package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void naoDeveriaCPFComNumerosInvalios(){
        assertThrows(IllegalArgumentException.class, () -> {
            new CPF( null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new CPF( " ");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new CPF( "12345678900");
        });
    }

    @Test
    void deveriaPermitirCriarCPFComNumerosValidos(){
      String numero = "123.456.789-01";
      CPF cpf = new CPF( numero);
      assertEquals( numero, cpf.getNumero());
    }
}
