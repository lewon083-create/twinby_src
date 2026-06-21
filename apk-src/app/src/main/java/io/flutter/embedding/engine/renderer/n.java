package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.uz;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f25619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f25620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f25621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlutterJNI f25622h;

    public n(long j10, Handler handler, FlutterJNI flutterJNI, h hVar) {
        this.f25615a = j10;
        this.f25621g = handler;
        this.f25622h = flutterJNI;
        this.f25620f = hVar;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f25618d) {
                return;
            }
            release();
            this.f25621g.post(new uz(this.f25615a, this.f25622h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f25619e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f25617c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f25619e;
        if (surface == null || !surface.isValid()) {
            this.f25619e = new Surface(this.f25620f.f25582b.surfaceTexture());
        }
        return this.f25619e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f25620f.f25582b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f25616b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f25615a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f25620f.release();
        this.f25619e.release();
        this.f25619e = null;
        this.f25618d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f25622h.markTextureFrameAvailable(this.f25615a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i, int i10) {
        this.f25616b = i;
        this.f25617c = i10;
        this.f25620f.f25582b.surfaceTexture().setDefaultBufferSize(i, i10);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }
}
