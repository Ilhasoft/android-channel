package io.rapidpro.androidchannel;

import android.content.Context;

/**
 * Created by john-mac on 1/26/17.
 */

public class GCMBroadcastReceiver extends com.google.android.gcm.GCMBroadcastReceiver {

    @Override
    protected String getGCMIntentServiceClassName(Context context) {
        return "io.rapidpro.androidchannel.GCMIntentService";
    }
}
