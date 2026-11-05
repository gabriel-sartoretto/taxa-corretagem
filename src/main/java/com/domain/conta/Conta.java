package com.domain.conta;

import com.enums.TipoCliente;

import java.math.BigDecimal;

public class Conta {

    private long id;
    private BigDecimal saldo;
    private TipoCliente cliente;
    private BigDecimal minimo;

    public TipoCliente getCliente() {
        return this.cliente;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public BigDecimal getMinimo() {
        return this.minimo;
    }
}
