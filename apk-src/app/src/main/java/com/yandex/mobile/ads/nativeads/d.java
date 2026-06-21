package com.yandex.mobile.ads.nativeads;

import kotlin.jvm.internal.Intrinsics;
import yads.ht3;
import yads.l02;
import yads.mt3;
import yads.tm;
import yads.ut3;
import yads.y02;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y02 f15310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ut3 f15312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm f15313d;

    public /* synthetic */ d(y02 y02Var) {
        this(y02Var, new f(), new ut3(), new tm());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        try {
            this.f15311b.getClass();
            this.f15310a.a(f.a(nativeAdViewBinder));
        } catch (l02 e3) {
            throw new NativeAdException(e3.f40410b, e3);
        } catch (Throwable th2) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && Intrinsics.a(((d) obj).f15310a, this.f15310a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new ht3(this.f15310a.getAdAssets());
    }

    public int hashCode() {
        return this.f15310a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f15310a.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f15310a.a(nativeAdEventListener != null ? new mt3(nativeAdEventListener) : null);
    }

    public d(y02 y02Var, f fVar, ut3 ut3Var, tm tmVar) {
        this.f15310a = y02Var;
        this.f15311b = fVar;
        this.f15312c = ut3Var;
        this.f15313d = tmVar;
    }
}
