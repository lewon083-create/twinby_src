package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 implements z60, l60 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f4571d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f4572e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.e0 f4573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gh0 f4574c;

    public dh0(gh0 gh0Var, t9.e0 e0Var) {
        this.f4574c = gh0Var;
        this.f4573b = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        a(false);
    }

    public final void a(boolean z5) {
        int i;
        int iIntValue;
        wk wkVar = al.W6;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && !this.f4573b.t()) {
            Object obj = f4571d;
            synchronized (obj) {
                i = f4572e;
                iIntValue = ((Integer) sVar.f31970c.a(al.X6)).intValue();
            }
            if (i < iIntValue) {
                gh0 gh0Var = this.f4574c;
                or0 or0VarN = gh0Var.f5810e.n(new Bundle());
                or0VarN.a(new l81(0, or0VarN, new ac.c(gh0Var, z5)), hx.f6285g);
                synchronized (obj) {
                    f4572e++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        a(true);
    }
}
