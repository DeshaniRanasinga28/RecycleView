package com.newsalerts.ef.volley.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.newsalerts.ef.volley.R;

/**
 * Created by EF on 04-Feb-18.
 */

public class ScenarioHolder extends RecyclerView.ViewHolder{
    public TextView titleTextView;

    public ScenarioHolder(View itemView) {
        super(itemView);

        titleTextView = (TextView)itemView.findViewById(R.id.titleTextView);
    }
}
