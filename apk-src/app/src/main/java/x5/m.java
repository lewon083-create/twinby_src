package x5;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.yd1;
import m3.z;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb.e f35899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35901c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35905g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f35907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f35908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35909l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35911n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f35906h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9 f35902d = new h9(7, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9 f35903e = new h9(8, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9 f35904f = new h9(6, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35910m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m3.p f35912o = new m3.p();

    public m(bb.e eVar, boolean z5, boolean z10) {
        this.f35899a = eVar;
        this.f35900b = z5;
        this.f35901c = z10;
    }

    @Override // x5.f
    public final void a() {
        this.f35905g = 0L;
        this.f35911n = false;
        this.f35910m = -9223372036854775807L;
        n3.n.a(this.f35906h);
        this.f35902d.c();
        this.f35903e.c();
        this.f35904f.c();
        ((yd1) this.f35899a.f2021e).b(0);
        l lVar = this.f35908k;
        if (lVar != null) {
            lVar.f35890k = false;
            lVar.f35894o = false;
            k kVar = lVar.f35893n;
            kVar.f35867b = false;
            kVar.f35866a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.m.b(int, int, long, long):void");
    }

    @Override // x5.f
    public final void c(m3.p pVar) {
        int i;
        this.f35907j.getClass();
        String str = z.f28608a;
        int i10 = pVar.f28590b;
        int i11 = pVar.f28591c;
        byte[] bArr = pVar.f28589a;
        this.f35905g += (long) pVar.a();
        this.f35907j.d(pVar.a(), pVar);
        while (true) {
            int iB = n3.n.b(bArr, i10, i11, this.f35906h);
            if (iB == i11) {
                d(bArr, i10, i11);
                return;
            }
            int i12 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i13 = iB - i10;
            if (i13 > 0) {
                d(bArr, i10, iB);
            }
            int i14 = i11 - iB;
            long j10 = this.f35905g - ((long) i14);
            b(i14, i13 < 0 ? -i13 : 0, j10, this.f35910m);
            g(i12, j10, this.f35910m);
            i10 = iB + i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.m.d(byte[], int, int):void");
    }

    @Override // x5.f
    public final void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.i = (String) r9Var.f9764e;
        r9Var.b();
        a0 a0VarP = mVar.P(r9Var.f9763d, 2);
        this.f35907j = a0VarP;
        this.f35908k = new l(a0VarP, this.f35900b, this.f35901c);
        this.f35899a.m(mVar, r9Var);
    }

    @Override // x5.f
    public final void f(boolean z5) {
        this.f35907j.getClass();
        String str = z.f28608a;
        if (z5) {
            ((yd1) this.f35899a.f2021e).b(0);
            b(0, 0, this.f35905g, this.f35910m);
            g(9, this.f35905g, this.f35910m);
            b(0, 0, this.f35905g, this.f35910m);
        }
    }

    public final void g(int i, long j10, long j11) {
        if (!this.f35909l || this.f35908k.f35883c) {
            this.f35902d.d(i);
            this.f35903e.d(i);
        }
        this.f35904f.d(i);
        l lVar = this.f35908k;
        boolean z5 = this.f35911n;
        lVar.i = i;
        lVar.f35891l = j11;
        lVar.f35889j = j10;
        lVar.f35898s = z5;
        if (!lVar.f35882b || i != 1) {
            if (!lVar.f35883c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        k kVar = lVar.f35892m;
        lVar.f35892m = lVar.f35893n;
        lVar.f35893n = kVar;
        kVar.f35867b = false;
        kVar.f35866a = false;
        lVar.f35888h = 0;
        lVar.f35890k = true;
    }

    @Override // x5.f
    public final void i(int i, long j10) {
        this.f35910m = j10;
        this.f35911n = ((i & 2) != 0) | this.f35911n;
    }
}
