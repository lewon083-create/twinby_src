package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import w9.d;
import w9.e;
import w9.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, j jVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
