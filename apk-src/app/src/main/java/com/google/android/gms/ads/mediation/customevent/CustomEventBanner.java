package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import k9.h;
import w9.d;
import x9.a;
import x9.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, h hVar, d dVar, Bundle bundle);
}
