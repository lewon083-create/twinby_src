package s9;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32855b;

    public k(long j10) {
        this.f32855b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.A.remove(Long.valueOf(this.f32855b)) == null) {
            return null;
        }
        p9.k.C.f31302h.d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
