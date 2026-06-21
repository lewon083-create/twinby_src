package ti;

import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.sv;
import q9.v2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f33877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f33878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f33879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sv f33880g;

    public q0(int i, ka.k kVar, String str, n nVar, m mVar) {
        super(i);
        this.f33875b = kVar;
        this.f33876c = str;
        this.f33879f = nVar;
        this.f33878e = null;
        this.f33877d = mVar;
    }

    @Override // ti.j
    public final void b() {
        this.f33880g = null;
    }

    @Override // ti.h
    public final void d(boolean z5) {
        sv svVar = this.f33880g;
        if (svVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
            return;
        }
        try {
            ev evVar = svVar.f10402b;
            if (evVar != null) {
                evVar.i4(z5);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // ti.h
    public final void e() {
        sv svVar = this.f33880g;
        if (svVar == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
            return;
        }
        ka.k kVar = this.f33875b;
        if (((Activity) kVar.f27324c) == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
            return;
        }
        svVar.f10404d.f10071b = new f0(this.f33834a, kVar);
        p0 p0Var = new p0(this);
        try {
            ev evVar = svVar.f10402b;
            if (evVar != null) {
                evVar.u3(new v2(p0Var));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        this.f33880g.c((Activity) kVar.f27324c, new p0(this));
    }

    public q0(int i, ka.k kVar, String str, s sVar, m mVar) {
        super(i);
        this.f33875b = kVar;
        this.f33876c = str;
        this.f33878e = sVar;
        this.f33879f = null;
        this.f33877d = mVar;
    }
}
