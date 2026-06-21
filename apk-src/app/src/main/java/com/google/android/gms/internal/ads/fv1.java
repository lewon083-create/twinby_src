package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fv1 f5454c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pp0 f5456b;

    static {
        new fv1("");
        f5454c = new fv1("preload");
    }

    public fv1(String str) {
        pp0 pp0Var;
        this.f5455a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            pp0Var = new pp0(12);
            pp0Var.f9149c = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            pp0Var = null;
        }
        this.f5456b = pp0Var;
    }
}
