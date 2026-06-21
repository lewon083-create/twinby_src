package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f4651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp0 f4652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ku0 f4653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o31 f4654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o31 f4655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uk f4656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f4657h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s50 f4658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uu1 f4661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tu1 f4662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f4664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f4669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f4671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xs1 f4672x;

    public dt1(Context context, ox0 ox0Var) {
        pp0 pp0Var = new pp0(8, ox0Var);
        ku0 ku0Var = new ku0(context, 5);
        yh0 yh0Var = new yh0(context);
        jl1 jl1Var = jl1.f6878c;
        uk ukVar = new uk(context, false);
        context.getClass();
        this.f4650a = context;
        this.f4652c = pp0Var;
        this.f4653d = ku0Var;
        this.f4654e = yh0Var;
        this.f4655f = jl1Var;
        this.f4656g = ukVar;
        String str = cq0.f4293a;
        Looper looperMyLooper = Looper.myLooper();
        this.f4657h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f4658j = s50.f10178b;
        this.f4659k = 1;
        this.f4660l = true;
        this.f4661m = uu1.f11102d;
        this.f4662n = tu1.f10719b;
        this.f4672x = new xs1(cq0.s(20L), cq0.s(500L));
        this.f4651b = c6.f4047g;
        this.f4663o = 500L;
        this.f4664p = 2000L;
        this.f4665q = 600000;
        this.f4666r = Integer.MAX_VALUE;
        this.f4667s = Integer.MAX_VALUE;
        this.f4668t = 600000;
        this.f4669u = true;
        this.f4671w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = at1.f3385a;
        }
    }
}
