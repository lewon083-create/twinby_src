package l4;

import ad.a1;
import ad.j0;
import ad.z;
import ad.z0;
import j3.p0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27872h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f27878o;

    public l(int i, p0 p0Var, int i10, j jVar, int i11, String str, String str2) {
        int iD;
        super(i, p0Var, i10);
        int i12 = 0;
        this.f27871g = s3.a.l(i11, false);
        int i13 = this.f27882e.f26327e;
        jVar.getClass();
        j0 j0Var = jVar.f26381r;
        this.f27872h = (i13 & 1) != 0;
        this.i = (i13 & 2) != 0;
        j0 j0VarW = str2 != null ? j0.w(str2) : j0Var.isEmpty() ? j0.w("") : j0Var;
        int i14 = 0;
        while (true) {
            if (i14 >= j0VarW.size()) {
                iD = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iD = p.d(this.f27882e, (String) j0VarW.get(i14), false);
                if (iD > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f27873j = i14;
        this.f27874k = iD;
        int i15 = str2 != null ? 1088 : 0;
        int i16 = this.f27882e.f26328f;
        a1 a1Var = p.f27901k;
        int iBitCount = (i16 == 0 || i16 != i15) ? Integer.bitCount(i15 & i16) : Integer.MAX_VALUE;
        this.f27875l = iBitCount;
        j3.o oVar = this.f27882e;
        this.f27878o = (1088 & oVar.f26328f) != 0;
        int iB = p.b(oVar, jVar.f26382s);
        this.f27876m = iB;
        int iD2 = p.d(this.f27882e, str, p.f(str) == null);
        this.f27877n = iD2;
        boolean z5 = iD > 0 || (j0Var.isEmpty() && iBitCount > 0) || ((j0Var.isEmpty() && iB != Integer.MAX_VALUE) || this.f27872h || (this.i && iD2 > 0));
        if (s3.a.l(i11, jVar.B) && z5) {
            i12 = 1;
        }
        this.f27870f = i12;
    }

    @Override // l4.n
    public final int a() {
        return this.f27870f;
    }

    @Override // l4.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        z zVarC = z.f896a.c(this.f27871g, lVar.f27871g);
        Integer numValueOf = Integer.valueOf(this.f27873j);
        Integer numValueOf2 = Integer.valueOf(lVar.f27873j);
        z0 z0Var = z0.f899c;
        z0 z0Var2 = z0.f900d;
        z zVarB = zVarC.b(numValueOf, numValueOf2, z0Var2);
        int i = lVar.f27874k;
        int i10 = this.f27874k;
        z zVarA = zVarB.a(i10, i);
        int i11 = lVar.f27875l;
        int i12 = this.f27875l;
        z zVarC2 = zVarA.a(i12, i11).b(Integer.valueOf(this.f27876m), Integer.valueOf(lVar.f27876m), z0Var2).c(this.f27872h, lVar.f27872h);
        Boolean boolValueOf = Boolean.valueOf(this.i);
        Boolean boolValueOf2 = Boolean.valueOf(lVar.i);
        if (i10 != 0) {
            z0Var = z0Var2;
        }
        z zVarA2 = zVarC2.b(boolValueOf, boolValueOf2, z0Var).a(this.f27877n, lVar.f27877n);
        if (i12 == 0) {
            zVarA2 = zVarA2.d(this.f27878o, lVar.f27878o);
        }
        return zVarA2.e();
    }
}
