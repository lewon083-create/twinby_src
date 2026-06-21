package b4;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4.h f1862b;

    public /* synthetic */ b(m mVar, o4.h hVar, int i) {
        this.f1861a = i;
        this.f1862b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f1861a) {
            case 0:
                o4.h hVar = this.f1862b;
                Handler handler = hVar.f29622b;
                if (Build.VERSION.SDK_INT >= 30) {
                    hVar.a(j10);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
            default:
                o4.h hVar2 = this.f1862b;
                Handler handler2 = hVar2.f29622b;
                if (Build.VERSION.SDK_INT >= 30) {
                    hVar2.a(j10);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
        }
    }
}
