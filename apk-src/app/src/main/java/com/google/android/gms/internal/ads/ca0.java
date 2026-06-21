package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa0 f4121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug f4122d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ca0(fa0 fa0Var, eb0 eb0Var, int i) {
        this.f4120b = i;
        switch (i) {
            case 1:
                this.f4121c = fa0Var;
                this.f4122d = (ug) eb0Var;
                break;
            default:
                this.f4121c = fa0Var;
                this.f4122d = (ug) eb0Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f4120b) {
            case 0:
                this.f4121c.g(this.f4122d);
                break;
            default:
                this.f4121c.h(this.f4122d);
                break;
        }
    }
}
