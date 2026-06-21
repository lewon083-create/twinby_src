package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ls1 f11972a;

    public x10(n10 n10Var, Context context, String str, q9.g3 g3Var) {
        ns1 ns1VarA = ns1.a(context);
        ns1 ns1VarA2 = ns1.a(g3Var);
        ns1 ns1VarA3 = ns1.a(str);
        ls1 ls1Var = n10Var.f8118j;
        ls1 ls1VarA = ls1.a(new i20(ls1Var, 23));
        ls1 ls1VarA2 = ls1.a(new wm0(n10Var.I0, 7));
        this.f11972a = ls1.a(new aa.q(ns1VarA, ns1VarA2, ns1VarA3, ls1.a(new j40(ns1VarA, n10Var.f8106c, n10Var.F, ls1VarA, ls1VarA2)), ls1VarA, ls1VarA2, n10Var.f8116h, n10Var.G, ls1Var));
    }

    public x10(f80 f80Var, cw cwVar, Context context, View view, Activity activity, String str, HashMap map, jd jdVar, by0 by0Var) {
        ns1 ns1VarA = ns1.a(by0Var);
        ns1 ns1VarB = ns1.b(str);
        ns1 ns1VarA2 = ns1.a(jdVar);
        ls1 ls1Var = (ls1) cwVar.f4348d;
        ns1 ns1Var = (ns1) f80Var.f5259b;
        ls1 ls1Var2 = (ls1) f80Var.i;
        f01 f01Var = new f01(0, ls1Var, ls1Var2, ns1VarA2, ns1Var);
        fp0 fp0Var = new fp0(ns1VarA2, ls1Var, ls1Var2, 2);
        ns1 ns1VarA3 = ns1.a(map);
        ls1 ls1Var3 = (ls1) cwVar.f4348d;
        ls1 ls1Var4 = (ls1) f80Var.i;
        c01 c01Var = new c01(ns1VarA2, ls1Var3, ns1VarA3, ls1Var4);
        f01 f01Var2 = new f01(1, ls1Var3, ls1Var4, ns1VarA2, (ns1) f80Var.f5262e);
        a01 a01Var = new a01(ns1VarA2, ls1Var3, ns1VarA, ns1VarA3, ls1Var4, 1);
        fp0 fp0Var2 = new fp0(ns1VarA2, ls1Var3, ls1Var4, 3);
        ns1 ns1VarA4 = ns1.a(context);
        ls1 ls1Var5 = (ls1) cwVar.f4348d;
        ls1 ls1Var6 = (ls1) f80Var.i;
        l90 l90Var = new l90(ns1VarA2, ls1Var5, ns1VarA, ns1VarA4, ns1VarA3, ls1Var6);
        ns1 ns1Var2 = (ns1) f80Var.f5259b;
        ns1 ns1Var3 = (ns1) f80Var.f5262e;
        n50 n50Var = new n50(ns1VarA2, ls1Var5, ns1VarA3, ns1Var2, ns1VarA, ns1Var3, ls1Var6);
        f01 f01Var3 = new f01(2, ls1Var5, ls1Var6, ns1VarA2, ns1Var2);
        j40 j40Var = new j40(ns1VarA2, ls1Var5, ns1VarA3, ns1Var2, ls1Var6);
        c01 c01Var2 = new c01(ns1VarA2, ns1VarA3, ns1Var3, ls1Var6);
        int i = rs1.f10057c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(f01Var);
        arrayList.add(fp0Var);
        arrayList.add(c01Var);
        arrayList.add(f01Var2);
        arrayList.add(a01Var);
        arrayList.add(fp0Var2);
        arrayList.add(l90Var);
        arrayList.add(n50Var);
        arrayList.add(f01Var3);
        arrayList.add(j40Var);
        arrayList.add(c01Var2);
        rs1 rs1Var = new rs1(arrayList, list);
        ns1 ns1VarB2 = ns1.b(view);
        ns1 ns1VarB3 = ns1.b(activity);
        ls1 ls1Var7 = (ls1) cwVar.f4348d;
        ls1 ls1Var8 = (ls1) f80Var.i;
        a01 a01Var2 = new a01(ns1VarA2, ls1Var7, ns1VarB2, ns1VarB3, ls1Var8, 0);
        ls1 ls1VarA = ls1.a(new ge0(ns1VarA4, 7));
        m01 m01Var = new m01(ns1VarA2, ls1Var7, ls1VarA, ns1VarB2, ls1Var8);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(f01Var);
        arrayList2.add(fp0Var);
        arrayList2.add(f01Var2);
        arrayList2.add(a01Var2);
        arrayList2.add(m01Var);
        arrayList2.add(a01Var);
        arrayList2.add(fp0Var2);
        arrayList2.add(l90Var);
        arrayList2.add(n50Var);
        arrayList2.add(f01Var3);
        arrayList2.add(j40Var);
        rs1 rs1Var2 = new rs1(arrayList2, list2);
        m01 m01Var2 = new m01(ns1VarA2, (ls1) cwVar.f4348d, ns1VarA3, ls1VarA, (ls1) f80Var.i);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(f01Var);
        arrayList3.add(fp0Var);
        arrayList3.add(f01Var2);
        arrayList3.add(a01Var2);
        arrayList3.add(m01Var);
        arrayList3.add(a01Var);
        arrayList3.add(fp0Var2);
        arrayList3.add(l90Var);
        arrayList3.add(n50Var);
        arrayList3.add(f01Var3);
        arrayList3.add(j40Var);
        arrayList3.add(m01Var2);
        this.f11972a = ls1.a(new y30((ls1) f80Var.f5266j, (ls1) f80Var.f5268l, (ls1) cwVar.f4348d, ns1VarA, ns1VarB, ns1VarA2, rs1Var, rs1Var2, new rs1(arrayList3, list3), (ls1) f80Var.i));
    }
}
