package com.example.android.freiburgguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that provides the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 * <p>
 * Based off of the tutorial: https://traversoft.com/blog/2016/01/31/replace-listview-with-recyclerview/
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceHolder> {

    //List of {@link Place} objects.
    private final ArrayList<Place> places;
    private int resourceId;
    private Context ctxt;

    /**
     * Create {@link PlaceAdapter} object.
     *
     * @param context    is the current Fragment the adapter is being created in.
     * @param resourceId is the layout used to display each {@link Place} object.
     * @param places     is the list of {@link Place}s  to be displayed.
     */
    public PlaceAdapter(Context context, int resourceId, ArrayList<Place> places) {
        this.places = places;
        this.resourceId = resourceId;
        this.ctxt = context;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.resourceId, parent, false);
        return new PlaceHolder(this.ctxt, view);
    }

    @Override
    public void onBindViewHolder(PlaceHolder holder, int position) {
        Place places = this.places.get(position);

        holder.bindPlace(places);
    }

    @Override
    public int getItemCount() {
        return this.places.size();
    }
}