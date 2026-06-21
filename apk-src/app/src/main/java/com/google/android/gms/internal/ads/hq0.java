package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q9.d3 f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q9.g3 f6213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q9.b3 f6215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f6217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wm f6219h;
    public q9.j3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n9.a f6220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n9.d f6221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q9.v0 f6222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6223m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public wp f6224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l7.n f6225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public uk0 f6228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f6230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f6231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q9.y0 f6233w;

    public hq0() {
        l7.n nVar = new l7.n(4);
        nVar.f28052c = 2;
        this.f6225o = nVar;
        this.f6226p = false;
        this.f6227q = false;
        this.f6229s = false;
        this.f6231u = new AtomicLong();
        this.f6232v = false;
    }

    public final iq0 a() {
        pa.c0.j(this.f6214c, "ad unit must not be null");
        pa.c0.j(this.f6213b, "ad size must not be null");
        pa.c0.j(this.f6212a, "ad request must not be null");
        return new iq0(this);
    }
}
