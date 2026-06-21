package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2 f8193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f8194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7 f8195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f8196e;

    static {
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        List list = Collections.EMPTY_LIST;
        b4 b4Var = b4.f3576a;
        new h0();
        r7 r7Var = r7.B;
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ n5(String str, h0 h0Var, q2 q2Var, c2 c2Var, r7 r7Var) {
        b4 b4Var = b4.f3576a;
        this.f8192a = str;
        this.f8193b = q2Var;
        this.f8194c = c2Var;
        this.f8195d = r7Var;
        this.f8196e = h0Var;
    }

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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        if (!this.f8192a.equals(n5Var.f8192a) || !this.f8196e.equals(n5Var.f8196e) || !Objects.equals(this.f8193b, n5Var.f8193b) || !this.f8194c.equals(n5Var.f8194c) || !Objects.equals(this.f8195d, n5Var.f8195d)) {
            return false;
        }
        b4 b4Var = b4.f3576a;
        return b4Var.equals(b4Var);
    }

    public final int hashCode() {
        int iHashCode = this.f8192a.hashCode() * 31;
        q2 q2Var = this.f8193b;
        return (this.f8195d.hashCode() + ((this.f8196e.hashCode() + ((this.f8194c.hashCode() + ((iHashCode + (q2Var != null ? q2Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
