package com.example.android.freiburgguide;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

/**
 * Based on http://clover.studio/2016/08/09/getting-current-location-in-android-using-location-manager/
 */
public class VicinityLocator extends Service implements LocationListener {

    private final Context ctxt;

    boolean hasGps = false;

    boolean hasNetwork = false;

    boolean canGetLocation = false;

    Location userLocation;
    double latitude;
    double longitude;

    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 100;

    private static final long MIN_TIME_BW_UPDATES = 1000;
    protected LocationManager lm;

    public VicinityLocator(Context context) {
        this.ctxt = context;
        getUserLocation();
    }

    public float distanceCalculator(double placeLatitude, double placeLongitude) {
       //For testing: position of Freiburger Münster
        Location testingLocation = new Location("Testing Location");
        testingLocation.setLatitude(47.995581);
        testingLocation.setLongitude(7.582811);

        Location placeLocation = new Location("Place Location");

        placeLocation.setLatitude(placeLatitude);
        placeLocation.setLongitude(placeLongitude);

        //Calculate distance
        float distance = testingLocation.distanceTo(placeLocation); // Use userLocation in final code.

        return distance;
    }

    private Location getUserLocation() {

        try {
            lm = (LocationManager) ctxt.getSystemService(LOCATION_SERVICE);

            // getting GPS status
            hasGps = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);

            // getting network status
            hasNetwork = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if (!hasGps && !hasNetwork) {
                showSettingsAlert();
            } else {
                this.canGetLocation = true;
                // First get userLocation from Network Provider
                if (hasNetwork) {
                    try {
                        lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
                                MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                        Log.d("Network", "Network");
                        if (lm != null) {
                            userLocation = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        }

                        if (userLocation != null) {
                            latitude = userLocation.getLatitude();
                            longitude = userLocation.getLongitude();
                        }
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }
                }

                // if GPS Enabled get lat/long using GPS Services
                if (hasGps) {
                    if (userLocation == null) {
                        try {
                            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                                    MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                            Log.d("GPS Enabled", "GPS Enabled");
                            if (lm != null) {
                                userLocation = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                                if (userLocation != null) {
                                    latitude = userLocation.getLatitude();
                                    longitude = userLocation.getLongitude();
                                    Log.v("VicinityLocator", "Latitude: " + latitude + "Longitude: " + longitude);
                                }
                            }
                        } catch (SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userLocation;
    }

    public double getLongitude() {
        if (userLocation != null) {
            longitude = userLocation.getLongitude();
        }
        return longitude;
    }

    public double getLatitude() {
        if (userLocation != null) {
            latitude = userLocation.getLatitude();
        }
        return latitude;
    }

    public boolean canGetLocation() {
        return this.canGetLocation;
    }

    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(ctxt);

        alertDialog.setTitle("GPS Not Enabled");

        alertDialog.setMessage("Do you wants to turn On GPS?");

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                ctxt.startActivity(intent);
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialog.show();
    }

    public void stopUsingGPS() {
        if (lm != null) {

            lm.removeUpdates(VicinityLocator.this);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onProviderDisabled(String provider) {
    }
}