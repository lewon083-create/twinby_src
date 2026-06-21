package yads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cf0 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ if0 f37362a;

    public cf0(if0 if0Var) {
        this.f37362a = if0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z5) {
        this.f37362a.b();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z5) {
        this.f37362a.b();
    }
}
