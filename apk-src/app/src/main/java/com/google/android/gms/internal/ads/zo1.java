package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c6 f13054a;

    static {
        int i = tm1.f10663a;
        f13054a = new c6(6);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hn1.N(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hn1.N(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
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
    public static void d(Object obj, Object obj2) {
        sn1 sn1Var = (sn1) obj;
        ep1 ep1Var = sn1Var.zzt;
        ep1 ep1Var2 = ((sn1) obj2).zzt;
        ep1 ep1Var3 = ep1.f5026f;
        if (!ep1Var3.equals(ep1Var2)) {
            if (ep1Var3.equals(ep1Var)) {
                int i = ep1Var.f5027a + ep1Var2.f5027a;
                int[] iArrCopyOf = Arrays.copyOf(ep1Var.f5028b, i);
                System.arraycopy(ep1Var2.f5028b, 0, iArrCopyOf, ep1Var.f5027a, ep1Var2.f5027a);
                Object[] objArrCopyOf = Arrays.copyOf(ep1Var.f5029c, i);
                System.arraycopy(ep1Var2.f5029c, 0, objArrCopyOf, ep1Var.f5027a, ep1Var2.f5027a);
                ep1Var = new ep1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ep1Var.getClass();
                if (!ep1Var2.equals(ep1Var3)) {
                    if (!ep1Var.f5031e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = ep1Var.f5027a + ep1Var2.f5027a;
                    ep1Var.e(i10);
                    System.arraycopy(ep1Var2.f5028b, 0, ep1Var.f5028b, ep1Var.f5027a, ep1Var2.f5027a);
                    System.arraycopy(ep1Var2.f5029c, 0, ep1Var.f5029c, ep1Var.f5027a, ep1Var2.f5027a);
                    ep1Var.f5027a = i10;
                }
            }
        }
        sn1Var.zzt = ep1Var;
    }

    public static Object e(Object obj, int i, zn1 zn1Var, vn1 vn1Var, Object obj2, c6 c6Var) {
        if (vn1Var == null) {
            return obj2;
        }
        if (zn1Var == null) {
            Iterator it = zn1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!vn1Var.a(iIntValue)) {
                    if (obj2 == null) {
                        c6Var.getClass();
                        obj2 = c6.z(obj);
                    }
                    c6Var.getClass();
                    ((ep1) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zn1Var.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) zn1Var.get(i11);
            int iIntValue2 = num.intValue();
            if (vn1Var.a(iIntValue2)) {
                if (i11 != i10) {
                    zn1Var.set(i10, num);
                }
                i10++;
            } else {
                if (obj2 == null) {
                    c6Var.getClass();
                    obj2 = c6.z(obj);
                }
                c6Var.getClass();
                ((ep1) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i10 != size) {
            zn1Var.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void f(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        if (list instanceof in1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                hn1Var.W(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        hn1Var.f0(i11);
        while (i10 < list.size()) {
            hn1Var.i0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void g(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        if (list instanceof on1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                hn1Var.T(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        hn1Var.f0(i11);
        while (i10 < list.size()) {
            hn1Var.g0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void h(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof ho1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.U(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += hn1.O(((Long) list.get(i11)).longValue());
            }
            hn1Var.f0(iO);
            while (i10 < list.size()) {
                hn1Var.h0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        ho1 ho1Var = (ho1) list;
        if (!z5) {
            while (i10 < ho1Var.f6209d) {
                hn1Var.U(i, ho1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < ho1Var.f6209d; i12++) {
            iO2 += hn1.O(ho1Var.c(i12));
        }
        hn1Var.f0(iO2);
        while (i10 < ho1Var.f6209d) {
            hn1Var.h0(ho1Var.c(i10));
            i10++;
        }
    }

    public static void i(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof ho1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.U(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += hn1.O(((Long) list.get(i11)).longValue());
            }
            hn1Var.f0(iO);
            while (i10 < list.size()) {
                hn1Var.h0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        ho1 ho1Var = (ho1) list;
        if (!z5) {
            while (i10 < ho1Var.f6209d) {
                hn1Var.U(i, ho1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < ho1Var.f6209d; i12++) {
            iO2 += hn1.O(ho1Var.c(i12));
        }
        hn1Var.f0(iO2);
        while (i10 < ho1Var.f6209d) {
            hn1Var.h0(ho1Var.c(i10));
            i10++;
        }
    }

    public static void j(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof ho1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    hn1Var.U(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iO += hn1.O((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            hn1Var.f0(iO);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                hn1Var.h0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        ho1 ho1Var = (ho1) list;
        if (!z5) {
            while (i10 < ho1Var.f6209d) {
                long jC = ho1Var.c(i10);
                hn1Var.U(i, (jC >> 63) ^ (jC + jC));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < ho1Var.f6209d; i12++) {
            long jC2 = ho1Var.c(i12);
            iO2 += hn1.O((jC2 >> 63) ^ (jC2 + jC2));
        }
        hn1Var.f0(iO2);
        while (i10 < ho1Var.f6209d) {
            long jC3 = ho1Var.c(i10);
            hn1Var.h0((jC3 >> 63) ^ (jC3 + jC3));
            i10++;
        }
    }

    public static void k(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof ho1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.W(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            hn1Var.f0(i11);
            while (i10 < list.size()) {
                hn1Var.i0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        ho1 ho1Var = (ho1) list;
        if (!z5) {
            while (i10 < ho1Var.f6209d) {
                hn1Var.W(i, ho1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < ho1Var.f6209d; i14++) {
            ho1Var.c(i14);
            i13 += 8;
        }
        hn1Var.f0(i13);
        while (i10 < ho1Var.f6209d) {
            hn1Var.i0(ho1Var.c(i10));
            i10++;
        }
    }

    public static void l(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof ho1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.W(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            hn1Var.f0(i11);
            while (i10 < list.size()) {
                hn1Var.i0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        ho1 ho1Var = (ho1) list;
        if (!z5) {
            while (i10 < ho1Var.f6209d) {
                hn1Var.W(i, ho1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < ho1Var.f6209d; i14++) {
            ho1Var.c(i14);
            i13 += 8;
        }
        hn1Var.f0(i13);
        while (i10 < ho1Var.f6209d) {
            hn1Var.i0(ho1Var.c(i10));
            i10++;
        }
    }

    public static void m(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.R(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += hn1.O(((Integer) list.get(i11)).intValue());
            }
            hn1Var.f0(iO);
            while (i10 < list.size()) {
                hn1Var.e0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                hn1Var.R(i, tn1Var.e(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < tn1Var.f10669d; i12++) {
            iO2 += hn1.O(tn1Var.e(i12));
        }
        hn1Var.f0(iO2);
        while (i10 < tn1Var.f10669d) {
            hn1Var.e0(tn1Var.e(i10));
            i10++;
        }
    }

    public static void n(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.S(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iN = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iN += hn1.N(((Integer) list.get(i11)).intValue());
            }
            hn1Var.f0(iN);
            while (i10 < list.size()) {
                hn1Var.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                hn1Var.S(i, tn1Var.e(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iN2 = 0;
        for (int i12 = 0; i12 < tn1Var.f10669d; i12++) {
            iN2 += hn1.N(tn1Var.e(i12));
        }
        hn1Var.f0(iN2);
        while (i10 < tn1Var.f10669d) {
            hn1Var.f0(tn1Var.e(i10));
            i10++;
        }
    }

    public static void o(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    hn1Var.S(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iN = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iN += hn1.N((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            hn1Var.f0(iN);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                hn1Var.f0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                int iE = tn1Var.e(i10);
                hn1Var.S(i, (iE >> 31) ^ (iE + iE));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iN2 = 0;
        for (int i12 = 0; i12 < tn1Var.f10669d; i12++) {
            int iE2 = tn1Var.e(i12);
            iN2 += hn1.N((iE2 >> 31) ^ (iE2 + iE2));
        }
        hn1Var.f0(iN2);
        while (i10 < tn1Var.f10669d) {
            int iE3 = tn1Var.e(i10);
            hn1Var.f0((iE3 >> 31) ^ (iE3 + iE3));
            i10++;
        }
    }

    public static void p(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.T(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            hn1Var.f0(i11);
            while (i10 < list.size()) {
                hn1Var.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                hn1Var.T(i, tn1Var.e(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < tn1Var.f10669d; i14++) {
            tn1Var.e(i14);
            i13 += 4;
        }
        hn1Var.f0(i13);
        while (i10 < tn1Var.f10669d) {
            hn1Var.g0(tn1Var.e(i10));
            i10++;
        }
    }

    public static void q(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.T(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            hn1Var.f0(i11);
            while (i10 < list.size()) {
                hn1Var.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                hn1Var.T(i, tn1Var.e(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < tn1Var.f10669d; i14++) {
            tn1Var.e(i14);
            i13 += 4;
        }
        hn1Var.f0(i13);
        while (i10 < tn1Var.f10669d) {
            hn1Var.g0(tn1Var.e(i10));
            i10++;
        }
    }

    public static void r(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        int i10 = 0;
        if (!(list instanceof tn1)) {
            if (!z5) {
                while (i10 < list.size()) {
                    hn1Var.R(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.Q(i, 2);
            int iO = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO += hn1.O(((Integer) list.get(i11)).intValue());
            }
            hn1Var.f0(iO);
            while (i10 < list.size()) {
                hn1Var.e0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        tn1 tn1Var = (tn1) list;
        if (!z5) {
            while (i10 < tn1Var.f10669d) {
                hn1Var.R(i, tn1Var.e(i10));
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int iO2 = 0;
        for (int i12 = 0; i12 < tn1Var.f10669d; i12++) {
            iO2 += hn1.O(tn1Var.e(i12));
        }
        hn1Var.f0(iO2);
        while (i10 < tn1Var.f10669d) {
            hn1Var.e0(tn1Var.e(i10));
            i10++;
        }
    }

    public static void s(int i, List list, pp0 pp0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        if (list instanceof vm1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                hn1Var.X(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        hn1Var.Q(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        hn1Var.f0(i11);
        while (i10 < list.size()) {
            hn1Var.d0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ho1)) {
            int iO = 0;
            while (i < size) {
                iO += hn1.O(((Long) list.get(i)).longValue());
                i++;
            }
            return iO;
        }
        ho1 ho1Var = (ho1) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += hn1.O(ho1Var.c(i));
            i++;
        }
        return iO2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ho1)) {
            int iO = 0;
            while (i < size) {
                iO += hn1.O(((Long) list.get(i)).longValue());
                i++;
            }
            return iO;
        }
        ho1 ho1Var = (ho1) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += hn1.O(ho1Var.c(i));
            i++;
        }
        return iO2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ho1)) {
            int iO = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iO += hn1.O((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iO;
        }
        ho1 ho1Var = (ho1) list;
        int iO2 = 0;
        while (i < size) {
            long jC = ho1Var.c(i);
            iO2 += hn1.O((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iO2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tn1)) {
            int iO = 0;
            while (i < size) {
                iO += hn1.O(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        tn1 tn1Var = (tn1) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += hn1.O(tn1Var.e(i));
            i++;
        }
        return iO2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tn1)) {
            int iO = 0;
            while (i < size) {
                iO += hn1.O(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        tn1 tn1Var = (tn1) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += hn1.O(tn1Var.e(i));
            i++;
        }
        return iO2;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tn1)) {
            int iN = 0;
            while (i < size) {
                iN += hn1.N(((Integer) list.get(i)).intValue());
                i++;
            }
            return iN;
        }
        tn1 tn1Var = (tn1) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += hn1.N(tn1Var.e(i));
            i++;
        }
        return iN2;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tn1)) {
            int iN = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iN += hn1.N((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iN;
        }
        tn1 tn1Var = (tn1) list;
        int iN2 = 0;
        while (i < size) {
            int iE = tn1Var.e(i);
            iN2 += hn1.N((iE >> 31) ^ (iE + iE));
            i++;
        }
        return iN2;
    }
}
