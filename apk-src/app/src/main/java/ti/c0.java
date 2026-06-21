package ti;

import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.wh;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wh f33803c;

    public c0(int i, ka.k kVar, String str, s sVar, n nVar, m mVar) {
        super(i);
        if (!((sVar == null && nVar == null) ? false : true)) {
            throw new IllegalStateException("One of request and adManagerAdRequest must be non-null.");
        }
        this.f33802b = kVar;
    }

    @Override // ti.j
    public final void b() {
        this.f33803c = null;
    }

    @Override // ti.h
    public final void d(boolean z5) {
        wh whVar = this.f33803c;
        if (whVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
            return;
        }
        try {
            whVar.f11808a.I(z5);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // ti.h
    public final void e() {
        wh whVar = this.f33803c;
        if (whVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
            return;
        }
        ka.k kVar = this.f33802b;
        Activity activity = (Activity) kVar.f27324c;
        if (activity == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            whVar.f11810c.f12153b = new f0(this.f33834a, kVar);
            whVar.c(activity);
        }
    }
}
