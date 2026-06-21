package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g01 implements vl0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f38596q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p73 f38598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb3 f38599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f38600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final by1 f38601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f38602f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f01 f38603g = new f01();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38604h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f38606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f38607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f38608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f38609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38611p;

    public g01(jb3 jb3Var) {
        this.f38599c = jb3Var;
        if (jb3Var != null) {
            this.f38601e = new by1(178);
            this.f38600d = new lb2();
        } else {
            this.f38601e = null;
            this.f38600d = null;
        }
        this.f38607l = -9223372036854775807L;
        this.f38609n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f4  */
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
    public final void a(yads.lb2 r23) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.g01.a(yads.lb2):void");
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f38597a = o93Var.f41502e;
        o93Var.b();
        this.f38598b = qq0Var.a(o93Var.f41501d, 2);
        jb3 jb3Var = this.f38599c;
        if (jb3Var != null) {
            jb3Var.a(qq0Var, o93Var);
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        this.f38607l = j10;
    }

    @Override // yads.vl0
    public final void a() {
        fy1.a(this.f38602f);
        f01 f01Var = this.f38603g;
        f01Var.f38306a = false;
        f01Var.f38307b = 0;
        f01Var.f38308c = 0;
        by1 by1Var = this.f38601e;
        if (by1Var != null) {
            by1Var.f37169b = false;
            by1Var.f37170c = false;
        }
        this.f38604h = 0L;
        this.i = false;
        this.f38607l = -9223372036854775807L;
        this.f38609n = -9223372036854775807L;
    }
}
