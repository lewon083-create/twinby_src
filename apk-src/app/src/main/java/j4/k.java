package j4;

import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import i4.a1;
import m3.p;
import p3.c0;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f26507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f26508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f26509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f26510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f26511u;

    public k(p3.h hVar, p3.l lVar, j3.o oVar, int i, Object obj, long j10, long j11, long j12, long j13, long j14, int i10, long j15, e eVar) {
        super(hVar, lVar, oVar, i, obj, j10, j11, j12, j13, j14);
        this.f26506p = i10;
        this.f26507q = j15;
        this.f26508r = eVar;
    }

    @Override // j4.m
    public final long a() {
        return this.f26516k + ((long) this.f26506p);
    }

    @Override // j4.m
    public final boolean b() {
        return this.f26511u;
    }

    @Override // m4.k
    public final void d() {
        this.f26510t = true;
    }

    @Override // m4.k
    public final void load() {
        h3.e eVar = this.f26446n;
        eVar.getClass();
        if (this.f26509s == 0) {
            long j10 = this.f26507q;
            for (a1 a1Var : (a1[]) eVar.f20376d) {
                if (a1Var.F != j10) {
                    a1Var.F = j10;
                    a1Var.f20857z = true;
                }
            }
            e eVar2 = this.f26508r;
            long j11 = this.f26444l;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f26507q;
            long j13 = this.f26445m;
            eVar2.b(eVar, j12, j13 != -9223372036854775807L ? j13 - this.f26507q : -9223372036854775807L);
        }
        try {
            p3.l lVarC = this.f26470c.c(this.f26509s);
            c0 c0Var = this.f26476j;
            q4.h hVar = new q4.h(c0Var, lVarC.f31177f, c0Var.open(lVarC));
            while (!this.f26510t) {
                try {
                    int iA = this.f26508r.f26460b.a(hVar, e.f26459l);
                    h5.r(iA != 1);
                    if (!(iA == 0)) {
                        break;
                    }
                } finally {
                    this.f26509s = hVar.f31739e - this.f26470c.f31177f;
                }
            }
            j3.o oVar = this.f26472e;
            String str = oVar.f26334m;
            int i = oVar.M;
            int i10 = oVar.N;
            if (j3.c0.k(str) && ((i > 1 || i10 > 1) && i != -1 && i10 != -1)) {
                a0 a0VarE = eVar.E(4);
                int i11 = i * i10;
                long j14 = (this.i - this.f26475h) / ((long) i11);
                for (int i12 = 1; i12 < i11; i12++) {
                    a0VarE.d(0, new p());
                    a0VarE.f(((long) i12) * j14, 0, 0, 0, null);
                }
            }
            j4.g(this.f26476j);
            this.f26511u = !this.f26510t;
        } catch (Throwable th2) {
            j4.g(this.f26476j);
            throw th2;
        }
    }
}
