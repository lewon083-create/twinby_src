package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gu1 implements ny1, vw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu1 f5906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj0 f5907b;

    public gu1(xj0 xj0Var, iu1 iu1Var) {
        this.f5907b = xj0Var;
        this.f5906a = iu1Var;
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void a(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        Pair pairC = c(hy1Var);
        if (pairC != null) {
            ((lo0) this.f5907b.f12167k).e(new eu1(this, pairC, zx1Var, ey1Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void b(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var, IOException iOException, boolean z5) {
        Pair pairC = c(hy1Var);
        if (pairC != null) {
            ((lo0) this.f5907b.f12167k).e(new cy0(this, pairC, zx1Var, ey1Var, iOException, z5));
        }
    }

    public final Pair c(hy1 hy1Var) {
        hy1 hy1VarA;
        iu1 iu1Var = this.f5906a;
        hy1 hy1Var2 = null;
        if (hy1Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = iu1Var.f6619c;
                if (i >= arrayList.size()) {
                    hy1VarA = null;
                    break;
                }
                if (((hy1) arrayList.get(i)).f6302d == hy1Var.f6302d) {
                    Object obj = hy1Var.f6299a;
                    Object obj2 = iu1Var.f6618b;
                    int i10 = qu1.f9594k;
                    hy1VarA = hy1Var.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (hy1VarA == null) {
                return null;
            }
            hy1Var2 = hy1VarA;
        }
        return Pair.create(Integer.valueOf(iu1Var.f6620d), hy1Var2);
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void f(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        Pair pairC = c(hy1Var);
        if (pairC != null) {
            ((lo0) this.f5907b.f12167k).e(new eu1(this, pairC, zx1Var, ey1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void p(int i, hy1 hy1Var, ey1 ey1Var) {
        Pair pairC = c(hy1Var);
        if (pairC != null) {
            ((lo0) this.f5907b.f12167k).e(new d1(this, pairC, ey1Var, 13));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void q(int i, hy1 hy1Var, final zx1 zx1Var, final ey1 ey1Var, final int i10) {
        final Pair pairC = c(hy1Var);
        if (pairC != null) {
            ((lo0) this.f5907b.f12167k).e(new Runnable() { // from class: com.google.android.gms.internal.ads.fu1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairC;
                    int iIntValue = ((Integer) pair.first).intValue();
                    hy1 hy1Var2 = (hy1) pair.second;
                    ((bv1) this.f5444b.f5907b.f12166j).q(iIntValue, hy1Var2, zx1Var, ey1Var, i10);
                }
            });
        }
    }
}
