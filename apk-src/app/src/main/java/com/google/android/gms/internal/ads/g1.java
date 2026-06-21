package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht1 f5591b;

    public g1(Handler handler, ht1 ht1Var, int i) {
        switch (i) {
            case 1:
                this.f5590a = handler;
                this.f5591b = ht1Var;
                break;
            default:
                if (ht1Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f5590a = handler;
                this.f5591b = ht1Var;
                break;
        }
    }

    public void a(bs bsVar) {
        Handler handler = this.f5590a;
        if (handler != null) {
            handler.post(new l81(1, this, bsVar));
        }
    }
}
