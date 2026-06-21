package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 implements k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.e0 f10468b = p9.k.C.f31302h.g();

    public t20(Context context) {
        this.f10467a = context;
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void a(HashMap map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z5 = Boolean.parseBoolean(str);
        this.f10468b.s(z5);
        if (z5) {
            com.google.android.gms.internal.auth.m.D(this.f10467a);
        }
    }
}
