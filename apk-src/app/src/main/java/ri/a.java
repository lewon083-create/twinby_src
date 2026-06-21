package ri;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.impl.r;
import java.util.concurrent.ExecutorService;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32326g;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i) {
        this.f32321b = i;
        this.f32323d = obj;
        this.f32324e = obj2;
        this.f32325f = obj3;
        this.f32326g = obj4;
        this.f32322c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32321b) {
            case 0:
                bb.e eVar = (bb.e) this.f32323d;
                ci.e eVar2 = (ci.e) this.f32324e;
                Handler handler = (Handler) this.f32325f;
                t0 t0Var = (t0) this.f32326g;
                eVar2.d(a.a.f10b);
                Context context = a.a.f10b;
                io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(eVar, eVar2, t0Var, this.f32322c);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
                }
                if (((nc.e) eVar2.f2294c) == null) {
                    throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                }
                if (eVar2.f2293b) {
                    handler.post(aVar);
                    return;
                } else {
                    ((ExecutorService) eVar2.f2297f).execute(new ci.c(eVar2, context, handler, aVar, 0));
                    return;
                }
            case 1:
                r.a((r) this.f32323d, (String) this.f32324e, (String) this.f32325f, (IHandlerExecutor) this.f32326g, this.f32322c);
                return;
            default:
                t.m mVar = (t.m) this.f32323d;
                ((CameraCaptureSession.CaptureCallback) mVar.f33151b).onCaptureBufferLost((CameraCaptureSession) this.f32324e, (CaptureRequest) this.f32325f, (Surface) this.f32326g, this.f32322c);
                return;
        }
    }
}
