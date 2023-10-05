package com.github.icaroraphael.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Home")
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarSistemaOperacional() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validarPelaJRE() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void validarPorIntervaloDeJRE() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
