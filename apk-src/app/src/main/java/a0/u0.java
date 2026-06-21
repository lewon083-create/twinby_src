package a0;

import android.util.Size;
import g0.x2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0.f1 f225a;

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
    static {
        Object size = new Size(640, 480);
        Object bVar = new t0.b(t0.a.f33331c, new t0.c(p0.b.f30756c, 1), null);
        t0 t0Var = new t0(0);
        g0.g gVar = g0.i1.f19609n;
        g0.q1 q1Var = t0Var.f224b;
        q1Var.y(gVar, size);
        q1Var.y(x2.f19801w, 1);
        q1Var.y(g0.i1.i, 0);
        q1Var.y(g0.i1.f19612q, bVar);
        i0 i0Var = i0.f112d;
        if (!i0Var.equals(i0Var)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        q1Var.y(g0.h1.f19581h, i0Var);
        f225a = new g0.f1(g0.u1.u(q1Var));
    }
}
