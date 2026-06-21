package yads;

import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jt3 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mt3 f39977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ or3 f39978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt3(mt3 mt3Var, or3 or3Var) {
        super(0);
        this.f39977b = mt3Var;
        this.f39978c = or3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeAdEventListener nativeAdEventListener = this.f39977b.f41014a;
        or3 or3Var = this.f39978c;
        ef.a aVar = ((ef.e) ((fe.c) nativeAdEventListener).f16785c).f16374b;
        String rawData = or3Var != null ? or3Var.getRawData() : null;
        if (rawData == null) {
            rawData = "";
        }
        aVar.invoke("onImpression", kotlin.collections.i0.c(new Pair("data", rawData)));
        return Unit.f27471a;
    }
}
