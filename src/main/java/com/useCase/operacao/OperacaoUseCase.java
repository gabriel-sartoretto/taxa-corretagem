package com.useCase.operacao;

import com.domain.ativo.Ativo;
import com.domain.conta.Conta;
import com.domain.operacao.Operacao;
import com.domain.taxa.Taxa;
import com.enums.TipoOperacao;

public class OperacaoUseCase {

    public void operar(long quantidade, Conta conta, Ativo ativo, Taxa taxa, TipoOperacao tipoOperacao) {
        Operacao operacao = new Operacao();
        operacao.montar(quantidade, conta, ativo, taxa, tipoOperacao);
        operacao.calcularTaxa(operacao, quantidade, conta.getCliente(), conta.getMinimo(), ativo.getPreco(), taxa.getTaxa());
        if (tipoOperacao.equals(TipoOperacao.COMPRAR)) {
            //altera conta pra subtrair saldo
        } else {
            //altera conta pra adicionar saldo
        }
        //repository.salvar(operacao);
    }
}
