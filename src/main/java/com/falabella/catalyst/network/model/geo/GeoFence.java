package com.falabella.catalyst.network.model.geo;

public class GeoFence implements Comparable{
    Long sequence;
    String latitude;
    String longitude;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
