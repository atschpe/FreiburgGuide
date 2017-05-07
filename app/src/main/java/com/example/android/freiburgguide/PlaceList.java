package com.example.android.freiburgguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * The {@link Place} object lists provided by this app along with the sublists accessed by the
 * fragments. Updated
 */

public class PlaceList {

    Context ctxt;

    //The various lists accessed by the fragments.
    private ArrayList<Place> history, jewish, schlossberg, war, all;

    // ----- Getters ------
    public ArrayList<Place> getPlacesHistory() {
        return history;
    }

    public ArrayList<Place> getPlacesJewish() {
        return jewish;
    }

    public ArrayList<Place> getPlacesSchlossberg() {
        return schlossberg;
    }

    public ArrayList<Place> getPlacesWar() {
        return war;
    }

    public ArrayList<Place> getPlacesAll() {
        return all;
    }

    // ------ Setters ------
   public void setPlacesHistory(ArrayList<Place> placesHistory) {
        history = placesHistory;
    }

    public void setPlacesJewish(ArrayList<Place> placesJewish) {
        jewish = placesJewish;
    }

    public void setPlacesSchlossberg(ArrayList<Place> placesSchlossberg) {
        schlossberg = placesSchlossberg;
    }

    public void setPlacesWar(ArrayList<Place> placesWar) {
        war = placesWar;
    }

    public void setPlacesAll(ArrayList<Place> placesAll) {
        all = placesAll;
    }

    // Constructor
    public PlaceList(Context context) {
        super();
        this.ctxt = context;

        //Create lists of places containing: placeThumbnail, placeImage, placeName, placeDescription,
        // placeLat & placeLong

        //general history
        ArrayList<Place> historyList = new ArrayList<>();
        historyList.add(new Place(R.drawable.citywall, R.drawable.citywall_full, R.string.citywall_name,
                R.string.citywall_description, context.getString(R.string.cemetry_lat),
                context.getString(R.string.cemetry_long)));
        historyList.add(new Place(R.drawable.hylacomylus, R.drawable.hylacomylus_full,
                R.string.hylacomylus_name, R.string.hylacomylus_description,
                context.getString(R.string.hylacomylus_lat), context.getString(R.string.hylacomylus_long)));
        historyList.add(new Place(R.drawable.kaufhaus, R.drawable.kaufhaus_full, R.string.kaufhaus_name,
                R.string.kaufhaus_description, context.getString(R.string.kaufhaus_lat),
                context.getString(R.string.kaufhaus_long)));
        historyList.add(new Place(R.drawable.wucherstier, R.drawable.wucherstier_full,
                R.string.wucherstier_name, R.string.wucherstier_description,
                context.getString(R.string.wucherstier_lat), context.getString(R.string.wucherstier_long)));
        historyList.add(new Place(R.drawable.gerichtslaube, R.drawable.gerichtslaube_full,
                R.string.gerichtslaube_name, R.string.gerichtslaube_description,
                context.getString(R.string.gerichtslaube_lat), context.getString(R.string.gerichtslaube_long)));
        historyList.add(new Place(R.drawable.martinplaque, R.drawable.martinplaque_full,
                R.string.martinplaque_name, R.string.martinplaque_description,
                context.getString(R.string.martinplaque_lat), context.getString(R.string.martinplaque_long)));
        historyList.add(new Place(R.drawable.breisachertor, R.drawable.breisachertor_full,
                R.string.breisachertor_name, R.string.breisachertor_description,
                context.getString(R.string.breisachertor_lat), context.getString(R.string.breisachertor_long)));
        historyList.add(new Place(R.drawable.rectory, R.drawable.rectory_full, R.string.rectory_name,
                R.string.rectory_description, context.getString(R.string.rectory_lat),
                context.getString(R.string.rectory_long)));
        historyList.add(new Place(R.drawable.bachhus, R.drawable.bachhus_full, R.string.bachhus_name,
                R.string.bachhus_description, context.getString(R.string.bachhus_lat),
                context.getString(R.string.bachhus_long)));
        historyList.add(new Place(R.drawable.schwabentor, R.drawable.schwabentor_full,
                R.string.schwabentor_name, R. string.schwabentor_description,
                context.getString(R.string.schwabentor_lat), context.getString(R.string.schwabentor_long)));
        historyList.add(new Place(R.drawable.martinsgate, R.drawable.martinsgate_full,
                R.string.martinsgate_name, R.string.martinsgate_description,
                context.getString(R.string.martinsgate_lat), context.getString(R.string.martinplaque_long)));
        historyList.add(new Place(R.drawable.rosenzweig, R.drawable.rosenzweig_full,
                R.string.rosenzweig_name, R.string.rosenzweig_description,
                context.getString(R.string.rosenzweig_lat), context.getString(R.string.rosenzweig_long)));
        historyList.add(new Place(R.drawable.lenel, R.drawable.lenel_full, R.string.lenel_name,
                R.string.lenel_description, context.getString(R.string.lenel_lat),
                context.getString(R.string.lenel_long)));
        historyList.add(new Place(R.drawable.predigerkloster, R.drawable.predigerkloster_full,
                R.string.predigerkloster_name, R.string.predigerkloster_description,
                context.getString(R.string.predigerkloster_lat), context.getString(R.string.predigerkloster_long)));
        historyList.add(new Place(R.drawable.cityhall, R.drawable.cityhall_full, R.string.cityhall_name,
                R.string.cityhall_description, context.getString(R.string.cityhall_lat),
                context.getString(R.string.cityhall_long)));
        historyList.add(new Place(R.drawable.threetrees, R.drawable.threetrees_full,
                R.string.threetrees_name, R.string.threetrees_description,
                context.getString(R.string.threetrees_lat), context.getString(R.string.threetrees_long)));
        historyList.add(new Place(R.drawable.martin, R.drawable.martin_full, R.string.martin_name,
                R.string.martin_dscription, context.getString(R.string.martinplaque_lat),
                context.getString(R.string.martinplaque_long)));
        historyList.add(new Place(R.drawable.fehrenbach, R.drawable.fehrenbach_full,
                R.string.fehrenbach_name, R.string.fehrenbach_description,
                context.getString(R.string.fehrenbach_lat), context.getString(R.string.fehrenbach_long)));
        historyList.add(new Place(R.drawable.fehsenfeld, R.drawable.fehsenfeld_full,
                R.string.fehsenfeld_name, R.string.fehsenfeld_description,
                context.getString(R.string.fehsenfeld_lat), context.getString(R.string.fehsenfeld_long)));
        historyList.add(new Place(R.drawable.flood, R.drawable.flood_full, R.string.flood_name,
                R.string.flood_description, context.getString(R.string.flood_lat),
                context.getString(R.string.flood_long)));
        historyList.add(new Place(R.drawable.support, R.drawable.support_full, R.string.support_name,
                R.string.support_description, context.getString(R.string.support_lat),
                context.getString(R.string.support_long)));
        setPlacesHistory(historyList);
        historyList = getPlacesHistory();

        //War history
        ArrayList<Place> warList = new ArrayList<>();
        warList.add(new Place(R.drawable.munster, R.drawable.munster_full, R.string.munster_name,
                R.string.munster_description, context.getString(R.string.munster_lat),
                context.getString(R.string.munster_long)));
        warList.add(new Place(R.drawable.barricade, R.drawable.barricade_full,
                R.string.barricade_name, R.string.barricade_description,
                context.getString(R.string.barricade_lat), context.getString(R.string.barricade_long)));
        warList.add(new Place(R.drawable.sternwald, R.drawable.sternwald_full,
                R.string.sternwald_name, R.string.sternwald_description,
                context.getString(R.string.sternwald_lat), context.getString(R.string.sternwald_long)));
        warList.add(new Place(R.drawable.dortus, R.drawable.dortus_full, R.string.dortus_name,
                R.string.dortus_description, context.getString(R.string.dortus_lat),
                context.getString(R.string.dortus_long)));
        warList.add(new Place(R.drawable.dortusplaque, R.drawable.dortusplaque_full,
                R.string.dortusplaque_name, R.string.dortusplaque_description,
                context.getString(R.string.dortusplaque_lat), context.getString(R.string.dortusplaque_long)));
        warList.add(new Place(R.drawable.soldiermem, R.drawable.soldiermem_full,
                R.string.soldiermem_name, R.string.soldiermem_description,
                context.getString(R.string.soldiermem_lat), context.getString(R.string.soldiermem_long)));
        warList.add(new Place(R.drawable.bombattack, R.drawable.bombattack_full,
                R.string.bombattack_name, R.string.bombattack_description,
                context.getString(R.string.bombattack_lat), context.getString(R.string.bombattack_long)));
        warList.add(new Place(R.drawable.oldtownhall, R.drawable.oldtownhall_full,
                R.string.oldtownhall_name, R.string.oldtownhall_description,
                context.getString(R.string.oldtownhall_lat), context.getString(R.string.oldtownhall_long)));
        warList.add(new Place(R.drawable.terrace, R.drawable.terrace_full, R.string.terrace_name,
                R.string.terrace_description, context.getString(R.string.terrace_lat),
                context.getString(R.string.terrace_long)));
        warList.add(new Place(R.drawable.university, R.drawable.university_full,
                R.string.university_name, R.string.university_description,
                context.getString(R.string.university_lat), context.getString(R.string.university_long)));
        warList.add(new Place(R.drawable.baslerhof, R.drawable.baslerhof_full,
                R.string.baslerhof_name, R.string.baslerhof_description,
                context.getString(R.string.baslerhof_lat), context.getString(R.string.baslerhof_long)));
        warList.add(new Place(R.drawable.fahnenbergplatz, R.drawable.fahnenbergplatz_full,
                R.string.fahnenbergplatz_name, R.string.fahnenbergplatz_description,
                context.getString(R.string.fahnenbergplatz_lat), context.getString(R.string.fahnenbergplatz_long)));
        warList.add(new Place(R.drawable.whiterose, R.drawable.whiterose_full,
                R.string.whiterose_name, R.string.whiterose_description,
                context.getString(R.string.whiterose_lat), context.getString(R.string.whiterose_long)));
        setPlacesWar(warList);
        warList = getPlacesWar();

        //Jewish history
        ArrayList<Place> jewishList = new ArrayList<>();
        jewishList.add(new Place(R.drawable.gurs, R.drawable.gurs_full, R.string.gurs_name,
                R.string.gurs_description, context.getString(R.string.gurs_lat),
                context.getString(R.string.gurs_long)));
        jewishList.add(new Place(R.drawable.buerckel, R.drawable.buerckel_full,
                R.string.buerckel_name, R.string.buerckel_description,
                context.getString(R.string.buerckel_lat), context.getString(R.string.buerckel_long)));
        jewishList.add(new Place(R.drawable.stolpersteine, R.drawable.stolpersteine_full,
                R.string.stolpersteine_name, R.string.stolpersteine_description,
                context.getString(R.string.stolpersteine_lat), context.getString(R.string.stolpersteine_long)));
        jewishList.add(new Place(R.drawable.blauebrucke, R.drawable.blauebrucke_full,
                R.string.blauebrucke_name, R.string.blauebrucke_description,
                context.getString(R.string.blauebrucke_lat), context.getString(R.string.blauebrucke_long)));
        jewishList.add(new Place(R.drawable.hebelschule, R.drawable.hebelschule_full,
                R.string.hebelschule_name, R.string.hebelschule_description,
                context.getString(R.string.hebelschule_lat), context.getString(R.string.hebelschule_long)));
        jewishList.add(new Place(R.drawable.vordtriede, R.drawable.vordtriede_full,
                R.string.vordtriede_name, R.string.vordtriede_description,
                context.getString(R.string.vordtriebe_lat), context.getString(R.string.vordtriebe_long)));
        jewishList.add(new Place(R.drawable.oldsyn, R.drawable.oldsyn_full, R.string.oldsyn_name,
                R.string.oldsyn_description, context.getString(R.string.oldsyn_lat),
                context.getString(R.string.oldsyn_long)));
        jewishList.add(new Place(R.drawable.synplaque, R.drawable.synplaque_full,
                R.string.synplaque_name, R.string.synplaque_description,
                context.getString(R.string.synplaque_lat), context.getString(R.string.syplaque_long)));
        jewishList.add(new Place(R.drawable.newsyn, R.drawable.newsyn_full, R.string.newsyn_name,
                R.string.newsyn_description, context.getString(R.string.newsyn_lat),
                context.getString(R.string.newsyn_long)));
        jewishList.add(new Place(R.drawable.schelenz, R.drawable.schelenz_full,
                R.string.schelenz_name, R.string.schelenz_description,
                context.getString(R.string.schelenz_lat), context.getString(R.string.schelenz_long)));
        jewishList.add(new Place(R.drawable.annaplatz, R.drawable.annaplatz_full,
                R.string.annaplatz_name, R.string.annaplatz_description,
                context.getString(R.string.annaplatz_lat), context.getString(R.string.annaplatz_long)));
        jewishList.add(new Place(R.drawable.herder, R.drawable.herder_full, R.string.herder_name,
                R.string.herder_description, context.getString(R.string.herder_lat),
                context.getString(R.string.herder_long)));
        jewishList.add(new Place(R.drawable.cemetry, R.drawable.cemetry_full, R.string.cemetry_name,
                R.string.cemetry_description, context.getString(R.string.cemetry_lat),
                context.getString(R.string.cemetry_long)));
        jewishList.add(new Place(R.drawable.zwangsschule, R.drawable.zwangsschule_full,
                R.string.zwangsschule_name, R.string.zwangsschule_description,
                context.getString(R.string.zwangsschule_lat), context.getString(R.string.zwangsschule_long)));
        setPlacesJewish(jewishList);
        jewishList = getPlacesJewish();

        //Schlossberg history
        ArrayList<Place> schlossbergList = new ArrayList<>();
        schlossbergList.add(new Place(R.drawable.ludwigshohe, R.drawable.ludwigshohe_full,
                R.string.ludwigshohe_name, R.string.lugwigshohe_description,
                context.getString(R.string.ludwigshohe_lat), context.getString(R.string.ludwigshohe_long)));
        schlossbergList.add(new Place(R.drawable.hoffmann, R.drawable.hoffmann_full,
                R.string.hoffmann_name, R.string.hoffmann_description,
                context.getString(R.string.hoffmann_lat), context.getString(R.string.hoffmann_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg1, R.drawable.schlossberg1_full,
                R.string.schlossberg1_name, R.string.schlossberg1_description,
                context.getString(R.string.schlossberg1_lat), context.getString(R.string.schlossberg1_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg2, R.drawable.schlossberg2_full,
                R.string.schlossberg2_name, R.string.schlossberg2_description,
                context.getString(R.string.schlossberg2_lat), context.getString(R.string.schlossberg2_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg3, R.drawable.schlossberg3_full,
                R.string.schlossberg3_name, R.string.schlossberg3_description,
                context.getString(R.string.schlossberg3_lat), context.getString(R.string.schlossberg3_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg4, R.drawable.schlossberg4_full,
                R.string.schlossberg4_name, R.string.schlossberg4_description,
                context.getString(R.string.schlossberg4_lat), context.getString(R.string.schlossberg4_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg5, R.drawable.schlossberg5_full,
                R.string.schlossberg5_name, R.string.schlossberg5_description,
                context.getString(R.string.schlossberg5_lat), context.getString(R.string.schlossberg5_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg6, R.drawable.schlossberg6_full,
                R.string.schlossberg6_name, R.string.schlossberg6_description,
                context.getString(R.string.schlossberg6_lat), context.getString(R.string.schlossberg6_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg7, R.drawable.schlossberg7_full,
                R.string.schlossberg7_name, R.string.schlossberg7_description,
                context.getString(R.string.schlossberg7_lat), context.getString(R.string.schlossberg7_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg8, R.drawable.schlossberg8_full,
                R.string.schlossberg8_name, R.string.schlossberg8_description,
                context.getString(R.string.schlossberg8_lat), context.getString(R.string.schlossberg8_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg9, R.drawable.schlossberg9_full,
                R.string.schlossberg9_name, R.string.schlossberg9_description,
                context.getString(R.string.schlossberg9_lat), context.getString(R.string.schlossberg9_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg10, R.drawable.schlossberg10_full,
                R.string.schlossberg10_name, R.string.schlossberg10_description,
                context.getString(R.string.schlossberg10_lat), context.getString(R.string.schlossberg10_long)));
        schlossbergList.add(new Place(R.drawable.schlossberg_incorrect,
                R.drawable.schlossberg_incorrect_full, R.string.schlossberg_incorrect_name,
                R.string.schlossberg_incorrect_description,
                context.getString(R.string.schlossberg_incorrect_lat),
                context.getString(R.string.schlossberg_incorrect_long)));
        setPlacesSchlossberg(schlossbergList);
        schlossbergList = getPlacesSchlossberg();

        //A list containing all the places.
        ArrayList<Place> allList = new ArrayList<>();
        allList.addAll(historyList);
        allList.addAll(jewishList);
        allList.addAll(schlossbergList);
        allList.addAll(warList);
        setPlacesAll(allList);
        allList = getPlacesAll();
    }
}