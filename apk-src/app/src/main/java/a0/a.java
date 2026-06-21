package a0;

import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image.Plane f11a;

    public a(Image.Plane plane) {
        this.f11a = plane;
    }

    @Override // a0.q1
    public final ByteBuffer e() {
        return this.f11a.getBuffer();
    }

    @Override // a0.q1
    public final int f() {
        return this.f11a.getRowStride();
    }

    @Override // a0.q1
    public final int g() {
        return this.f11a.getPixelStride();
    }
}
