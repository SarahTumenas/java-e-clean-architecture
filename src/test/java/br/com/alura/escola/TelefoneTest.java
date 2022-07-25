package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneCOmDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(null, "123456789");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(" ", "123456789");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("1", "123456789");
        });
    }

    @Test
    void naoDeveriaCriarTelefoneCOmNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("11", null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("11 ", " ");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("11", "1234");
        });
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {

        String ddd = "11";
        String numero = "123456789";

        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());

    }
}
