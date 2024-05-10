package org.example.parteDois;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void calcularSalario() {
    }

    @Test
    void setImposto_05_does_not_throw_exception() {
        Empregado empregado = new Empregado();
        Assertions.assertDoesNotThrow(() -> empregado.setImposto(0.5));
    }

    @Test
    void setImposto_1_does_throw_exception() {
        Empregado empregado = new Empregado();
        Assertions.assertThrows(RuntimeException.class, () -> empregado.setImposto(1));
    }
    @Test
    void quando_salario_100_imposto_10_calcularSalario_90() {
        Empregado empregado = new Empregado();
        empregado.setSalarioBase(100);
        empregado.setImposto(0.1);
        Assertions.assertEquals(90, empregado.calcularSalario());
    }
}