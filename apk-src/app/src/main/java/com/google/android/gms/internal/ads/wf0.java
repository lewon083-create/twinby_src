package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf0 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ku f11803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11805d;

    public /* synthetic */ wf0(Object obj, ku kuVar, int i, int i10) {
        this.f11802a = i10;
        this.f11805d = obj;
        this.f11803b = kuVar;
        this.f11804c = i;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final /* synthetic */ ed.d a(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f11802a) {
            case 0:
                cw cwVar = (cw) this.f11805d;
                ku kuVar = this.f11803b;
                if (kuVar != null && (bundle = kuVar.f7308n) != null) {
                    bundle.putBoolean("ls", true);
                }
                return vv.J(((xg0) ((js1) cwVar.f4350f).j()).l4(kuVar, this.f11804c), new xf0(kuVar, 0), (r81) cwVar.f4348d);
            default:
                z7 z7Var = (z7) this.f11805d;
                ku kuVar2 = this.f11803b;
                if (kuVar2 != null && (bundle2 = kuVar2.f7308n) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return vv.J(((xg0) ((js1) z7Var.f12905g).j()).o4(kuVar2, this.f11804c), new xf0(kuVar2, 1), (r81) z7Var.f12902d);
        }
    }
}
