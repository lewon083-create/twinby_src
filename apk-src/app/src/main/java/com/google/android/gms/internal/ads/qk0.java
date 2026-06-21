package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 extends q9.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f9531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hq0 f9532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7 f9533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q9.y f9534f;

    public qk0(n10 n10Var, Context context, String str) {
        hq0 hq0Var = new hq0();
        this.f9532d = hq0Var;
        this.f9533e = new k7();
        this.f9531c = n10Var;
        hq0Var.f6214c = str;
        this.f9530b = context;
    }

    @Override // q9.h0
    public final void H2(wm wmVar) {
        this.f9532d.f6219h = wmVar;
    }

    @Override // q9.h0
    public final void I1(n9.a aVar) {
        hq0 hq0Var = this.f9532d;
        hq0Var.f6220j = aVar;
        if (aVar != null) {
            hq0Var.f6216e = aVar.f29174b;
        }
    }

    @Override // q9.h0
    public final void N3(sn snVar) {
        this.f9533e.f7130b = snVar;
    }

    @Override // q9.h0
    public final void O3(wp wpVar) {
        hq0 hq0Var = this.f9532d;
        hq0Var.f6224n = wpVar;
        hq0Var.f6215d = new q9.b3(false, true, false);
    }

    @Override // q9.h0
    public final void P0(bo boVar) {
        this.f9533e.f7132d = boVar;
    }

    @Override // q9.h0
    public final void R2(String str, wn wnVar, un unVar) {
        k7 k7Var = this.f9533e;
        ((h1.i) k7Var.f7135g).put(str, wnVar);
        if (unVar != null) {
            ((h1.i) k7Var.f7136h).put(str, unVar);
        }
    }

    @Override // q9.h0
    public final void U0(aq aqVar) {
        this.f9533e.f7134f = aqVar;
    }

    @Override // q9.h0
    public final void U3(q9.y0 y0Var) {
        this.f9532d.f6233w = y0Var;
    }

    @Override // q9.h0
    public final void f2(zn znVar, q9.g3 g3Var) {
        this.f9533e.f7133e = znVar;
        this.f9532d.f6213b = g3Var;
    }

    @Override // q9.h0
    public final q9.e0 i() {
        k7 k7Var = this.f9533e;
        k7Var.getClass();
        na0 na0Var = new na0(k7Var);
        ArrayList arrayList = new ArrayList();
        if (na0Var.f8253c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (na0Var.f8251a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (na0Var.f8252b != null) {
            arrayList.add(Integer.toString(2));
        }
        h1.i iVar = na0Var.f8256f;
        if (!iVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (na0Var.f8255e != null) {
            arrayList.add(Integer.toString(7));
        }
        hq0 hq0Var = this.f9532d;
        hq0Var.f6217f = arrayList;
        ArrayList arrayList2 = new ArrayList(iVar.f20340d);
        for (int i = 0; i < iVar.f20340d; i++) {
            arrayList2.add((String) iVar.f(i));
        }
        hq0Var.f6218g = arrayList2;
        if (hq0Var.f6213b == null) {
            hq0Var.f6213b = q9.g3.c();
        }
        return new rk0(this.f9530b, this.f9531c, hq0Var, na0Var, this.f9534f);
    }

    @Override // q9.h0
    public final void o2(rn rnVar) {
        this.f9533e.f7131c = rnVar;
    }

    @Override // q9.h0
    public final void u1(n9.d dVar) {
        hq0 hq0Var = this.f9532d;
        hq0Var.f6221k = dVar;
        if (dVar != null) {
            hq0Var.f6216e = dVar.f29182b;
            hq0Var.f6222l = dVar.f29183c;
        }
    }

    @Override // q9.h0
    public final void x3(q9.y yVar) {
        this.f9534f = yVar;
    }
}
