package com.example.newestapp.activities;

import android.content.Intent;

import com.example.newestapp.R;

public enum VacationSpotType {
    Chamonix_Mont_Blanc(R.drawable.charmonixbackground,R.string.CHARMONIX_MONT_BLANC_locationName, R.string.CHARMONIX_MONT_BLANC_locationInfo, R.drawable.charmonixone, R.drawable.charmonixtwo, R.drawable.charmonixthree, R.drawable.charmonixfour ,R.string.CHARMONIX_MONT_BLANC_skiiLocationName, R.string.CHARMONIX_MONT_BLANC_skiiLocationInfo, R.string.CHARMONIX_MONT_BLANC_skiiLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_hikingLocationName, R.string.CHARMONIX_MONT_BLANC_hikingLocationInfo, R.string.CHARMONIX_MONT_BLANC_hikingLocationFunFacts, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationName, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationInfo, R.string.CHARMONIX_MONT_BLANC_rockClimbingLocationFunFacts, R.raw.charmonixhiking),
    Meribel(R.drawable.meribelbackground, R.string.MERIBEL_locationName, R.string.MERIBEL_locationInfo, R.drawable.meribelone, R.drawable.meribeltwo, R.drawable.meribelthree, R.drawable.meribelfour,R.string.MERIBEL_skiiLocationName, R.string.MERIBEL_skiiLocationInfo, R.string.MERIBEL_skiiLocationFunFacts, R.string.MERIBEL_hikingLocationName, R.string.MERIBEL_hikingLocationInfo, R.string.MERIBEL_hikingLocationFunFacts, R.string.MERIBEL_rockClimbingLocationName, R.string.MERIBEL_rockClimbingLocationInfo, R.string.MERIBEL_rockClimbingLocationFunFacts, R.raw.meribel),
    Courchevel(R.drawable.courchevelbackground, R.string.COURCHEVEL_locationName, R.string.COURCHEVEL_locationInfo, R.drawable.courchevelone, R.drawable.courcheveltwo, R.drawable.courchevelthree, R.drawable.courchevelfour, R.string.COURCHEVEL_skiiLocationName, R.string.COURCHEVEL_skiiLocationInfo, R.string.COURCHEVEL_skiiLocationFunFacts, R.string.COURCHEVEL_hikingLocationName, R.string.COURCHEVEL_hikingLocationInfo, R.string.COURCHEVEL_hikingLocationFunFacts, R.string.COURCHEVEL_rockClimbingLocationName, R.string.COURCHEVEL_rockClimbingLocationInfo, R.string.COURCHEVEL_rockClimbingLocationFunFacts, R.raw.courchevel),
    Val_dIsère(R.drawable.valdserebackground, R.string.VAL_DLSERVE_locationName, R.string.VAL_DLSERVE_locationInfo, R.drawable.valdsereone, R.drawable.valdseretwo, R.drawable.valdserethree, R.drawable.valdserefour ,R.string.VAL_DLSERVE_skiiLocationName, R.string.VAL_DLSERVE_skiiLocationInfo, R.string.VAL_DLSERVE_skiiLocationFunFacts, R.string.VAL_DLSERVE_hikingLocationName, R.string.VAL_DLSERVE_hikingLocationInfo, R.string.VAL_DLSERVE_hikingLocationFunFacts, R.string.VAL_DLSERVE_rockClimbingLocationName, R.string.VAL_DLSERVE_rockClimbingLocationInfo, R.string.VAL_DLSERVE_rockClimbingLocationFunFacts, R.raw.valdisere),
    Zermatt(R.drawable.zermattbackground, R.string.ZERMATT_locationName, R.string.ZERMATT_locationInfo, R.drawable.zermattone, R.drawable.zermatttwo, R.drawable.zermattthree, R.drawable.zermattfour ,R.string.ZERMATT_skiiLocationName, R.string.ZERMATT_skiiLocationInfo, R.string.ZERMATT_skiiLocationFunFacts, R.string.ZERMATT_hikingLocationName, R.string.ZERMATT_hikingLocationInfo, R.string.ZERMATT_hikingLocationFunFacts, R.string.ZERMATT_rockClimbingLocationName, R.string.ZERMATT_rockClimbingLocationInfo, R.string.ZERMATT_rockClimbingLocationFunFacts, R.raw.zermatt),
    St_Moritz(R.drawable.stmoritzbackground, R.string.STMORITZ_locationName, R.string.STMORITZ_locationInfo, R.drawable.stmoritzone, R.drawable.stmoritztwo, R.drawable.stmoritzthree, R.drawable.stmoritzfour ,R.string.STMORITZ_skiiLocationName, R.string.STMORITZ_skiiLocationInfo, R.string.STMORITZ_skiiLocationFunFacts, R.string.STMORITZ_hikingLocationName, R.string.STMORITZ_hikingLocationInfo, R.string.STMORITZ_hikingLocationFunFacts, R.string.STMORITZ_rockClimbingLocationName, R.string.STMORITZ_rockClimbingLocationInfo, R.string.STMORITZ_rockClimbingLocationFunFacts, R.raw.stmoritz),
    Verbier(R.drawable.verbierbackground, R.string.VERBIER_locationName, R.string.VERBIER_locationInfo, R.drawable.verbierone, R.drawable.verbiertwo, R.drawable.verbierthree, R.drawable.verbierfour ,R.string.VERBIER_skiiLocationName, R.string.VERBIER_skiiLocationInfo, R.string.VERBIER_skiiLocationFunFacts, R.string.VERBIER_hikingLocationName, R.string.VERBIER_hikingLocationInfo, R.string.VERBIER_hikingLocationFunFacts, R.string.VERBIER_rockClimbingLocationName, R.string.VERBIER_rockClimbingLocationInfo, R.string.VERBIER_rockClimbingLocationFunFacts, R.raw.verbier),
    Grindelwald(R.drawable.grindelwaldbackground, R.string.GRINDELWALD_locationName, R.string.GRINDELWALD_locationInfo, R.drawable.grindelwaldone, R.drawable.grindelwaldtwo, R.drawable.grindelwaldthree, R.drawable.grindelwaldfour,R.string.GRINDELWALD_skiiLocationName, R.string.GRINDELWALD_skiiLocationInfo, R.string.GRINDELWALD_skiiLocationFunFacts, R.string.GRINDELWALD_hikingLocationName, R.string.GRINDELWALD_hikingLocationInfo, R.string.GRINDELWALD_hikingLocationFunFacts, R.string.GRINDELWALD_rockClimbingLocationName, R.string.GRINDELWALD_rockClimbingLocationInfo, R.string.GRINDELWALD_rockClimbingLocationFunFacts, R.raw.grindelwald),
    Cortina_dAmpezzo(R.drawable.cortinabackground, R.string.CORTINA_DAMPEZZO_locationName, R.string.CORTINA_DAMPEZZO_locationInfo, R.drawable.cortinaone, R.drawable.cortinatwo, R.drawable.cortinathree, R.drawable.cortinafour ,R.string.CORTINA_DAMPEZZO_skiiLocationName, R.string.CORTINA_DAMPEZZO_skiiLocationInfo, R.string.CORTINA_DAMPEZZO_skiiLocationFunFacts, R.string.CORTINA_DAMPEZZO_hikingLocationName, R.string.CORTINA_DAMPEZZO_hikingLocationInfo, R.string.CORTINA_DAMPEZZO_hikingLocationFunFacts, R.string.CORTINA_DAMPEZZO_rockClimbingLocationName, R.string.CORTINA_DAMPEZZO_rockClimbingLocationInfo, R.string.CORTINA_DAMPEZZO_rockClimbingLocationFunFacts, R.raw.cortinadampezzo),
    MadonnadiCampiglio(R.drawable.madonabackground, R.string.MADONNA_DI_VAL_GARDENA_locationName, R.string.MADONNA_DI_VAL_GARDENA_locationInfo, R.drawable.madonaone, R.drawable.madonatwo, R.drawable.madonathree, R.drawable.madonafour ,R.string.MADONNA_DI_VAL_GARDENA_skiiLocationName, R.string.MADONNA_DI_VAL_GARDENA_skiiLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_skiiLocationFunFacts, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationName, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationFunFacts, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationName, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationFunFacts, R.raw.madonnadicampiglio),
    Selva_di_Val_Gardena(R.drawable.valgardenabackground, R.string.MADONNA_DI_VAL_GARDENA_locationName, R.string.MADONNA_DI_VAL_GARDENA_locationInfo, R.drawable.valgardenaone, R.drawable.valgardenatwo, R.drawable.valgardenathree, R.drawable.valgardenafour, R.string.MADONNA_DI_VAL_GARDENA_skiiLocationName, R.string.MADONNA_DI_VAL_GARDENA_skiiLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_skiiLocationFunFacts, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationName, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_hikingLocationFunFacts, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationName, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationInfo, R.string.MADONNA_DI_VAL_GARDENA_rockClimbingLocationFunFacts, R.raw.gardena),
    Courmayeur(R.drawable.cormayeurbackground, R.string.COURMAYEUR_locationName, R.string.COURMAYEUR_locationInfo, R.drawable.cormayeurone, R.drawable.cormayeurtwo, R.drawable.cormayeurthree, R.drawable.cormayeurfour,R.string.COURMAYEUR_skiiLocationName, R.string.COURMAYEUR_skiiLocationInfo, R.string.COURMAYEUR_skiiLocationFunFacts, R.string.COURMAYEUR_hikingLocationName, R.string.COURMAYEUR_hikingLocationInfo, R.string.COURMAYEUR_hikingLocationFunFacts, R.string.COURMAYEUR_rockClimbingLocationName, R.string.COURMAYEUR_rockClimbingLocationInfo, R.string.COURMAYEUR_rockClimbingLocationFunFacts, R.raw.courmayeur),
    Kitzbühel(R.drawable.kitzbuhelbackground, R.string.KITZBUHEL_locationName, R.string.KITZBUHEL_locationInfo, R.drawable.kitzbuhelone, R.drawable.kitzbuheltwo, R.drawable.kitzbuhelthree, R.drawable.kitzbuhelfour ,R.string.KITZBUHEL_skiiLocationName, R.string.KITZBUHEL_skiiLocationInfo, R.string.KITZBUHEL_skiiLocationFunFacts, R.string.KITZBUHEL_hikingLocationName, R.string.KITZBUHEL_hikingLocationInfo, R.string.KITZBUHEL_hikingLocationFunFacts, R.string.KITZBUHEL_rockClimbingLocationName, R.string.KITZBUHEL_rockClimbingLocationInfo, R.string.KITZBUHEL_rockClimbingLocationFunFacts, R.raw.kitzhubel),
    St_Anton_am_Arlberg(R.drawable.stantonbackground, R.string.ST_ANTON_AM_ARLBERG_locationName, R.string.ST_ANTON_AM_ARLBERG_locationInfo, R.drawable.stantonone, R.drawable.stantontwo, R.drawable.stantonthree, R.drawable.stantonfour,R.string.ST_ANTON_AM_ARLBERG_skiiLocationName, R.string.ST_ANTON_AM_ARLBERG_skiiLocationInfo, R.string.ST_ANTON_AM_ARLBERG_skiiLocationFunFacts, R.string.ST_ANTON_AM_ARLBERG_hikingLocationName, R.string.ST_ANTON_AM_ARLBERG_hikingLocationInfo, R.string.ST_ANTON_AM_ARLBERG_hikingLocationFunFacts, R.string.ST_ANTON_AM_ARLBERG_rockClimbingLocationName, R.string.ST_ANTON_AM_ARLBERG_rockClimbingLocationInfo, R.string.ST_ANTON_AM_ARLBERG_rockClimbingLocationFunFacts, R.raw.anton),
    Ischgl(R.drawable.ischglbackground, R.string.ISCHGL_locationName, R.string.ISCHGL_locationInfo, R.drawable.ischglone, R.drawable.ischgltwo, R.drawable.ischglthree, R.drawable.ischglfour,R.string.ISCHGL_skiiLocationName, R.string.ISCHGL_skiiLocationInfo, R.string.ISCHGL_skiiLocationFunFacts, R.string.ISCHGL_hikingLocationName, R.string.ISCHGL_hikingLocationInfo, R.string.ISCHGL_hikingLocationFunFacts, R.string.ISCHGL_rockClimbingLocationName, R.string.ISCHGL_rockClimbingLocationInfo, R.string.ISCHGL_rockClimbingLocationFunFacts, R.raw.ischgl),
    Sölden(R.drawable.soldenbackground, R.string.SOLDEN_locationName, R.string.SOLDEN_locationInfo, R.drawable.soldenone, R.drawable.soldentwo, R.drawable.soldenthree, R.drawable.soldenfour ,R.string.SOLDEN_skiiLocationName, R.string.SOLDEN_skiiLocationInfo, R.string.SOLDEN_skiiLocationFunFacts, R.string.SOLDEN_hikingLocationName, R.string.SOLDEN_hikingLocationInfo, R.string.SOLDEN_hikingLocationFunFacts, R.string.SOLDEN_rockClimbingLocationName, R.string.SOLDEN_rockClimbingLocationInfo, R.string.SOLDEN_rockClimbingLocationFunFacts, R.raw.solden);

    public final int locationName;
    public final int locationInfo;
    public final int skiiLocationName;
    public final int skiiLocationInfo;
    public final int skiiLocationFunFacts;
    public final int hikingLocationName;
    public final int hikingLocationInfo;
    public final int hikingLocationFunFacts;
    public final int rockClimbingLocationName;
    public final int rockClimbingLocationInfo;
    public final int rockClimbingLocationFunFacts;
    public final int imageOne;
    public final int imageTwo;
    public final int imageThree;
    public final int imageFour;
    public final int backgroundImg;
    public final int hikingVideo;

    VacationSpotType(int background, int locName, int locInfo,  int imgOne, int imgTwo, int imgThree, int imgFour, int skiiLocName, int skiiLocInfo, int skiiLocFunFacts, int hikingLocName, int hikingLocInfo, int hikingLocFunFacts, int rockClimbingLocName, int rockClimbingLocInfo, int rockClimbingLocFunFacts, int vidHike){
        this.backgroundImg = background;
        this.locationName = locName;
        this.locationInfo = locInfo;
        this.skiiLocationName = skiiLocName;
        this.skiiLocationInfo = skiiLocInfo;
        this.skiiLocationFunFacts = skiiLocFunFacts;
        this.hikingLocationName = hikingLocName;
        this.hikingLocationInfo = hikingLocInfo;
        this.hikingLocationFunFacts = hikingLocFunFacts;
        this.rockClimbingLocationName = rockClimbingLocName;
        this.rockClimbingLocationInfo = rockClimbingLocInfo;
        this.rockClimbingLocationFunFacts = rockClimbingLocFunFacts;
        this.imageOne = imgOne;
        this.imageTwo = imgTwo;
        this.imageThree = imgThree;
        this.imageFour = imgFour;
        this.hikingVideo = vidHike;
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
