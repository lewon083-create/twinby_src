package l4;

import ad.a1;
import ad.z;
import ad.z0;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27839h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f27845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f27846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f27847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f27849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f27850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f27851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f27852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f27853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f27854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f27855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f27856z;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(int r8, j3.p0 r9, int r10, l4.j r11, int r12, boolean r13, l4.e r14, int r15) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.f.<init>(int, j3.p0, int, l4.j, int, boolean, l4.e, int):void");
    }

    @Override // l4.n
    public final int a() {
        return this.f27837f;
    }

    @Override // l4.n
    public final boolean b(n nVar) {
        int i;
        String str;
        f fVar = (f) nVar;
        j3.o oVar = fVar.f27882e;
        this.i.getClass();
        j3.o oVar2 = this.f27882e;
        int i10 = oVar2.F;
        if (i10 == -1 || i10 != oVar.F) {
            return false;
        }
        return (this.f27845o || ((str = oVar2.f26335n) != null && TextUtils.equals(str, oVar.f26335n))) && (i = oVar2.G) != -1 && i == oVar.G && this.f27854x == fVar.f27854x && this.f27855y == fVar.f27855y;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z5 = this.f27840j;
        boolean z10 = this.f27838g;
        a1 a1VarA = (z10 && z5) ? p.f27901k : p.f27901k.a();
        boolean z11 = fVar.f27840j;
        int i = fVar.f27852v;
        z zVarC = z.f896a.c(z5, z11);
        Integer numValueOf = Integer.valueOf(this.f27842l);
        Integer numValueOf2 = Integer.valueOf(fVar.f27842l);
        z0 z0Var = z0.f900d;
        z zVarB = zVarC.b(numValueOf, numValueOf2, z0Var).a(this.f27841k, fVar.f27841k).a(this.f27843m, fVar.f27843m).b(Integer.valueOf(this.f27844n), Integer.valueOf(fVar.f27844n), z0Var).c(this.f27849s, fVar.f27849s).c(this.f27846p, fVar.f27846p).b(Integer.valueOf(this.f27847q), Integer.valueOf(fVar.f27847q), z0Var).a(this.f27848r, fVar.f27848r).c(z10, fVar.f27838g).b(Integer.valueOf(this.f27853w), Integer.valueOf(fVar.f27853w), z0Var);
        this.i.getClass();
        z zVarB2 = zVarB.c(this.f27854x, fVar.f27854x).c(this.f27855y, fVar.f27855y).c(this.f27856z, fVar.f27856z).b(Integer.valueOf(this.f27850t), Integer.valueOf(fVar.f27850t), a1VarA).b(Integer.valueOf(this.f27851u), Integer.valueOf(fVar.f27851u), a1VarA);
        if (Objects.equals(this.f27839h, fVar.f27839h)) {
            zVarB2 = zVarB2.b(Integer.valueOf(this.f27852v), Integer.valueOf(i), a1VarA);
        }
        return zVarB2.e();
    }
}
