package yads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xb0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb0 f44632a;

    public xb0(yb0 yb0Var) {
        this.f44632a = yb0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        nn2 nn2Var;
        zb0 zb0Var = this.f44632a.f44994c;
        if (audioTrack != zb0Var.f45332u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.f45329r;
        if (glVar == null || !zb0Var.U || (nn2Var = ((gk1) glVar).f38786a.Q0) == null) {
            return;
        }
        ((bo0) nn2Var).f37112a.i.f40427a.sendEmptyMessage(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        nn2 nn2Var;
        zb0 zb0Var = this.f44632a.f44994c;
        if (audioTrack != zb0Var.f45332u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.f45329r;
        if (glVar == null || !zb0Var.U || (nn2Var = ((gk1) glVar).f38786a.Q0) == null) {
            return;
        }
        ((bo0) nn2Var).f37112a.i.f40427a.sendEmptyMessage(2);
    }
}
