package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xe0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44666h;
    public final af0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f44667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f44668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f44669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f44670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f44671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f44672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f44673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f44674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f44675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f44676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f44677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f44678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f44679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f44680w;

    public xe0(int i, k73 k73Var, int i10, af0 af0Var, int i11, boolean z5, qg2 qg2Var) {
        int i12;
        int iA;
        int iA2;
        super(i, i10, k73Var);
        this.i = af0Var;
        this.f44666h = if0.b(this.f38753e.f41367d);
        this.f44667j = if0.a(false, i11);
        int i13 = 0;
        while (true) {
            i12 = Integer.MAX_VALUE;
            if (i13 >= af0Var.f43218o.size()) {
                iA = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iA = if0.a(this.f38753e, (String) af0Var.f43218o.get(i13), false);
                if (iA > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f44669l = i13;
        this.f44668k = iA;
        this.f44670m = if0.a(this.f38753e.f41369f, af0Var.f43219p);
        nx0 nx0Var = this.f38753e;
        int i14 = nx0Var.f41369f;
        this.f44671n = i14 == 0 || (i14 & 1) != 0;
        this.f44674q = (nx0Var.f41368e & 1) != 0;
        int i15 = nx0Var.f41388z;
        this.f44675r = i15;
        this.f44676s = nx0Var.A;
        int i16 = nx0Var.i;
        this.f44677t = i16;
        this.f44665g = (i16 == -1 || i16 <= af0Var.f43221r) && (i15 == -1 || i15 <= af0Var.f43220q) && qg2Var.apply(nx0Var);
        String[] strArrD = lb3.d();
        int i17 = 0;
        while (true) {
            if (i17 >= strArrD.length) {
                iA2 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iA2 = if0.a(this.f38753e, strArrD[i17], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f44672o = i17;
        this.f44673p = iA2;
        int i18 = 0;
        while (true) {
            if (i18 < af0Var.f43222s.size()) {
                String str = this.f38753e.f41375m;
                if (str != null && str.equals(af0Var.f43222s.get(i18))) {
                    i12 = i18;
                    break;
                }
                i18++;
            } else {
                break;
            }
        }
        this.f44678u = i12;
        this.f44679v = ro.a(i11) == 128;
        this.f44680w = ro.b(i11) == 64;
        this.f44664f = a(z5, i11);
    }

    public static int a(List list, List list2) {
        return ((xe0) Collections.max(list)).compareTo((xe0) Collections.max(list2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xe0 xe0Var) {
        ua2 ua2VarA = (this.f44665g && this.f44667j) ? if0.i : if0.i.a();
        hy hyVarA = fy.a(lq.a(this.f44667j, xe0Var.f44667j));
        Integer numValueOf = Integer.valueOf(this.f44669l);
        Integer numValueOf2 = Integer.valueOf(xe0Var.f44669l);
        b82.f36960b.getClass();
        lq2 lq2Var = lq2.f40637b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, lq2Var).a(this.f44668k, xe0Var.f44668k).a(this.f44670m, xe0Var.f44670m).a(this.f44674q, xe0Var.f44674q).a(this.f44671n, xe0Var.f44671n).a(Integer.valueOf(this.f44672o), Integer.valueOf(xe0Var.f44672o), lq2Var).a(this.f44673p, xe0Var.f44673p).a(this.f44665g, xe0Var.f44665g).a(Integer.valueOf(this.f44678u), Integer.valueOf(xe0Var.f44678u), lq2Var).a(Integer.valueOf(this.f44677t), Integer.valueOf(xe0Var.f44677t), this.i.f43227x ? if0.i.a() : if0.f39525j).a(this.f44679v, xe0Var.f44679v).a(this.f44680w, xe0Var.f44680w).a(Integer.valueOf(this.f44675r), Integer.valueOf(xe0Var.f44675r), ua2VarA).a(Integer.valueOf(this.f44676s), Integer.valueOf(xe0Var.f44676s), ua2VarA);
        Integer numValueOf3 = Integer.valueOf(this.f44677t);
        Integer numValueOf4 = Integer.valueOf(xe0Var.f44677t);
        if (!lb3.a(this.f44666h, xe0Var.f44666h)) {
            ua2VarA = if0.f39525j;
        }
        return hyVarA2.a(numValueOf3, numValueOf4, ua2VarA).a();
    }

    public final int a(boolean z5, int i) {
        if (!if0.a(this.i.M, i)) {
            return 0;
        }
        if (!this.f44665g && !this.i.G) {
            return 0;
        }
        if (!if0.a(false, i) || !this.f44665g || this.f38753e.i == -1) {
            return 1;
        }
        af0 af0Var = this.i;
        if (af0Var.f43228y || af0Var.f43227x) {
            return 1;
        }
        return (af0Var.O || !z5) ? 2 : 1;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f44664f;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        int i;
        String str;
        int i10;
        xe0 xe0Var = (xe0) gf0Var;
        af0 af0Var = this.i;
        if (!af0Var.J && ((i10 = this.f38753e.f41388z) == -1 || i10 != xe0Var.f38753e.f41388z)) {
            return false;
        }
        if (!af0Var.H && ((str = this.f38753e.f41375m) == null || !TextUtils.equals(str, xe0Var.f38753e.f41375m))) {
            return false;
        }
        af0 af0Var2 = this.i;
        if (!af0Var2.I && ((i = this.f38753e.A) == -1 || i != xe0Var.f38753e.A)) {
            return false;
        }
        if (af0Var2.K) {
            return true;
        }
        return this.f44679v == xe0Var.f44679v && this.f44680w == xe0Var.f44680w;
    }
}
