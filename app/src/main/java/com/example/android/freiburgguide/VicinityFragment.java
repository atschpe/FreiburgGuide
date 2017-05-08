package com.example.android.freiburgguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass allowing the user to search {@link Place} objects from the list near
 * their location.
 */
public class VicinityFragment extends Fragment {

    public VicinityFragment() {
        // Required empty public constructor
    }

    VicinityLocator vl;

    ArrayList<Place> filteredPlaces;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Access the Vicinity Locator.
        vl = new VicinityLocator(getContext());

        PlaceList pl = new PlaceList(getContext());
        ArrayList<Place> places = pl.getPlacesAll();

        //A list to store the places that are in the vicinity of the user.
        filteredPlaces = new ArrayList<>();

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
        PlaceAdapter pa = new PlaceAdapter(getContext(), R.layout.list_item, filteredPlaces);

        // Locate the listview "list" in place_list.xml, set layout manager and set
        // it to the adapter.
        RecyclerView lv = (RecyclerView) rootView.findViewById(R.id.list);

        //create a standard LayoutManager for the RecyclerView.
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        if (!filteredPlaces.isEmpty()) {
            lv.setHasFixedSize(false); //depending on the location of the user this can change.
            lv.setLayoutManager(lm);
            lv.setAdapter(pa);
        } else {

            TextView nothingNearby = (TextView) rootView.findViewById(R.id.nothing_nearby);
            nothingNearby.setVisibility(View.VISIBLE);
            lv.setVisibility(View.GONE);
        }

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        vl.stopUsingGPS();
    }
}