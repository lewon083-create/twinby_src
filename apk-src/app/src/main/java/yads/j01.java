package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j01 implements vl0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f39683l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb3 f39684a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i01 f39689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39691h;
    public p73 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39692j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f39686c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h01 f39687d = new h01();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39693k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final by1 f39688e = new by1(178);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f39685b = new lb2();

    public j01(jb3 jb3Var) {
        this.f39684a = jb3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
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
    public final void a(yads.lb2 r26) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.j01.a(yads.lb2):void");
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f39691h = o93Var.f41502e;
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 2);
        this.i = p73VarA;
        this.f39689f = new i01(p73VarA);
        jb3 jb3Var = this.f39684a;
        if (jb3Var != null) {
            jb3Var.a(qq0Var, o93Var);
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f39693k = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        fy1.a(this.f39686c);
        h01 h01Var = this.f39687d;
        h01Var.f38964a = false;
        h01Var.f38966c = 0;
        h01Var.f38965b = 0;
        i01 i01Var = this.f39689f;
        if (i01Var != null) {
            i01Var.f39385b = false;
            i01Var.f39386c = false;
            i01Var.f39387d = false;
            i01Var.f39388e = -1;
        }
        by1 by1Var = this.f39688e;
        if (by1Var != null) {
            by1Var.f37169b = false;
            by1Var.f37170c = false;
        }
        this.f39690g = 0L;
        this.f39693k = -9223372036854775807L;
    }
}
