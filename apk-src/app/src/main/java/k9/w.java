package k9;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xt;
import q9.g2;
import q9.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f27296c;

    public /* synthetic */ w(l lVar, int i) {
        this.f27295b = i;
        this.f27296c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27295b) {
            case 0:
                l lVar = this.f27296c;
                try {
                    g2 g2Var = lVar.f27273b;
                    g2Var.getClass();
                    try {
                        l0 l0Var = g2Var.i;
                        if (l0Var != null) {
                            l0Var.c();
                        }
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                        return;
                    }
                } catch (IllegalStateException e7) {
                    xt.a(lVar.getContext()).c("BaseAdView.pause", e7);
                    return;
                }
                xt.a(lVar.getContext()).c("BaseAdView.pause", e7);
                break;
            case 1:
                l lVar2 = this.f27296c;
                try {
                    g2 g2Var2 = lVar2.f27273b;
                    g2Var2.getClass();
                    try {
                        l0 l0Var2 = g2Var2.i;
                        if (l0Var2 != null) {
                            l0Var2.k();
                        }
                    } catch (RemoteException e10) {
                        u9.i.k("#007 Could not call remote method.", e10);
                    }
                } catch (IllegalStateException e11) {
                    xt.a(lVar2.getContext()).c("BaseAdView.resume", e11);
                    return;
                }
                break;
            default:
                l lVar3 = this.f27296c;
                try {
                    g2 g2Var3 = lVar3.f27273b;
                    g2Var3.getClass();
                    try {
                        l0 l0Var3 = g2Var3.i;
                        if (l0Var3 != null) {
                            l0Var3.h();
                        }
                    } catch (RemoteException e12) {
                        u9.i.k("#007 Could not call remote method.", e12);
                        return;
                    }
                } catch (IllegalStateException e13) {
                    xt.a(lVar3.getContext()).c("BaseAdView.destroy", e13);
                }
                xt.a(lVar3.getContext()).c("BaseAdView.destroy", e13);
                break;
        }
    }
}
