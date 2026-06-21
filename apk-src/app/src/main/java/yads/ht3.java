package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ht3 implements NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f39321a;

    public ht3(y00 y00Var) {
        this.f39321a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht3) && Intrinsics.a(this.f39321a, ((ht3) obj).f39321a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f39321a.f44869g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f39321a.f44870h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f39321a.i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        a10 a10Var = this.f39321a.f44865c;
        if (a10Var != null) {
            return new nt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getPrice() {
        return this.f39321a.f44871j;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getSponsored() {
        return this.f39321a.f44874m;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f39321a.f44875n;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getWarning() {
        return this.f39321a.f44876o;
    }

    public final int hashCode() {
        return this.f39321a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f39321a + ")";
    }
}
