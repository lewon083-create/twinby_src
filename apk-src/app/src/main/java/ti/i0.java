package ti;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.ads.cq;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cq f33833c;

    public i0(int i, ka.k kVar, String str, s sVar, m mVar) {
        super(i);
        this.f33832b = kVar;
    }

    @Override // ti.j
    public final void b() {
        this.f33833c = null;
    }

    @Override // ti.h
    public final void d(boolean z5) {
        cq cqVar = this.f33833c;
        if (cqVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            cqVar.d(z5);
        }
    }

    @Override // ti.h
    public final void e() {
        cq cqVar = this.f33833c;
        if (cqVar == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
            return;
        }
        ka.k kVar = this.f33832b;
        if (((Activity) kVar.f27324c) == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            cqVar.c(new f0(this.f33834a, kVar));
            this.f33833c.e((Activity) kVar.f27324c);
        }
    }
}
