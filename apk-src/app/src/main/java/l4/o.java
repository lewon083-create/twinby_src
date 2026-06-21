package l4;

import ad.z;
import ad.z0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f27884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27885h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f27891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f27892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f27893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f27894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f27895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f27896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f27897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f27898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f27899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f27900x;

    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(int r7, j3.p0 r8, int r9, l4.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.o.<init>(int, j3.p0, int, l4.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        z zVarC = z.f896a.c(oVar.i, oVar2.i);
        Integer numValueOf = Integer.valueOf(oVar.f27890n);
        Integer numValueOf2 = Integer.valueOf(oVar2.f27890n);
        z0 z0Var = z0.f900d;
        z zVarB = zVarC.b(numValueOf, numValueOf2, z0Var).a(oVar.f27891o, oVar2.f27891o).a(oVar.f27892p, oVar2.f27892p).b(Integer.valueOf(oVar.f27893q), Integer.valueOf(oVar2.f27893q), z0Var).c(oVar.f27894r, oVar2.f27894r).a(oVar.f27895s, oVar2.f27895s).c(oVar.f27886j, oVar2.f27886j).c(oVar.f27883f, oVar2.f27883f).c(oVar.f27885h, oVar2.f27885h).b(Integer.valueOf(oVar.f27889m), Integer.valueOf(oVar2.f27889m), z0Var);
        boolean z5 = oVar.f27898v;
        z zVarC2 = zVarB.c(z5, oVar2.f27898v);
        boolean z10 = oVar.f27899w;
        z zVarC3 = zVarC2.c(z10, oVar2.f27899w);
        if (z5 && z10) {
            zVarC3 = zVarC3.a(oVar.f27900x, oVar2.f27900x);
        }
        return zVarC3.e();
    }

    @Override // l4.n
    public final int a() {
        return this.f27897u;
    }

    @Override // l4.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.f27896t && !Objects.equals(this.f27882e.f26335n, oVar.f27882e.f26335n)) {
            return false;
        }
        this.f27884g.getClass();
        return this.f27898v == oVar.f27898v && this.f27899w == oVar.f27899w;
    }
}
