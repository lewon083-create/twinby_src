package ej;

import cj.h;
import cj.y;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import s3.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends y implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16388g;

    @Override // cj.y
    public final h a(l lVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new a(lVar, this.f2365b, textureRegistry$SurfaceProducer.handlesCropAndRotation());
    }

    @Override // cj.y
    public final void b() {
        super.b();
        this.f2366c.release();
    }

    @Override // io.flutter.view.p
    public final void c() {
        ((s3.y) this.f2368e).f0(null);
        this.f16388g = true;
    }

    @Override // io.flutter.view.p
    public final void d() {
        if (this.f16388g) {
            ((s3.y) this.f2368e).f0(this.f2366c.getSurface());
            this.f16388g = false;
        }
    }
}
