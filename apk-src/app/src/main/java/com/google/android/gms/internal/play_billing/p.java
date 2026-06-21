package com.google.android.gms.internal.play_billing;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collector f14275a;

    static {
        final int i = 0;
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 1;
        f14275a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return new y(0);
                    case 1:
                        return new g0(0);
                    default:
                        return new e0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((y) obj).c(obj2);
                        return;
                    case 1:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        obj2.getClass();
                        g0Var.c(obj2);
                        return;
                    default:
                        e0 e0Var = (e0) obj;
                        p0 p0Var = (p0) obj2;
                        e0Var.getClass();
                        if (p0Var.f14277b.equals(p0Var.f14278c)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                        }
                        e0Var.f14165a.add(p0Var);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        e0 e0Var = (e0) obj;
                        e0Var.getClass();
                        for (p0 p0Var : ((e0) obj2).f14165a) {
                            if (p0Var.f14277b.equals(p0Var.f14278c)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                            }
                            e0Var.f14165a.add(p0Var);
                        }
                        return e0Var;
                    case 1:
                        y yVar = (y) obj;
                        y yVar2 = (y) obj2;
                        Object[] objArr = yVar2.f14343c;
                        int i13 = yVar2.f14342b;
                        for (int i14 = 0; i14 < i13; i14++) {
                            yVar.getClass();
                            if (objArr[i14] == null) {
                                throw new NullPointerException(l7.o.i(i14, "at index "));
                            }
                        }
                        yVar.e(i13);
                        System.arraycopy(objArr, 0, yVar.f14343c, yVar.f14342b, i13);
                        yVar.f14342b += i13;
                        return yVar;
                    default:
                        g0 g0Var = (g0) obj;
                        g0 g0Var2 = (g0) obj2;
                        Object[] objArr2 = g0Var2.f14343c;
                        int i15 = g0Var2.f14342b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            g0Var.getClass();
                            if (objArr2[i16] == null) {
                                throw new NullPointerException(l7.o.i(i16, "at index "));
                            }
                        }
                        g0Var.e(i15);
                        System.arraycopy(objArr2, 0, g0Var.f14343c, g0Var.f14342b, i15);
                        g0Var.f14342b += i15;
                        return g0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:102:0x0134 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 434
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i13 = 1;
        final int i14 = 1;
        final int i15 = 2;
        final int i16 = 2;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i13) {
                    case 0:
                        return new y(0);
                    case 1:
                        return new g0(0);
                    default:
                        return new e0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        ((y) obj).c(obj2);
                        return;
                    case 1:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        obj2.getClass();
                        g0Var.c(obj2);
                        return;
                    default:
                        e0 e0Var = (e0) obj;
                        p0 p0Var = (p0) obj2;
                        e0Var.getClass();
                        if (p0Var.f14277b.equals(p0Var.f14278c)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                        }
                        e0Var.f14165a.add(p0Var);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        e0 e0Var = (e0) obj;
                        e0Var.getClass();
                        for (p0 p0Var : ((e0) obj2).f14165a) {
                            if (p0Var.f14277b.equals(p0Var.f14278c)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                            }
                            e0Var.f14165a.add(p0Var);
                        }
                        return e0Var;
                    case 1:
                        y yVar = (y) obj;
                        y yVar2 = (y) obj2;
                        Object[] objArr = yVar2.f14343c;
                        int i132 = yVar2.f14342b;
                        for (int i142 = 0; i142 < i132; i142++) {
                            yVar.getClass();
                            if (objArr[i142] == null) {
                                throw new NullPointerException(l7.o.i(i142, "at index "));
                            }
                        }
                        yVar.e(i132);
                        System.arraycopy(objArr, 0, yVar.f14343c, yVar.f14342b, i132);
                        yVar.f14342b += i132;
                        return yVar;
                    default:
                        g0 g0Var = (g0) obj;
                        g0 g0Var2 = (g0) obj2;
                        Object[] objArr2 = g0Var2.f14343c;
                        int i152 = g0Var2.f14342b;
                        for (int i162 = 0; i162 < i152; i162++) {
                            g0Var.getClass();
                            if (objArr2[i162] == null) {
                                throw new NullPointerException(l7.o.i(i162, "at index "));
                            }
                        }
                        g0Var.e(i152);
                        System.arraycopy(objArr2, 0, g0Var.f14343c, g0Var.f14342b, i152);
                        g0Var.f14342b += i152;
                        return g0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:102:0x0134 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 434
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i17 = 2;
        final int i18 = 2;
        final int i19 = 0;
        final int i20 = 0;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i17) {
                    case 0:
                        return new y(0);
                    case 1:
                        return new g0(0);
                    default:
                        return new e0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        ((y) obj).c(obj2);
                        return;
                    case 1:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        obj2.getClass();
                        g0Var.c(obj2);
                        return;
                    default:
                        e0 e0Var = (e0) obj;
                        p0 p0Var = (p0) obj2;
                        e0Var.getClass();
                        if (p0Var.f14277b.equals(p0Var.f14278c)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                        }
                        e0Var.f14165a.add(p0Var);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        e0 e0Var = (e0) obj;
                        e0Var.getClass();
                        for (p0 p0Var : ((e0) obj2).f14165a) {
                            if (p0Var.f14277b.equals(p0Var.f14278c)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", p0Var));
                            }
                            e0Var.f14165a.add(p0Var);
                        }
                        return e0Var;
                    case 1:
                        y yVar = (y) obj;
                        y yVar2 = (y) obj2;
                        Object[] objArr = yVar2.f14343c;
                        int i132 = yVar2.f14342b;
                        for (int i142 = 0; i142 < i132; i142++) {
                            yVar.getClass();
                            if (objArr[i142] == null) {
                                throw new NullPointerException(l7.o.i(i142, "at index "));
                            }
                        }
                        yVar.e(i132);
                        System.arraycopy(objArr, 0, yVar.f14343c, yVar.f14342b, i132);
                        yVar.f14342b += i132;
                        return yVar;
                    default:
                        g0 g0Var = (g0) obj;
                        g0 g0Var2 = (g0) obj2;
                        Object[] objArr2 = g0Var2.f14343c;
                        int i152 = g0Var2.f14342b;
                        for (int i162 = 0; i162 < i152; i162++) {
                            g0Var.getClass();
                            if (objArr2[i162] == null) {
                                throw new NullPointerException(l7.o.i(i162, "at index "));
                            }
                        }
                        g0Var.e(i152);
                        System.arraycopy(objArr2, 0, g0Var.f14343c, g0Var.f14342b, i152);
                        g0Var.f14342b += i152;
                        return g0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:102:0x0134 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 434
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
    }
}
