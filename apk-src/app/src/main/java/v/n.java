package v;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class n extends l {
    @Override // v.l, v.j
    public Object c() {
        Object obj = this.f34624a;
        f2.g.b(obj instanceof m);
        return ((m) obj).f34628a;
    }

    @Override // v.l, v.j
    public final String d() {
        return null;
    }

    @Override // v.l, v.j
    public void g(long j10) {
        ((m) this.f34624a).f34629b = j10;
    }

    @Override // v.l, v.j
    public final void i(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
