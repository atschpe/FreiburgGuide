package com.example.android.freiburgguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass displaying a list of {@link Place}s pertaining to the Jewish history
 * in Freiburg.
 */
public class JewFragment extends Fragment {

    public JewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: placeThumbnail, placeImage, placeName, placeDescription,
        // placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.gurs, R.drawable.gurs_full, R.string.gurs_name,
                R.string.gurs_description, getString(R.string.gurs_lat), getString(R.string.gurs_long)));
        places.add(new Place(R.drawable.buerckel, R.drawable.buerckel_full, R.string.buerckel_name,
                R.string.buerckel_description, getString(R.string.buerckel_lat),
                getString(R.string.buerckel_long)));
        places.add(new Place(R.drawable.stolpersteine, R.drawable.stolpersteine_full,
                R.string.stolpersteine_name, R.string.stolpersteine_description,
                getString(R.string.stolpersteine_lat), getString(R.string.stolpersteine_long)));
        places.add(new Place(R.drawable.blauebrucke, R.drawable.blauebrucke_full,
                R.string.blauebrucke_name, R.string.blauebrucke_description,
                getString(R.string.blauebrucke_lat), getString(R.string.blauebrucke_long)));
        places.add(new Place(R.drawable.hebelschule, R.drawable.hebelschule_full,
                R.string.hebelschule_name, R.string.hebelschule_description,
                getString(R.string.hebelschule_lat), getString(R.string.hebelschule_long)));
        places.add(new Place(R.drawable.vordtriede, R.drawable.vordtriede_full,
                R.string.vordtriede_name, R.string.vordtriede_description,
                getString(R.string.vordtriebe_lat), getString(R.string.vordtriebe_long)));
        places.add(new Place(R.drawable.oldsyn, R.drawable.oldsyn_full, R.string.oldsyn_name,
                R.string.oldsyn_description, getString(R.string.oldsyn_lat),
                getString(R.string.oldsyn_long)));
        places.add(new Place(R.drawable.synplaque, R.drawable.synplaque_full,
                R.string.synplaque_name, R.string.synplaque_description,
                getString(R.string.synplaque_lat), getString(R.string.syplaque_long)));
        places.add(new Place(R.drawable.newsyn, R.drawable.newsyn_full, R.string.newsyn_name,
                R.string.newsyn_description, getString(R.string.newsyn_lat),
                getString(R.string.newsyn_long)));
        places.add(new Place(R.drawable.schelenz, R.drawable.schelenz_full, R.string.schelenz_name,
                R.string.schelenz_description, getString(R.string.schelenz_lat),
                getString(R.string.schelenz_long)));
        places.add(new Place(R.drawable.annaplatz, R.drawable.annaplatz_full,
                R.string.annaplatz_name, R.string.annaplatz_description,
                getString(R.string.annaplatz_lat), getString(R.string.annaplatz_long)));
        places.add(new Place(R.drawable.herder, R.drawable.herder_full, R.string.herder_name,
                R.string.herder_description, getString(R.string.herder_lat),
                getString(R.string.herder_long)));
        places.add(new Place(R.drawable.cemetry, R.drawable.cemetry_full, R.string.cemetry_name,
                R.string.cemetry_description, getString(R.string.cemetry_lat),
                getString(R.string.cemetry_long)));
        places.add(new Place(R.drawable.zwangsschule, R.drawable.zwangsschule_full,
                R.string.zwangsschule_name, R.string.zwangsschule_description,
                getString(R.string.zwangsschule_lat), getString(R.string.zwangsschule_long)));

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}