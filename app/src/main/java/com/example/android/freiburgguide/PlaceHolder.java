package com.example.android.freiburgguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * {@link PlaceHolder} is a {@link RecyclerView.ViewHolder} linking to the objects in the UI for the
 * bindview.
 *
 * Based off of the tutorial: https://traversoft.com/blog/2016/01/31/replace-listview-with-recyclerview/
 */

public class PlaceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final ImageView placeThumbnail;
    private final TextView placeName;
    private final TextView placeDescription;

    private Place place;
    private Context ctxt;

    public PlaceHolder(Context context, View itemView) {
        super(itemView);

        ctxt = context;

        //Get the views to be populated.
        this.placeThumbnail = (ImageView) itemView.findViewById(R.id.place_thumbnail);
        this.placeName = (TextView) itemView.findViewById(R.id.place_name);
        this.placeDescription = (TextView) itemView.findViewById(R.id.place_description);

        itemView.setOnClickListener(this);
    }

    //bind views to their respective contents.
    public void bindPlace(Place place) {
        this.place = place;
        this.placeThumbnail.setImageResource(place.getThumbnail());
        this.placeName.setText(place.getName());
        this.placeDescription.setText(place.getDescription());
    }

    @Override
    public void onClick(View v) {

        //Send needed Object information to the InfoActivity.
        Intent i = new Intent(ctxt, InfoActivity.class);

        Bundle placeBundle = new Bundle();
        placeBundle.putInt("place image", place.getImage());
        placeBundle.putInt("place name", place.getName());
        placeBundle.putInt("place description", place.getDescription());
        placeBundle.putString("place lat", place.getLatitude());
        placeBundle.putString("place long", place.getLongitude());

        i.putExtras(placeBundle);
        ctxt.startActivity(i);
    }
}