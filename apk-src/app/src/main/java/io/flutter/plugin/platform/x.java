package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f25762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceTexture f25763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f25764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25765e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25766f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25767g = false;

    public x(io.flutter.embedding.engine.renderer.h hVar) {
        w wVar = new w(this);
        this.f25762b = hVar;
        this.f25763c = hVar.f25582b.surfaceTexture();
        hVar.f25584d = wVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void a(int i, int i10) {
        this.f25765e = i;
        this.f25766f = i10;
        SurfaceTexture surfaceTexture = this.f25763c;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i10);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f25766f;
    }

    @Override // io.flutter.plugin.platform.h
    public final long getId() {
        return this.f25762b.f25581a;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        Surface surface = this.f25764d;
        if (surface == null || this.f25767g) {
            if (surface != null) {
                surface.release();
                this.f25764d = null;
            }
            this.f25764d = new Surface(this.f25763c);
            this.f25767g = false;
        }
        SurfaceTexture surfaceTexture = this.f25763c;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f25764d;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.f25765e;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f25763c = null;
        Surface surface = this.f25764d;
        if (surface != null) {
            surface.release();
            this.f25764d = null;
        }
    }
}
