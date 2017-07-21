package com.bridou_n.beaconscanner.features.beaconList;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bridou_n.beaconscanner.R;
import com.bridou_n.beaconscanner.utils.EwRoute;

import java.util.List;

/**
 * Created by Guhya on 2017-07-19.
 */

public class CustomArrayAdapter extends ArrayAdapter<EwRoute>{

    public CustomArrayAdapter(Context context, List<EwRoute> routeList){
        super(context, R.layout.row, routeList);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false);
            holder.tv = (TextView) convertView.findViewById(R.id.rowTextView1);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        EwRoute route = getItem(position);
        holder.tv.setText(route.getStopName());

        return convertView;

    }

    static class ViewHolder{
        TextView tv;
    }

}
