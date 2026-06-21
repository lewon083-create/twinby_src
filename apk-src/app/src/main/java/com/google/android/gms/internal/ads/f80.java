package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5265h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f5266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f5269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5271o;

    public f80() {
        this.f5258a = new HashSet();
        this.f5259b = new HashSet();
        this.f5260c = new HashSet();
        this.f5261d = new HashSet();
        this.f5262e = new HashSet();
        this.f5263f = new HashSet();
        this.f5264g = new HashSet();
        this.f5265h = new HashSet();
        this.i = new HashSet();
        this.f5266j = new HashSet();
        this.f5267k = new HashSet();
        this.f5268l = new HashSet();
        this.f5269m = new HashSet();
        this.f5270n = new HashSet();
    }

    public void a(l60 l60Var, Executor executor) {
        ((HashSet) this.i).add(new s80(l60Var, executor));
    }

    public void b(l9.d dVar, Executor executor) {
        ((HashSet) this.f5267k).add(new s80(dVar, executor));
    }

    public void c(v80 v80Var, Executor executor) {
        ((HashSet) this.f5261d).add(new s80(v80Var, executor));
    }

    public void d(q70 q70Var, Executor executor) {
        ((HashSet) this.f5259b).add(new s80(q70Var, executor));
    }

    public f80(ExecutorService executorService, Context context, ux0 ux0Var) {
        this.f5258a = this;
        ns1 ns1VarA = ns1.a(context);
        this.f5259b = ns1VarA;
        ls1 ls1VarA = ls1.a(c80.L);
        this.f5260c = ls1VarA;
        ns1 ns1VarA2 = ns1.a(executorService);
        this.f5261d = ns1VarA2;
        ls1 ls1VarA2 = ls1.a(new vp0(ns1VarA, ls1VarA, ns1VarA2));
        int i = 2;
        ls1 ls1VarA3 = ls1.a(new yv(ns1VarA, ns1VarA2, i));
        ls1 ls1VarA4 = ls1.a(new yv(ns1VarA, ns1VarA2, 3));
        ls1 ls1VarA5 = ls1.a(new v00(ls1.a(ns1VarA2), ls1VarA, 17));
        ls1 ls1VarA6 = ls1.a(pn1.A);
        ns1 ns1VarA3 = ns1.a(ux0Var);
        this.f5262e = ns1VarA3;
        int i10 = 1;
        ls1 ls1VarA7 = ls1.a(new vp0(i10, ls1VarA5, ls1VarA6, ns1VarA3));
        this.f5263f = ls1VarA7;
        ls1 ls1VarA8 = ls1.a(new yv(ns1VarA2, ns1VarA3, i10));
        this.f5264g = ls1VarA8;
        ls1 ls1VarA9 = ls1.a(new j40((Object) ns1VarA, ls1VarA7, (Object) ns1VarA2, (Object) ls1VarA8, (Object) ns1VarA3, 19));
        this.f5265h = ls1VarA9;
        int i11 = rs1.f10057c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(ls1VarA2);
        arrayList.add(ls1VarA3);
        arrayList.add(ls1VarA4);
        arrayList.add(ls1VarA9);
        rs1 rs1Var = new rs1(arrayList, list);
        ls1 ls1VarA10 = ls1.a(new p20(23, new vx0(0, this)));
        ls1 ls1VarA11 = ls1.a(new p20(24, new vx0(i10, this)));
        ls1 ls1VarA12 = ls1.a(new p20(25, new vx0(i, this)));
        ls1 ls1VarA13 = ls1.a(new v00(ls1VarA, ls1VarA9, 18));
        this.i = ls1VarA13;
        ls1 ls1VarA14 = ls1.a(new j40(ns1VarA3, ls1.a(new j40(ls1VarA10, (qs1) ls1VarA11, (qs1) ls1VarA12, (Object) ns1VarA2, ls1VarA13, 20)), ls1VarA9, ns1VarA2, ls1VarA13, 21));
        ls1 ls1VarA15 = ls1.a(new ge0(ns1VarA2, 5));
        this.f5266j = ls1VarA15;
        ls1 ls1VarA16 = ls1.a(new o01(ns1VarA, ls1VarA13, ns1VarA3, ls1VarA15));
        ls1 ls1VarA17 = ls1.a(new o01(2, ls1VarA13, ls1VarA15, ns1VarA, ns1VarA3));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(ls1VarA14);
        arrayList2.add(ls1VarA16);
        arrayList2.add(ls1VarA17);
        ls1 ls1VarA18 = ls1.a(new ml((qs1) rs1Var, (qs1) new rs1(arrayList2, list2), (ms1) ns1VarA2, ls1VarA13, 17));
        ls1 ls1VarA19 = ls1.a(nz.C);
        ls1 ls1VarA20 = ls1.a(new xe0(ls1VarA, 15));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(ls1VarA19);
        arrayList3.add(ls1VarA2);
        arrayList3.add(ls1VarA3);
        arrayList3.add(ls1VarA20);
        arrayList3.add(ls1VarA4);
        arrayList3.add(ls1VarA16);
        arrayList3.add(ls1VarA17);
        ls1 ls1VarA21 = ls1.a(new mm0(ls1VarA19, new rs1(arrayList3, list3), 16));
        this.f5267k = ls1VarA21;
        ls1 ls1VarA22 = ls1.a(new xe0(ls1VarA13, 14));
        this.f5268l = ls1VarA22;
        this.f5269m = ls1.a(new n50(ls1VarA18, ls1VarA14, ls1VarA21, ls1VarA13, ls1VarA7, ls1.a(new o01(0, ls1VarA13, ls1VarA22, ns1VarA, ns1VarA3)), ns1VarA3, 8));
        this.f5270n = ls1.a(new ge0(ns1VarA, 4));
        this.f5271o = ls1.a(new ge0(ns1VarA2, 6));
    }
}
