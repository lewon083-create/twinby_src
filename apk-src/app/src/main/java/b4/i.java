package b4;

import com.google.android.gms.internal.measurement.h5;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r3.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1902m;

    @Override // r3.e
    public final void r() {
        super.r();
        this.f1901l = 0;
    }

    public final boolean v(r3.e eVar) {
        ByteBuffer byteBuffer;
        h5.h(!eVar.c(1073741824));
        h5.h(!eVar.c(268435456));
        h5.h(!eVar.c(4));
        if (w()) {
            if (this.f1901l >= this.f1902m) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.f32192f;
            if (byteBuffer2 != null && (byteBuffer = this.f32192f) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f1901l;
        this.f1901l = i + 1;
        if (i == 0) {
            this.f32194h = eVar.f32194h;
            if (eVar.c(1)) {
                this.f7316c = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.f32192f;
        if (byteBuffer3 != null) {
            t(byteBuffer3.remaining());
            this.f32192f.put(byteBuffer3);
        }
        this.f1900k = eVar.f32194h;
        return true;
    }

    public final boolean w() {
        return this.f1901l > 0;
    }
}
