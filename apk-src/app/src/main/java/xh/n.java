package xh;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f36155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f36157f;

    public n(Context context, boolean z5) {
        super(context, null);
        this.f36153b = false;
        this.f36154c = false;
        this.f36156e = false;
        f0 f0Var = new f0(new dj.a(1, this), this, this.f36155d);
        this.f36157f = f0Var;
        if (z5) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f36156e = i0.o.B(getContext());
        getHolder().addCallback(f0Var);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f36155d;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f36155d = jVar;
        this.f36157f.f36123f.a(jVar);
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f36155d == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f36155d;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
        }
        this.f36157f.f36123f.h();
        this.f36155d = null;
    }

    public final void c() {
        if (this.f36155d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.j jVar = this.f36155d;
        Surface surface = getHolder().getSurface();
        boolean z5 = this.f36154c;
        FlutterJNI flutterJNI = jVar.f25607a;
        if (!z5) {
            jVar.j();
        }
        jVar.f25609c = surface;
        if (z5) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f36155d;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i10) {
        if (!this.f36156e) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.getMode(i10) == 0 ? 1 : 0));
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f36155d == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f36154c = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        if (this.f36155d == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f36157f.f36123f.onResume();
        if (this.f36153b) {
            c();
        }
        this.f36154c = false;
    }
}
