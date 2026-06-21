package l9;

import android.content.Context;
import android.os.RemoteException;
import k9.h;
import k9.l;
import k9.t;
import k9.u;
import pa.c0;
import q9.b3;
import q9.g2;
import q9.l0;
import u9.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l {
    public c(Context context) {
        super(context);
        c0.j(context, "Context cannot be null");
    }

    public h[] getAdSizes() {
        return this.f27273b.f31867g;
    }

    public d getAppEventListener() {
        return this.f27273b.f31868h;
    }

    public t getVideoController() {
        return this.f27273b.f31863c;
    }

    public u getVideoOptions() {
        return this.f27273b.f31869j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f27273b.d(hVarArr);
    }

    public void setAppEventListener(d dVar) {
        this.f27273b.e(dVar);
    }

    public void setManualImpressionsEnabled(boolean z5) {
        g2 g2Var = this.f27273b;
        g2Var.f31872m = z5;
        try {
            l0 l0Var = g2Var.i;
            if (l0Var != null) {
                l0Var.S2(z5);
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    public void setVideoOptions(u uVar) {
        g2 g2Var = this.f27273b;
        g2Var.f31869j = uVar;
        try {
            l0 l0Var = g2Var.i;
            if (l0Var != null) {
                l0Var.a2(uVar == null ? null : new b3(uVar));
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }
}
