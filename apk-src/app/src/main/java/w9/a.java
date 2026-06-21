package w9;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import k9.s;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract s getSDKVersionInfo();

    public abstract s getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<t0> list);

    public void loadAppOpenAd(f fVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", (Object) null, 4));
    }

    public void loadBannerAd(g gVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", (Object) null, 4));
    }

    public void loadInterstitialAd(i iVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", (Object) null, 4));
    }

    @Deprecated
    public void loadNativeAd(k kVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", (Object) null, 4));
    }

    public void loadNativeAdMapper(k kVar, c cVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(m mVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", (Object) null, 4));
    }

    public void loadRewardedInterstitialAd(m mVar, c cVar) {
        cVar.w(new la.m(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", (Object) null, 4));
    }
}
