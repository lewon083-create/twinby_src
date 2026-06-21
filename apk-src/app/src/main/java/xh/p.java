package xh;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f36161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f36162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36163f;

    public p(Context context) {
        super(context, null);
        this.f36159b = false;
        this.f36160c = false;
        this.f36163f = false;
        setSurfaceTextureListener(new o(this));
        this.f36163f = i0.o.B(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f36161d;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f36161d = jVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f36161d == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f36161d;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = this.f36162e;
            if (surface != null) {
                surface.release();
                this.f36162e = null;
            }
        }
        this.f36161d = null;
    }

    public final void c() {
        if (this.f36161d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f36162e;
        if (surface != null) {
            surface.release();
            this.f36162e = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f36162e = surface2;
        io.flutter.embedding.engine.renderer.j jVar = this.f36161d;
        boolean z5 = this.f36160c;
        FlutterJNI flutterJNI = jVar.f25607a;
        if (!z5) {
            jVar.j();
        }
        jVar.f25609c = surface2;
        if (z5) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f36161d;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        if (!this.f36163f) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.getMode(i10) == 0 ? 1 : 0));
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f36161d == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f36160c = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        if (this.f36161d == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f36159b) {
            c();
        }
        this.f36160c = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f36162e = surface;
    }
}
