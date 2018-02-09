package com.newsalerts.ef.volley;

import android.app.Application;

/**
 * Created by EF on 04-Feb-18.
 */

public class ExpertApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();

    }

    private void init() {
        MyVolley.init(this);
    }
}
