package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f50 implements q9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h50 f5241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq0 f5242c;

    public f50(h50 h50Var, iq0 iq0Var) {
        this.f5241b = h50Var;
        this.f5242c = iq0Var;
    }

    @Override // q9.a
    public final void onAdClicked() {
        iq0 iq0Var = this.f5242c;
        h50 h50Var = this.f5241b;
        String str = iq0Var.f6575g;
        synchronized (h50Var.f6027a) {
            try {
                ConcurrentHashMap concurrentHashMap = h50Var.f6028b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
