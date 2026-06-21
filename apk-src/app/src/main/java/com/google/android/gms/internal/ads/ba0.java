package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa0 f3692c;

    public /* synthetic */ ba0(fa0 fa0Var, int i) {
        this.f3691b = i;
        this.f3692c = fa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3691b) {
            case 0:
                fa0 fa0Var = this.f3692c;
                fa0Var.f5281n.P();
                ja0 ja0Var = fa0Var.f5280m;
                synchronized (ja0Var) {
                    try {
                        sz szVar = ja0Var.i;
                        if (szVar != null) {
                            szVar.destroy();
                            ja0Var.i = null;
                        }
                        sz szVar2 = ja0Var.f6774j;
                        if (szVar2 != null) {
                            szVar2.destroy();
                            ja0Var.f6774j = null;
                        }
                        sz szVar3 = ja0Var.f6775k;
                        if (szVar3 != null) {
                            szVar3.destroy();
                            ja0Var.f6775k = null;
                        }
                        ed.d dVar = ja0Var.f6777m;
                        if (dVar != null) {
                            dVar.cancel(false);
                            ja0Var.f6777m = null;
                        }
                        jx jxVar = ja0Var.f6778n;
                        if (jxVar != null) {
                            jxVar.cancel(false);
                            ja0Var.f6778n = null;
                        }
                        ja0Var.f6776l = null;
                        ja0Var.f6786v.clear();
                        ja0Var.f6787w.clear();
                        ja0Var.f6767b = null;
                        ja0Var.f6768c = null;
                        ja0Var.f6769d = null;
                        ja0Var.f6770e = null;
                        ja0Var.f6773h = null;
                        ja0Var.f6779o = null;
                        ja0Var.f6780p = null;
                        ja0Var.f6781q = null;
                        ja0Var.f6783s = null;
                        ja0Var.f6784t = null;
                        ja0Var.f6785u = null;
                    } finally {
                    }
                }
                return;
            default:
                fa0 fa0Var2 = this.f3692c;
                na0 na0Var = fa0Var2.f5284q;
                try {
                    ja0 ja0Var2 = fa0Var2.f5280m;
                    int iQ = ja0Var2.q();
                    if (iQ == 1) {
                        sn snVar = na0Var.f8251a;
                        if (snVar != null) {
                            fa0Var2.l();
                            on onVar = (on) fa0Var2.f5285r.j();
                            Parcel parcelD0 = snVar.D0();
                            vg.e(parcelD0, onVar);
                            snVar.L1(parcelD0, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 2) {
                        rn rnVar = na0Var.f8252b;
                        if (rnVar != null) {
                            fa0Var2.l();
                            nn nnVar = (nn) fa0Var2.f5286s.j();
                            Parcel parcelD02 = rnVar.D0();
                            vg.e(parcelD02, nnVar);
                            rnVar.L1(parcelD02, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 3) {
                        String strG = ja0Var2.g();
                        wn wnVar = strG == null ? null : (wn) na0Var.f8256f.get(strG);
                        if (wnVar != null) {
                            if (ja0Var2.h() != null) {
                                fa0Var2.e("Google", true);
                            }
                            wnVar.Y3((qn) fa0Var2.f5289v.j());
                            return;
                        }
                        return;
                    }
                    if (iQ == 6) {
                        bo boVar = na0Var.f8253c;
                        if (boVar != null) {
                            fa0Var2.l();
                            boVar.N1((fo) fa0Var2.f5287t.j());
                            return;
                        }
                        return;
                    }
                    if (iQ != 7) {
                        u9.i.e("Wrong native template id!");
                        return;
                    }
                    aq aqVar = na0Var.f8255e;
                    if (aqVar != null) {
                        xp xpVar = (xp) fa0Var2.f5288u.j();
                        Parcel parcelD03 = aqVar.D0();
                        vg.e(parcelD03, xpVar);
                        aqVar.L1(parcelD03, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e3) {
                    u9.i.f("RemoteException when notifyAdLoad is called", e3);
                    return;
                }
        }
    }
}
