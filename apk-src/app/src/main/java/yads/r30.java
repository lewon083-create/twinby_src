package yads;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r30 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f42451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f42452b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42454d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42455e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f42453c = new byte[1];

    public r30(u33 u33Var, u30 u30Var) {
        this.f42451a = u33Var;
        this.f42452b = u30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42455e) {
            return;
        }
        this.f42451a.close();
        this.f42455e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f42453c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f42453c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        if (!this.f42455e) {
            if (!this.f42454d) {
                this.f42451a.a(this.f42452b);
                this.f42454d = true;
            }
            int i11 = this.f42451a.read(bArr, i, i10);
            if (i11 == -1) {
                return -1;
            }
            return i11;
        }
        throw new IllegalStateException();
    }
}
