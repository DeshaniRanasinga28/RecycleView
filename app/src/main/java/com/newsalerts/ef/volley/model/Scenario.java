package com.newsalerts.ef.volley.model;

import java.io.Serializable;

/**
 * Created by EF on 04-Feb-18.
 */

public class Scenario {
    private String caseid;
    private String text;

    public Scenario(){

    }

    public Scenario(String caseid, String text) {
        this.caseid = caseid;
        this.text = text;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
