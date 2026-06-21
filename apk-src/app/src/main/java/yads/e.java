package yads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends v63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy2 f37935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37936e = false;

    public e(vy2 vy2Var) {
        this.f37935d = vy2Var;
        this.f37934c = vy2Var.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // yads.v63
    public final int a(boolean z5) {
        if (this.f37934c == 0) {
            return -1;
        }
        int iA = 0;
        if (this.f37936e) {
            z5 = false;
        }
        if (z5) {
            int[] iArr = this.f37935d.f44225b;
            iA = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            zf2 zf2Var = (zf2) this;
            if (!zf2Var.f45397j[iA].c()) {
                return zf2Var.f45397j[iA].a(z5) + zf2Var.i[iA];
            }
            iA = a(z5, iA);
        } while (iA != -1);
        return -1;
    }

    @Override // yads.v63
    public final int b(boolean z5) {
        int iB;
        int i = this.f37934c;
        if (i == 0) {
            return -1;
        }
        if (this.f37936e) {
            z5 = false;
        }
        if (z5) {
            int[] iArr = this.f37935d.f44225b;
            iB = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iB = i - 1;
        }
        do {
            zf2 zf2Var = (zf2) this;
            if (!zf2Var.f45397j[iB].c()) {
                return zf2Var.f45397j[iB].b(z5) + zf2Var.i[iB];
            }
            iB = b(z5, iB);
        } while (iB != -1);
        return -1;
    }

    @Override // yads.v63
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        zf2 zf2Var = (zf2) this;
        Integer num = (Integer) zf2Var.f45399l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iA = zf2Var.f45397j[iIntValue].a(obj3)) == -1) {
            return -1;
        }
        return zf2Var.f45396h[iIntValue] + iA;
    }

    public final int b(boolean z5, int i) {
        if (z5) {
            vy2 vy2Var = this.f37935d;
            int i10 = vy2Var.f44226c[i] - 1;
            if (i10 >= 0) {
                return vy2Var.f44225b[i10];
            }
        } else if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // yads.v63
    public final int b(int i, int i10, boolean z5) {
        if (this.f37936e) {
            if (i10 == 1) {
                i10 = 2;
            }
            z5 = false;
        }
        zf2 zf2Var = (zf2) this;
        int iA = lb3.a(zf2Var.i, i + 1, false, false);
        int i11 = zf2Var.i[iA];
        int iB = zf2Var.f45397j[iA].b(i - i11, i10 != 2 ? i10 : 0, z5);
        if (iB != -1) {
            return i11 + iB;
        }
        int iB2 = b(z5, iA);
        while (iB2 != -1 && zf2Var.f45397j[iB2].c()) {
            iB2 = b(z5, iB2);
        }
        if (iB2 != -1) {
            return zf2Var.f45397j[iB2].b(z5) + zf2Var.i[iB2];
        }
        if (i10 == 2) {
            return b(z5);
        }
        return -1;
    }

    public final int a(boolean z5, int i) {
        if (z5) {
            vy2 vy2Var = this.f37935d;
            int i10 = vy2Var.f44226c[i] + 1;
            int[] iArr = vy2Var.f44225b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }
        if (i < this.f37934c - 1) {
            return i + 1;
        }
        return -1;
    }

    @Override // yads.v63
    public final int a(int i, int i10, boolean z5) {
        if (this.f37936e) {
            if (i10 == 1) {
                i10 = 2;
            }
            z5 = false;
        }
        zf2 zf2Var = (zf2) this;
        int iA = lb3.a(zf2Var.i, i + 1, false, false);
        int i11 = zf2Var.i[iA];
        int iA2 = zf2Var.f45397j[iA].a(i - i11, i10 != 2 ? i10 : 0, z5);
        if (iA2 != -1) {
            return i11 + iA2;
        }
        int iA3 = a(z5, iA);
        while (iA3 != -1 && zf2Var.f45397j[iA3].c()) {
            iA3 = a(z5, iA3);
        }
        if (iA3 != -1) {
            return zf2Var.f45397j[iA3].a(z5) + zf2Var.i[iA3];
        }
        if (i10 == 2) {
            return a(z5);
        }
        return -1;
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        zf2 zf2Var = (zf2) this;
        int iA = lb3.a(zf2Var.f45396h, i + 1, false, false);
        int i10 = zf2Var.i[iA];
        zf2Var.f45397j[iA].a(i - zf2Var.f45396h[iA], s63Var, z5);
        s63Var.f42825d += i10;
        if (z5) {
            Object obj = zf2Var.f45398k[iA];
            Object obj2 = s63Var.f42824c;
            obj2.getClass();
            s63Var.f42824c = Pair.create(obj, obj2);
        }
        return s63Var;
    }

    @Override // yads.v63
    public final s63 a(Object obj, s63 s63Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        zf2 zf2Var = (zf2) this;
        Integer num = (Integer) zf2Var.f45399l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = zf2Var.i[iIntValue];
        zf2Var.f45397j[iIntValue].a(obj3, s63Var);
        s63Var.f42825d += i;
        s63Var.f42824c = obj;
        return s63Var;
    }

    @Override // yads.v63
    public final Object a(int i) {
        zf2 zf2Var = (zf2) this;
        int iA = lb3.a(zf2Var.f45396h, i + 1, false, false);
        return Pair.create(zf2Var.f45398k[iA], zf2Var.f45397j[iA].a(i - zf2Var.f45396h[iA]));
    }

    @Override // yads.v63
    public final u63 a(int i, u63 u63Var, long j10) {
        zf2 zf2Var = (zf2) this;
        int iA = lb3.a(zf2Var.i, i + 1, false, false);
        int i10 = zf2Var.i[iA];
        int i11 = zf2Var.f45396h[iA];
        zf2Var.f45397j[iA].a(i - i10, u63Var, j10);
        Object objCreate = zf2Var.f45398k[iA];
        if (!u63.f43575s.equals(u63Var.f43579b)) {
            objCreate = Pair.create(objCreate, u63Var.f43579b);
        }
        u63Var.f43579b = objCreate;
        u63Var.f43592p += i11;
        u63Var.f43593q += i11;
        return u63Var;
    }
}
