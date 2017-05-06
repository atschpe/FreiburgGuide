package com.example.android.freiburgguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class InfoActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    int nameDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Link the detail_image ImageView with the placeImage.
        ImageView detailImage = (ImageView) findViewById(R.id.detail_image);
        int imageDetail = getIntent().getExtras().getInt("place image");
        detailImage.setImageResource(imageDetail);

        //Link detail_Name TextView with placeName.
        TextView detailName = (TextView) findViewById(R.id.detail_name);
        nameDetail = getIntent().getExtras().getInt("place name");
        detailName.setText(nameDetail);

        //link detail_Description TextView with placeDescription.
        TextView detailDescription = (TextView) findViewById(R.id.detail_description);
        int descriptionDetail = getIntent().getExtras().getInt("place description");
        detailDescription.setText(descriptionDetail);
    }

    /**
     * Once the map is ready we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Set lat and long of the place to the map.
        double latDetail = Double.parseDouble(getIntent().getExtras().getString("place lat"));
        double longDetail = Double.parseDouble(getIntent().getExtras().getString("place long"));
        LatLng place = new LatLng(latDetail, longDetail);
        mMap.addMarker(new MarkerOptions().position(place).title(String.valueOf(nameDetail)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place, 15.0f));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mMap.clear();
    }
}