package yads;

import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rt3 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st3 f42724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.d f42725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt3(st3 st3Var, com.yandex.mobile.ads.nativeads.d dVar) {
        super(0);
        this.f42724b = st3Var;
        this.f42725c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeAdLoadListener nativeAdLoadListener = this.f42724b.f43079a;
        com.yandex.mobile.ads.nativeads.d nativeAd = this.f42725c;
        a1.e eVar = (a1.e) nativeAdLoadListener;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        ef.e eVar2 = (ef.e) eVar.f323c;
        if (eVar2.f16375c == ((NativeAdLoader) eVar.f324d)) {
            eVar2.f16376d = false;
            eVar2.f16375c = null;
            eVar2.f16377e = nativeAd;
            nativeAd.setNativeAdEventListener(new fe.c(13, eVar2));
            eVar2.f16374b.invoke("onAdLoaded", null);
        }
        return Unit.f27471a;
    }
}
