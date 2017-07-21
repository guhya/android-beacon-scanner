package com.bridou_n.beaconscanner.utils;

import java.util.List;
import java.util.Map;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Guhya on 2017-07-17.
 */

public class EwBeacon extends RealmObject{

    @PrimaryKey
    private String beaconId;
    private String location;

    private RealmList<EwRoute> routeList;

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

    public RealmList<EwRoute> getRouteList() {
        return routeList;
    }

    public void setRouteList(RealmList<EwRoute> routeList) {
        this.routeList = routeList;
    }

}
