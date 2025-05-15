package com.example.newestapp.activities;

import android.content.Intent;

public enum VacationSpotType {
    CHARMONIX_MONT_BLANC,
    MERIBEL,
    COURCHEVEL,
    VAL_DLSERVE,
    ZERMATT,
    STMORITZ,
    VERBIER,
    GRINDELWALD,
    CORTINA_DAMPEZZO,
    MADONNA_DI_VAL_GARDENA,
    COURMAYEUR,
    KITZBUHEL,
    ST_ANTON_AM_ARLBERG,
    ISCHGL,
    SOLDEN;

    private static final String NAME = VacationSpotType.class.getName();

    public void attachTo(Intent intent){
        intent.putExtra(NAME, ordinal());
    }

    public static VacationSpotType detachFrom(Intent intent){
        if(!intent.hasExtra(NAME)) throw new IllegalStateException("No vacation type");
        return values()[intent.getIntExtra(NAME,-1)];
    }


}
