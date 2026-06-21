package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f14200a;

    static {
        c4 c4Var = c4.f14151c;
        f14200a = new e3(6);
    }

    public static void a(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    x2Var.Z(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int iE0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iE0 += x2.e0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            x2Var.a0(iE0);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                x2Var.a0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                int iC = h3Var.c(i10);
                x2Var.Z(i, (iC >> 31) ^ (iC + iC));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iE02 = 0;
        for (int i12 = 0; i12 < h3Var.f14207d; i12++) {
            int iC2 = h3Var.c(i12);
            iE02 += x2.e0((iC2 >> 31) ^ (iC2 + iC2));
        }
        x2Var.a0(iE02);
        while (i10 < h3Var.f14207d) {
            int iC3 = h3Var.c(i10);
            x2Var.a0((iC3 >> 31) ^ (iC3 + iC3));
            i10++;
        }
    }

    public static void b(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof s3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                x2Var.b0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iO = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iO += x2.O((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        x2Var.a0(iO);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            x2Var.c0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    public static void c(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x2Var.Z(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int iE0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE0 += x2.e0(((Integer) list.get(i11)).intValue());
            }
            x2Var.a0(iE0);
            while (i10 < list.size()) {
                x2Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                x2Var.Z(i, h3Var.c(i10));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iE02 = 0;
        for (int i12 = 0; i12 < h3Var.f14207d; i12++) {
            iE02 += x2.e0(h3Var.c(i12));
        }
        x2Var.a0(iE02);
        while (i10 < h3Var.f14207d) {
            x2Var.a0(h3Var.c(i10));
            i10++;
        }
    }

    public static void d(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof s3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.b0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iO = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += x2.O(((Long) list.get(i11)).longValue());
        }
        x2Var.a0(iO);
        while (i10 < list.size()) {
            x2Var.c0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int iO = 0;
            while (i < size) {
                iO += x2.O(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        h3 h3Var = (h3) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += x2.O(h3Var.c(i));
            i++;
        }
        return iO2;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x2.e0(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x2.e0(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int iO = 0;
            while (i < size) {
                iO += x2.O(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        h3 h3Var = (h3) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += x2.O(h3Var.c(i));
            i++;
        }
        return iO2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += x2.O(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int iE0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iE0 += x2.e0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iE0;
        }
        h3 h3Var = (h3) list;
        int iE02 = 0;
        while (i < size) {
            int iC = h3Var.c(i);
            iE02 += x2.e0((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iE02;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iO += x2.O((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iO;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int iE0 = 0;
            while (i < size) {
                iE0 += x2.e0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iE0;
        }
        h3 h3Var = (h3) list;
        int iE02 = 0;
        while (i < size) {
            iE02 += x2.e0(h3Var.c(i));
            i++;
        }
        return iE02;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += x2.O(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    public static Object o(int i, Object obj, Object obj2, int i10) {
        Object obj3 = obj2;
        if (obj2 == null) {
            g3 g3Var = (g3) obj;
            j4 j4Var = g3Var.zzc;
            obj3 = j4Var;
            if (j4Var == j4.f14219f) {
                j4 j4VarB = j4.b();
                g3Var.zzc = j4VarB;
                obj3 = j4VarB;
            }
        }
        ((j4) obj3).c(i << 3, Long.valueOf(i10));
        return obj3;
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
    public static void p(Object obj, Object obj2) {
        g3 g3Var = (g3) obj;
        j4 j4Var = g3Var.zzc;
        j4 j4Var2 = ((g3) obj2).zzc;
        j4 j4Var3 = j4.f14219f;
        if (!j4Var3.equals(j4Var2)) {
            if (j4Var3.equals(j4Var)) {
                int i = j4Var.f14220a + j4Var2.f14220a;
                int[] iArrCopyOf = Arrays.copyOf(j4Var.f14221b, i);
                System.arraycopy(j4Var2.f14221b, 0, iArrCopyOf, j4Var.f14220a, j4Var2.f14220a);
                Object[] objArrCopyOf = Arrays.copyOf(j4Var.f14222c, i);
                System.arraycopy(j4Var2.f14222c, 0, objArrCopyOf, j4Var.f14220a, j4Var2.f14220a);
                j4Var = new j4(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                j4Var.getClass();
                if (!j4Var2.equals(j4Var3)) {
                    if (!j4Var.f14224e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = j4Var.f14220a + j4Var2.f14220a;
                    j4Var.e(i10);
                    System.arraycopy(j4Var2.f14221b, 0, j4Var.f14221b, j4Var.f14220a, j4Var2.f14220a);
                    System.arraycopy(j4Var2.f14222c, 0, j4Var.f14222c, j4Var.f14220a, j4Var2.f14220a);
                    j4Var.f14220a = i10;
                }
            }
        }
        g3Var.zzc = j4Var;
    }

    public static void q(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        int i11;
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof u2) {
            throw new ClassCastException();
        }
        int i12 = 0;
        if (!z5) {
            while (i12 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i12)).booleanValue();
                x2Var.a0(i << 3);
                int i13 = x2Var.f14368f;
                try {
                    i10 = i13 + 1;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                }
                try {
                    x2Var.f14366d[i13] = bBooleanValue;
                    x2Var.f14368f = i10;
                    i12++;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i13 = i10;
                    throw new androidx.datastore.preferences.protobuf.m(i13, x2Var.f14367e, 1, e, 6);
                }
            }
            return;
        }
        x2Var.Y(i, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        x2Var.a0(i14);
        while (i12 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i12)).booleanValue();
            int i16 = x2Var.f14368f;
            try {
                i11 = i16 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                x2Var.f14366d[i16] = bBooleanValue2;
                x2Var.f14368f = i11;
                i12++;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i16 = i11;
                throw new androidx.datastore.preferences.protobuf.m(i16, x2Var.f14367e, 1, e, 6);
            }
        }
    }

    public static void r(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof y2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.T(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        x2Var.a0(i11);
        while (i10 < list.size()) {
            x2Var.U(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void s(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x2Var.V(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += x2.O(((Integer) list.get(i11)).intValue());
            }
            x2Var.a0(iO);
            while (i10 < list.size()) {
                x2Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                x2Var.V(i, h3Var.c(i10));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < h3Var.f14207d; i12++) {
            iO2 += x2.O(h3Var.c(i12));
        }
        x2Var.a0(iO2);
        while (i10 < h3Var.f14207d) {
            x2Var.W(h3Var.c(i10));
            i10++;
        }
    }

    public static void t(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x2Var.R(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            x2Var.a0(i11);
            while (i10 < list.size()) {
                x2Var.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                x2Var.R(i, h3Var.c(i10));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f14207d; i14++) {
            h3Var.c(i14);
            i13 += 4;
        }
        x2Var.a0(i13);
        while (i10 < h3Var.f14207d) {
            x2Var.S(h3Var.c(i10));
            i10++;
        }
    }

    public static void u(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof s3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.T(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        x2Var.a0(i11);
        while (i10 < list.size()) {
            x2Var.U(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void v(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof c3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.R(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        x2Var.a0(i11);
        while (i10 < list.size()) {
            x2Var.S(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void w(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x2Var.V(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += x2.O(((Integer) list.get(i11)).intValue());
            }
            x2Var.a0(iO);
            while (i10 < list.size()) {
                x2Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                x2Var.V(i, h3Var.c(i10));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < h3Var.f14207d; i12++) {
            iO2 += x2.O(h3Var.c(i12));
        }
        x2Var.a0(iO2);
        while (i10 < h3Var.f14207d) {
            x2Var.W(h3Var.c(i10));
            i10++;
        }
    }

    public static void x(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof s3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.b0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int iO = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += x2.O(((Long) list.get(i11)).longValue());
        }
        x2Var.a0(iO);
        while (i10 < list.size()) {
            x2Var.c0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void y(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x2Var.R(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x2Var.Y(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            x2Var.a0(i11);
            while (i10 < list.size()) {
                x2Var.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f14207d) {
                x2Var.R(i, h3Var.c(i10));
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f14207d; i14++) {
            h3Var.c(i14);
            i13 += 4;
        }
        x2Var.a0(i13);
        while (i10 < h3Var.f14207d) {
            x2Var.S(h3Var.c(i10));
            i10++;
        }
    }

    public static void z(int i, List list, t3 t3Var, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        if (list == null || list.isEmpty()) {
            return;
        }
        x2 x2Var = (x2) t3Var.f14315a;
        if (list instanceof s3) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x2Var.T(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        x2Var.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        x2Var.a0(i11);
        while (i10 < list.size()) {
            x2Var.U(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
