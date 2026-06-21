package yads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nb0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f41205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f41206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(zb0 zb0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f41206c = zb0Var;
        this.f41205b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f41205b.flush();
            this.f41205b.release();
        } finally {
            this.f41206c.f45320h.d();
        }
    }
}
