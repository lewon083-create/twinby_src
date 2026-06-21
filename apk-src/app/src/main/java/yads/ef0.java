package yads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ef0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38115h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f38116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f38117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f38118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f38119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f38120n;

    public ef0(int i, k73 k73Var, int i10, af0 af0Var, int i11, String str) {
        int iA;
        super(i, i10, k73Var);
        int i12 = 0;
        this.f38114g = if0.a(false, i11);
        int i13 = this.f38753e.f41368e & (~af0Var.f43225v);
        this.f38115h = (i13 & 1) != 0;
        this.i = (i13 & 2) != 0;
        r51 r51VarA = af0Var.f43223t.isEmpty() ? r51.a("") : af0Var.f43223t;
        int i14 = 0;
        while (true) {
            if (i14 >= r51VarA.size()) {
                i14 = Integer.MAX_VALUE;
                iA = 0;
                break;
            } else {
                iA = if0.a(this.f38753e, (String) r51VarA.get(i14), af0Var.f43226w);
                if (iA > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f38116j = i14;
        this.f38117k = iA;
        int iA2 = if0.a(this.f38753e.f41369f, af0Var.f43224u);
        this.f38118l = iA2;
        this.f38120n = (this.f38753e.f41369f & 1088) != 0;
        int iA3 = if0.a(this.f38753e, str, if0.b(str) == null);
        this.f38119m = iA3;
        boolean z5 = iA > 0 || (af0Var.f43223t.isEmpty() && iA2 > 0) || this.f38115h || (this.i && iA3 > 0);
        if (if0.a(af0Var.M, i11) && z5) {
            i12 = 1;
        }
        this.f38113f = i12;
    }

    public static int a(List list, List list2) {
        return ((ef0) list.get(0)).compareTo((ef0) list2.get(0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ef0 ef0Var) {
        hy hyVarA = fy.a(lq.a(this.f38114g, ef0Var.f38114g));
        Integer numValueOf = Integer.valueOf(this.f38116j);
        Integer numValueOf2 = Integer.valueOf(ef0Var.f38116j);
        Comparator comparator = b82.f36960b;
        comparator.getClass();
        lq2 lq2Var = lq2.f40637b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, lq2Var).a(this.f38117k, ef0Var.f38117k).a(this.f38118l, ef0Var.f38118l).a(this.f38115h, ef0Var.f38115h);
        Boolean boolValueOf = Boolean.valueOf(this.i);
        Boolean boolValueOf2 = Boolean.valueOf(ef0Var.i);
        if (this.f38117k != 0) {
            comparator = lq2Var;
        }
        hy hyVarA3 = hyVarA2.a(boolValueOf, boolValueOf2, comparator).a(this.f38119m, ef0Var.f38119m);
        if (this.f38118l == 0) {
            hyVarA3 = hyVarA3.b(this.f38120n, ef0Var.f38120n);
        }
        return hyVarA3.a();
    }

    @Override // yads.gf0
    public final int a() {
        return this.f38113f;
    }

    @Override // yads.gf0
    public final /* bridge */ /* synthetic */ boolean a(gf0 gf0Var) {
        return false;
    }
}
