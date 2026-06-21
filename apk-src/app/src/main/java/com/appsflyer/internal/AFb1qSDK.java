package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFb1qSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1gSDK aFj1gSDK = new AFj1gSDK(intent);
        Uri uri = (Uri) aFj1gSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String strAFAdRevenueData = aFj1gSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
        if (strAFAdRevenueData != null) {
            return Uri.parse(strAFAdRevenueData);
        }
        return null;
    }
}
