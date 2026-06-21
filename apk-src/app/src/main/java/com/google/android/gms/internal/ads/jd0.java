package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements q70, z60, l60, r60, q9.a, a80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si f6827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6828c = false;

    public jd0(si siVar, gp0 gp0Var) {
        this.f6827b = siVar;
        siVar.b(2);
        if (gp0Var != null) {
            siVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void A(boolean z5) {
        this.f6827b.b(true != z5 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void B(wj wjVar) {
        si siVar = this.f6827b;
        synchronized (siVar) {
            if (siVar.f10298c) {
                try {
                    siVar.f10297b.g(wjVar);
                } catch (NullPointerException e3) {
                    p9.k.C.f31302h.d("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        siVar.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void D(wj wjVar) {
        si siVar = this.f6827b;
        synchronized (siVar) {
            if (siVar.f10298c) {
                try {
                    siVar.f10297b.g(wjVar);
                } catch (NullPointerException e3) {
                    p9.k.C.f31302h.d("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        siVar.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        int i = x1Var.f31976b;
        si siVar = this.f6827b;
        switch (i) {
            case 1:
                siVar.b(101);
                break;
            case 2:
                siVar.b(102);
                break;
            case 3:
                siVar.b(5);
                break;
            case 4:
                siVar.b(103);
                break;
            case 5:
                siVar.b(104);
                break;
            case 6:
                siVar.b(105);
                break;
            case 7:
                siVar.b(106);
                break;
            default:
                siVar.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        this.f6827b.b(3);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        this.f6827b.a(new o70(eq0Var));
    }

    @Override // q9.a
    public final synchronized void onAdClicked() {
        if (this.f6828c) {
            this.f6827b.b(8);
        } else {
            this.f6827b.b(7);
            this.f6828c = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r() {
        this.f6827b.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void x(boolean z5) {
        this.f6827b.b(true != z5 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void y(wj wjVar) {
        si siVar = this.f6827b;
        synchronized (siVar) {
            if (siVar.f10298c) {
                try {
                    siVar.f10297b.g(wjVar);
                } catch (NullPointerException e3) {
                    p9.k.C.f31302h.d("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        siVar.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void z() {
        this.f6827b.b(6);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
    }
}
