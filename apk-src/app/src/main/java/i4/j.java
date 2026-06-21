package i4;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements j0, x3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f20931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f20932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f20933d;

    public j(l lVar, Object obj) {
        this.f20933d = lVar;
        this.f20931b = lVar.a(null);
        this.f20932c = new i0(lVar.f20829e.f20928c, 0, null);
        this.f20930a = obj;
    }

    public final boolean a(int i, c0 c0Var) {
        c0 c0VarX;
        Object obj = this.f20930a;
        l lVar = this.f20933d;
        if (c0Var != null) {
            c0VarX = lVar.x(obj, c0Var);
            if (c0VarX == null) {
                return false;
            }
        } else {
            c0VarX = null;
        }
        int iZ = lVar.z(i, obj);
        i0 i0Var = this.f20931b;
        if (i0Var.f20926a != iZ || !Objects.equals(i0Var.f20927b, c0VarX)) {
            this.f20931b = new i0(lVar.f20828d.f20928c, iZ, c0VarX);
        }
        i0 i0Var2 = this.f20932c;
        if (i0Var2.f20926a == iZ && Objects.equals(i0Var2.f20927b, c0VarX)) {
            return true;
        }
        this.f20932c = new i0(lVar.f20829e.f20928c, iZ, c0VarX);
        return true;
    }

    public final f4.g b(f4.g gVar, c0 c0Var) {
        long j10 = gVar.f16632e;
        l lVar = this.f20933d;
        Object obj = this.f20930a;
        long jY = lVar.y(j10, obj);
        long j11 = gVar.f16633f;
        long jY2 = lVar.y(j11, obj);
        return (jY == j10 && jY2 == j11) ? gVar : new f4.g(gVar.f16629b, gVar.f16630c, (j3.o) gVar.f16634g, gVar.f16631d, gVar.f16635h, jY, jY2);
    }

    @Override // i4.j0
    public final void c(int i, c0 c0Var, u uVar, f4.g gVar) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new f0(i0Var, uVar, gVarB, 0));
        }
    }

    @Override // i4.j0
    public final void f(int i, c0 c0Var, u uVar, f4.g gVar, int i10) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new e0(i0Var, uVar, gVarB, i10));
        }
    }

    @Override // i4.j0
    public final void g(int i, c0 c0Var, f4.g gVar) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            c0 c0Var2 = i0Var.f20927b;
            c0Var2.getClass();
            i0Var.a(new com.google.firebase.messaging.o(i0Var, c0Var2, gVarB, 9));
        }
    }

    @Override // i4.j0
    public final void m(int i, c0 c0Var, u uVar, f4.g gVar, IOException iOException, boolean z5) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new g0(i0Var, uVar, gVarB, iOException, z5));
        }
    }

    @Override // i4.j0
    public final void s(int i, c0 c0Var, u uVar, f4.g gVar) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new f0(i0Var, uVar, gVarB, 1));
        }
    }

    @Override // i4.j0
    public final void t(int i, c0 c0Var, f4.g gVar) {
        if (a(i, c0Var)) {
            i0 i0Var = this.f20931b;
            f4.g gVarB = b(gVar, c0Var);
            i0Var.getClass();
            i0Var.a(new a0.y(16, i0Var, gVarB));
        }
    }
}
