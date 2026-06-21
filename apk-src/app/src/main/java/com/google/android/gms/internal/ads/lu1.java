package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final hy1 f7631t = new hy1(new Object(), -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci f7632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy1 f7633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bt1 f7637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mz1 f7639h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f7640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hy1 f7641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final pc f7645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f7646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f7647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f7648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f7649s;

    public lu1(ci ciVar, hy1 hy1Var, long j10, long j11, int i, bt1 bt1Var, boolean z5, mz1 mz1Var, g gVar, List list, hy1 hy1Var2, boolean z10, int i10, int i11, pc pcVar, long j12, long j13, long j14, long j15) {
        this.f7632a = ciVar;
        this.f7633b = hy1Var;
        this.f7634c = j10;
        this.f7635d = j11;
        this.f7636e = i;
        this.f7637f = bt1Var;
        this.f7638g = z5;
        this.f7639h = mz1Var;
        this.i = gVar;
        this.f7640j = list;
        this.f7641k = hy1Var2;
        this.f7642l = z10;
        this.f7643m = i10;
        this.f7644n = i11;
        this.f7645o = pcVar;
        this.f7646p = j12;
        this.f7647q = j13;
        this.f7648r = j14;
        this.f7649s = j15;
    }

    public static lu1 a(g gVar) {
        jg jgVar = ci.f4215a;
        mz1 mz1Var = mz1.f8054d;
        r51 r51Var = r51.f9713f;
        pc pcVar = pc.f9009d;
        hy1 hy1Var = f7631t;
        return new lu1(jgVar, hy1Var, -9223372036854775807L, 0L, 1, null, false, mz1Var, gVar, r51Var, hy1Var, false, 1, 0, pcVar, 0L, 0L, 0L, 0L);
    }

    public final lu1 b(hy1 hy1Var, long j10, long j11, long j12, long j13, mz1 mz1Var, g gVar, List list) {
        hy1 hy1Var2 = this.f7641k;
        boolean z5 = this.f7642l;
        int i = this.f7643m;
        int i10 = this.f7644n;
        pc pcVar = this.f7645o;
        long j14 = this.f7646p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new lu1(this.f7632a, hy1Var, j11, j12, this.f7636e, this.f7637f, this.f7638g, mz1Var, gVar, list, hy1Var2, z5, i, i10, pcVar, j14, j13, j10, jElapsedRealtime);
    }

    public final lu1 c(ci ciVar) {
        return new lu1(ciVar, this.f7633b, this.f7634c, this.f7635d, this.f7636e, this.f7637f, this.f7638g, this.f7639h, this.i, this.f7640j, this.f7641k, this.f7642l, this.f7643m, this.f7644n, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final lu1 d(int i) {
        return new lu1(this.f7632a, this.f7633b, this.f7634c, this.f7635d, i, this.f7637f, this.f7638g, this.f7639h, this.i, this.f7640j, this.f7641k, this.f7642l, this.f7643m, this.f7644n, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final lu1 e(bt1 bt1Var) {
        return new lu1(this.f7632a, this.f7633b, this.f7634c, this.f7635d, this.f7636e, bt1Var, this.f7638g, this.f7639h, this.i, this.f7640j, this.f7641k, this.f7642l, this.f7643m, this.f7644n, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final lu1 f(boolean z5) {
        return new lu1(this.f7632a, this.f7633b, this.f7634c, this.f7635d, this.f7636e, this.f7637f, z5, this.f7639h, this.i, this.f7640j, this.f7641k, this.f7642l, this.f7643m, this.f7644n, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final lu1 g(hy1 hy1Var) {
        return new lu1(this.f7632a, this.f7633b, this.f7634c, this.f7635d, this.f7636e, this.f7637f, this.f7638g, this.f7639h, this.i, this.f7640j, hy1Var, this.f7642l, this.f7643m, this.f7644n, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final lu1 h(int i, int i10, boolean z5) {
        return new lu1(this.f7632a, this.f7633b, this.f7634c, this.f7635d, this.f7636e, this.f7637f, this.f7638g, this.f7639h, this.i, this.f7640j, this.f7641k, z5, i, i10, this.f7645o, this.f7646p, this.f7647q, this.f7648r, this.f7649s);
    }

    public final boolean i() {
        return this.f7636e == 3 && this.f7642l && this.f7644n == 0;
    }
}
