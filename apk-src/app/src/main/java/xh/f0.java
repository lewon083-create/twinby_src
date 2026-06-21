package xh;

import android.os.Build;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f36119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f36120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dj.a f36121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f36122e = new io.flutter.embedding.engine.renderer.a(3, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f36123f;

    public f0(dj.a aVar, n nVar, io.flutter.embedding.engine.renderer.j jVar) {
        boolean z5 = Build.VERSION.SDK_INT < 26;
        this.f36123f = z5 ? new ni.i(24, this) : new m7.a(29, this);
        this.f36121d = aVar;
        this.f36120c = jVar;
        this.f36119b = nVar;
        if (z5) {
            nVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        dj.a aVar = this.f36121d;
        if (aVar != null) {
            aVar.surfaceChanged(surfaceHolder, i, i10, i11);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        dj.a aVar = this.f36121d;
        if (aVar != null) {
            aVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        dj.a aVar = this.f36121d;
        if (aVar != null) {
            aVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.j jVar = this.f36120c;
        if (jVar == null) {
            return;
        }
        jVar.a(new d0(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
