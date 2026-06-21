package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uw implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jx f11115c;

    public uw(vw vwVar, Context context, jx jxVar) {
        this.f11114b = context;
        this.f11115c = jxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jx jxVar = this.f11115c;
        try {
            jxVar.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f11114b));
        } catch (IOException | IllegalStateException | ma.h | ma.i e3) {
            jxVar.d(e3);
            u9.i.f("Exception while getting advertising Id info", e3);
        }
    }
}
