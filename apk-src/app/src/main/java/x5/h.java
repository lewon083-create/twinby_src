package x5;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.r9;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f35832r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f35834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u7.f f35835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.p f35837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9 f35838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f35839g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f35840h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f35843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f35845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f35846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35848q;

    public h(u7.f fVar, String str) {
        this.f35835c = fVar;
        this.f35836d = str;
        g gVar = new g();
        gVar.f35831d = new byte[128];
        this.f35840h = gVar;
        if (fVar != null) {
            this.f35838f = new h9(178, 1);
            this.f35837e = new m3.p();
        } else {
            this.f35838f = null;
            this.f35837e = null;
        }
        this.f35844m = -9223372036854775807L;
        this.f35846o = -9223372036854775807L;
    }

    @Override // x5.f
    public final void a() {
        n3.n.a(this.f35839g);
        g gVar = this.f35840h;
        gVar.f35828a = false;
        gVar.f35829b = 0;
        gVar.f35830c = 0;
        h9 h9Var = this.f35838f;
        if (h9Var != null) {
            h9Var.c();
        }
        this.i = 0L;
        this.f35841j = false;
        this.f35844m = -9223372036854775807L;
        this.f35846o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
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
    public final void c(m3.p r23) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.c(m3.p):void");
    }

    @Override // x5.f
    public final void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f35833a = (String) r9Var.f9764e;
        r9Var.b();
        this.f35834b = mVar.P(r9Var.f9763d, 2);
        u7.f fVar = this.f35835c;
        if (fVar != null) {
            fVar.e(mVar, r9Var);
        }
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
    @Override // x5.f
    public final void f(boolean z5) {
        this.f35834b.getClass();
        if (z5) {
            boolean z10 = this.f35847p;
            this.f35834b.f(this.f35846o, z10 ? 1 : 0, (int) (this.i - this.f35845n), 0, null);
        }
    }

    @Override // x5.f
    public final void i(int i, long j10) {
        this.f35844m = j10;
    }
}
