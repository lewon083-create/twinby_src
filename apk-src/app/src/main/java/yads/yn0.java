package yads;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yn0 implements qh3, at, cf2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qh3 f45121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public at f45122c;

    @Override // yads.qh3
    public final void a(long j10, long j11, nx0 nx0Var, MediaFormat mediaFormat) {
        qh3 qh3Var = this.f45121b;
        if (qh3Var != null) {
            qh3Var.a(j10, j11, nx0Var, mediaFormat);
        }
    }

    @Override // yads.cf2
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.f45121b = (qh3) obj;
        } else if (i == 8) {
            this.f45122c = (at) obj;
        } else if (i == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    @Override // yads.at
    public final void onCameraMotion(long j10, float[] fArr) {
        at atVar = this.f45122c;
        if (atVar != null) {
            atVar.onCameraMotion(j10, fArr);
        }
    }

    @Override // yads.at
    public final void onCameraMotionReset() {
        at atVar = this.f45122c;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }
}
