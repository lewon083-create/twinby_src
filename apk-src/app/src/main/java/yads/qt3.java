package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qt3 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st3 f42387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f42388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt3(st3 st3Var, AdRequestError adRequestError) {
        super(0);
        this.f42387b = st3Var;
        this.f42388c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeAdLoadListener nativeAdLoadListener = this.f42387b.f43079a;
        AdRequestError error = this.f42388c;
        a1.e eVar = (a1.e) nativeAdLoadListener;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        ef.e eVar2 = (ef.e) eVar.f323c;
        if (eVar2.f16375c == ((NativeAdLoader) eVar.f324d)) {
            eVar2.f16376d = false;
            eVar2.f16375c = null;
            eVar2.f16377e = null;
            eVar2.f16374b.invoke("onAdFailedToLoad", kotlin.collections.j0.g(new Pair("code", Long.valueOf(error.getCode())), new Pair("description", error.getDescription())));
        }
        return Unit.f27471a;
    }
}
