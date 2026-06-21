package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lf implements cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv0 f7499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f7500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uf f7501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf f7502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cf f7503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wf f7504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f7505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q8 f7506h;

    public lf(fv0 fv0Var, cw cwVar, uf ufVar, kf kfVar, cf cfVar, wf wfVar, p1 p1Var, q8 q8Var) {
        this.f7499a = fv0Var;
        this.f7500b = cwVar;
        this.f7501c = ufVar;
        this.f7502d = kfVar;
        this.f7503e = cfVar;
        this.f7504f = wfVar;
        this.f7505g = p1Var;
        this.f7506h = q8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d A[Catch: all -> 0x00fd, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:12:0x00ec, B:14:0x00f2, B:16:0x00f9, B:20:0x00ff, B:22:0x010a, B:24:0x010e, B:26:0x0119, B:28:0x011d), top: B:41:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap a() {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lf.a():java.util.HashMap");
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap g() {
        HashMap mapA = a();
        uf ufVar = this.f7501c;
        if (ufVar.f10938m <= -2) {
            WeakReference weakReference = ufVar.i;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                ufVar.f10938m = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(ufVar.f10938m));
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap i() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap j() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap l() {
        HashMap mapA = a();
        q8 q8Var = this.f7506h;
        if (q8Var != null) {
            List list = q8Var.f9364a;
            q8Var.f9364a = Collections.EMPTY_LIST;
            mapA.put("vst", list);
        }
        return mapA;
    }
}
