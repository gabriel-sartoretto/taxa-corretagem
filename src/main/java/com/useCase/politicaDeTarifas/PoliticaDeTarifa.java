package com.useCase.politicaDeTarifas;

import java.math.BigDecimal;

public interface PoliticaDeTarifa {
    BigDecimal calcularTarifa(BigDecimal valor);
}
