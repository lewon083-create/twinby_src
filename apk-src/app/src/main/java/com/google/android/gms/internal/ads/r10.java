package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 extends gr {
    public final wm0 A;
    public final ls1 B;
    public final ls1 C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cw f9654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oq0 f9655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n10 f9656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s10 f9657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ls1 f9658h;
    public final ls1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ls1 f9659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ls1 f9660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ls1 f9661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ls1 f9662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ls1 f9663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ls1 f9664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ls1 f9665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ls1 f9666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ls1 f9667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ls1 f9668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ls1 f9669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ls1 f9670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ls1 f9671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ls1 f9672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ls1 f9673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ls1 f9674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ls1 f9675z;

    public r10(n10 n10Var, s10 s10Var, oq0 oq0Var, cw cwVar) {
        super(1);
        this.f9656f = n10Var;
        this.f9657g = s10Var;
        this.f9654d = cwVar;
        this.f9655e = oq0Var;
        y40 y40Var = new y40(oq0Var, 0);
        ls1 ls1Var = s10Var.f10138j;
        ih ihVar = n10Var.F0;
        ls1 ls1VarA = ls1.a(new z20(ls1Var, y40Var, 1));
        ls1 ls1VarA2 = ls1.a(new k50(ls1VarA, 7));
        ls1 ls1VarA3 = ls1.a(new i20(n10Var.G0, 9));
        ls1 ls1VarA4 = ls1.a(new r30(y40Var, 0));
        j10 j10Var = n10Var.f8116h;
        ih ihVar2 = rs.f10044n;
        ls1 ls1VarA5 = ls1.a(new aw(j10Var, ls1VarA4, ihVar2, 2));
        d10 d10Var = n10Var.f8114g;
        int i = 3;
        ls1 ls1VarA6 = ls1.a(new o30(ls1VarA3, ls1.a(new k30(d10Var, ls1VarA5, 0)), n10Var.f8106c, ls1.a(new v00(ls1VarA5, ls1VarA3, i)), n10Var.f8112f));
        this.f9658h = ls1VarA6;
        ls1 ls1VarA7 = ls1.a(new v00(ls1VarA6, ls1VarA4, 5));
        b40 b40Var = new b40(cwVar, i);
        p20 p20Var = new p20(15, new p20(14, b40Var));
        int i10 = rs1.f10057c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(s10Var.f10148t);
        arrayList2.add(s10Var.f10149u);
        arrayList.add(ls1VarA2);
        arrayList2.add(ls1VarA7);
        arrayList.add(p20Var);
        ls1 ls1VarA8 = ls1.a(new h60(new rs1(arrayList, arrayList2), 3));
        this.i = ls1VarA8;
        ls1 ls1VarA9 = ls1.a(c80.B);
        this.f9659j = ls1VarA9;
        ls1 ls1Var2 = n10Var.f8106c;
        ls1 ls1VarA10 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 4));
        y40 y40Var2 = new y40(oq0Var, 3);
        y40 y40Var3 = new y40(oq0Var, 2);
        d10 d10Var2 = n10Var.f8114g;
        ls1 ls1VarA11 = ls1.a(new i20(d10Var2, 20));
        ls1 ls1VarA12 = ls1.a(pn1.f9125s);
        ls1 ls1VarA13 = ls1.a(new x20(d10Var2, n10Var.C, ls1VarA11, ls1VarA12, n10Var.D0, n10Var.f8108d));
        ls1 ls1VarA14 = ls1.a(new l90(n10Var.K, n10Var.J, y40Var, y40Var3, ls1VarA13, s10Var.f10140l));
        b40 b40Var2 = new b40(cwVar, 0);
        ls1 ls1VarA15 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(s10Var.f10154z);
        arrayList3.add(ls1VarA15);
        ls1 ls1VarA16 = ls1.a(new aw(new rs1(arrayList3, arrayList4), y40Var, y40Var2, 6));
        ls1 ls1VarA17 = ls1.a(new p20(8, y40Var2));
        this.f9660k = ls1VarA17;
        ls1 ls1VarA18 = ls1.a(new f30(n10Var.f8114g, n10Var.f8106c, n10Var.f8108d, y40Var2, y40Var, s10Var.f10143o, ls1VarA14, b40Var2, b40Var, n10Var.G, s10Var.f10144p, s10Var.f10140l, s10Var.f10153y, ls1VarA16, ls1VarA17, s10Var.f10139k));
        this.f9661l = ls1VarA18;
        f10 f10Var = new f10(ls1VarA18, 24);
        k50 k50Var = new k50(ls1.a(new z20(y40Var, n10Var.W, 0)), 11);
        ArrayList arrayList5 = new ArrayList(4);
        ArrayList arrayList6 = new ArrayList(2);
        arrayList5.add(s10Var.f10150v);
        arrayList6.add(s10Var.f10151w);
        arrayList6.add(s10Var.f10152x);
        arrayList5.add(ls1VarA10);
        arrayList5.add(f10Var);
        arrayList5.add(k50Var);
        ls1 ls1VarA19 = ls1.a(new h60(new rs1(arrayList5, arrayList6), 4));
        this.f9662m = ls1VarA19;
        ls1 ls1VarA20 = ls1.a(new n50(n10Var.f8114g, n10Var.C0, n10Var.f8118j, y40Var2, y40Var, n10Var.I, ihVar2));
        ls1 ls1VarA21 = ls1.a(new k50(ls1VarA20, 5));
        ls1 ls1VarA22 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 3));
        ls1 ls1Var3 = n10Var.f8148y0;
        d60 d60Var = s10Var.f10133f;
        ls1 ls1VarA23 = ls1.a(new k50(ls1.a(new d40(ls1Var3, d60Var, 1)), 3));
        f10 f10Var2 = new f10(ls1VarA18, 23);
        ArrayList arrayList7 = new ArrayList(5);
        ArrayList arrayList8 = new ArrayList(3);
        arrayList7.add(s10Var.A);
        arrayList7.add(s10Var.B);
        arrayList8.add(s10Var.C);
        arrayList8.add(s10Var.D);
        arrayList7.add(ls1VarA21);
        arrayList7.add(ls1VarA22);
        arrayList8.add(ls1VarA23);
        arrayList7.add(f10Var2);
        ls1 ls1VarA24 = ls1.a(new h60(new rs1(arrayList7, arrayList8), 0));
        this.f9663n = ls1VarA24;
        d10 d10Var3 = n10Var.f8114g;
        j10 j10Var2 = n10Var.f8116h;
        ls1 ls1Var4 = n10Var.f8118j;
        ls1 ls1VarA25 = ls1.a(new j40(d10Var3, j10Var2, y40Var, b40Var, ls1Var4));
        this.f9664o = ls1VarA25;
        ls1 ls1VarA26 = ls1.a(new j40(d10Var3, (ms1) b40Var, y40Var, j10Var2, ls1VarA25, 0));
        this.f9665p = ls1VarA26;
        f10 f10Var3 = new f10(ls1VarA26, 7);
        p20 p20Var2 = new p20(3, new aw(b40Var, ls1Var4, y40Var, 3));
        int i11 = 6;
        ls1 ls1VarA27 = ls1.a(new k50(ls1VarA20, i11));
        ls1 ls1VarA28 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, i11));
        f10 f10Var4 = new f10(ls1VarA16, 12);
        f10 f10Var5 = new f10(ls1VarA18, 26);
        ls1 ls1VarA29 = ls1.a(new v00(ls1VarA6, ls1VarA4, 4));
        ArrayList arrayList9 = new ArrayList(8);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(s10Var.E);
        arrayList9.add(s10Var.F);
        arrayList10.add(s10Var.G);
        arrayList10.add(s10Var.H);
        arrayList9.add(f10Var3);
        arrayList9.add(p20Var2);
        arrayList9.add(ls1VarA27);
        arrayList9.add(ls1VarA28);
        arrayList9.add(f10Var4);
        arrayList9.add(f10Var5);
        arrayList10.add(ls1VarA29);
        ls1 ls1VarA30 = ls1.a(new h60(new rs1(arrayList9, arrayList10), 2));
        this.f9666q = ls1VarA30;
        f10 f10Var6 = new f10(ls1VarA18, 29);
        ArrayList arrayList11 = new ArrayList(1);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add(s10Var.I);
        arrayList11.add(f10Var6);
        ls1 ls1VarA31 = ls1.a(new h60(new rs1(arrayList11, arrayList12), 19));
        this.f9667r = ls1VarA31;
        f10 f10Var7 = new f10(ls1.a(new z20(y40Var, n10Var.K, 2)), 22);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(s10Var.J);
        arrayList13.add(f10Var7);
        ls1 ls1VarA32 = ls1.a(new h60(new rs1(arrayList13, arrayList14), 21));
        this.f9668s = ls1VarA32;
        ls1 ls1VarA33 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 10));
        ArrayList arrayList15 = new ArrayList(1);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add(s10Var.K);
        arrayList15.add(ls1VarA33);
        ls1 ls1VarA34 = ls1.a(new h60(new rs1(arrayList15, arrayList16), 20));
        this.f9669t = ls1VarA34;
        ls1 ls1VarA35 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 7));
        f10 f10Var8 = new f10(ls1VarA16, 13);
        ArrayList arrayList17 = new ArrayList(2);
        ArrayList arrayList18 = new ArrayList(1);
        arrayList18.add(s10Var.R);
        arrayList17.add(ls1VarA35);
        arrayList17.add(f10Var8);
        ls1 ls1VarA36 = ls1.a(new h60(new rs1(arrayList17, arrayList18), 8));
        ls1 ls1VarA37 = ls1.a(new k50(ls1VarA20, 2));
        f10 f10Var9 = new f10(ls1VarA18, 28);
        ArrayList arrayList19 = new ArrayList(2);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(s10Var.S);
        arrayList19.add(ls1VarA37);
        arrayList19.add(f10Var9);
        ls1 ls1VarA38 = ls1.a(new ml(y40Var, ls1VarA30, ls1VarA36, ls1.a(new h60(new rs1(arrayList19, arrayList20), 10))));
        this.f9670u = ls1VarA38;
        int i12 = 8;
        ls1 ls1VarA39 = ls1.a(new k50(ls1VarA, i12));
        this.f9671v = ls1VarA39;
        k50 k50Var2 = new k50(ls1.a(new f10(ls1VarA19, 11)), 1);
        ls1 ls1VarA40 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, i12));
        ArrayList arrayList21 = new ArrayList(2);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(s10Var.U);
        arrayList21.add(k50Var2);
        arrayList21.add(ls1VarA40);
        ls1 ls1VarA41 = ls1.a(new h60(new rs1(arrayList21, arrayList22), 9));
        this.f9672w = ls1VarA41;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add(s10Var.V);
        this.f9673x = ls1.a(new h60(new rs1(list, arrayList23), 24));
        f10 f10Var10 = new f10(ls1VarA38, 5);
        ls1 ls1VarA42 = ls1.a(new k50(ls1VarA20, 4));
        ArrayList arrayList24 = new ArrayList(1);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList25.add(f10Var10);
        arrayList24.add(ls1VarA42);
        this.f9674y = ls1.a(new h60(new rs1(arrayList24, arrayList25), 13));
        ls1 ls1VarA43 = ls1.a(new k30(ls1VarA9, (qs1) ls1Var2, 5));
        f10 f10Var11 = new f10(ls1VarA18, 25);
        ArrayList arrayList26 = new ArrayList(2);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add(s10Var.W);
        arrayList26.add(ls1VarA43);
        arrayList26.add(f10Var11);
        h60 h60Var = new h60(new rs1(arrayList26, arrayList27), 1);
        ls1 ls1VarA44 = ls1.a(new k50(ls1VarA20, 0));
        ArrayList arrayList28 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList28.add(ls1VarA44);
        this.f9675z = ls1.a(new aw(h60Var, new rs1(arrayList28, list2), n10Var.f8108d, 5));
        f10 f10Var12 = new f10(cwVar, ls1VarA38, 6);
        f10 f10Var13 = new f10(cwVar, ls1VarA26, 8);
        c40 c40Var = new c40(cwVar, s10Var.f10138j, n10Var.f8116h, y40Var, s10Var.f10133f);
        f10 f10Var14 = new f10(ls1VarA18, 27);
        ArrayList arrayList29 = new ArrayList(9);
        ArrayList arrayList30 = new ArrayList(5);
        arrayList29.add(s10Var.L);
        arrayList30.add(s10Var.M);
        arrayList29.add(s10Var.N);
        arrayList29.add(s10Var.O);
        arrayList30.add(s10Var.Y);
        arrayList30.add(s10Var.Z);
        arrayList30.add(s10Var.f10124a0);
        arrayList29.add(s10Var.P);
        arrayList29.add(s10Var.Q);
        arrayList30.add(f10Var12);
        arrayList29.add(f10Var13);
        arrayList29.add(c40Var);
        arrayList29.add(ls1VarA39);
        arrayList29.add(f10Var14);
        int i13 = 2;
        jw jwVar = new jw(cwVar, new rs1(arrayList29, arrayList30), i13);
        j40 j40Var = new j40(y40Var, new y40(oq0Var, 1), s10Var.f10142n, y40Var3, s10Var.f10135g);
        ArrayList arrayList31 = new ArrayList(1);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add(s10Var.f10128c0);
        arrayList31.add(s10Var.f10130d0);
        c50 c50Var = new c50(y40Var2, y40Var, ls1VarA8, jwVar, s10Var.f10126b0, j40Var, ls1VarA9, new h60(new rs1(arrayList31, arrayList32), 6), ls1VarA31, ls1VarA17, n10Var.f8127n0);
        b40 b40Var3 = new b40(cwVar, 1);
        b40 b40Var4 = new b40(cwVar, i13);
        wm0 wm0Var = new wm0();
        this.A = wm0Var;
        ls1 ls1Var5 = s10Var.f10138j;
        wm0.a(wm0Var, new j40((qs1) ls1Var5, (qs1) s10Var.X, (ms1) s10Var.f10133f, (qs1) new p20(2, new y30(c50Var, ls1Var5, b40Var3, b40Var2, b40Var, b40Var4, s10Var.f10132e0, ls1VarA32, wm0Var, n10Var.f8106c)), (qs1) n10Var.f8118j, 15));
        f10 f10Var15 = new f10(ls1VarA38, 9);
        f10 f10Var16 = new f10(ls1.a(new p20(6, new d40(d10Var, d60Var, 0))), 10);
        int i14 = 7;
        p20 p20Var3 = new p20(4, new jw(b40Var, ls1Var2, i14));
        ls1 ls1VarA45 = ls1.a(new v00(ls1VarA6, ls1VarA4, 6));
        ArrayList arrayList33 = new ArrayList(1);
        ArrayList arrayList34 = new ArrayList(4);
        arrayList34.add(s10Var.f10136g0);
        arrayList34.add(f10Var15);
        arrayList33.add(f10Var16);
        arrayList34.add(p20Var3);
        arrayList34.add(ls1VarA45);
        rs1 rs1Var = new rs1(arrayList33, arrayList34);
        ls1 ls1Var6 = s10Var.f10138j;
        ls1 ls1VarA46 = ls1.a(new aw(ls1Var6, rs1Var, y40Var, i14));
        this.B = ls1VarA46;
        ls1 ls1VarA47 = ls1.a(new aw(ls1Var6, j10Var, y40Var, 4));
        ls1 ls1VarA48 = ls1.a(new k30((qs1) ls1Var6, ls1VarA47, 2));
        i20 i20Var = new i20(s10Var.f10145q, 10);
        ArrayList arrayList35 = new ArrayList(1);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add(s10Var.h0);
        arrayList35.add(i20Var);
        ls1 ls1VarA49 = ls1.a(new h60(new rs1(arrayList35, arrayList36), 12));
        ls1 ls1Var7 = n10Var.f8112f;
        ls1 ls1Var8 = n10Var.f8118j;
        this.C = ls1.a(new zc0(ls1VarA24, ls1VarA19, s10Var.f10134f0, ls1VarA41, s10Var.T, n10Var.f8106c, ls1VarA46, ls1VarA6, ls1VarA48, ls1VarA47, n10Var.G, ls1VarA49, n10Var.I, n10Var.K, ls1Var8, ls1VarA34, ls1VarA13, ls1VarA12, n10Var.f8127n0, ls1.a(new j40(y40Var2, y40Var, ls1Var7, ls1Var8, n10Var.f8108d)), ls1VarA17));
    }

    public final y60 h0() {
        c51 c51VarV = d51.v(14);
        s10 s10Var = this.f9657g;
        c51VarV.f((s80) s10Var.L.j());
        c51VarV.g((Iterable) s10Var.M.j());
        c51VarV.f((s80) s10Var.N.j());
        c51VarV.f((s80) s10Var.O.j());
        ae0 ae0Var = (ae0) s10Var.f10137h.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        Set setN = l80.n(ae0Var, gxVar);
        gr.G(setN);
        c51VarV.g(setN);
        c51VarV.g(s10Var.f10123a.f5689f);
        Set set = Collections.EMPTY_SET;
        gr.G(set);
        c51VarV.g(set);
        c51VarV.f((s80) s10Var.P.j());
        c51VarV.f((s80) s10Var.Q.j());
        k40 k40Var = (k40) this.f9670u.j();
        gx gxVar2 = hx.f6285g;
        Set setSingleton = Collections.singleton(new s80(k40Var, gxVar2));
        gr.G(setSingleton);
        c51VarV.g(setSingleton);
        c51VarV.f(new s80((i40) this.f9665p.j(), hx.f6284f));
        Context context = (Context) s10Var.f10138j.j();
        a60 a60Var = s10Var.f10125b;
        u9.a aVar = this.f9656f.f8102a.f12808a;
        gr.G(aVar);
        xp0 xp0Var = (xp0) this.f9655e.f8763d;
        gr.G(xp0Var);
        iq0 iq0Var = a60Var.f2787b;
        gr.G(iq0Var);
        c51VarV.f(new s80(new a40(context, aVar, xp0Var, iq0Var, 0), gxVar2));
        c51VarV.f((s80) this.f9671v.j());
        c51VarV.f(new s80((e30) this.f9661l.j(), gxVar));
        return this.f9654d.v(c51VarV.h());
    }

    public final x30 i0() {
        oq0 oq0Var = this.f9655e;
        eq0 eq0Var = (eq0) oq0Var.f8762c;
        gr.G(eq0Var);
        xp0 xp0Var = (xp0) oq0Var.f8763d;
        gr.G(xp0Var);
        u60 u60Var = (u60) this.i.j();
        y60 y60VarH0 = h0();
        s10 s10Var = this.f9657g;
        mo0 mo0Var = s10Var.f10123a.f5697o;
        e60 e60Var = new e60(xp0Var, (String) oq0Var.f8764e, (ei0) s10Var.f10142n.j(), oq0Var.s(), (String) s10Var.f10135g.j());
        s70 s70Var = (s70) this.f9659j.j();
        g80 g80Var = s10Var.f10123a;
        c51 c51VarV = d51.v(2);
        c51VarV.g(g80Var.f5690g);
        we0 we0Var = (we0) s10Var.i.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        c51VarV.f(new s80(we0Var, gxVar));
        a70 a70Var = new a70(c51VarV.h());
        q80 q80Var = (q80) this.f9667r.j();
        r50 r50Var = (r50) this.f9660k.j();
        n10 n10Var = this.f9656f;
        sa saVar = new sa(eq0Var, xp0Var, u60Var, y60VarH0, mo0Var, e60Var, s70Var, a70Var, q80Var, r50Var, (de0) n10Var.f8127n0.j());
        Context context = (Context) s10Var.f10138j.j();
        cw cwVar = this.f9654d;
        yp0 yp0Var = (yp0) cwVar.f4349e;
        gr.G(yp0Var);
        View view = (View) cwVar.f4348d;
        gr.G(view);
        sz szVar = (sz) cwVar.f4350f;
        q40 q40Var = (q40) cwVar.f4347c;
        na0 na0Var = (na0) s10Var.f10127c.f8248c;
        gr.G(na0Var);
        return new x30(saVar, context, yp0Var, view, szVar, q40Var, na0Var, (w80) this.f9668s.j(), ls1.b(this.A), (Executor) n10Var.f8106c.j());
    }
}
