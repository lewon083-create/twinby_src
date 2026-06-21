package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dx implements mh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9.e0 f4701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zd1 f4702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cx f4703e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4700b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f4704f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f4705g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4706h = false;

    public dx(String str, t9.e0 e0Var) {
        this.f4703e = new cx(str, e0Var);
        this.f4701c = e0Var;
        zd1 zd1Var = new zd1(7, false);
        zd1Var.f12971c = BigInteger.ONE;
        zd1Var.f12972d = CommonUrlParts.Values.FALSE_INTEGER;
        this.f4702d = zd1Var;
    }

    public final void a(xw xwVar) {
        synchronized (this.f4700b) {
            this.f4704f.add(xwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void l0(boolean z5) {
        long j10;
        int i;
        p9.k.C.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z5) {
            t9.e0 e0Var = this.f4701c;
            e0Var.i();
            synchronized (e0Var.f33564a) {
                j10 = e0Var.f33577o;
            }
            if (jCurrentTimeMillis - j10 > ((Long) q9.s.f31967e.f31970c.a(al.f3190s1)).longValue()) {
                this.f4703e.f4355d = -1;
            } else {
                cx cxVar = this.f4703e;
                e0Var.i();
                synchronized (e0Var.f33564a) {
                    i = e0Var.f33579q;
                }
                cxVar.f4355d = i;
            }
            this.f4706h = true;
            return;
        }
        t9.e0 e0Var2 = this.f4701c;
        e0Var2.i();
        synchronized (e0Var2.f33564a) {
            try {
                if (e0Var2.f33577o != jCurrentTimeMillis) {
                    e0Var2.f33577o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = e0Var2.f33570g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        e0Var2.f33570g.apply();
                    }
                    e0Var2.j();
                }
            } finally {
            }
        }
        int i10 = this.f4703e.f4355d;
        e0Var2.i();
        synchronized (e0Var2.f33564a) {
            try {
                if (e0Var2.f33579q == i10) {
                    return;
                }
                e0Var2.f33579q = i10;
                SharedPreferences.Editor editor2 = e0Var2.f33570g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i10);
                    e0Var2.f33570g.apply();
                }
                e0Var2.j();
            } finally {
            }
        }
    }
}
