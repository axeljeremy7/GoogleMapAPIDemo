package com.axel.googlemapapidemo;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Axel on 6/14/16.
 */
public class Route {

    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
