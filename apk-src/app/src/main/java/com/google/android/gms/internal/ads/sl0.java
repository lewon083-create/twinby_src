package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10333c;

    public /* synthetic */ sl0(int i, Object obj, boolean z5) {
        this.f10331a = i;
        this.f10333c = obj;
        this.f10332b = z5;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        switch (this.f10331a) {
            case 0:
                String str = (String) this.f10333c;
                w50 w50Var = (w50) obj;
                if (str != null) {
                    Bundle bundleA = ix.a(w50Var.f11646a, "pii");
                    bundleA.putString("afai", str);
                    bundleA.putBoolean("is_afai_lat", this.f10332b);
                }
                break;
            default:
                Bundle bundle = ((w50) obj).f11646a;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3077k6)).booleanValue()) {
                    bundle.putBoolean("app_switched", this.f10332b);
                }
                q9.j3 j3Var = (q9.j3) this.f10333c;
                if (j3Var != null) {
                    int i = j3Var.f31916b;
                    if (i == 1) {
                        bundle.putString("avo", "p");
                    } else if (i == 2) {
                        bundle.putString("avo", "l");
                    }
                }
                break;
        }
    }
}
