package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 {
    public static n10 P0;
    public final ls1 A;
    public final ls1 A0;
    public final ls1 B;
    public final h20 B0;
    public final a10 C;
    public final ls1 C0;
    public final ls1 D;
    public final ls1 D0;
    public final ls1 E;
    public final ls1 E0;
    public final ns1 F;
    public final ih F0;
    public final ls1 G;
    public final ls1 G0;
    public final b20 H;
    public final v30 H0;
    public final ls1 I;
    public final ls1 I0;
    public final ls1 J;
    public final ls1 J0;
    public final ls1 K;
    public final ls1 K0;
    public final ls1 L;
    public final ls1 L0;
    public final ls1 M;
    public final ls1 M0;
    public final ls1 N;
    public final ls1 N0;
    public final ls1 O;
    public final ls1 O0;
    public final ls1 P;
    public final ls1 Q;
    public final ls1 R;
    public final ls1 S;
    public final h10 T;
    public final l10 U;
    public final ls1 V;
    public final k10 W;
    public final ls1 X;
    public final ls1 Y;
    public final ls1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00 f8102a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ls1 f8103a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n10 f8104b = this;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ls1 f8105b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f8106c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final bn0 f8107c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f8108d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ls1 f8109d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ls1 f8110e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ls1 f8111e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ls1 f8112f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final dm0 f8113f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d10 f8114g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ls1 f8115g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j10 f8116h;
    public final mn0 h0;
    public final ls1 i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ls1 f8117i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ls1 f8118j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final wn0 f8119j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ls1 f8120k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ls1 f8121k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ls1 f8122l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ls1 f8123l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ls1 f8124m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ls1 f8125m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ls1 f8126n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ls1 f8127n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ls1 f8128o;
    public final ls1 o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ls1 f8129p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final vl0 f8130p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ls1 f8131q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ls1 f8132q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ls1 f8133r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final fl0 f8134r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ls1 f8135s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ls1 f8136s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ls1 f8137t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final bm0 f8138t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ls1 f8139u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ls1 f8140u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ls1 f8141v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ls1 f8142v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ls1 f8143w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final um0 f8144w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ls1 f8145x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ls1 f8146x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e10 f8147y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ls1 f8148y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ls1 f8149z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final ls1 f8150z0;

    public n10(z00 z00Var, fp fpVar) {
        this.f8102a = z00Var;
        ls1 ls1VarA = ls1.a(rs.f10053w);
        this.f8106c = ls1VarA;
        ls1 ls1VarA2 = ls1.a(new xe0(ls1.a(rs.f10054x), 11));
        this.f8108d = ls1VarA2;
        this.f8110e = ls1.a(nz.f8520z);
        int i = 5;
        ls1 ls1VarA3 = ls1.a(new jo0(i));
        this.f8112f = ls1VarA3;
        d10 d10Var = new d10(z00Var);
        this.f8114g = d10Var;
        int i10 = 1;
        qs1 qs1VarA = ss1.a(new g10(d10Var, ls1.a(new b10(z00Var, i)), i10));
        j10 j10Var = new j10(z00Var);
        this.f8116h = j10Var;
        ls1 ls1VarA4 = ls1.a(new aw(qs1VarA, new aa.d0(d10Var, j10Var, i10), d10Var, 13));
        this.i = ls1VarA4;
        int i11 = 19;
        ls1 ls1VarA5 = ls1.a(new w90(ls1VarA4, i11));
        this.f8118j = ls1VarA5;
        ls1 ls1VarA6 = ls1.a(c80.f4095z);
        this.f8120k = ls1VarA6;
        this.f8122l = ls1.a(new v00(ls1VarA6, ls1VarA5, 0));
        ls1 ls1VarA7 = ls1.a(new gf0(d10Var, j10Var, i10));
        this.f8124m = ls1VarA7;
        c10 c10Var = new c10(d10Var, 2);
        ls1 ls1VarA8 = ls1.a(rs.f10047q);
        this.f8126n = ls1VarA8;
        ls1 ls1VarA9 = ls1.a(new jw(c10Var, ls1VarA8, i11));
        this.f8128o = ls1VarA9;
        ls1 ls1VarA10 = ls1.a(new f10(ls1VarA9, 2));
        this.f8129p = ls1VarA10;
        ls1 ls1VarA11 = ls1.a(new q90(23));
        this.f8131q = ls1VarA11;
        b10 b10Var = new b10(z00Var, 2);
        ls1 ls1VarA12 = ls1.a(new ih(5));
        this.f8133r = ls1VarA12;
        ls1 ls1VarA13 = ls1.a(new v00(ls1VarA12, ls1VarA4, 9));
        ls1 ls1VarA14 = ls1.a(c80.G);
        this.f8135s = ls1VarA14;
        ls1 ls1VarA15 = ls1.a(new f10(ls1VarA14, 0));
        int i12 = rs1.f10057c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ls1VarA15);
        h60 h60Var = new h60(new rs1(list, arrayList), 17);
        ls1 ls1VarA16 = ls1.a(new v00(ls1VarA6, ls1VarA2, 1));
        ls1 ls1VarA17 = ls1.a(new ml(d10Var, j10Var, ls1VarA8, ls1VarA16));
        this.f8137t = ls1VarA17;
        ls1 ls1VarA18 = ls1.a(new aa.q(ls1VarA, d10Var, b10Var, ls1VarA9, ls1VarA2, ls1VarA13, j10Var, h60Var, ls1VarA17));
        this.f8139u = ls1VarA18;
        int i13 = 10;
        ls1 ls1VarA19 = ls1.a(new ih(i13));
        this.f8141v = ls1VarA19;
        ls1 ls1VarA20 = ls1.a(new q90(i13));
        this.f8143w = ls1VarA20;
        ls1 ls1VarA21 = ls1.a(new gf0(d10Var, j10Var, 0));
        ls1 ls1VarA22 = ls1.a(new c10(d10Var, 4));
        ls1 ls1VarA23 = ls1.a(new c10(d10Var, 3));
        ls1 ls1VarA24 = ls1.a(new v00(ls1VarA18, ls1VarA8, 10));
        ls1 ls1VarA25 = ls1.a(new aw(d10Var, b10Var, ls1VarA21, 14));
        this.f8145x = ls1VarA25;
        e10 e10Var = new e10(d10Var);
        this.f8147y = e10Var;
        ls1 ls1VarA26 = ls1.a(new ta0(ls1VarA21, ls1VarA22, ls1VarA23, d10Var, j10Var, ls1VarA24, ls1VarA25, e10Var));
        this.f8149z = ls1VarA26;
        b10 b10Var2 = new b10(z00Var, 3);
        ls1 ls1VarA27 = ls1.a(new j50(d10Var, ls1VarA17, j10Var));
        this.A = ls1VarA27;
        ls1 ls1VarA28 = ls1.a(new c10(d10Var, 5));
        ls1 ls1VarA29 = ls1.a(new ih(2));
        this.B = ls1VarA29;
        a10 a10Var = new a10(ls1VarA29);
        this.C = a10Var;
        this.D = ls1.a(new g20(d10Var, j10Var, ls1VarA9, ls1VarA10, ls1VarA11, ls1VarA18, ls1VarA19, ls1VarA20, ls1VarA26, b10Var2, ls1VarA17, c10Var, ls1VarA27, ls1VarA5, ls1.a(new ml(ls1VarA28, ls1VarA5, d10Var, a10Var, 10))));
        ls1 ls1VarA30 = ls1.a(new xe0(ls1VarA2, 12));
        g10 g10Var = new g10(d10Var, ls1VarA5);
        ls1 ls1VarA31 = ls1.a(new aw(ls1VarA2, g10Var, ls1VarA3, 1));
        ls1 ls1VarA32 = ls1.a(new n50(d10Var, j10Var, ls1VarA2, ls1VarA30, c10Var, ls1VarA3, ls1VarA31, 7));
        this.E = ls1.a(new v00(ls1.a(new ml(ls1VarA32, g10Var, d10Var, ls1VarA3)), ls1.a(new j40(ls1VarA32, (qs1) g10Var, (qs1) d10Var, (Object) ls1VarA3, ls1VarA31, 18)), 15));
        ns1 ns1VarA = ns1.a(this);
        this.F = ns1VarA;
        ls1 ls1VarA33 = ls1.a(new v00(ls1.a(new b10(z00Var, 4)), ls1.a(new b10(z00Var, 0)), 2));
        this.G = ls1VarA33;
        b20 b20Var = new b20(fpVar);
        this.H = b20Var;
        ls1 ls1VarA34 = ls1.a(new c10(d10Var, 6));
        this.I = ls1VarA34;
        ls1 ls1VarA35 = ls1.a(c80.K);
        ls1 ls1VarA36 = ls1.a(new xe0(ls1VarA34, 13));
        this.J = ls1VarA36;
        int i14 = 2;
        ls1 ls1VarA37 = ls1.a(new l90(d10Var, ls1VarA35, qs1VarA, ls1VarA36, ls1VarA17, ls1VarA16));
        this.K = ls1VarA37;
        ls1 ls1VarA38 = ls1.a(new ml(d10Var, ls1VarA34, qs1VarA, ls1VarA5));
        this.L = ls1VarA38;
        ls1 ls1VarA39 = ls1.a(new xe0(ls1VarA33, 9));
        this.M = ls1VarA39;
        ls1 ls1VarA40 = ls1.a(new f10(ls1.a(new aa.q(d10Var, ls1VarA, ls1VarA33, j10Var, b20Var, ls1VarA34, ls1VarA37, ls1VarA5, ls1VarA38, ls1VarA39)), 3));
        this.N = ls1VarA40;
        ls1 ls1VarA41 = ls1.a(new aa.d0(d10Var, ls1VarA4, i14));
        ls1 ls1VarA42 = ls1.a(new aa.d0(d10Var, j10Var, 0));
        this.O = ls1.a(new aa.m(ns1VarA, d10Var, ls1VarA33, ls1VarA40, ls1VarA2, ls1VarA4, ls1VarA37, j10Var, new ml(ls1VarA2, ls1VarA41, ls1VarA42, ls1VarA4, 0), ls1VarA39, ls1VarA41, ls1VarA42));
        int i15 = 1;
        this.P = ls1.a(new aa.s(ls1VarA4, i15));
        this.Q = ls1.a(pn1.f9130x);
        this.R = ls1.a(new aa.b0(d10Var, i15));
        int i16 = 7;
        int i17 = 16;
        this.S = ls1.a(new p20(i17, new v00(ls1.a(new p20(22, new b10(z00Var, i15))), ls1.a(new w90(ls1VarA5, i16)), i17)));
        this.T = new h10(ns1VarA);
        this.U = new l10(d10Var, ls1VarA17);
        this.V = ls1.a(pn1.f9121o);
        this.W = new k10(ls1VarA29);
        int i18 = 20;
        this.X = ls1.a(new w90(ls1VarA3, i18));
        int i19 = 0;
        ls1 ls1VarA43 = ls1.a(new c10(d10Var, i19));
        this.Y = ls1VarA43;
        ls1 ls1VarA44 = ls1.a(new g10(d10Var, ls1VarA43, i19));
        this.Z = ls1VarA44;
        this.f8103a0 = ls1.a(new aw(new g10(d10Var, ls1VarA7, i14), ls1VarA3, ls1VarA5, 19));
        this.f8105b0 = ls1.a(pn1.f9129w);
        bn0 bn0Var = new bn0(ls1VarA43, ls1VarA44, d10Var);
        this.f8107c0 = bn0Var;
        this.f8109d0 = ls1.a(new aw(bn0Var, ls1VarA3, ls1VarA5, 25));
        this.f8111e0 = ls1.a(rs.f10051u);
        dm0 dm0Var = new dm0(d10Var);
        this.f8113f0 = dm0Var;
        this.f8115g0 = ls1.a(new aw(dm0Var, ls1VarA3, ls1VarA5, 23));
        mn0 mn0Var = new mn0(d10Var, j10Var, e10Var);
        this.h0 = mn0Var;
        this.f8117i0 = ls1.a(new aw(mn0Var, ls1VarA3, ls1VarA5, 26));
        wn0 wn0Var = new wn0(d10Var);
        this.f8119j0 = wn0Var;
        this.f8121k0 = ls1.a(new aw(wn0Var, ls1VarA3, ls1VarA5, 27));
        this.f8123l0 = ls1.a(new aw(new c10(d10Var, i16), ls1VarA3, ls1VarA5, 17));
        this.f8125m0 = ls1.a(new v00(ls1VarA3, ls1VarA5, 12));
        this.f8127n0 = ls1.a(nz.f8514t);
        this.o0 = ls1.a(new v00(ls1VarA3, ls1VarA5, 13));
        vl0 vl0Var = new vl0(ls1VarA29);
        this.f8130p0 = vl0Var;
        this.f8132q0 = ls1.a(new aw(vl0Var, ls1VarA3, ls1VarA5, 21));
        fl0 fl0Var = new fl0(d10Var);
        this.f8134r0 = fl0Var;
        this.f8136s0 = ls1.a(new aw(fl0Var, ls1VarA3, ls1VarA5, i18));
        bm0 bm0Var = new bm0(j10Var);
        this.f8138t0 = bm0Var;
        this.f8140u0 = ls1.a(new aw(bm0Var, ls1VarA3, ls1VarA5, 22));
        ls1 ls1VarA45 = ls1.a(new ih(4));
        this.f8142v0 = ls1VarA45;
        um0 um0Var = new um0(d10Var, ls1VarA45);
        this.f8144w0 = um0Var;
        this.f8146x0 = ls1.a(new aw(um0Var, ls1VarA3, ls1VarA5, 24));
        this.f8148y0 = ls1.a(nz.f8509o);
        ls1 ls1VarA46 = ls1.a(new b10(z00Var, 6));
        this.f8150z0 = ls1VarA46;
        int i20 = 8;
        this.A0 = ls1.a(new aw(new c10(d10Var, i20), ls1VarA3, ls1VarA5, 18));
        this.B0 = new h20(d10Var);
        this.C0 = ls1.a(rs.f10052v);
        this.D0 = ls1.a(pn1.f9132z);
        this.E0 = ls1.a(new f10(ls1VarA9, 1));
        this.F0 = new ih(i20);
        this.G0 = ls1.a(new j50(d10Var, j10Var, ls1VarA17));
        this.H0 = new v30(ls1VarA2, ls1VarA3, ls1VarA5);
        this.I0 = ls1.a(c80.J);
        this.J0 = ls1.a(pn1.f9131y);
        this.K0 = ls1.a(new c10(d10Var, 1));
        this.L0 = ls1.a(new w90(ls1VarA5, 3));
        this.M0 = ls1.a(rs.f10041k);
        this.N0 = ls1.a(new aa.z(d10Var, ls1VarA46, ls1VarA44, ls1.a(new aa.b0(d10Var, 0)), ls1VarA2));
        this.O0 = ls1.a(new c10(d10Var, 9));
    }

    public static n10 a(Context context, ir irVar, int i) {
        r81 r81Var;
        SharedPreferences sharedPreferences;
        synchronized (n10.class) {
            try {
                n10 n10Var = P0;
                if (n10Var != null) {
                    return n10Var;
                }
                p9.k kVar = p9.k.C;
                kVar.f31304k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                al.a(context);
                if (((Boolean) ul.f10971e.r()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", pn1.C(context, "init_without_write") + 1).commit();
                }
                oq0 oq0VarL = oq0.l(context);
                boolean zG = t9.g0.g((Context) oq0VarL.f8762c);
                u9.a aVar = new u9.a(ModuleDescriptor.MODULE_VERSION, i, 0, true, zG);
                if (((Boolean) cm.f4255c.r()).booleanValue()) {
                    q9.d1 d1Var = (q9.d1) oq0VarL.f8763d;
                    q9.n2 liteSdkVersion = null;
                    if (d1Var != null) {
                        try {
                            liteSdkVersion = d1Var.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        aVar = new u9.a(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.f31944c, 0, true, zG);
                    }
                }
                oq0VarL.t(irVar);
                z00 z00Var = new z00();
                z00Var.f12808a = aVar;
                z00Var.f12811d = new WeakReference(context);
                z00Var.f12809b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                z00Var.f12810c = jCurrentTimeMillis;
                z00 z00Var2 = new z00();
                z00Var2.f12808a = z00Var.f12808a;
                z00Var2.f12809b = z00Var.f12809b;
                z00Var2.f12811d = z00Var.f12811d;
                z00Var2.f12810c = z00Var.f12810c;
                n10 n10Var2 = new n10(z00Var2, new fp(24));
                wk wkVar = al.Ye;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    ex exVar = kVar.f31299e;
                    gx gxVar = hx.f6279a;
                    gr.G(gxVar);
                    exVar.a(gxVar, (sd0) n10Var2.f8118j.j(), context);
                    ex exVar2 = kVar.f31299e;
                    if (exVar2.f5125d.get() && exVar2.f5127f >= 0 && exVar2.f5128g >= 0 && exVar2.f5126e.compareAndSet(false, true) && (r81Var = exVar2.f5122a) != null) {
                        ((gx) r81Var).a(new s(18, exVar2));
                    }
                }
                ((tf0) n10Var2.f8124m.j()).a();
                ((u00) n10Var2.f8122l.j()).a(context, aVar);
                kVar.f31302h.b(context, aVar, (sd0) n10Var2.f8118j.j());
                kVar.f31303j.c(context);
                kVar.f31297c.D(context);
                kVar.f31297c.E(context);
                com.google.android.gms.internal.measurement.h5.I(context);
                kVar.f31301g.o(context);
                kVar.f31319z.d(context);
                if (((Boolean) sVar.f31970c.a(al.vf)).booleanValue()) {
                    String str = (String) sVar.f31970c.a(al.f3262wf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(StringUtils.COMMA)).contains(context.getPackageName())) {
                            ((cd0) n10Var2.S.j()).a(kVar.f31301g);
                        }
                    }
                } else if (((Boolean) sVar.f31970c.a(al.f3233uf)).booleanValue()) {
                    ((cd0) n10Var2.S.j()).a(kVar.f31301g);
                }
                ((t9.a0) n10Var2.R.j()).a();
                cw.o(context);
                if (((Boolean) sVar.f31970c.a(al.W6)).booleanValue()) {
                    if (!((Boolean) sVar.f31970c.a(al.V0)).booleanValue()) {
                        si siVar = new si(new com.google.android.gms.internal.measurement.i4(context, 6));
                        ut utVar = new ut(16, new ch0(context), (r81) n10Var2.f8110e.j());
                        try {
                            utVar.e(new ac.c(new oq0(context, aVar, siVar, utVar), kVar.f31302h.g().t()));
                        } catch (Exception e3) {
                            u9.i.e("Error in offline signals database startup: ".concat(String.valueOf(e3.getMessage())));
                        }
                    }
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.of)).booleanValue()) {
                    Context context2 = n10Var2.f8102a.f12809b;
                    gr.G(context2);
                    gx gxVar2 = hx.f6279a;
                    gr.G(gxVar2);
                    gxVar2.execute(new h30(15, new oq0(n10Var2, context2, gxVar2)));
                }
                P0 = n10Var2;
                return n10Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f8106c.j();
    }

    public final bs0 c() {
        return (bs0) this.f8137t.j();
    }
}
