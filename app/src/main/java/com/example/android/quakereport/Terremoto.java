package com.example.android.quakereport;

/**
 * {@link Terremoto} represents a Class regarding the contents of the ArrayList.
 * It contains Earthquake magnitude, location and date.
 */

public class Terremoto {

    /** Earthquake Magnitude */
    private double mEarthquakeMag;

    /** Earthquake Location */
    private String mEarthquakeLoc;

    /** Earthquake Date */
    private long mTimeInMilliseconds;

    /** Earthquake website URL */
    private String mUrl;



    /**
     * Create a new Terremoto object.
     *
     * @param earthquakeMag is the maginitude of the earthquakes around the world
     * @param earthquakeLoc represents the location of the earthquake around the world
     * @param timeInMilliseconds represents the Date the earthquake occurred
     * @param url is the website URL to find more details about the earthquake
     */
    public Terremoto(double earthquakeMag, String earthquakeLoc, long timeInMilliseconds, String url) {
        mEarthquakeMag = earthquakeMag;
        mEarthquakeLoc = earthquakeLoc;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the return for Earthquake Magnitude
     */
    public double getEarthquakeMag() {
        return mEarthquakeMag;
    }

    /**
     * Get the return for Earthquake Location
     */
    public String getEarthquakeLoc() {
        return mEarthquakeLoc;
    }

    /**
     * Get the return for Earthquake Date
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the return for Earthquake website URL
     */
    public String getUrl() {
        return mUrl;
    }
}
