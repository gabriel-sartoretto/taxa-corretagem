package com;

import com.domain.conta.Conta;
import com.enums.TipoCliente;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1L, TipoCliente.COMUM);
    }
}