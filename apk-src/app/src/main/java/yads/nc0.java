package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nc0 implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ig1 f41212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo f41213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f41214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p30 f41216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ve2 f41218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lc0[] f41219h;
    public pp0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c30 f41220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zo f41222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41223m;

    public nc0(du duVar, ig1 ig1Var, c30 c30Var, vo voVar, int i, int[] iArr, pp0 pp0Var, int i10, p30 p30Var, long j10, boolean z5, ArrayList arrayList, ve2 ve2Var, af2 af2Var) {
        this.f41212a = ig1Var;
        this.f41220j = c30Var;
        this.f41213b = voVar;
        this.f41214c = iArr;
        this.i = pp0Var;
        int i11 = i10;
        this.f41215d = i11;
        this.f41216e = p30Var;
        this.f41221k = i;
        this.f41217f = j10;
        ve2 ve2Var2 = ve2Var;
        this.f41218g = ve2Var2;
        long jC = c30Var.c(i);
        ArrayList arrayListA = a();
        this.f41219h = new lc0[pp0Var.f()];
        int i12 = 0;
        while (i12 < this.f41219h.length) {
            no2 no2Var = (no2) arrayListA.get(pp0Var.b(i12));
            uo uoVarB = voVar.b(no2Var.f41310b);
            lc0[] lc0VarArr = this.f41219h;
            uo uoVar = uoVarB == null ? (uo) no2Var.f41310b.get(0) : uoVarB;
            nx0 nx0Var = no2Var.f41309a;
            ((zf.a) duVar).getClass();
            long j11 = jC;
            lc0VarArr[i12] = new lc0(j11, no2Var, uoVar, ar.a(i11, nx0Var, z5, arrayList, ve2Var2, af2Var), 0L, no2Var.d());
            i12++;
            i11 = i10;
            ve2Var2 = ve2Var;
            jC = j11;
        }
    }

    public final ArrayList a() {
        List list = ((hc2) this.f41220j.f37264m.get(this.f41221k)).f39127c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f41214c) {
            arrayList.addAll(((zb) list.get(i)).f45307c);
        }
        return arrayList;
    }
}
