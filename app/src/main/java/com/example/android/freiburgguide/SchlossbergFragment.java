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

        PlaceList pl = new PlaceList(getContext());
        ArrayList<Place> places = pl.getPlacesSchlossberg();

        //PlaceAdapter that uses the list of places as data source.
        PlaceAdapter pa = new PlaceAdapter(getContext(), R.layout.list_item, places);

        //create a standard LayoutManager for the RecyclerView.
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        // Locate the listview "list" in place_list.xml, set layout manager and set
        // it to the adapter.
        RecyclerView lv = (RecyclerView) rootView.findViewById(R.id.list);
        lv.setHasFixedSize(true);
        lv.setLayoutManager(lm);
        lv.setAdapter(pa);

        return rootView;
    }
}