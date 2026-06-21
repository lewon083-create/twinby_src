package s0;

import android.opengl.EGLSurface;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f32391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32393c;

    public c(EGLSurface eGLSurface, int i, int i10) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f32391a = eGLSurface;
        this.f32392b = i;
        this.f32393c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f32391a.equals(cVar.f32391a) && this.f32392b == cVar.f32392b && this.f32393c == cVar.f32393c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f32391a.hashCode() ^ 1000003) * 1000003) ^ this.f32392b) * 1000003) ^ this.f32393c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f32391a);
        sb2.append(", width=");
        sb2.append(this.f32392b);
        sb2.append(", height=");
        return z.d(this.f32393c, "}", sb2);
    }
}
