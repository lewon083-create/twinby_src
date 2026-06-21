package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r81 f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nz0 f8048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jd f8051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wz0 f8052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j21 f8053g;

    public mz0(r81 r81Var, nz0 nz0Var, wz0 wz0Var, by0 by0Var, String str, jd jdVar, rs1 rs1Var, rs1 rs1Var2, rs1 rs1Var3, j21 j21Var) {
        this.f8047a = r81Var;
        this.f8048b = nz0Var;
        this.f8050d = str;
        this.f8052f = wz0Var;
        this.f8051e = jdVar;
        this.f8053g = j21Var;
        int iOrdinal = by0Var.ordinal();
        if (iOrdinal == 0) {
            this.f8049c = rs1Var.j();
        } else if (iOrdinal == 1) {
            this.f8049c = rs1Var2.j();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f8049c = rs1Var3.j();
        }
    }

    public final ed.d a() {
        boolean z5;
        boolean z10;
        nz0 nz0Var = this.f8048b;
        synchronized (nz0Var) {
            z5 = nz0Var.f8524d;
        }
        if (!z5) {
            return vv.d(Integer.toString(7));
        }
        wz0 wz0Var = this.f8052f;
        synchronized (wz0Var) {
            z10 = wz0Var.f11947j;
        }
        if (!z10) {
            final int i = 1;
            return vv.B(new Callable(this) { // from class: com.google.android.gms.internal.ads.lz0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ mz0 f7695c;

                {
                    this.f7695c = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    switch (i) {
                        case 0:
                            mz0 mz0Var = this.f7695c;
                            try {
                                mz0Var.f8053g.a(101).a();
                                wd wdVar = (wd) mz0Var.f8051e.d();
                                String str = mz0Var.f8050d;
                                nz0 nz0Var2 = mz0Var.f8048b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((ge) nz0Var2.d(str, wdVar.b()).d()).b(), 11);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    nz0Var2.getClass();
                                    jd jdVarB0 = wd.B0();
                                    jdVarB0.h(4096);
                                    strEncodeToString = Base64.encodeToString(nz0Var2.b(((wd) jdVarB0.d()).b(), str, true), 11);
                                }
                                return strEncodeToString;
                            } finally {
                            }
                        default:
                            mz0 mz0Var2 = this.f7695c;
                            String str2 = mz0Var2.f8050d;
                            nz0 nz0Var3 = mz0Var2.f8048b;
                            nz0Var3.getClass();
                            jd jdVarB02 = wd.B0();
                            jdVarB02.h(16384);
                            return Base64.encodeToString(nz0Var3.b(((wd) jdVarB02.d()).b(), str2, true), 11);
                    }
                }
            }, this.f8047a);
        }
        Set set = this.f8049c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((gx) this.f8047a).b((k01) it.next()));
        }
        x41 x41VarV = x41.v(arrayList);
        final int i10 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.lz0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ mz0 f7695c;

            {
                this.f7695c = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                switch (i10) {
                    case 0:
                        mz0 mz0Var = this.f7695c;
                        try {
                            mz0Var.f8053g.a(101).a();
                            wd wdVar = (wd) mz0Var.f8051e.d();
                            String str = mz0Var.f8050d;
                            nz0 nz0Var2 = mz0Var.f8048b;
                            try {
                                strEncodeToString = Base64.encodeToString(((ge) nz0Var2.d(str, wdVar.b()).d()).b(), 11);
                                break;
                            } catch (IllegalArgumentException unused) {
                                nz0Var2.getClass();
                                jd jdVarB0 = wd.B0();
                                jdVarB0.h(4096);
                                strEncodeToString = Base64.encodeToString(nz0Var2.b(((wd) jdVarB0.d()).b(), str, true), 11);
                            }
                            return strEncodeToString;
                        } finally {
                        }
                    default:
                        mz0 mz0Var2 = this.f7695c;
                        String str2 = mz0Var2.f8050d;
                        nz0 nz0Var3 = mz0Var2.f8048b;
                        nz0Var3.getClass();
                        jd jdVarB02 = wd.B0();
                        jdVarB02.h(16384);
                        return Base64.encodeToString(nz0Var3.b(((wd) jdVarB02.d()).b(), str2, true), 11);
                }
            }
        };
        f81 f81Var = f81.f5272b;
        e81 e81Var = new e81(x41VarV, false, false);
        e81Var.f4874q = new d81(e81Var, callable, f81Var);
        e81Var.w();
        return e81Var;
    }
}
