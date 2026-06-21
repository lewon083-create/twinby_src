package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v8 implements t8 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f11288r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w2 f11290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9 f11291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tk0 f11293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9 f11294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f11295g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u8 f11296h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11304q;

    public v8(o9 o9Var, String str) {
        tk0 tk0Var;
        this.f11291c = o9Var;
        this.f11292d = str;
        u8 u8Var = new u8();
        u8Var.f10872d = new byte[128];
        this.f11296h = u8Var;
        if (o9Var != null) {
            this.f11294f = new h9(178, 0);
            tk0Var = new tk0();
        } else {
            tk0Var = null;
            this.f11294f = null;
        }
        this.f11293e = tk0Var;
        this.f11300m = -9223372036854775807L;
        this.f11302o = -9223372036854775807L;
    }

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
    @Override // com.google.android.gms.internal.ads.t8
    public final void b(boolean z5) {
        w2 w2Var = this.f11290b;
        w2Var.getClass();
        if (z5) {
            boolean z10 = this.f11303p;
            long j10 = this.i - this.f11301n;
            w2Var.c(this.f11302o, z10 ? 1 : 0, (int) j10, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void d(int i, long j10) {
        this.f11300m = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
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
    @Override // com.google.android.gms.internal.ads.t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.tk0 r23) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v8.g(com.google.android.gms.internal.ads.tk0):void");
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void h() {
        rs.O(this.f11295g);
        u8 u8Var = this.f11296h;
        u8Var.f10869a = false;
        u8Var.f10870b = 0;
        u8Var.f10871c = 0;
        h9 h9Var = this.f11294f;
        if (h9Var != null) {
            h9Var.e();
        }
        this.i = 0L;
        this.f11297j = false;
        this.f11300m = -9223372036854775807L;
        this.f11302o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void j(b2 b2Var, r9 r9Var) {
        r9Var.f();
        r9Var.g();
        this.f11289a = (String) r9Var.f9764e;
        r9Var.g();
        this.f11290b = b2Var.O(r9Var.f9763d, 2);
        o9 o9Var = this.f11291c;
        if (o9Var != null) {
            o9Var.a(b2Var, r9Var);
        }
    }
}
