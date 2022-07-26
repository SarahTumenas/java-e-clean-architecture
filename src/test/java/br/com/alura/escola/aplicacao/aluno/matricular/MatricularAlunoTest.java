package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        //Mock -> Mockito

        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@mail.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(
                new CPF("123.456.789-00"));


        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@mail.com", encontrado.getEmail());

    }

}
