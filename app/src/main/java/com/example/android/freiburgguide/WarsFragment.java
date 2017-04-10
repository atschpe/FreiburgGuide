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
public class WarsFragment extends Fragment {

    public WarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: place Thumbnail, placeImage, placeName,
        // placeDescription, placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.munster, R.drawable.munster_full, R.string.munster_name,
                R.string.munster_description, getString(R.string.munster_lat),
                getString(R.string.munster_long)));
        places.add(new Place(R.drawable.barricade, R.drawable.barricade_full,
                R.string.barricade_name, R.string.barricade_description,
                getString(R.string.barricade_lat), getString(R.string.barricade_long)));
        places.add(new Place(R.drawable.sternwald, R.drawable.sternwald_full,
                R.string.sternwald_name, R.string.sternwald_description,
                getString(R.string.sternwald_lat), getString(R.string.sternwald_long)));
        places.add(new Place(R.drawable.dortus, R.drawable.dortus_full, R.string.dortus_name,
                R.string.dortus_description, getString(R.string.dortus_lat),
                getString(R.string.dortus_long)));
        places.add(new Place(R.drawable.dortusplaque, R.drawable.dortusplaque_full,
                R.string.dortusplaque_name, R.string.dortusplaque_description,
                getString(R.string.dortusplaque_lat), getString(R.string.dortusplaque_long)));
        places.add(new Place(R.drawable.soldiermem, R.drawable.soldiermem_full,
                R.string.soldiermem_name, R.string.soldiermem_description,
                getString(R.string.soldiermem_lat), getString(R.string.soldiermem_long)));
        places.add(new Place(R.drawable.bombattack, R.drawable.bombattack_full,
                R.string.bombattack_name, R.string.bombattack_description,
                getString(R.string.bombattack_lat), getString(R.string.bombattack_long)));
        places.add(new Place(R.drawable.oldtownhall, R.drawable.oldtownhall_full,
                R.string.oldtownhall_name, R.string.oldtownhall_description,
                getString(R.string.oldtownhall_description), getString(R.string.oldtownhall_long)));
        places.add(new Place(R.drawable.terrace, R.drawable.terrace_full, R.string.terrace_name,
                R.string.terrace_description, getString(R.string.terrace_lat),
                getString(R.string.terrace_long)));
        places.add(new Place(R.drawable.university, R.drawable.university_full,
                R.string.university_name, R.string.university_description,
                getString(R.string.university_lat), getString(R.string.university_long)));
        places.add(new Place(R.drawable.baslerhof, R.drawable.baslerhof_full,
                R.string.baslerhof_name, R.string.baslerhof_description,
                getString(R.string.baslerhof_lat), getString(R.string.baslerhof_long)));
        places.add(new Place(R.drawable.fahnenbergplatz, R.drawable.fahnenbergplatz_full,
                R.string.fahnenbergplatz_name, R.string.fahnenbergplatz_description,
                getString(R.string.fahnenbergplatz_lat), getString(R.string.fahnenbergplatz_long)));
        places.add(new Place(R.drawable.whiterose, R.drawable.whiterose_full,
                R.string.whiterose_name, R.string.whiterose_description,
                getString(R.string.whiterose_lat), getString(R.string.whiterose_long)));

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}
