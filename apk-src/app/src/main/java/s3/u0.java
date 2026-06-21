package s3;

import android.os.SystemClock;
import i4.j1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i4.c0 f32656u = new i4.c0(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.o0 f32657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.c0 f32658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f32660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f32662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f32664h;
    public final l4.v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f32665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i4.c0 f32666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f32667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f32668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f32669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j3.f0 f32670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f32671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f32672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f32673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f32674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f32675t;

    public u0(j3.o0 o0Var, i4.c0 c0Var, long j10, long j11, int i, i iVar, boolean z5, j1 j1Var, l4.v vVar, List list, i4.c0 c0Var2, boolean z10, int i10, int i11, j3.f0 f0Var, long j12, long j13, long j14, long j15, boolean z11) {
        this.f32657a = o0Var;
        this.f32658b = c0Var;
        this.f32659c = j10;
        this.f32660d = j11;
        this.f32661e = i;
        this.f32662f = iVar;
        this.f32663g = z5;
        this.f32664h = j1Var;
        this.i = vVar;
        this.f32665j = list;
        this.f32666k = c0Var2;
        this.f32667l = z10;
        this.f32668m = i10;
        this.f32669n = i11;
        this.f32670o = f0Var;
        this.f32672q = j12;
        this.f32673r = j13;
        this.f32674s = j14;
        this.f32675t = j15;
        this.f32671p = z11;
    }

    public static u0 k(l4.v vVar) {
        j3.l0 l0Var = j3.o0.f26348a;
        j1 j1Var = j1.f20934d;
        ad.b1 b1Var = ad.b1.f768f;
        j3.f0 f0Var = j3.f0.f26236d;
        i4.c0 c0Var = f32656u;
        return new u0(l0Var, c0Var, -9223372036854775807L, 0L, 1, null, false, j1Var, vVar, b1Var, c0Var, false, 1, 0, f0Var, 0L, 0L, 0L, 0L, false);
    }

    public final u0 a() {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, l(), SystemClock.elapsedRealtime(), this.f32671p);
    }

    public final u0 b(boolean z5) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, z5, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 c(i4.c0 c0Var) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, c0Var, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 d(i4.c0 c0Var, long j10, long j11, long j12, long j13, j1 j1Var, l4.v vVar, List list) {
        return new u0(this.f32657a, c0Var, j11, j12, this.f32661e, this.f32662f, this.f32663g, j1Var, vVar, list, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, j13, j10, SystemClock.elapsedRealtime(), this.f32671p);
    }

    public final u0 e(int i, int i10, boolean z5) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, z5, i, i10, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 f(i iVar) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, iVar, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 g(j3.f0 f0Var) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, f0Var, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 h(int i) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, i, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final u0 i(boolean z5) {
        return new u0(this.f32657a, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, z5);
    }

    public final u0 j(j3.o0 o0Var) {
        return new u0(o0Var, this.f32658b, this.f32659c, this.f32660d, this.f32661e, this.f32662f, this.f32663g, this.f32664h, this.i, this.f32665j, this.f32666k, this.f32667l, this.f32668m, this.f32669n, this.f32670o, this.f32672q, this.f32673r, this.f32674s, this.f32675t, this.f32671p);
    }

    public final long l() {
        long j10;
        long j11;
        if (!m()) {
            return this.f32674s;
        }
        do {
            j10 = this.f32675t;
            j11 = this.f32674s;
        } while (j10 != this.f32675t);
        return m3.z.M(m3.z.Z(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f32670o.f26237a)));
    }

    public final boolean m() {
        return this.f32661e == 3 && this.f32667l && this.f32669n == 0;
    }
}
