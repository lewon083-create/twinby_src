package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qr3 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitializationListener f42378a;

    public qr3(InitializationListener initializationListener) {
        this.f42378a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qr3) && Intrinsics.a(((qr3) obj).f42378a, this.f42378a);
    }

    public final int hashCode() {
        return this.f42378a.hashCode();
    }

    @Override // yads.l00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new pr3(this));
    }
}
