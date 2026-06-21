package i4;

import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f20911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f20912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f20913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j3.n0 f20914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f20915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f20916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20918t;

    public h(e eVar) {
        super(eVar.f20873a);
        this.f20911m = eVar.f20874b;
        this.f20912n = eVar.f20875c;
        this.f20913o = new ArrayList();
        this.f20914p = new j3.n0();
    }

    @Override // i4.l1
    public final void D(j3.o0 o0Var) {
        if (this.f20916r != null) {
            return;
        }
        G(o0Var);
    }

    public final void G(j3.o0 o0Var) {
        long j10;
        j3.n0 n0Var = this.f20914p;
        o0Var.n(0, n0Var);
        long j11 = n0Var.f26322p;
        f fVar = this.f20915q;
        long j12 = this.f20911m;
        ArrayList arrayList = this.f20913o;
        if (fVar == null || arrayList.isEmpty()) {
            this.f20917s = j11;
            this.f20918t = j12 != Long.MIN_VALUE ? j11 + j12 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) arrayList.get(i);
                long j13 = this.f20917s;
                long j14 = this.f20918t;
                dVar.f20871g = j13;
                dVar.f20872h = j14;
            }
            j10 = 0;
        } else {
            j10 = this.f20917s - j11;
            j12 = j12 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f20918t - j11;
        }
        try {
            f fVar2 = new f(o0Var, j10, j12);
            this.f20915q = fVar2;
            q(fVar2);
        } catch (g e3) {
            this.f20916r = e3;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).i = this.f20916r;
            }
        }
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, bb.e eVar, long j10) {
        d dVar = new d(this.f20955l.b(c0Var, eVar, j10), this.f20912n, this.f20917s, this.f20918t);
        this.f20913o.add(dVar);
        return dVar;
    }

    @Override // i4.l, i4.a
    public final void l() throws g {
        g gVar = this.f20916r;
        if (gVar != null) {
            throw gVar;
        }
        super.l();
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        ArrayList arrayList = this.f20913o;
        h5.r(arrayList.remove(a0Var));
        this.f20955l.r(((d) a0Var).f20866b);
        if (arrayList.isEmpty()) {
            f fVar = this.f20915q;
            fVar.getClass();
            G(fVar.f20995b);
        }
    }

    @Override // i4.l, i4.a
    public final void t() {
        super.t();
        this.f20916r = null;
        this.f20915q = null;
    }
}
