package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements bi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd0 f3802a;

    public bj0(gd0 gd0Var) {
        this.f3802a = gd0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final ci0 a(String str, JSONObject jSONObject) {
        return new ci0(this.f3802a.a(str, jSONObject), new wi0(), str);
    }
}
