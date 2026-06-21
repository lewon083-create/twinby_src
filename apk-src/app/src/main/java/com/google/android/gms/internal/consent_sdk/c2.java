package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements yc.c, yc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f13349b;

    public /* synthetic */ c2(z2 z2Var) {
        this.f13349b = z2Var;
    }

    @Override // yc.b
    public void a(yc.e eVar) {
        z2 z2Var = this.f13349b;
        synchronized (z2Var.f13635e) {
            z2Var.f13638h = false;
        }
    }

    @Override // yc.c
    public void b() {
        z2 z2Var = this.f13349b;
        synchronized (z2Var.f13635e) {
            z2Var.f13638h = false;
        }
    }
}
