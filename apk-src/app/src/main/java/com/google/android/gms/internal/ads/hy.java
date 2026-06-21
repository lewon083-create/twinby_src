package com.google.android.gms.internal.ads;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jy f6295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6296d;

    public /* synthetic */ hy(jy jyVar, String str, int i) {
        this.f6294b = i;
        this.f6295c = jyVar;
        this.f6296d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6294b) {
            case 0:
                vx vxVar = this.f6295c.f6993h;
                if (vxVar != null) {
                    vxVar.c(SentryEvent.JsonKeys.EXCEPTION, "what", "ExoPlayerAdapter exception", SentryBaseEvent.JsonKeys.EXTRA, this.f6296d);
                }
                break;
            default:
                vx vxVar2 = this.f6295c.f6993h;
                if (vxVar2 != null) {
                    vxVar2.c("error", "what", "ExoPlayerAdapter error", SentryBaseEvent.JsonKeys.EXTRA, this.f6296d);
                }
                break;
        }
    }
}
