package com.example.android.freiburgguide;

/**
 * {@link Place} represents a place that the user wants to learn more about. It contains resource
 * IDs for the image, name, specifications, address, and url.
 */
public class Place {

    private int PlaceImage;

    private int PlaceName;

    private int PlaceDescription;

    private String PlaceLat;

    private String PlaceLong;

    /**
     * Create a new {@link Place} object.
     *
     * @param placeImage       is a drawable image of the place, to help the user recognise it.
     * @param placeName        is the name of the place to view.
     * @param placeDescription is a description about the place.
     * @param placeLat         is the latitude of the place.
     * @param placeLong        is the longitude of the place.
     */
    public Place(int placeImage, int placeName, int placeDescription, String placeLat,
                 String placeLong) {
        PlaceImage = placeImage;
        PlaceName = placeName;
        PlaceDescription = placeDescription;
        PlaceLat = placeLat;
        PlaceLong = placeLong;
    }

    public int getPlaceImage() {
        return PlaceImage;
    }

    public int getPlaceName() {
        return PlaceName;
    }

    public int getPlaceDescription() {
        return PlaceDescription;
    }

    public String getPlaceLat() {
        return PlaceLat;
    }

    public String getPlaceLong() {
        return PlaceLong;
    }
}
