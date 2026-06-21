package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m01 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx2 f40723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40725c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40729g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p73 f40731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l01 f40732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40733l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40735n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f40730h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final by1 f40726d = new by1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final by1 f40727e = new by1(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final by1 f40728f = new by1(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40734m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lb2 f40736o = new lb2();

    public m01(qx2 qx2Var, boolean z5, boolean z10) {
        this.f40723a = qx2Var;
        this.f40724b = z5;
        this.f40725c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
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
    public final void a(yads.lb2 r27) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.m01.a(yads.lb2):void");
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.i = o93Var.f41502e;
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 2);
        this.f40731j = p73VarA;
        this.f40732k = new l01(p73VarA, this.f40724b, this.f40725c);
        this.f40723a.a(qq0Var, o93Var);
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f40734m = j10;
        }
        this.f40735n = ((i & 2) != 0) | this.f40735n;
    }

    @Override // yads.vl0
    public final void a() {
        this.f40729g = 0L;
        this.f40735n = false;
        this.f40734m = -9223372036854775807L;
        fy1.a(this.f40730h);
        by1 by1Var = this.f40726d;
        by1Var.f37169b = false;
        by1Var.f37170c = false;
        by1 by1Var2 = this.f40727e;
        by1Var2.f37169b = false;
        by1Var2.f37170c = false;
        by1 by1Var3 = this.f40728f;
        by1Var3.f37169b = false;
        by1Var3.f37170c = false;
        l01 l01Var = this.f40732k;
        if (l01Var != null) {
            l01Var.a();
        }
    }
}
