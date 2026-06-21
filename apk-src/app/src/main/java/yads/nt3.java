package yads;

import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nt3 implements NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a10 f41353a;

    public nt3(a10 a10Var) {
        this.f41353a = a10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt3) && Intrinsics.a(this.f41353a, ((nt3) obj).f41353a);
    }

    public final int hashCode() {
        return this.f41353a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f41353a + ")";
    }
}
