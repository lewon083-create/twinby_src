package ti;

import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.nv;
import q9.v2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f33863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f33864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f33865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nv f33866g;

    public o0(int i, ka.k kVar, String str, n nVar, m mVar) {
        super(i);
        this.f33861b = kVar;
        this.f33862c = str;
        this.f33865f = nVar;
        this.f33864e = null;
        this.f33863d = mVar;
    }

    @Override // ti.j
    public final void b() {
        this.f33866g = null;
    }

    @Override // ti.h
    public final void d(boolean z5) {
        nv nvVar = this.f33866g;
        if (nvVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
            return;
        }
        try {
            ev evVar = nvVar.f8458b;
            if (evVar != null) {
                evVar.i4(z5);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // ti.h
    public final void e() {
        nv nvVar = this.f33866g;
        if (nvVar == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
            return;
        }
        ka.k kVar = this.f33861b;
        if (((Activity) kVar.f27324c) == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
            return;
        }
        nvVar.f8460d.f10071b = new f0(this.f33834a, kVar);
        m0 m0Var = new m0(this);
        try {
            ev evVar = nvVar.f8458b;
            if (evVar != null) {
                evVar.u3(new v2(m0Var));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        this.f33866g.c((Activity) kVar.f27324c, new m0(this));
    }

    public o0(int i, ka.k kVar, String str, s sVar, m mVar) {
        super(i);
        this.f33861b = kVar;
        this.f33862c = str;
        this.f33864e = sVar;
        this.f33865f = null;
        this.f33863d = mVar;
    }
}
