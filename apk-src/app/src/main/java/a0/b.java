package a0;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f23b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a[] f24c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f25d;

    public b(Image image) {
        this.f23b = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f24c = new a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f24c[i] = new a(planes[i]);
            }
        } else {
            this.f24c = new a[0];
        }
        this.f25d = new h(g0.r2.f19734b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // a0.r1
    public final Image C() {
        return this.f23b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23b.close();
    }

    @Override // a0.r1
    public final q1[] f() {
        return this.f24c;
    }

    @Override // a0.r1
    public final int getFormat() {
        return this.f23b.getFormat();
    }

    @Override // a0.r1
    public final int getHeight() {
        return this.f23b.getHeight();
    }

    @Override // a0.r1
    public final int getWidth() {
        return this.f23b.getWidth();
    }

    @Override // a0.r1
    public final m1 x() {
        return this.f25d;
    }
}
