package com.example.android.freiburgguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that provides the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter {

    /**
     * List of {@link Place}s.
     */
    ArrayList<Place> places;

    /**
     * Create {@link PlaceAdapter} object.
     *
     * @param context is the current Fragment the adapter is being created in.
     * @param places  is the list of {@link Place}s  to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
        this.places = places;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check whether a current view can be reused.
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate((R.layout.list_item), parent,
                    false);
        }

        //Get the current {@link Place} object as referred to by the position in the list.
        final Place currentPlace = this.places.get(position);

        //Locate ImageView for the current place in the list_item layout.
        ImageView placeThumbnail = (ImageView) listViewItem.findViewById(R.id.place_thumbnail);
        placeThumbnail.setImageResource(currentPlace.getThumbnail());

        //Locate TextView for the current place name in the list_item.
        TextView placeName = (TextView) listViewItem.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getName());

        //Locate TextView for the current place description in the list_item.
        TextView placeDescription = (TextView) listViewItem.findViewById(R.id.place_description);
        placeDescription.setText(currentPlace.getDescription());

        listViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), InfoActivity.class);

                Bundle placeBundle = new Bundle();
                placeBundle.putInt("place image", currentPlace.getImage());
                placeBundle.putInt("place name", currentPlace.getName());
                placeBundle.putInt("place description", currentPlace.getDescription());
                placeBundle.putString("place lat", currentPlace.getLatitude());
                placeBundle.putString("place long", currentPlace.getLongitude());

                i.putExtras(placeBundle);
                getContext().startActivity(i);
            }
        });
        return listViewItem;
    }
}