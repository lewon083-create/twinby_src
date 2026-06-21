package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class l extends j {
    @Override // v.j
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // v.j
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // v.j
    public Object c() {
        Object obj = this.f34624a;
        f2.g.b(obj instanceof k);
        return ((k) obj).f34625a;
    }

    @Override // v.j
    public String d() {
        return ((k) this.f34624a).f34626b;
    }

    @Override // v.j
    public final boolean f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // v.j
    public void g(long j10) {
        ((k) this.f34624a).f34627c = j10;
    }

    @Override // v.j
    public void i(String str) {
        ((k) this.f34624a).f34626b = str;
    }
}
