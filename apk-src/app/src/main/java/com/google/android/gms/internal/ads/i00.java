package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends q9.a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sz f6318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q9.c2 f6323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6324h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yn f6330o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6319c = new Object();
    public boolean i = true;

    public i00(sz szVar, float f10, boolean z5, boolean z10) {
        this.f6318b = szVar;
        this.f6325j = f10;
        this.f6320d = z5;
        this.f6321e = z10;
    }

    @Override // q9.b2
    public final void Z3(q9.c2 c2Var) {
        synchronized (this.f6319c) {
            this.f6323g = c2Var;
        }
    }

    @Override // q9.b2
    public final void c() {
        o4("pause", null);
    }

    @Override // q9.b2
    public final float d() {
        float f10;
        synchronized (this.f6319c) {
            f10 = this.f6325j;
        }
        return f10;
    }

    @Override // q9.b2
    public final int f() {
        int i;
        synchronized (this.f6319c) {
            i = this.f6322f;
        }
        return i;
    }

    @Override // q9.b2
    public final void i() {
        o4("play", null);
    }

    @Override // q9.b2
    public final boolean m() {
        boolean z5;
        synchronized (this.f6319c) {
            z5 = this.i;
        }
        return z5;
    }

    public final void m4(q9.b3 b3Var) {
        Object obj = this.f6319c;
        boolean z5 = b3Var.f31792c;
        boolean z10 = b3Var.f31793d;
        synchronized (obj) {
            this.f6328m = z5;
            this.f6329n = z10;
        }
        boolean z11 = b3Var.f31791b;
        String str = true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        String str2 = true != z10 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        String str3 = true != z11 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        h1.e eVar = new h1.e(3);
        eVar.put("muteStart", str3);
        eVar.put("customControlsRequested", str);
        eVar.put("clickToExpandRequested", str2);
        o4("initialState", Collections.unmodifiableMap(eVar));
    }

    @Override // q9.b2
    public final float n() {
        float f10;
        synchronized (this.f6319c) {
            f10 = this.f6326k;
        }
        return f10;
    }

    public final void n4(float f10, float f11, int i, boolean z5, float f12) {
        boolean z10;
        boolean z11;
        int i10;
        synchronized (this.f6319c) {
            try {
                z10 = true;
                if (f11 == this.f6325j && f12 == this.f6327l) {
                    z10 = false;
                }
                this.f6325j = f11;
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.Zd)).booleanValue()) {
                    this.f6326k = f10;
                }
                z11 = this.i;
                this.i = z5;
                i10 = this.f6322f;
                this.f6322f = i;
                float f13 = this.f6327l;
                this.f6327l = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f6318b.i0().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            try {
                yn ynVar = this.f6330o;
                if (ynVar != null) {
                    ynVar.L1(ynVar.D0(), 2);
                }
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
        hx.f6284f.execute(new h00(this, i10, i, z11, z5));
    }

    public final void o4(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        hx.f6284f.execute(new l81(16, this, map2));
    }

    @Override // q9.b2
    public final float p() {
        float f10;
        synchronized (this.f6319c) {
            f10 = this.f6327l;
        }
        return f10;
    }

    @Override // q9.b2
    public final boolean q() {
        boolean z5;
        synchronized (this.f6319c) {
            try {
                z5 = false;
                if (this.f6320d && this.f6328m) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // q9.b2
    public final q9.c2 r() {
        q9.c2 c2Var;
        synchronized (this.f6319c) {
            c2Var = this.f6323g;
        }
        return c2Var;
    }

    @Override // q9.b2
    public final boolean s() {
        boolean z5;
        Object obj = this.f6319c;
        boolean zQ = q();
        synchronized (obj) {
            z5 = false;
            if (!zQ) {
                try {
                    if (this.f6329n && this.f6321e) {
                        z5 = true;
                    }
                } finally {
                }
            }
        }
        return z5;
    }

    @Override // q9.b2
    public final void u0(boolean z5) {
        o4(true != z5 ? "unmute" : "mute", null);
    }

    @Override // q9.b2
    public final void y() {
        o4("stop", null);
    }
}
