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
public class SchlossbergFragment extends Fragment {

    public SchlossbergFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create list of places containing: place Thumbnail, placeImage, placeName,
        // placeDescription, placeLat & placeLong
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.ludwigshohe, R.drawable.ludwigshohe_full,
                R.string.ludwigshohe_name, R.string.lugwigshohe_description,
                getString(R.string.ludwigshohe_lat), getString(R.string.ludwigshohe_long)));
        places.add(new Place(R.drawable.hoffmann, R.drawable.hoffmann_full, R.string.hoffmann_name,
                R.string.hoffmann_description, getString(R.string.hoffmann_lat),
                getString(R.string.hoffmann_long)));
        places.add(new Place(R.drawable.schlossberg1, R.drawable.schlossberg1_full,
                R.string.schlossberg1_name, R.string.schlossberg1_description,
                getString(R.string.schlossberg1_lat), getString(R.string.schlossberg1_long)));
        places.add(new Place(R.drawable.schlossberg2, R.drawable.schlossberg2_full,
                R.string.schlossberg2_name, R.string.schlossberg2_description,
                getString(R.string.schlossberg2_lat), getString(R.string.schlossberg2_long)));
        places.add(new Place(R.drawable.schlossberg3, R.drawable.schlossberg3_full,
                R.string.schlossberg3_name, R.string.schlossberg3_description,
                getString(R.string.schlossberg3_lat), getString(R.string.schlossberg3_long)));
        places.add(new Place(R.drawable.schlossberg4, R.drawable.schlossberg4_full,
                R.string.schlossberg4_name, R.string.schlossberg4_description,
                getString(R.string.schlossberg4_lat), getString(R.string.schlossberg4_long)));
        places.add(new Place(R.drawable.schlossberg5, R.drawable.schlossberg5_full,
                R.string.schlossberg5_name, R.string.schlossberg5_description,
                getString(R.string.schlossberg5_lat), getString(R.string.schlossberg5_long)));
        places.add(new Place(R.drawable.schlossberg6, R.drawable.schlossberg6_full,
                R.string.schlossberg6_name, R.string.schlossberg6_description,
                getString(R.string.schlossberg6_lat), getString(R.string.schlossberg6_long)));
        places.add(new Place(R.drawable.schlossberg7, R.drawable.schlossberg7_full,
                R.string.schlossberg7_name, R.string.schlossberg7_description,
                getString(R.string.schlossberg7_lat), getString(R.string.schlossberg7_long)));
        places.add(new Place(R.drawable.schlossberg8, R.drawable.schlossberg8_full,
                R.string.schlossberg8_name, R.string.schlossberg8_description,
                getString(R.string.schlossberg8_lat), getString(R.string.schlossberg8_long)));
        places.add(new Place(R.drawable.schlossberg9, R.drawable.schlossberg9_full,
                R.string.schlossberg9_name, R.string.schlossberg9_description,
                getString(R.string.schlossberg9_lat), getString(R.string.schlossberg9_long)));
        places.add(new Place(R.drawable.schlossberg10, R.drawable.schlossberg10_full,
                R.string.schlossberg10_name, R.string.schlossberg10_description,
                getString(R.string.schlossberg10_lat), getString(R.string.schlossberg10_long)));
        places.add(new Place(R.drawable.schlossberg_incorrect, R.drawable.schlossberg_incorrect_full,
                R.string.schlossberg_incorrect_name, R.string.schlossberg_incorrect_description,
                getString(R.string.schlossberg_incorrect_lat),
                getString(R.string.schlossberg_incorrect_long)));


        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}