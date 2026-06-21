package s3;

import android.os.Looper;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f32681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f32682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f32684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f32685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32686f;

    public x0(v0 v0Var, w0 w0Var, j3.o0 o0Var, int i, Looper looper) {
        this.f32682b = v0Var;
        this.f32681a = w0Var;
        this.f32685e = looper;
    }

    public final synchronized void a(boolean z5) {
        notifyAll();
    }

    public final void b() {
        h5.r(!this.f32686f);
        this.f32686f = true;
        e0 e0Var = (e0) this.f32682b;
        if (!e0Var.K && e0Var.f32509k.getThread().isAlive()) {
            e0Var.i.a(14, this).b();
        } else {
            m3.b.s("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
