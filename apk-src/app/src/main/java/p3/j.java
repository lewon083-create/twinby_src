package p3;

import com.google.android.gms.internal.measurement.h5;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f31159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f31160c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31162e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31163f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f31161d = new byte[1];

    public j(h hVar, l lVar) {
        this.f31159b = hVar;
        this.f31160c = lVar;
    }

    public final void a() {
        if (this.f31162e) {
            return;
        }
        this.f31159b.open(this.f31160c);
        this.f31162e = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f31163f) {
            return;
        }
        this.f31159b.close();
        this.f31163f = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f31161d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        h5.r(!this.f31163f);
        a();
        int i11 = this.f31159b.read(bArr, i, i10);
        if (i11 == -1) {
            return -1;
        }
        return i11;
    }
}
