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
public class ExcursionFragment extends Fragment {

    public ExcursionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: place Thumbnail, placeImage, placeName,
        // placeDescription, placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.strasbourg, R.drawable.strasbourg_full,
                R.string.strasbourg_name, R.string.strasbourg_description,
                getString(R.string.strasbourg_lat), getString(R.string.strasbourg_long)));
        places.add(new Place(R.drawable.colmar, R. drawable.colmar_full, R.string.colmar_name,
                R. string.colmar_description, getString(R.string.colmar_lat),
                getString(R.string.colmar_long)));
        places.add(new Place(R.drawable.europapark, R.drawable.europapark_full,
                R. string.europapark_name, R.string.europapark_description,
                getString(R.string.europapark_lat), getString(R.string.europapark_long)));
        places.add(new Place(R.drawable.staufen, R.drawable.staufen_full, R.string.staufen_name,
                R.string.staufen_description, getString(R.string.staufen_lat),
                getString(R.string.staufen_long)));
        places.add(new Place(R.drawable.schauinsland, R.drawable.schauinsland_full,
                R.string.schauinsland_name, R.string.schauinsland_description,
                getString(R.string.schauinsland_lat), getString(R.string.schauinsland_long)));
        places.add(new Place(R.drawable.titisee, R.drawable.titisee_full, R.string.titisee_name,
                R.string.titisee_description, getString(R.string.titisee_lat),
                getString(R.string.titisee_long)));
        places.add(new Place(R.drawable.schluchsee, R.drawable.schluchsee_full,
                R.string.schluchsee_name, R.string.schluchsee_description,
                getString(R.string.schluchsee_lat), getString(R.string.schluchsee_long)));
        places.add(new Place(R.drawable.basel, R.drawable.basel_full, R.string.basel_name,
                R.string.basel_description, getString(R.string.basel_lat),
                getString(R.string.basel_long)));

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}
