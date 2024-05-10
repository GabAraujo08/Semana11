package org.example.parteDois;

import org.junit.gen5.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void quando_construtor_nome_diferente_null(){
        Pessoa pessoa = new Pessoa("Jose");
        Assertions.assertNotNull(pessoa);
    }
    @Test
    void quando_construtor_nome_endereco_telefone_diferente_null(){
        Pessoa pessoa = new Pessoa("Jose", "SP", "11999999999");
        Assertions.assertNotNull(pessoa);
    }
}