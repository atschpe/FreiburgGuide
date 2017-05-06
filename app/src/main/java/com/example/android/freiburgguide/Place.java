package com.example.android.freiburgguide;

/**
 * {@link Place} represents a place that the user wants to learn more about. It contains resource
 * IDs for the image, name, specifications, address, and url.
 */
public class Place {

    private int thumbnail;

    private int image;

    private int name;

    private int description;

    private String latitude;

    private String longitude;

    /**
     * Create a new {@link Place} object.
     *
     * @param placeThumbnail   is the thumbnail shown on the list view.
     * @param placeImage       is a drawable image of the place, to help the user recognise it.
     * @param placeName        is the name of the place to view.
     * @param placeDescription is a description about the place.
     * @param placeLatitude    is the latitude of the place.
     * @param placeLongitude   is the longitude of the place.
     */
    public Place(int placeThumbnail, int placeImage, int placeName, int placeDescription,
                 String placeLatitude, String placeLongitude) {
        thumbnail = placeThumbnail;
        image = placeImage;
        name = placeName;
        description = placeDescription;
        latitude = placeLatitude;
        longitude = placeLongitude;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getImage() {
        return image;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }


}
