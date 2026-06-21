package y3;

import i4.a1;
import i4.i0;
import j3.a0;
import j3.b0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a1 {
    public final Map H;
    public j3.l I;

    public p(bb.e eVar, x3.h hVar, i0 i0Var, Map map) {
        super(eVar, hVar, i0Var);
        this.H = map;
    }

    @Override // i4.a1
    public final j3.o p(j3.o oVar) {
        j3.l lVar;
        j3.l lVar2 = this.I;
        if (lVar2 == null) {
            lVar2 = oVar.f26339r;
        }
        if (lVar2 != null && (lVar = (j3.l) this.H.get(lVar2.f26271d)) != null) {
            lVar2 = lVar;
        }
        b0 b0Var = oVar.f26333l;
        b0 b0Var2 = null;
        if (b0Var == null) {
            b0Var = b0Var2;
        } else {
            a0[] a0VarArr = b0Var.f26216a;
            int length = a0VarArr.length;
            int i = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                a0 a0Var = a0VarArr[i10];
                if ((a0Var instanceof e5.n) && "com.apple.streaming.transportStreamTimestamp".equals(((e5.n) a0Var).f16262b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    a0[] a0VarArr2 = new a0[length - 1];
                    while (i < length) {
                        if (i != i10) {
                            a0VarArr2[i < i10 ? i : i - 1] = a0VarArr[i];
                        }
                        i++;
                    }
                    b0Var2 = new b0(a0VarArr2);
                }
                b0Var = b0Var2;
            }
        }
        if (lVar2 != oVar.f26339r || b0Var != oVar.f26333l) {
            j3.n nVarA = oVar.a();
            nVarA.f26296q = lVar2;
            nVarA.f26290k = b0Var;
            oVar = new j3.o(nVarA);
        }
        return super.p(oVar);
    }
}
