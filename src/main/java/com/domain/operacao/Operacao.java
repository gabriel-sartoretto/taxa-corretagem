package com.domain.operacao;

import com.domain.ativo.Ativo;
import com.domain.conta.Conta;
import com.domain.taxa.Taxa;
import com.enums.TipoOperacao;

import java.math.BigDecimal;

/*
1 - é possível comprar parcelado ou apenas valores inteiros?
2 - a taxa é a mesma para compra e venda certo?
 */
public class Operacao {

    private long id;
    private Conta conta;
    private Ativo ativo;
    private long quantidade;
    private Taxa taxa;
    private BigDecimal taxaTotalPaga;
    private TipoOperacao tipoOperacao;

    public Operacao() {}

    public Operacao montar(long quantidade, Conta conta, Ativo ativo, Taxa taxa, TipoOperacao tipoOperacao) {
        Operacao operacao = new Operacao();
        this.conta = conta;
        this.taxa = taxa;
        this.quantidade = quantidade;
        this.ativo = ativo;
        this.tipoOperacao = tipoOperacao;
        operacao = this;
        return operacao;
    }
}
