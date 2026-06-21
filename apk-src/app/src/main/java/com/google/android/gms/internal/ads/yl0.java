package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import io.appmetrica.analytics.impl.C0232ia;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e50 f12658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rq0 f12659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iq0 f12660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t9.e0 f12661h = p9.k.C.f31302h.g();
    public final qd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h50 f12662j;

    public yl0(Context context, String str, String str2, e50 e50Var, rq0 rq0Var, iq0 iq0Var, qd0 qd0Var, h50 h50Var, long j10) {
        this.f12654a = context;
        this.f12655b = str;
        this.f12656c = str2;
        this.f12658e = e50Var;
        this.f12659f = rq0Var;
        this.f12660g = iq0Var;
        this.i = qd0Var;
        this.f12662j = h50Var;
        this.f12657d = j10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        Bundle bundle = new Bundle();
        qd0 qd0Var = this.i;
        ConcurrentHashMap concurrentHashMap = qd0Var.f9459a;
        String str = this.f12655b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue()) {
            p9.k.C.f31304k.getClass();
            qd0Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f12657d));
            qd0Var.b(C0232ia.f24064g, true != t9.g0.h(this.f12654a) ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        }
        e50 e50Var = this.f12658e;
        iq0 iq0Var = this.f12660g;
        q9.d3 d3Var = iq0Var.f6572d;
        xw xwVar = e50Var.f4838c;
        synchronized (xwVar.f12354d) {
            xwVar.f12351a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xwVar.f12359j = jElapsedRealtime;
            dx dxVar = xwVar.f12352b;
            synchronized (dxVar.f4700b) {
                dxVar.f4703e.a(d3Var, jElapsedRealtime);
            }
        }
        bundle.putAll(this.f12659f.a());
        return vv.d(new zl0(this.f12654a, bundle, str, this.f12656c, this.f12661h, iq0Var.f6575g, this.f12662j));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 12;
    }
}
