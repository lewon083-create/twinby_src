package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f1372c;

    static {
        Class<?> cls;
        Class<?> cls2;
        z0 z0Var = z0.f1519c;
        k1 k1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1370a = cls;
        try {
            z0 z0Var2 = z0.f1519c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                k1Var = (k1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1371b = k1Var;
        f1372c = new k1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += n.T(((Integer) list.get(i)).intValue());
        }
        return iT;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.R(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.R(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += n.T(((Integer) list.get(i)).intValue());
        }
        return iT;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += n.T(((Long) list.get(i)).longValue());
        }
        return iT;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof a0)) {
                int iS = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iS += n.S((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iS;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof j0)) {
                int iT = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iT += n.T((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iT;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i = 0; i < size; i++) {
            iS += n.S(((Integer) list.get(i)).intValue());
        }
        return iS;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += n.T(((Long) list.get(i)).longValue());
        }
        return iT;
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
    public static void k(k1 k1Var, Object obj, Object obj2) {
        k1Var.getClass();
        z zVar = (z) obj;
        j1 j1Var = zVar.unknownFields;
        j1 j1Var2 = ((z) obj2).unknownFields;
        j1 j1Var3 = j1.f1426f;
        if (!j1Var3.equals(j1Var2)) {
            if (j1Var3.equals(j1Var)) {
                int i = j1Var.f1427a + j1Var2.f1427a;
                int[] iArrCopyOf = Arrays.copyOf(j1Var.f1428b, i);
                System.arraycopy(j1Var2.f1428b, 0, iArrCopyOf, j1Var.f1427a, j1Var2.f1427a);
                Object[] objArrCopyOf = Arrays.copyOf(j1Var.f1429c, i);
                System.arraycopy(j1Var2.f1429c, 0, objArrCopyOf, j1Var.f1427a, j1Var2.f1427a);
                j1Var = new j1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                j1Var.getClass();
                if (!j1Var2.equals(j1Var3)) {
                    if (!j1Var.f1431e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = j1Var.f1427a + j1Var2.f1427a;
                    j1Var.a(i10);
                    System.arraycopy(j1Var2.f1428b, 0, j1Var.f1428b, j1Var.f1427a, j1Var2.f1427a);
                    System.arraycopy(j1Var2.f1429c, 0, j1Var.f1429c, j1Var.f1427a, j1Var2.f1427a);
                    j1Var.f1427a = i10;
                }
            }
        }
        zVar.unknownFields = j1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof d) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.Y(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11++;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.W(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof o) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                nVar.getClass();
                nVar.d0(i, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 8;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.e0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.f0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += n.T(((Integer) list.get(i11)).intValue());
        }
        nVar.m0(iT);
        while (i10 < list.size()) {
            nVar.g0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.b0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 4;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.c0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.d0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 8;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.e0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof v) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                nVar.getClass();
                nVar.b0(i, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 4;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.c0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.f0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += n.T(((Integer) list.get(i11)).intValue());
        }
        nVar.m0(iT);
        while (i10 < list.size()) {
            nVar.g0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.n0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += n.T(((Long) list.get(i11)).longValue());
        }
        nVar.m0(iT);
        while (i10 < list.size()) {
            nVar.o0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.b0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 4;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.c0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.d0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = n.f1445f;
            i11 += 8;
        }
        nVar.m0(i11);
        while (i10 < list.size()) {
            nVar.e0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                nVar.l0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iS = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iS += n.S((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        nVar.m0(iS);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            nVar.m0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void x(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                nVar.n0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iT += n.T((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        nVar.m0(iT);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            nVar.o0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void y(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.l0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iS = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iS += n.S(((Integer) list.get(i11)).intValue());
        }
        nVar.m0(iS);
        while (i10 < list.size()) {
            nVar.m0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i, List list, l0 l0Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1440a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                nVar.n0(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        nVar.k0(i, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += n.T(((Long) list.get(i11)).longValue());
        }
        nVar.m0(iT);
        while (i10 < list.size()) {
            nVar.o0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i, b0 b0Var, Object obj2, k1 k1Var) {
        return obj2;
    }
}
