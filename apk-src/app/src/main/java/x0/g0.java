package x0;

import android.os.SystemClock;
import g0.d2;
import java.util.concurrent.atomic.AtomicBoolean;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends g0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35596a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f35597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.h f35598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2 f35599d;

    public g0(AtomicBoolean atomicBoolean, j1.h hVar, d2 d2Var) {
        this.f35597b = atomicBoolean;
        this.f35598c = hVar;
        this.f35599d = d2Var;
    }

    @Override // g0.p
    public final void b(int i, g0.v vVar) {
        Object obj;
        if (this.f35596a) {
            this.f35596a = false;
            com.google.android.gms.internal.auth.g.e("VideoCapture", "cameraCaptureResult timestampNs = " + vVar.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.f35597b;
        if (atomicBoolean.get() || (obj = vVar.c().f19735a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        j1.h hVar = this.f35598c;
        if (iIntValue == hVar.hashCode() && hVar.b(null) && !atomicBoolean.getAndSet(true)) {
            hl.d.s().execute(new v0(17, this, this.f35599d));
        }
    }
}
