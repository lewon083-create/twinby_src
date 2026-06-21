package bd;

import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.measurement.h5;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2071b;

    public /* synthetic */ f(int i) {
        this.f2071b = i;
    }

    public final String toString() {
        switch (this.f2071b) {
        }
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i10 = this.f2071b;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f2071b) {
            case 0:
                bArr.getClass();
                break;
            default:
                bArr.getClass();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        switch (this.f2071b) {
            case 0:
                bArr.getClass();
                h5.p(i, i10 + i, bArr.length);
                break;
            default:
                bArr.getClass();
                ix.p0(i, i10 + i, bArr.length);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }
}
