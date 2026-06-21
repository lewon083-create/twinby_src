package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v6 f13532a;

    static {
        int i = h5.f13404a;
        f13532a = new v6();
    }

    public static void a(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    l5Var.A(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                i11 += l5.i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            l5Var.B(i11);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                l5Var.B((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                int iC = u5Var.c(i10);
                l5Var.A(i, (iC >> 31) ^ (iC + iC));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f13586d; i14++) {
            int iC2 = u5Var.c(i14);
            i13 += l5.i((iC2 >> 31) ^ (iC2 + iC2));
        }
        l5Var.B(i13);
        while (i10 < u5Var.f13586d) {
            int iC3 = u5Var.c(i10);
            l5Var.B((iC3 >> 31) ^ (iC3 + iC3));
            i10++;
        }
    }

    public static void b(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof c6) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                l5Var.C(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iJ += l5.j((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        l5Var.B(iJ);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            l5Var.D((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    public static void c(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    l5Var.A(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += l5.i(((Integer) list.get(i12)).intValue());
            }
            l5Var.B(i11);
            while (i10 < list.size()) {
                l5Var.B(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                l5Var.A(i, u5Var.c(i10));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f13586d; i14++) {
            i13 += l5.i(u5Var.c(i14));
        }
        l5Var.B(i13);
        while (i10 < u5Var.f13586d) {
            l5Var.B(u5Var.c(i10));
            i10++;
        }
    }

    public static void d(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof c6) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.C(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iJ += l5.j(((Long) list.get(i11)).longValue());
        }
        l5Var.B(iJ);
        while (i10 < list.size()) {
            l5Var.D(((Long) list.get(i10)).longValue());
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
        if (!(list instanceof u5)) {
            int iJ = 0;
            while (i < size) {
                iJ += l5.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return iJ;
        }
        u5 u5Var = (u5) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += l5.j(u5Var.c(i));
            i++;
        }
        return iJ2;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l5.i(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l5.i(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iJ = 0;
            while (i < size) {
                iJ += l5.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return iJ;
        }
        u5 u5Var = (u5) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += l5.j(u5Var.c(i));
            i++;
        }
        return iJ2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += l5.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int i10 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                i10 += l5.i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return i10;
        }
        u5 u5Var = (u5) list;
        int i11 = 0;
        while (i < size) {
            int iC = u5Var.c(i);
            i11 += l5.i((iC >> 31) ^ (iC + iC));
            i++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += l5.j((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iJ;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int i10 = 0;
            while (i < size) {
                i10 += l5.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i10;
        }
        u5 u5Var = (u5) list;
        int i11 = 0;
        while (i < size) {
            i11 += l5.i(u5Var.c(i));
            i++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += l5.j(((Long) list.get(i)).longValue());
        }
        return iJ;
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
    public static void o(Object obj, Object obj2) {
        t5 t5Var = (t5) obj;
        u6 u6Var = t5Var.zzc;
        u6 u6Var2 = ((t5) obj2).zzc;
        u6 u6Var3 = u6.f13587e;
        if (!u6Var3.equals(u6Var2)) {
            if (u6Var3.equals(u6Var)) {
                u6Var.getClass();
                u6Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(u6Var.f13588a, 0);
                System.arraycopy(u6Var2.f13588a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(u6Var.f13589b, 0);
                System.arraycopy(u6Var2.f13589b, 0, objArrCopyOf, 0, 0);
                u6Var = new u6(iArrCopyOf, objArrCopyOf, true);
            } else {
                u6Var.getClass();
                if (!u6Var2.equals(u6Var3)) {
                    if (!u6Var.f13591d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = u6Var.f13588a;
                    int length = iArr.length;
                    System.arraycopy(u6Var2.f13588a, 0, iArr, 0, 0);
                    System.arraycopy(u6Var2.f13589b, 0, u6Var.f13589b, 0, 0);
                }
            }
        }
        t5Var.zzc = u6Var;
    }

    public static void p(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof i5) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i10)).booleanValue();
                l5Var.l(11);
                l5Var.o(i << 3);
                byte[] bArr = l5Var.f13460c;
                int i11 = l5Var.f13462e;
                bArr[i11] = bBooleanValue;
                l5Var.f13462e = i11 + 1;
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        l5Var.B(i12);
        while (i10 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i10)).booleanValue();
            if (l5Var.f13462e == l5Var.f13461d) {
                l5Var.k();
            }
            byte[] bArr2 = l5Var.f13460c;
            int i14 = l5Var.f13462e;
            bArr2[i14] = bBooleanValue2;
            l5Var.f13462e = i14 + 1;
            i10++;
        }
    }

    public static void q(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof m5) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.u(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        l5Var.B(i11);
        while (i10 < list.size()) {
            l5Var.v(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void r(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    l5Var.w(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ += l5.j(((Integer) list.get(i11)).intValue());
            }
            l5Var.B(iJ);
            while (i10 < list.size()) {
                l5Var.x(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                l5Var.w(i, u5Var.c(i10));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < u5Var.f13586d; i12++) {
            iJ2 += l5.j(u5Var.c(i12));
        }
        l5Var.B(iJ2);
        while (i10 < u5Var.f13586d) {
            l5Var.x(u5Var.c(i10));
            i10++;
        }
    }

    public static void s(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    l5Var.s(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            l5Var.B(i11);
            while (i10 < list.size()) {
                l5Var.t(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                l5Var.s(i, u5Var.c(i10));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f13586d; i14++) {
            u5Var.c(i14);
            i13 += 4;
        }
        l5Var.B(i13);
        while (i10 < u5Var.f13586d) {
            l5Var.t(u5Var.c(i10));
            i10++;
        }
    }

    public static void t(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof c6) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.u(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        l5Var.B(i11);
        while (i10 < list.size()) {
            l5Var.v(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof r5) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.s(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        l5Var.B(i11);
        while (i10 < list.size()) {
            l5Var.t(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void v(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    l5Var.w(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ += l5.j(((Integer) list.get(i11)).intValue());
            }
            l5Var.B(iJ);
            while (i10 < list.size()) {
                l5Var.x(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                l5Var.w(i, u5Var.c(i10));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < u5Var.f13586d; i12++) {
            iJ2 += l5.j(u5Var.c(i12));
        }
        l5Var.B(iJ2);
        while (i10 < u5Var.f13586d) {
            l5Var.x(u5Var.c(i10));
            i10++;
        }
    }

    public static void w(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof c6) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.C(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iJ += l5.j(((Long) list.get(i11)).longValue());
        }
        l5Var.B(iJ);
        while (i10 < list.size()) {
            l5Var.D(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    l5Var.s(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            l5Var.z(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            l5Var.B(i11);
            while (i10 < list.size()) {
                l5Var.t(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z5) {
            while (i10 < u5Var.f13586d) {
                l5Var.s(i, u5Var.c(i10));
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f13586d; i14++) {
            u5Var.c(i14);
            i13 += 4;
        }
        l5Var.B(i13);
        while (i10 < u5Var.f13586d) {
            l5Var.t(u5Var.c(i10));
            i10++;
        }
    }

    public static void y(int i, List list, d6 d6Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l5 l5Var = (l5) d6Var.f13360c;
        if (list instanceof c6) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                l5Var.u(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        l5Var.z(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        l5Var.B(i11);
        while (i10 < list.size()) {
            l5Var.v(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
