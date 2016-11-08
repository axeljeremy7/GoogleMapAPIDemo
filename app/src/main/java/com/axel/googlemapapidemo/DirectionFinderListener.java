package com.axel.googlemapapidemo;

import java.util.List;

/**
 * Created by Axel on 6/14/16.
 */
public interface  DirectionFinderListener {

    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
