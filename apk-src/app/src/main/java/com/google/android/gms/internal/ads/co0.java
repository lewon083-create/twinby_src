package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f4275a;

    public co0(Context context) {
        this.f4275a = k7.f(context, u9.a.c());
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        return ((Boolean) q9.s.f31967e.f31970c.a(al.f3038hd)).booleanValue() ? vv.d(bo0.f3839a) : vv.d(new ul0(3, this));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 46;
    }
}
