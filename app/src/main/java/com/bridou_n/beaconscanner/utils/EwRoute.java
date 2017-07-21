package com.bridou_n.beaconscanner.utils;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Guhya on 2017-07-19.
 */

public class EwRoute extends RealmObject{
    @PrimaryKey
    private String stopId;
    private String stopName;

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }


}
