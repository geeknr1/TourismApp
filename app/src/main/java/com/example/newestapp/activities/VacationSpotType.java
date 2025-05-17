package com.example.newestapp.activities;

import android.content.Intent;

import com.example.newestapp.R;

public enum VacationSpotType {
    CHARMONIX_MONT_BLANC(R.string.CHARMONIX_MONT_BLANC_skiiLocationName, R.string.CHARMONIX_MONT_BLANC_skiiLocationInfo, R.string.CHARMONIX_MONT_BLANC_skiiLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_hikingLocationName, R.string.CHARMONIX_MONT_BLANC_hikingLocationInfo, R.string.CHARMONIX_MONT_BLANC_hikingLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationName, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationInfo, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationFunFacts),
    MERIBEL(R.string.MERIBEL_skiiLocationName, R.string.CHARMONIX_MONT_BLANC_skiiLocationInfo, R.string.CHARMONIX_MONT_BLANC_skiiLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_hikingLocationName, R.string.CHARMONIX_MONT_BLANC_hikingLocationInfo, R.string.CHARMONIX_MONT_BLANC_hikingLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationName, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationInfo, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationFunFacts);
//    COURCHEVEL,
//    VAL_DLSERVE,
//    ZERMATT,
//    STMORITZ,
//    VERBIER,
//    GRINDELWALD,
//    CORTINA_DAMPEZZO,
//    MADONNA_DI_VAL_GARDENA,
//    COURMAYEUR,
//    KITZBUHEL,
//    ST_ANTON_AM_ARLBERG,
//    ISCHGL,
//    SOLDEN;

    public final int skiiLocationName;
    public final int skiiLocationInfo;
    public final int skiiLocationFunFacts;
    public final int hikingLocationName;
    public final int hikingLocationInfo;
    public final int hikingLocationFunFacts;
    public final int rockClimbingLocationName;
    public final int rockClimbingLocationInfo;
    public final int rockClimbingLocationFunFacts;

    VacationSpotType(int skiiLocName, int skiiLocInfo, int skiiLocFunFacts, int hikingLocName, int hikingLocInfo, int hikingLocFunFacts, int rockClimbingLocName, int rockClimbingLocInfo, int rockClimbingLocFunFacts){
        this.skiiLocationName = skiiLocName;
        this.skiiLocationInfo = skiiLocInfo;
        this.skiiLocationFunFacts = skiiLocFunFacts;
        this.hikingLocationName = hikingLocName;
        this.hikingLocationInfo = hikingLocInfo;
        this.hikingLocationFunFacts = hikingLocFunFacts;
        this.rockClimbingLocationName = rockClimbingLocName;
        this.rockClimbingLocationInfo = rockClimbingLocInfo;
        this.rockClimbingLocationFunFacts = rockClimbingLocFunFacts;
    }

    private static final String NAME = VacationSpotType.class.getName();

    public void attachTo(Intent intent){
        intent.putExtra(NAME, ordinal());
    }

    public static VacationSpotType detachFrom(Intent intent){
        if(!intent.hasExtra(NAME)) throw new IllegalStateException("No vacation type");
        return values()[intent.getIntExtra(NAME,-1)];
    }


}
