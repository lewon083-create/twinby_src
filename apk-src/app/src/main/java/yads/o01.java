package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o01 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx2 f41409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p73 f41411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n01 f41412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41413e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f41419l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f41414f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final by1 f41415g = new by1(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final by1 f41416h = new by1(33);
    public final by1 i = new by1(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final by1 f41417j = new by1(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final by1 f41418k = new by1(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41420m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb2 f41421n = new lb2();

    public o01(qx2 qx2Var) {
        this.f41409a = qx2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
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
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.lb2 r44) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.o01.a(yads.lb2):void");
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f41410b = o93Var.f41502e;
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 2);
        this.f41411c = p73VarA;
        this.f41412d = new n01(p73VarA);
        this.f41409a.a(qq0Var, o93Var);
    }

    public final void a(byte[] bArr, int i, int i10) {
        n01 n01Var = this.f41412d;
        if (n01Var.f41121f) {
            int i11 = n01Var.f41119d;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                n01Var.f41122g = (bArr[i12] & 128) != 0;
                n01Var.f41121f = false;
            } else {
                n01Var.f41119d = (i10 - i) + i11;
            }
        }
        if (!this.f41413e) {
            this.f41415g.a(bArr, i, i10);
            this.f41416h.a(bArr, i, i10);
            this.i.a(bArr, i, i10);
        }
        this.f41417j.a(bArr, i, i10);
        this.f41418k.a(bArr, i, i10);
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f41420m = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f41419l = 0L;
        this.f41420m = -9223372036854775807L;
        fy1.a(this.f41414f);
        by1 by1Var = this.f41415g;
        by1Var.f37169b = false;
        by1Var.f37170c = false;
        by1 by1Var2 = this.f41416h;
        by1Var2.f37169b = false;
        by1Var2.f37170c = false;
        by1 by1Var3 = this.i;
        by1Var3.f37169b = false;
        by1Var3.f37170c = false;
        by1 by1Var4 = this.f41417j;
        by1Var4.f37169b = false;
        by1Var4.f37170c = false;
        by1 by1Var5 = this.f41418k;
        by1Var5.f37169b = false;
        by1Var5.f37170c = false;
        n01 n01Var = this.f41412d;
        if (n01Var != null) {
            n01Var.f41121f = false;
            n01Var.f41122g = false;
            n01Var.f41123h = false;
            n01Var.i = false;
            n01Var.f41124j = false;
        }
    }
}
