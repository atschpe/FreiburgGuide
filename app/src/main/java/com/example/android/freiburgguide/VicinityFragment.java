package com.example.android.freiburgguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass allowing the user to search {@link Place} objects from the list near
 * their userLocation.
 */
public class VicinityFragment extends Fragment {

    public VicinityFragment() {
        // Required empty public constructor
    }

    //Access the Vicinity Locator.
    VicinityLocator vl = new VicinityLocator(getContext());

    ArrayList<Place> filteredPlaces;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        PlaceList pl = new PlaceList(getContext());
        ArrayList<Place> places = pl.getPlacesAll();


        //get the lat./long. coordinates for each place in the list and only display those within
        // 100m od the user.
        for (int i = 0; i < places.size(); i++) {
            //get the lat./long. of the place for object at array position i.
            double placeLatitude = Double.parseDouble(places.get(i).getLatitude());
            double placeLongitude = Double.parseDouble(places.get(i).getLongitude());

            //calculate the distance from the user to the place.
            float distance = vl.distanceCalculator(placeLatitude, placeLongitude);

            //Is the place within 100m of the user? If so, add to the arraylist to be displayed.
            if (distance <= 100) {
                filteredPlaces.add(places.get(i));
            }
        }

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), filteredPlaces);

        if (pa.isEmpty()) {
            // Locate the listview "list" in place_list.xml and set it to the adapter.
            ListView lv = (ListView) rootView.findViewById(R.id.list);
            lv.setAdapter(pa);
        }
        TextView nothingNearby = (TextView) rootView.findViewById(R.id.nothing_nearby);
        nothingNearby.setVisibility(View.VISIBLE);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        vl.stopUsingGPS();
    }
}