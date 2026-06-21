package k6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.i f27193a = new h1.i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1.g f27194b = new h1.g();

    public final void a(androidx.recyclerview.widget.p pVar, r0 r0Var) {
        h1.i iVar = this.f27193a;
        t1 t1VarA = (t1) iVar.get(pVar);
        if (t1VarA == null) {
            t1VarA = t1.a();
            iVar.put(pVar, t1VarA);
        }
        t1VarA.f27184c = r0Var;
        t1VarA.f27182a |= 8;
    }

    public final r0 b(androidx.recyclerview.widget.p pVar, int i) {
        t1 t1Var;
        r0 r0Var;
        h1.i iVar = this.f27193a;
        int iD = iVar.d(pVar);
        if (iD >= 0 && (t1Var = (t1) iVar.i(iD)) != null) {
            int i10 = t1Var.f27182a;
            if ((i10 & i) != 0) {
                int i11 = i10 & (~i);
                t1Var.f27182a = i11;
                if (i == 4) {
                    r0Var = t1Var.f27183b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    r0Var = t1Var.f27184c;
                }
                if ((i11 & 12) == 0) {
                    iVar.g(iD);
                    t1Var.f27182a = 0;
                    t1Var.f27183b = null;
                    t1Var.f27184c = null;
                    t1.f27181d.c(t1Var);
                }
                return r0Var;
            }
        }
        return null;
    }

    public final void c(androidx.recyclerview.widget.p pVar) {
        t1 t1Var = (t1) this.f27193a.get(pVar);
        if (t1Var == null) {
            return;
        }
        t1Var.f27182a &= -2;
    }

    public final void d(androidx.recyclerview.widget.p pVar) {
        h1.g gVar = this.f27194b;
        int iE = gVar.e() - 1;
        while (true) {
            if (iE < 0) {
                break;
            }
            if (pVar == gVar.f(iE)) {
                Object[] objArr = gVar.f20334d;
                Object obj = objArr[iE];
                Object obj2 = h1.h.f20336a;
                if (obj != obj2) {
                    objArr[iE] = obj2;
                    gVar.f20332b = true;
                }
            } else {
                iE--;
            }
        }
        t1 t1Var = (t1) this.f27193a.remove(pVar);
        if (t1Var != null) {
            t1Var.f27182a = 0;
            t1Var.f27183b = null;
            t1Var.f27184c = null;
            t1.f27181d.c(t1Var);
        }
    }
}
