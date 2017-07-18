package com.bridou_n.beaconscanner.utils;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Guhya on 2017-07-17.
 */

public class EwBeacon extends RealmObject{

    @PrimaryKey
    private String beaconId;
    private String location;

    public String getBeaconId() {
        return beaconId;
    }

    public void setBeaconId(String beaconId) {
        this.beaconId = beaconId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
