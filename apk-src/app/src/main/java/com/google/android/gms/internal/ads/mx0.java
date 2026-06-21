package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 extends lx0 {
    public static mx0 i;

    public static final mx0 f(Context context) {
        mx0 mx0Var;
        synchronized (mx0.class) {
            try {
                if (i == null) {
                    i = new mx0(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                mx0Var = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mx0Var;
    }
}
