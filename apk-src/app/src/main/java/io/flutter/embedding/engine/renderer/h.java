package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.google.android.gms.internal.ads.uz;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements TextureRegistry$SurfaceTextureEntry, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f25582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f25584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f25585e;

    public h(j jVar, long j10, SurfaceTexture surfaceTexture) {
        this.f25585e = jVar;
        this.f25581a = j10;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new c(this, 1));
        this.f25582b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h hVar = this.f25580b;
                FlutterJNI flutterJNI = hVar.f25585e.f25607a;
                if (hVar.f25583c || !flutterJNI.isAttached()) {
                    return;
                }
                hVar.f25582b.markDirty();
                flutterJNI.scheduleFrame();
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f25583c) {
                return;
            }
            j jVar = this.f25585e;
            jVar.f25611e.post(new uz(this.f25581a, jVar.f25607a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f25581a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i) {
        o oVar = this.f25584d;
        if (oVar != null) {
            oVar.onTrimMemory(i);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f25583c) {
            return;
        }
        this.f25582b.release();
        long j10 = this.f25581a;
        j jVar = this.f25585e;
        jVar.f25607a.unregisterTexture(j10);
        jVar.h(this);
        this.f25583c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(o oVar) {
        this.f25584d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f25582b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }
}
