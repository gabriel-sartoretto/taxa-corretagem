package com.useCase.calcularTaxa;

import com.enums.TipoCliente;
import com.useCase.politicaDeTarifas.PoliticaDeTarifa;

import java.util.HashMap;
import java.util.Map;

public class CalcularTaxaUseCase {

    private final Map<TipoCliente, PoliticaDeTarifa> politicaDeTarifaMap;

    public CalcularTaxaUseCase() {
        this.politicaDeTarifaMap = Map.of(
                TipoCliente.COMUM, new
        );
    }
}
