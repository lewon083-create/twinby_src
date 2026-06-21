package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f13257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f13258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f13259c;

    static {
        Class<?> cls;
        Class<?> cls2;
        o1 o1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13257a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                o1Var = (o1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f13258b = o1Var;
        f13259c = new o1();
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
    public static void a(o1 o1Var, Object obj, Object obj2) {
        o1Var.getClass();
        l0 l0Var = (l0) obj;
        n1 n1Var = l0Var.zzc;
        n1 n1Var2 = ((l0) obj2).zzc;
        n1 n1Var3 = n1.f13263e;
        if (!n1Var3.equals(n1Var2)) {
            if (n1Var3.equals(n1Var)) {
                int i = n1Var.f13264a + n1Var2.f13264a;
                int[] iArrCopyOf = Arrays.copyOf(n1Var.f13265b, i);
                System.arraycopy(n1Var2.f13265b, 0, iArrCopyOf, n1Var.f13264a, n1Var2.f13264a);
                Object[] objArrCopyOf = Arrays.copyOf(n1Var.f13266c, i);
                System.arraycopy(n1Var2.f13266c, 0, objArrCopyOf, n1Var.f13264a, n1Var2.f13264a);
                n1Var = new n1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                n1Var.getClass();
                if (!n1Var2.equals(n1Var3)) {
                    if (!n1Var.f13267d) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = n1Var.f13264a + n1Var2.f13264a;
                    n1Var.c(i10);
                    System.arraycopy(n1Var2.f13265b, 0, n1Var.f13265b, n1Var.f13264a, n1Var2.f13264a);
                    System.arraycopy(n1Var2.f13266c, 0, n1Var.f13266c, n1Var.f13264a, n1Var2.f13264a);
                    n1Var.f13264a = i10;
                }
            }
        }
        l0Var.zzc = n1Var;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
