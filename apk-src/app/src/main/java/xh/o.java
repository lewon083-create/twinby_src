package xh;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f36158b;

    public o(p pVar) {
        this.f36158b = pVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        p pVar = this.f36158b;
        pVar.f36159b = true;
        if (pVar.f36161d == null || pVar.f36160c) {
            return;
        }
        pVar.c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p pVar = this.f36158b;
        pVar.f36159b = false;
        io.flutter.embedding.engine.renderer.j jVar = pVar.f36161d;
        if (jVar != null && !pVar.f36160c) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = pVar.f36162e;
            if (surface != null) {
                surface.release();
                pVar.f36162e = null;
            }
        }
        Surface surface2 = pVar.f36162e;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        pVar.f36162e = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        p pVar = this.f36158b;
        io.flutter.embedding.engine.renderer.j jVar = pVar.f36161d;
        if (jVar == null || pVar.f36160c) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f25607a.onSurfaceChanged(i, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
