package com.domain.taxa;

import java.util.Date;

public class Taxa {

    private long id;
    private float taxa;
    // Data pois a taxa pode varias e isso ajuda na auditoria
    private Date data;

    public float getTaxa() {
        return taxa;
    }
}
