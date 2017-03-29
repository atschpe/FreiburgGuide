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

        //Create list of places containing: placeImage, placeName, placeDescription, placeLat
        // & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.ludwigshohe, R.string.ludwigshohe_name,
                R.string.lugwigshohe_description, getString(R.string.ludwigshohe_lat),
                getString(R.string.ludwigshohe_long)));
        places.add(new Place(R.drawable.citywall, R.string.citywall_name,
                R.string.citywall_description, getString(R.string.cemetry_lat),
                getString(R.string.cemetry_long)));
        places.add(new Place(R.drawable.kaufhaus, R.string.kaufhaus_name,
                R.string.kaufhaus_description, getString(R.string.kaufhaus_lat),
                getString(R.string.kaufhaus_long)));
        places.add(new Place(R.drawable.gerichtslaube, R.string.gerichtslaube_name,
                R.string.gerichtslaube_description, getString(R.string.gerichtslaube_lat),
                getString(R.string.gerichtslaube_long)));
        places.add(new Place(R.drawable.martinplaque, R.string.martinplaque_name,
                R.string.martinplaque_description, getString(R.string.martinplaque_lat),
                getString(R.string.martinplaque_long)));
        places.add(new Place(R.drawable.breisachertor, R.string.breisachertor_name,
                R.string.breisachertor_description, getString(R.string.breisachertor_lat),
                getString(R.string.breisachertor_long)));
        places.add(new Place(R.drawable.martinsgate, R.string.martinsgate_name,
                R.string.martinsgate_description, getString(R.string.martinsgate_lat),
                getString(R.string.martinplaque_long)));
        places.add(new Place(R.drawable.munster, R.string.munster_name, R.string.munster_description,
                getString(R.string.munster_lat), getString(R.string.munster_long)));
        places.add(new Place(R.drawable.barricade, R.string.barricade_name,
                R.string.munster_description, getString(R.string.munster_lat),
                getString(R.string.munster_long)));
        places.add(new Place(R.drawable.sternwald, R.string.sternwald_name,
                R.string.sternwald_description, getString(R.string.sternwald_lat),
                getString(R.string.sternwald_long)));

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}
