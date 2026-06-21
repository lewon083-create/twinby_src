package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f10106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f10107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f10109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c6 f10110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f10111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10112h;
    public final w0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ro0 f10113j = new ro0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lo0 f10114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Pair f10115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10119p;

    public s0(n0 n0Var) {
        this.f10105a = n0Var.f8077a;
        q0 q0Var = (q0) n0Var.f8082f;
        q0Var.getClass();
        this.f10106b = q0Var;
        this.f10107c = new SparseArray();
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        this.f10108d = n0Var.f8078b;
        c6 c6Var = (c6) n0Var.f8083g;
        this.f10110f = c6Var;
        long j10 = n0Var.f8080d;
        this.f10112h = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
        w0 w0Var = (w0) n0Var.f8084h;
        this.i = w0Var;
        this.f10109e = new b0((v0) n0Var.f8081e, w0Var, c6Var);
        this.f10111g = new CopyOnWriteArraySet();
        new jx1(new ow1());
        this.f10118o = -9223372036854775807L;
        this.f10119p = -1;
        this.f10117n = 0;
    }
}
