package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mt3 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f41014a;

    public mt3(NativeAdEventListener nativeAdEventListener) {
        this.f41014a = nativeAdEventListener;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new jt3(this, j5Var != null ? new or3(j5Var) : null));
    }

    @Override // yads.z00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new it3(this));
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new kt3(this));
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new lt3(this));
    }

    @Override // yads.z00
    public final void closeNativeAd() {
    }
}
