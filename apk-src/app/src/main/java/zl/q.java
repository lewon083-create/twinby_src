package zl;

import android.media.MediaCodec;
import yads.ek1;
import yads.fk1;
import yads.h53;
import yads.qj;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek1 f46625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk1 f46626c;

    public /* synthetic */ q(fk1 fk1Var, ek1 ek1Var, int i) {
        this.f46624a = i;
        this.f46626c = fk1Var;
        this.f46625b = ek1Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f46624a) {
            case 0:
                ((h53) this.f46626c).a(this.f46625b, mediaCodec, j10, j11);
                break;
            default:
                ((qj) this.f46626c).a(this.f46625b, mediaCodec, j10, j11);
                break;
        }
    }
}
