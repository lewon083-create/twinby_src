package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 implements cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z11 f12813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12816e;

    public z01(Context context, ux0 ux0Var, z11 z11Var) {
        this.f12812a = context;
        this.f12814c = ux0Var.F();
        this.f12815d = ux0Var.M();
        this.f12816e = ux0Var.N();
        this.f12813b = z11Var;
    }

    public final void a(HashMap map) {
        ed.d dVar;
        wd wdVar;
        map.put("v", this.f12814c);
        map.put("t", new Throwable());
        try {
            dVar = (ed.d) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strU0 = (dVar == null || (Build.VERSION.SDK_INT >= 31 && !dVar.isDone()) || (wdVar = (wd) dVar.get(this.f12815d, TimeUnit.MILLISECONDS)) == null || wdVar.u0().length() <= 1) ? "E" : wdVar.u0();
        if (strU0.equals("E")) {
            try {
                ed.d dVar2 = (ed.d) map.get("ai");
                if (dVar2 != null) {
                    String str = (String) dVar2.get(this.f12816e, TimeUnit.MILLISECONDS);
                    if (!fs1.n(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strU0);
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap g() {
        HashMap mapC = this.f12813b.c();
        a(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap i() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap j() {
        HashMap mapA = this.f12813b.a();
        a(mapA);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap l() {
        HashMap mapB = this.f12813b.b(this.f12812a, null);
        a(mapB);
        return mapB;
    }
}
