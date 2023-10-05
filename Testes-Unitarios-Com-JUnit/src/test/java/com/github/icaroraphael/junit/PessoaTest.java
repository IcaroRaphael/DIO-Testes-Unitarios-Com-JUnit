package com.github.icaroraphael.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDateTime.of(2020,1,1, 12,0,0));
        Assertions.assertEquals(3, pessoa.getIdade());
    }
}
