package com.dh.flowmeter;

import android.net.Uri;

/**
 * Created by dh on 17-3-10.
 */

public final class Contract {

    public static final String GET_DATA_URL = "http://118.89.227.173:8080/Flowmeter/data";
    public static final double THRESHOLD = 130;
    public static final String ACTION_DATA_UPDATED = "com.dh.flowmeter.ACTION_DATA_UPDATED";

    public static final String TABLE_NAME = "DATA";
    public static final String[] COLUMN = {"_id", "VELOCITY", "QUANTITY", "CUMULANT", "HISTORY"};

    //provider
    public static final String AUTHORITY = "com.dh.flowmeter";
    private static final Uri BASE_URI = Uri.parse("content://" + AUTHORITY);
    public static final String PATH_DATA = "data";
    public static final String PATH_DATA_WITH_ID = "data/*";
    public static final Uri URI = BASE_URI.buildUpon().appendPath(PATH_DATA).build();

    public static Uri makeUriForId(int id) {
        return URI.buildUpon().appendPath(id + "").build();
    }

    public static String getIDFromUri(Uri queryUri) {
        return queryUri.getLastPathSegment();
    }
}
