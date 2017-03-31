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
public class PlaqueFragment extends Fragment {

    public PlaqueFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: place Thumbnail, placeImage, placeName,
        // placeDescription, placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.lenel, R.drawable.lenel_full, R.string.lenel_name,
                R.string.lenel_description, getString(R.string.lenel_lat),
                getString(R.string.lenel_long)));
        places.add(new Place(R.drawable.predigerkloster, R.drawable.predigerkloster_full,
                R.string.predigerkloster_name, R.string.predigerkloster_description,
                getString(R.string.predigerkloster_lat), getString(R.string.predigerkloster_long)));
        places.add(new Place(R.drawable.cityhall, R.drawable.cityhall_full, R.string.cityhall_name,
                R.string.cityhall_description, getString(R.string.cityhall_lat),
                getString(R.string.cityhall_long)));
        places.add(new Place(R.drawable.baslerhof, R.drawable.baslerhof_full,
                R.string.baslerhof_name, R.string.baslerhof_description,
                getString(R.string.baslerhof_lat), getString(R.string.baslerhof_long)));


        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}
