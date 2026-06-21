package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl.k f25882c;

    public q(dl.k kVar, long j10) {
        this.f25882c = kVar;
        this.f25881b = j10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long jNanoTime = System.nanoTime() - j10;
        long j11 = jNanoTime < 0 ? 0L : jNanoTime;
        dl.k kVar = this.f25882c;
        ((FlutterJNI) kVar.f15872c).onVsync(j11, kVar.f15871b, this.f25881b);
        kVar.f15873d = this;
    }
}
