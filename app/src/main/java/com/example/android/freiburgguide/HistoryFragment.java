package com.example.android.freiburgguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: placeThumbnail, placeImage, placeName, placeDescription,
        // placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.citywall, R.drawable.citywall_full, R.string.citywall_name,
                R.string.citywall_description, getString(R.string.cemetry_lat),
                getString(R.string.cemetry_long)));
        places.add(new Place(R.drawable.kaufhaus, R.drawable.kaufhaus_full, R.string.kaufhaus_name,
                R.string.kaufhaus_description, getString(R.string.kaufhaus_lat),
                getString(R.string.kaufhaus_long)));
        places.add(new Place(R.drawable.gerichtslaube, R.drawable.gerichtslaube_full,
                R.string.gerichtslaube_name, R.string.gerichtslaube_description,
                getString(R.string.gerichtslaube_lat), getString(R.string.gerichtslaube_long)));
        places.add(new Place(R.drawable.martinplaque, R.drawable.martinplaque_full,
                R.string.martinplaque_name, R.string.martinplaque_description,
                getString(R.string.martinplaque_lat), getString(R.string.martinplaque_long)));
        places.add(new Place(R.drawable.breisachertor, R.drawable.breisachertor_full,
                R.string.breisachertor_name, R.string.breisachertor_description,
                getString(R.string.breisachertor_lat), getString(R.string.breisachertor_long)));
        places.add(new Place(R.drawable.rectory, R.drawable.rectory_full, R.string.rectory_name,
                R.string.rectory_description, getString(R.string.rectory_lat),
                getString(R.string.rectory_long)));
        places.add(new Place(R.drawable.schwabentor, R.drawable.schwabentor_full,
                R.string.schwabentor_name, R. string.schwabentor_description,
                getString(R.string.schwabentor_lat), getString(R.string.schwabentor_long)));
        places.add(new Place(R.drawable.martinsgate, R.drawable.martinsgate_full,
                R.string.martinsgate_name, R.string.martinsgate_description,
                getString(R.string.martinsgate_lat), getString(R.string.martinplaque_long)));
        places.add(new Place(R.drawable.rosenzweig, R.drawable.rosenzweig_full,
                R.string.rosenzweig_name, R.string.rosenzweig_description,
                getString(R.string.rosenzweig_lat), getString(R.string.rosenzweig_long)));
        places.add(new Place(R.drawable.lenel, R.drawable.lenel_full, R.string.lenel_name,
                R.string.lenel_description, getString(R.string.lenel_lat),
                getString(R.string.lenel_long)));
        places.add(new Place(R.drawable.predigerkloster, R.drawable.predigerkloster_full,
                R.string.predigerkloster_name, R.string.predigerkloster_description,
                getString(R.string.predigerkloster_lat), getString(R.string.predigerkloster_long)));
        places.add(new Place(R.drawable.cityhall, R.drawable.cityhall_full, R.string.cityhall_name,
                R.string.cityhall_description, getString(R.string.cityhall_lat),
                getString(R.string.cityhall_long)));
        places.add(new Place(R.drawable.threetrees, R.drawable.threetrees_full,
                R.string.threetrees_name, R.string.threetrees_description,
                getString(R.string.threetrees_lat), getString(R.string.threetrees_long)));
        places.add(new Place(R.drawable.martin, R.drawable.martin_full, R.string.martin_name,
                R.string.martin_dscription, getString(R.string.martinplaque_lat),
                getString(R.string.martinplaque_long)));
        places.add(new Place(R.drawable.fehrenbach, R.drawable.fehrenbach_full,
                R.string.fehrenbach_name, R.string.fehrenbach_description,
                getString(R.string.fehrenbach_lat), getString(R.string.fehrenbach_long)));
        places.add(new Place(R.drawable.fehsenfeld, R.drawable.fehsenfeld_full,
                R.string.fehsenfeld_name, R.string.fehsenfeld_description,
                getString(R.string.fehsenfeld_lat), getString(R.string.fehsenfeld_long)));

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}