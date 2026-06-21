package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class st3 implements c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdLoadListener f43079a;

    public st3(NativeAdLoadListener nativeAdLoadListener) {
        this.f43079a = nativeAdLoadListener;
    }

    public final void a(y02 y02Var) {
        new CallbackStackTraceMarker(new rt3(this, new com.yandex.mobile.ads.nativeads.d(y02Var)));
    }

    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new qt3(this, new AdRequestError(l4Var.f40418a, l4Var.f40420c, l4Var.f40421d)));
    }
}
