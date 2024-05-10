package org.example.parteDois;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

class FornecedorTest {
    @Test
    void quando_valorCredito_1000_e_valorDivida_400() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setValorCredito(1000);
        fornecedor.setValorDivida(400);
        Assertions.assertEquals(600, fornecedor.obterSaldo());
    }
    @Test
    void quando_valorCredito_1000_getValorCredito_1000() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setValorCredito(1000);

        Assertions.assertEquals(1000, fornecedor.getValorCredito());
    }
    @Test
    void quando_setValorDivida_100_getDivida_100() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setValorDivida(100);

        Assertions.assertEquals(100, fornecedor.getValorDivida());
    }
    @Test
    void quando_setNome_Jose_getNome_Jose() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Jose");

        Assertions.assertEquals("Jose", fornecedor.getNome());
    }

    @Test
    void quando_setEndereco_SP_getEndereco_SP() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setEndereco("SP");

        Assertions.assertEquals("SP", fornecedor.getEndereco());
    }
    @Test
    void quando_setTelefone_11999999999_getTelefone_11999999999() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setTelefone("11999999999");

        Assertions.assertEquals("11999999999", fornecedor.getTelefone());
    }
}