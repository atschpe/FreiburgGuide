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
        places.add(new Place(R.drawable.hoffmann, R.drawable.hoffmann_full, R.string.hoffmann_name,
                R.string.hoffmann_description, getString(R.string.hoffmann_lat),
                getString(R.string.hoffmann_long)));
        places.add(new Place(R.drawable.schlossberg2, R.drawable.schlossberg2_full,
                R.string.schlossberg2_name, R.string.schlossberg2_description,
                getString(R.string.schlossberg2_lat), getString(R.string.schlossberg2_long)));
        places.add(new Place(R.drawable.schlossberg3, R.drawable.schlossberg3_full,
                R.string.schlossberg3_name, R.string.schlossberg3_description,
                getString(R.string.schlossberg3_lat), getString(R.string.schlossberg3_long)));
        places.add(new Place(R.drawable.schlossberg4, R.drawable.schlossberg4_full,
                R.string.schlossberg4_name, R.string.schlossberg4_description,
                getString(R.string.schlossberg4_lat), getString(R.string.schlossberg4_long)));
        places.add(new Place(R.drawable.schlossberg10, R.drawable.schlossberg10_full,
                R.string.schlossberg10_name, R.string.schlossberg10_description,
                getString(R.string.schlossberg10_lat), getString(R.string.schlossberg10_long)));


        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), places);

        // Locate the listview "list" in place_list.xml and set it to the adapter.
        ListView lv = (ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(pa);

        return rootView;
    }
}
