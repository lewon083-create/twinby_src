package s3;

import android.util.Pair;
import i4.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends j3.o0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f32724k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f32726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f32729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f32730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j3.o0[] f32731h;
    public final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f32732j;

    /* JADX WARN: Illegal instructions before constructor call */
    public z0(ArrayList arrayList, e1 e1Var) {
        j3.o0[] o0VarArr = new j3.o0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i10 = 0;
        while (it.hasNext()) {
            o0VarArr[i10] = ((l0) it.next()).a();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((l0) it2.next()).getUid();
            i++;
        }
        this(o0VarArr, objArr, e1Var);
    }

    @Override // j3.o0
    public final int a(boolean z5) {
        if (this.f32725b != 0) {
            int iQ = 0;
            if (z5) {
                int[] iArr = this.f32726c.f20882b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                j3.o0[] o0VarArr = this.f32731h;
                if (!o0VarArr[iQ].p()) {
                    return o0VarArr[iQ].a(z5) + this.f32730g[iQ];
                }
                iQ = q(iQ, z5);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // j3.o0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f32732j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f32731h[iIntValue].b(obj3)) != -1) {
                return this.f32729f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // j3.o0
    public final int c(boolean z5) {
        int iR;
        int i = this.f32725b;
        if (i != 0) {
            if (z5) {
                int[] iArr = this.f32726c.f20882b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                j3.o0[] o0VarArr = this.f32731h;
                if (!o0VarArr[iR].p()) {
                    return o0VarArr[iR].c(z5) + this.f32730g[iR];
                }
                iR = r(iR, z5);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // j3.o0
    public final int e(int i, int i10, boolean z5) {
        int[] iArr = this.f32730g;
        int iE = m3.z.e(iArr, i + 1, false, false);
        int i11 = iArr[iE];
        j3.o0[] o0VarArr = this.f32731h;
        int iE2 = o0VarArr[iE].e(i - i11, i10 != 2 ? i10 : 0, z5);
        if (iE2 != -1) {
            return i11 + iE2;
        }
        int iQ = q(iE, z5);
        while (iQ != -1 && o0VarArr[iQ].p()) {
            iQ = q(iQ, z5);
        }
        if (iQ != -1) {
            return o0VarArr[iQ].a(z5) + iArr[iQ];
        }
        if (i10 == 2) {
            return a(z5);
        }
        return -1;
    }

    @Override // j3.o0
    public final j3.m0 f(int i, j3.m0 m0Var, boolean z5) {
        int[] iArr = this.f32729f;
        int iE = m3.z.e(iArr, i + 1, false, false);
        int i10 = this.f32730g[iE];
        this.f32731h[iE].f(i - iArr[iE], m0Var, z5);
        m0Var.f26276c += i10;
        if (z5) {
            Object obj = this.i[iE];
            Object obj2 = m0Var.f26275b;
            obj2.getClass();
            m0Var.f26275b = Pair.create(obj, obj2);
        }
        return m0Var;
    }

    @Override // j3.o0
    public final j3.m0 g(Object obj, j3.m0 m0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f32732j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f32730g[iIntValue];
        this.f32731h[iIntValue].g(obj3, m0Var);
        m0Var.f26276c += i;
        m0Var.f26275b = obj;
        return m0Var;
    }

    @Override // j3.o0
    public final int h() {
        return this.f32728e;
    }

    @Override // j3.o0
    public final int k(int i, int i10) {
        int[] iArr = this.f32730g;
        int iE = m3.z.e(iArr, i + 1, false, false);
        int i11 = iArr[iE];
        j3.o0[] o0VarArr = this.f32731h;
        int iK = o0VarArr[iE].k(i - i11, i10 == 2 ? 0 : i10);
        if (iK != -1) {
            return i11 + iK;
        }
        int iR = r(iE, false);
        while (iR != -1 && o0VarArr[iR].p()) {
            iR = r(iR, false);
        }
        if (iR != -1) {
            return o0VarArr[iR].c(false) + iArr[iR];
        }
        if (i10 == 2) {
            return c(false);
        }
        return -1;
    }

    @Override // j3.o0
    public final Object l(int i) {
        int[] iArr = this.f32729f;
        int iE = m3.z.e(iArr, i + 1, false, false);
        return Pair.create(this.i[iE], this.f32731h[iE].l(i - iArr[iE]));
    }

    @Override // j3.o0
    public final j3.n0 m(int i, j3.n0 n0Var, long j10) {
        int[] iArr = this.f32730g;
        int iE = m3.z.e(iArr, i + 1, false, false);
        int i10 = iArr[iE];
        int i11 = this.f32729f[iE];
        this.f32731h[iE].m(i - i10, n0Var, j10);
        Object objCreate = this.i[iE];
        if (!j3.n0.f26306q.equals(n0Var.f26308a)) {
            objCreate = Pair.create(objCreate, n0Var.f26308a);
        }
        n0Var.f26308a = objCreate;
        n0Var.f26320n += i11;
        n0Var.f26321o += i11;
        return n0Var;
    }

    @Override // j3.o0
    public final int o() {
        return this.f32727d;
    }

    public final int q(int i, boolean z5) {
        if (!z5) {
            if (i < this.f32725b - 1) {
                return i + 1;
            }
            return -1;
        }
        e1 e1Var = this.f32726c;
        int i10 = e1Var.f20883c[i] + 1;
        int[] iArr = e1Var.f20882b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i, boolean z5) {
        if (!z5) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        e1 e1Var = this.f32726c;
        int i10 = e1Var.f20883c[i] - 1;
        if (i10 >= 0) {
            return e1Var.f20882b[i10];
        }
        return -1;
    }

    public z0(j3.o0[] o0VarArr, Object[] objArr, e1 e1Var) {
        this.f32726c = e1Var;
        this.f32725b = e1Var.f20882b.length;
        int length = o0VarArr.length;
        this.f32731h = o0VarArr;
        this.f32729f = new int[length];
        this.f32730g = new int[length];
        this.i = objArr;
        this.f32732j = new HashMap();
        int length2 = o0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (i < length2) {
            j3.o0 o0Var = o0VarArr[i];
            this.f32731h[i10] = o0Var;
            this.f32730g[i10] = iO;
            this.f32729f[i10] = iH;
            iO += o0Var.o();
            iH += this.f32731h[i10].h();
            this.f32732j.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.f32727d = iO;
        this.f32728e = iH;
    }
}
