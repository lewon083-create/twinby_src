package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i5 f13895a;

    static {
        j6 j6Var = j6.f13841c;
        f13895a = new i5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        k5 k5Var = (k5) obj;
        q6 q6Var = k5Var.zzc;
        q6 q6Var2 = ((k5) obj2).zzc;
        q6 q6Var3 = q6.f13926f;
        if (!q6Var3.equals(q6Var2)) {
            if (q6Var3.equals(q6Var)) {
                int i = q6Var.f13927a + q6Var2.f13927a;
                int[] iArrCopyOf = Arrays.copyOf(q6Var.f13928b, i);
                System.arraycopy(q6Var2.f13928b, 0, iArrCopyOf, q6Var.f13927a, q6Var2.f13927a);
                Object[] objArrCopyOf = Arrays.copyOf(q6Var.f13929c, i);
                System.arraycopy(q6Var2.f13929c, 0, objArrCopyOf, q6Var.f13927a, q6Var2.f13927a);
                q6Var = new q6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                q6Var.getClass();
                if (!q6Var2.equals(q6Var3)) {
                    if (!q6Var.f13931e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = q6Var.f13927a + q6Var2.f13927a;
                    q6Var.e(i10);
                    System.arraycopy(q6Var2.f13928b, 0, q6Var.f13928b, q6Var.f13927a, q6Var2.f13927a);
                    System.arraycopy(q6Var2.f13929c, 0, q6Var.f13929c, q6Var.f13927a, q6Var2.f13927a);
                    q6Var.f13927a = i10;
                }
            }
        }
        k5Var.zzc = q6Var;
    }

    public static void c(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        if (list instanceof b5) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                a5Var.B(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        a5Var.G(i11);
        while (i10 < list.size()) {
            a5Var.J(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void d(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        if (list instanceof g5) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                a5Var.z(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        a5Var.G(i11);
        while (i10 < list.size()) {
            a5Var.H(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void e(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof y5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.A(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iU = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iU += a5.u(((Long) list.get(i11)).longValue());
            }
            a5Var.G(iU);
            while (i10 < list.size()) {
                a5Var.I(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z5) {
            while (i10 < y5Var.f14099d) {
                a5Var.A(i, y5Var.c(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iU2 = 0;
        for (int i12 = 0; i12 < y5Var.f14099d; i12++) {
            iU2 += a5.u(y5Var.c(i12));
        }
        a5Var.G(iU2);
        while (i10 < y5Var.f14099d) {
            a5Var.I(y5Var.c(i10));
            i10++;
        }
    }

    public static void f(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof y5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.A(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iU = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iU += a5.u(((Long) list.get(i11)).longValue());
            }
            a5Var.G(iU);
            while (i10 < list.size()) {
                a5Var.I(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z5) {
            while (i10 < y5Var.f14099d) {
                a5Var.A(i, y5Var.c(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iU2 = 0;
        for (int i12 = 0; i12 < y5Var.f14099d; i12++) {
            iU2 += a5.u(y5Var.c(i12));
        }
        a5Var.G(iU2);
        while (i10 < y5Var.f14099d) {
            a5Var.I(y5Var.c(i10));
            i10++;
        }
    }

    public static void g(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof y5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    a5Var.A(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iU = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iU += a5.u((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            a5Var.G(iU);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                a5Var.I((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z5) {
            while (i10 < y5Var.f14099d) {
                long jC = y5Var.c(i10);
                a5Var.A(i, (jC >> 63) ^ (jC + jC));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iU2 = 0;
        for (int i12 = 0; i12 < y5Var.f14099d; i12++) {
            long jC2 = y5Var.c(i12);
            iU2 += a5.u((jC2 >> 63) ^ (jC2 + jC2));
        }
        a5Var.G(iU2);
        while (i10 < y5Var.f14099d) {
            long jC3 = y5Var.c(i10);
            a5Var.I((jC3 >> 63) ^ (jC3 + jC3));
            i10++;
        }
    }

    public static void h(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof y5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.B(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            a5Var.G(i11);
            while (i10 < list.size()) {
                a5Var.J(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z5) {
            while (i10 < y5Var.f14099d) {
                a5Var.B(i, y5Var.c(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < y5Var.f14099d; i14++) {
            y5Var.c(i14);
            i13 += 8;
        }
        a5Var.G(i13);
        while (i10 < y5Var.f14099d) {
            a5Var.J(y5Var.c(i10));
            i10++;
        }
    }

    public static void i(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof y5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.B(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            a5Var.G(i11);
            while (i10 < list.size()) {
                a5Var.J(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z5) {
            while (i10 < y5Var.f14099d) {
                a5Var.B(i, y5Var.c(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < y5Var.f14099d; i14++) {
            y5Var.c(i14);
            i13 += 8;
        }
        a5Var.G(i13);
        while (i10 < y5Var.f14099d) {
            a5Var.J(y5Var.c(i10));
            i10++;
        }
    }

    public static void j(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.x(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iU = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iU += a5.u(((Integer) list.get(i11)).intValue());
            }
            a5Var.G(iU);
            while (i10 < list.size()) {
                a5Var.F(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                a5Var.x(i, l5Var.e(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iU2 = 0;
        for (int i12 = 0; i12 < l5Var.f13866d; i12++) {
            iU2 += a5.u(l5Var.e(i12));
        }
        a5Var.G(iU2);
        while (i10 < l5Var.f13866d) {
            a5Var.F(l5Var.e(i10));
            i10++;
        }
    }

    public static void k(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.y(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iM = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iM += a5.M(((Integer) list.get(i11)).intValue());
            }
            a5Var.G(iM);
            while (i10 < list.size()) {
                a5Var.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                a5Var.y(i, l5Var.e(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iM2 = 0;
        for (int i12 = 0; i12 < l5Var.f13866d; i12++) {
            iM2 += a5.M(l5Var.e(i12));
        }
        a5Var.G(iM2);
        while (i10 < l5Var.f13866d) {
            a5Var.G(l5Var.e(i10));
            i10++;
        }
    }

    public static void l(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    a5Var.y(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iM = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iM += a5.M((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            a5Var.G(iM);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                a5Var.G((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                int iE = l5Var.e(i10);
                a5Var.y(i, (iE >> 31) ^ (iE + iE));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iM2 = 0;
        for (int i12 = 0; i12 < l5Var.f13866d; i12++) {
            int iE2 = l5Var.e(i12);
            iM2 += a5.M((iE2 >> 31) ^ (iE2 + iE2));
        }
        a5Var.G(iM2);
        while (i10 < l5Var.f13866d) {
            int iE3 = l5Var.e(i10);
            a5Var.G((iE3 >> 31) ^ (iE3 + iE3));
            i10++;
        }
    }

    public static void m(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.z(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            a5Var.G(i11);
            while (i10 < list.size()) {
                a5Var.H(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                a5Var.z(i, l5Var.e(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l5Var.f13866d; i14++) {
            l5Var.e(i14);
            i13 += 4;
        }
        a5Var.G(i13);
        while (i10 < l5Var.f13866d) {
            a5Var.H(l5Var.e(i10));
            i10++;
        }
    }

    public static void n(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.z(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            a5Var.G(i11);
            while (i10 < list.size()) {
                a5Var.H(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                a5Var.z(i, l5Var.e(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < l5Var.f13866d; i14++) {
            l5Var.e(i14);
            i13 += 4;
        }
        a5Var.G(i13);
        while (i10 < l5Var.f13866d) {
            a5Var.H(l5Var.e(i10));
            i10++;
        }
    }

    public static void o(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        int i10 = 0;
        if (!(list instanceof l5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    a5Var.x(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            a5Var.w(i, 2);
            int iU = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iU += a5.u(((Integer) list.get(i11)).intValue());
            }
            a5Var.G(iU);
            while (i10 < list.size()) {
                a5Var.F(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z5) {
            while (i10 < l5Var.f13866d) {
                a5Var.x(i, l5Var.e(i10));
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int iU2 = 0;
        for (int i12 = 0; i12 < l5Var.f13866d; i12++) {
            iU2 += a5.u(l5Var.e(i12));
        }
        a5Var.G(iU2);
        while (i10 < l5Var.f13866d) {
            a5Var.F(l5Var.e(i10));
            i10++;
        }
    }

    public static void p(int i, List list, z5 z5Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) z5Var.f14118a;
        if (list instanceof w4) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i10)).booleanValue();
                a5Var.G(i << 3);
                a5Var.E(zBooleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        a5Var.w(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        a5Var.G(i11);
        while (i10 < list.size()) {
            a5Var.E(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iU = 0;
            while (i < size) {
                iU += a5.u(((Long) list.get(i)).longValue());
                i++;
            }
            return iU;
        }
        y5 y5Var = (y5) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += a5.u(y5Var.c(i));
            i++;
        }
        return iU2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iU = 0;
            while (i < size) {
                iU += a5.u(((Long) list.get(i)).longValue());
                i++;
            }
            return iU;
        }
        y5 y5Var = (y5) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += a5.u(y5Var.c(i));
            i++;
        }
        return iU2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iU = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iU += a5.u((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iU;
        }
        y5 y5Var = (y5) list;
        int iU2 = 0;
        while (i < size) {
            long jC = y5Var.c(i);
            iU2 += a5.u((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iU2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iU = 0;
            while (i < size) {
                iU += a5.u(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU;
        }
        l5 l5Var = (l5) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += a5.u(l5Var.e(i));
            i++;
        }
        return iU2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iU = 0;
            while (i < size) {
                iU += a5.u(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU;
        }
        l5 l5Var = (l5) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += a5.u(l5Var.e(i));
            i++;
        }
        return iU2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iM = 0;
            while (i < size) {
                iM += a5.M(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        l5 l5Var = (l5) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += a5.M(l5Var.e(i));
            i++;
        }
        return iM2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iM = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM += a5.M((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM;
        }
        l5 l5Var = (l5) list;
        int iM2 = 0;
        while (i < size) {
            int iE = l5Var.e(i);
            iM2 += a5.M((iE >> 31) ^ (iE + iE));
            i++;
        }
        return iM2;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.M(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.M(i << 3) + 8) * size;
    }
}
