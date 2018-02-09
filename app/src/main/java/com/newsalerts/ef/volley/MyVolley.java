package com.newsalerts.ef.volley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.newsalerts.ef.volley.toolbox.BitmapLruCache;

/**
 * Created by EF on 04-Feb-18.
 */

public class MyVolley {

    private static final int MAX_IMAGE_CACHE_ENTIRES  = 100;

    private static RequestQueue mRequestQueue;
    private static ImageLoader mImageLoader;

    public MyVolley() {

    }

    static void init(Context context) {
        mRequestQueue = Volley.newRequestQueue(context);
        mImageLoader = new ImageLoader(mRequestQueue, new BitmapLruCache(MAX_IMAGE_CACHE_ENTIRES));
    }


    public static RequestQueue getRequestQueue() {
        if (mRequestQueue != null) {
            return mRequestQueue;
        } else {
            throw new IllegalStateException("RequestQueue not initialized");
        }
    }

    public static ImageLoader getImageLoader() {
        if (mImageLoader != null) {
            return mImageLoader;
        } else {
            throw new IllegalStateException("ImageLoader not initialized");
        }
    }
}
