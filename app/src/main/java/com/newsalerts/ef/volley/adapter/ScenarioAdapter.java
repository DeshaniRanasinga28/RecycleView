package com.newsalerts.ef.volley.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.newsalerts.ef.volley.R;
import com.newsalerts.ef.volley.model.Scenario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EF on 04-Feb-18.
 */

public class ScenarioAdapter extends RecyclerView.Adapter <ScenarioHolder> {
    private Context context;
    private ArrayList<Scenario> scenariosList;
    ScenarioHolder scenarioHolder;

    public ScenarioAdapter(ArrayList<Scenario> scenarios) {
        this.scenariosList = scenarios;
    }

    @Override
    public ScenarioHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scenario, parent, false);
        scenarioHolder = new ScenarioHolder(view);
        return scenarioHolder;
    }

    @Override
    public void onBindViewHolder(ScenarioHolder holder, int position) {
        Scenario scenario = scenariosList.get(position);
        holder.titleTextView.setText(scenario.getText());
//        Scenario scenario = scenarioList.get(position);
//        holder.titleTextView.setText(scenario.getText());
//        holder.titleTextView.setText(scenario.getText());

//        holder.titleTextView.setText(scenarioList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return scenariosList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

//public class ScenarioAdapter extends ArrayAdapter<Scenario> {
//
//    private final Context context;
//
//    public ScenarioAdapter(Context context, ArrayList<Scenario> items) {
//        super(context, 0, items);
//        this.context = context;
//    }
//
//    public static class ViewHolder{
//        public TextView titleTextView;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent){
//        View rowView;
//        if(convertView == null){
//            rowView = LayoutInflater.from(context).inflate(R.layout.item_scenario, parent, false);  //ID fo List Item Scenario
//            ViewHolder viewHolder = new ViewHolder();
//            viewHolder.titleTextView = (TextView) rowView.findViewById(R.id.titleTextView);  // ID of the textView Populate
//            rowView.setTag(viewHolder);
//            rowView.setTag(viewHolder);
//        }else{
//            rowView = convertView;
//        }
//
//        ViewHolder holder = (ViewHolder) rowView.getTag();
//        Scenario scenario = getItem(position);
//        holder.titleTextView.setText(scenario.getText());
//        return rowView;
//    }
//}
