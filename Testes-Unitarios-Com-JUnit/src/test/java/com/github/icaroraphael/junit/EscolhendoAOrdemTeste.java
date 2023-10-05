package com.github.icaroraphael.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //SEGUE A ORDEM NUMERICA DO "@Order()"
//@TestMethodOrder(MethodOrderer.MethodName.class) //SEGUE A ORDEM ALFABÉTICA DO NOME DOS MÉTODOS
//@TestMethodOrder(MethodOrderer.Random.class) //SEGUE UMA ORDEM ALEATÓRIA DOS TESTES
@TestMethodOrder(MethodOrderer.DisplayName.class) //SEGUE A ORDEM ALFABÉTICA DO "@DisplayName()"
public class EscolhendoAOrdemTeste {

//    @Order(4)
    @DisplayName("D")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("C")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("B")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("A")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
