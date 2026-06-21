package t3;

import i4.c0;
import j3.n0;
import j3.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f33428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f33431g;

    public e(f fVar, String str, int i, c0 c0Var) {
        this.f33431g = fVar;
        this.f33425a = str;
        this.f33426b = i;
        this.f33427c = c0Var == null ? -1L : c0Var.f20864d;
        if (c0Var == null || !c0Var.b()) {
            return;
        }
        this.f33428d = c0Var;
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.f33409d;
        o0 o0Var = aVar.f33407b;
        if (c0Var == null) {
            return this.f33426b != aVar.f33408c;
        }
        long j10 = this.f33427c;
        if (j10 == -1) {
            return false;
        }
        if (c0Var.f20864d > j10) {
            return true;
        }
        c0 c0Var2 = this.f33428d;
        if (c0Var2 == null) {
            return false;
        }
        int i = c0Var2.f20862b;
        int iB = o0Var.b(c0Var.f20861a);
        int iB2 = o0Var.b(c0Var2.f20861a);
        if (c0Var.f20864d < c0Var2.f20864d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!c0Var.b()) {
            int i10 = c0Var.f20865e;
            return i10 == -1 || i10 > i;
        }
        int i11 = c0Var.f20862b;
        int i12 = c0Var.f20863c;
        if (i11 <= i) {
            return i11 == i && i12 > c0Var2.f20863c;
        }
        return true;
    }

    public final boolean b(o0 o0Var, o0 o0Var2) {
        c0 c0Var;
        int i = this.f33426b;
        if (i < o0Var.o()) {
            f fVar = this.f33431g;
            n0 n0Var = fVar.f33433a;
            o0Var.n(i, n0Var);
            for (int i10 = n0Var.f26320n; i10 <= n0Var.f26321o; i10++) {
                int iB = o0Var2.b(o0Var.l(i10));
                if (iB != -1) {
                    i = o0Var2.f(iB, fVar.f33434b, false).f26276c;
                    break;
                }
            }
            i = -1;
        } else if (i >= o0Var2.o()) {
            i = -1;
        }
        this.f33426b = i;
        return i != -1 && ((c0Var = this.f33428d) == null || o0Var2.b(c0Var.f20861a) != -1);
    }
}
