package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9.b3 f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wp f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uk0 f6571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q9.d3 f6572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f6573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q9.g3 f6574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6576h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wm f6577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q9.j3 f6578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n9.a f6580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n9.d f6581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q9.v0 f6582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l7.n f6583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f6587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f6588u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f6589v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q9.y0 f6590w;

    public iq0(hq0 hq0Var) {
        this.f6574f = hq0Var.f6213b;
        this.f6575g = hq0Var.f6214c;
        this.f6590w = hq0Var.f6233w;
        q9.d3 d3Var = hq0Var.f6212a;
        this.f6573e = d3Var.C;
        int i = d3Var.f31801b;
        long j10 = d3Var.f31802c;
        Bundle bundle = d3Var.f31803d;
        int i10 = d3Var.f31804e;
        List list = d3Var.f31805f;
        boolean z5 = d3Var.f31806g;
        int i11 = d3Var.f31807h;
        boolean z10 = true;
        if (!d3Var.i && !hq0Var.f6216e) {
            z10 = false;
        }
        String str = d3Var.f31808j;
        q9.z2 z2Var = d3Var.f31809k;
        Location location = d3Var.f31810l;
        String str2 = d3Var.f31811m;
        Bundle bundle2 = d3Var.f31812n;
        Bundle bundle3 = d3Var.f31813o;
        List list2 = d3Var.f31814p;
        String str3 = d3Var.f31815q;
        String str4 = d3Var.f31816r;
        boolean z11 = d3Var.f31817s;
        q9.o0 o0Var = d3Var.f31818t;
        int i12 = d3Var.f31819u;
        String str5 = d3Var.f31820v;
        List list3 = d3Var.f31821w;
        int iT = t9.g0.t(d3Var.f31822x);
        q9.d3 d3Var2 = hq0Var.f6212a;
        q9.d3 d3Var3 = new q9.d3(i, j10, bundle, i10, list, z5, i11, z10, str, z2Var, location, str2, bundle2, bundle3, list2, str3, str4, z11, o0Var, i12, str5, list3, iT, d3Var2.f31823y, d3Var2.f31824z, d3Var2.A, d3Var2.B);
        this.f6572d = d3Var3;
        q9.b3 b3Var = hq0Var.f6215d;
        wm wmVar = null;
        if (b3Var == null) {
            wm wmVar2 = hq0Var.f6219h;
            b3Var = wmVar2 != null ? wmVar2.f11849g : null;
        }
        this.f6569a = b3Var;
        ArrayList arrayList = hq0Var.f6217f;
        this.f6576h = arrayList;
        this.i = hq0Var.f6218g;
        if (arrayList != null && (wmVar = hq0Var.f6219h) == null) {
            wmVar = new wm(new n9.c(new n9.c()));
        }
        this.f6577j = wmVar;
        this.f6578k = hq0Var.i;
        this.f6579l = hq0Var.f6223m;
        this.f6580m = hq0Var.f6220j;
        this.f6581n = hq0Var.f6221k;
        this.f6582o = hq0Var.f6222l;
        this.f6570b = hq0Var.f6224n;
        this.f6583p = new l7.n(hq0Var.f6225o);
        this.f6584q = hq0Var.f6226p;
        this.f6585r = hq0Var.f6227q;
        this.f6571c = hq0Var.f6228r;
        this.f6586s = hq0Var.f6229s;
        this.f6587t = hq0Var.f6230t;
        long j11 = d3Var3.B;
        this.f6588u = j11 != 0 ? new AtomicLong(j11) : hq0Var.f6231u;
        this.f6589v = hq0Var.f6232v;
    }

    public final boolean a() {
        return this.f6575g.matches((String) q9.s.f31967e.f31970c.a(al.R3));
    }
}
