package x5;

import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import j3.c0;
import java.util.Arrays;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f35804x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35805a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f35812h;
    public a0 i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35817n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35821r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35823t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a0 f35825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f35826w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f35806b = new y2(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f35807c = new m3.p(Arrays.copyOf(f35804x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35818o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35819p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35822s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f35824u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35813j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35814k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35815l = 256;

    public e(int i, String str, String str2, boolean z5) {
        this.f35805a = z5;
        this.f35808d = str;
        this.f35809e = i;
        this.f35810f = str2;
    }

    @Override // x5.f
    public final void a() {
        this.f35824u = -9223372036854775807L;
        this.f35817n = false;
        this.f35813j = 0;
        this.f35814k = 0;
        this.f35815l = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01f4  */
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
    @Override // x5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(m3.p r24) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.e.c(m3.p):void");
    }

    @Override // x5.f
    public final void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f35811g = (String) r9Var.f9764e;
        r9Var.b();
        a0 a0VarP = mVar.P(r9Var.f9763d, 1);
        this.f35812h = a0VarP;
        this.f35825v = a0VarP;
        if (!this.f35805a) {
            this.i = new q4.j();
            return;
        }
        r9Var.a();
        r9Var.b();
        a0 a0VarP2 = mVar.P(r9Var.f9763d, 5);
        this.i = a0VarP2;
        j3.n nVar = new j3.n();
        r9Var.b();
        nVar.f26281a = (String) r9Var.f9764e;
        nVar.f26291l = c0.n(this.f35810f);
        nVar.f26292m = c0.n("application/id3");
        pe.a.q(nVar, a0VarP2);
    }

    @Override // x5.f
    public final void i(int i, long j10) {
        this.f35824u = j10;
    }

    @Override // x5.f
    public final void f(boolean z5) {
    }
}
