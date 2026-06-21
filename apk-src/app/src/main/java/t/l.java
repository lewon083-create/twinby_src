package t;

import android.util.ArrayMap;
import fh.of;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f33142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayMap f33143b;

    @Override // g0.p
    public final void a(int i) {
        for (g0.p pVar : this.f33142a) {
            try {
                ((Executor) this.f33143b.get(pVar)).execute(new a1.q(pVar, i, 6));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.l("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e3);
            }
        }
    }

    @Override // g0.p
    public final void b(int i, g0.v vVar) {
        for (g0.p pVar : this.f33142a) {
            try {
                ((Executor) this.f33143b.get(pVar)).execute(new d.l(pVar, i, vVar, 6));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.l("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e3);
            }
        }
    }

    @Override // g0.p
    public final void c(int i, of ofVar) {
        for (g0.p pVar : this.f33142a) {
            try {
                ((Executor) this.f33143b.get(pVar)).execute(new d.l(pVar, i, ofVar, 5));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.l("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e3);
            }
        }
    }
}
