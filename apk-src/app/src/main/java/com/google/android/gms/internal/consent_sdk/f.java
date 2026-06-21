package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6 f13382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7 f13383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7 f13384d;

    public f(d6 d6Var, g7 g7Var, g7 g7Var2) {
        this.f13382b = d6Var;
        this.f13383c = g7Var;
        this.f13384d = g7Var2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s7.g j() {
        Application application = (Application) this.f13382b.f13360c;
        g gVar = (g) this.f13383c.j();
        t3 t3Var = (t3) this.f13384d.j();
        e0 e0Var = f0.f13386b;
        h0.c(e0Var);
        return new s7.g(application, gVar, t3Var, e0Var);
    }
}
