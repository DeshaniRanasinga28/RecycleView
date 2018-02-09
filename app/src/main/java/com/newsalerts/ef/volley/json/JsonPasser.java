package com.newsalerts.ef.volley.json;

import com.newsalerts.ef.volley.model.Scenario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by EF on 04-Feb-18.
 */

public class JsonPasser {
    private static JSONObject object;

    //JSON pass Scenario call object
    public static ArrayList<Scenario> getSenarios(String response){
        //create Scenario class Array object
        ArrayList<Scenario> items = new ArrayList<Scenario>();
        try{
            JSONArray jsonArray = new JSONArray(response);

            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject sce = jsonArray.getJSONObject(i);
                String caseid = sce.getString("caseid");
                String text = sce.getString("text");
                items.add(new Scenario(caseid, text));
            }
            return items;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
