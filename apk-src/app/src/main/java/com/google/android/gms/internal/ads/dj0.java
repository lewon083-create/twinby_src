package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m10 f4576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f4577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f4578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qq0 f4579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nc0 f4580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qd0 f4581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u9.a f4582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f4583h;

    public dj0(m10 m10Var, r81 r81Var, cw cwVar, qq0 qq0Var, nc0 nc0Var, qd0 qd0Var, u9.a aVar, Context context, fp fpVar) {
        this.f4582g = aVar;
        this.f4583h = context;
        this.f4576a = m10Var;
        this.f4577b = r81Var;
        this.f4578c = cwVar;
        this.f4579d = qq0Var;
        this.f4580e = nc0Var;
        this.f4581f = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        bq0 bq0Var = xp0Var.f12260s;
        return (bq0Var == null || bq0Var.f3854c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.D2)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, this.f4581f.f9463e, "rendering-native-ads-native-js-webview-start");
        }
        ed.d dVarB = this.f4579d.b();
        zq zqVar = new zq(11, this, xp0Var);
        r81 r81Var = this.f4577b;
        return vv.J(vv.J(dVarB, zqVar, r81Var), new v40(this, eq0Var, xp0Var, 8), r81Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[EDGE_INSN: B:173:0x039d->B:107:0x039d BREAK  A[LOOP:0: B:109:0x03a1->B:121:0x0401], PHI: r26
      0x039d: PHI (r26v5 com.google.android.gms.internal.ads.qd0) = 
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
     binds: [B:100:0x0383, B:102:0x0389, B:104:0x0395, B:106:0x039b, B:173:0x039d, B:170:0x039d, B:116:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[PHI: r26
      0x039d: PHI (r26v5 com.google.android.gms.internal.ads.qd0) = 
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v4 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
      (r26v7 com.google.android.gms.internal.ads.qd0)
     binds: [B:100:0x0383, B:102:0x0389, B:104:0x0395, B:106:0x039b, B:173:0x039d, B:170:0x039d, B:116:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.e81 c(final com.google.android.gms.internal.ads.eq0 r33, final com.google.android.gms.internal.ads.xp0 r34, final org.json.JSONObject r35) {
        /*
            Method dump skipped, instruction units count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dj0.c(com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.xp0, org.json.JSONObject):com.google.android.gms.internal.ads.e81");
    }
}
