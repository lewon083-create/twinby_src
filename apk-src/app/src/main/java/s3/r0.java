package s3;

import android.util.Pair;
import com.google.android.gms.internal.ads.xj0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements i4.j0, x3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f32641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj0 f32642b;

    public r0(xj0 xj0Var, t0 t0Var) {
        this.f32642b = xj0Var;
        this.f32641a = t0Var;
    }

    public final Pair a(int i, i4.c0 c0Var) {
        i4.c0 c0VarA;
        t0 t0Var = this.f32641a;
        i4.c0 c0Var2 = null;
        if (c0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= t0Var.f32651c.size()) {
                    c0VarA = null;
                    break;
                }
                if (((i4.c0) t0Var.f32651c.get(i10)).f20864d == c0Var.f20864d) {
                    Object obj = c0Var.f20861a;
                    Object obj2 = t0Var.f32650b;
                    int i11 = z0.f32724k;
                    c0VarA = c0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (c0VarA == null) {
                return null;
            }
            c0Var2 = c0VarA;
        }
        return Pair.create(Integer.valueOf(i + t0Var.f32652d), c0Var2);
    }

    @Override // i4.j0
    public final void c(int i, i4.c0 c0Var, i4.u uVar, f4.g gVar) {
        Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new o0(this, pairA, uVar, gVar, 1));
        }
    }

    @Override // i4.j0
    public final void f(int i, i4.c0 c0Var, final i4.u uVar, final f4.g gVar, final int i10) {
        final Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new Runnable() { // from class: s3.p0
                @Override // java.lang.Runnable
                public final void run() {
                    t3.d dVar = (t3.d) this.f32625b.f32642b.f12166j;
                    Pair pair = pairA;
                    dVar.f(((Integer) pair.first).intValue(), (i4.c0) pair.second, uVar, gVar, i10);
                }
            });
        }
    }

    @Override // i4.j0
    public final void g(int i, i4.c0 c0Var, f4.g gVar) {
        Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new n0(this, pairA, gVar, 0));
        }
    }

    @Override // i4.j0
    public final void m(int i, i4.c0 c0Var, i4.u uVar, f4.g gVar, IOException iOException, boolean z5) {
        Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new q0(this, pairA, uVar, gVar, iOException, z5, 0));
        }
    }

    @Override // i4.j0
    public final void s(int i, i4.c0 c0Var, i4.u uVar, f4.g gVar) {
        Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new o0(this, pairA, uVar, gVar, 0));
        }
    }

    @Override // i4.j0
    public final void t(int i, i4.c0 c0Var, f4.g gVar) {
        Pair pairA = a(i, c0Var);
        if (pairA != null) {
            ((m3.v) this.f32642b.f12167k).c(new n0(this, pairA, gVar, 1));
        }
    }
}
