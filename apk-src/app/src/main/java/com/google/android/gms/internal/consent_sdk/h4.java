package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 implements h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d6 f13402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7 f13403d;

    public /* synthetic */ h4(d6 d6Var, g7 g7Var, int i) {
        this.f13401b = i;
        this.f13402c = d6Var;
        this.f13403d = g7Var;
    }

    public n a() {
        return new n((Application) this.f13402c.f13360c, (g) this.f13403d.j());
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public final Object j() {
        switch (this.f13401b) {
            case 0:
                return new t3((Application) this.f13402c.f13360c, (d) this.f13403d.j());
            default:
                return a();
        }
    }
}
