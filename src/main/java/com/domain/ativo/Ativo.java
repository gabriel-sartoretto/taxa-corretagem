package com.domain.ativo;

import java.math.BigDecimal;

public class Ativo {

    private long id;
    private String nome;
    private BigDecimal preco;

    public String getNome() {
        return this.nome;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }
}
