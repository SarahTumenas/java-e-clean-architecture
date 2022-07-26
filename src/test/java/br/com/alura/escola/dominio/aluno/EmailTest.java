package br.com.alura.escola.dominio.aluno;


import br.com.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }


    @Test
    void deveriaCriarEmailsComEnderecosValidos() {
        String endereco = "fulano@mail.com";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());

    }

}
