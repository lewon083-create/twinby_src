package q4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.h f31737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31739e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31742h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f31740f = new byte[65536];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f31736b = new byte[4096];

    static {
        j3.y.a("media3.extractor");
    }

    public h(j3.h hVar, long j10, long j11) {
        this.f31737c = hVar;
        this.f31739e = j10;
        this.f31738d = j11;
    }

    @Override // q4.l
    public final void B(int i) {
        a(i, false);
    }

    @Override // q4.l
    public final int F(int i) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.f31742h, i);
        e(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f31736b;
            hVar = this;
            iMin = hVar.d(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.f31739e += (long) iMin;
        }
        return iMin;
    }

    @Override // q4.l
    public final int I(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        b(i10);
        int i11 = this.f31742h;
        int i12 = this.f31741g;
        int i13 = i11 - i12;
        if (i13 == 0) {
            hVar = this;
            iMin = hVar.d(this.f31740f, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.f31742h += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(hVar.f31740f, hVar.f31741g, bArr, i, iMin);
        hVar.f31741g += iMin;
        return iMin;
    }

    @Override // q4.l
    public final void L() {
        this.f31741g = 0;
    }

    @Override // q4.l
    public final void M(int i) throws EOFException, InterruptedIOException {
        x(i, false);
    }

    @Override // q4.l
    public final void V(byte[] bArr, int i, int i10) {
        y(bArr, i, i10, false);
    }

    public final boolean a(int i, boolean z5) {
        b(i);
        int iD = this.f31742h - this.f31741g;
        while (iD < i) {
            int i10 = i;
            boolean z10 = z5;
            iD = d(this.f31740f, this.f31741g, i10, iD, z10);
            if (iD == -1) {
                return false;
            }
            this.f31742h = this.f31741g + iD;
            i = i10;
            z5 = z10;
        }
        this.f31741g += i;
        return true;
    }

    public final void b(int i) {
        int i10 = this.f31741g + i;
        byte[] bArr = this.f31740f;
        if (i10 > bArr.length) {
            this.f31740f = Arrays.copyOf(this.f31740f, m3.z.j(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int d(byte[] bArr, int i, int i10, int i11, boolean z5) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i12 = this.f31737c.read(bArr, i + i11, i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        if (i11 == 0 && z5) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(int i) {
        int i10 = this.f31742h - i;
        this.f31742h = i10;
        this.f31741g = 0;
        byte[] bArr = this.f31740f;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i10);
        this.f31740f = bArr2;
    }

    @Override // q4.l
    public final long getLength() {
        return this.f31738d;
    }

    @Override // q4.l
    public final long getPosition() {
        return this.f31739e;
    }

    @Override // q4.l
    public final boolean h(byte[] bArr, int i, int i10, boolean z5) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.f31742h;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f31740f, 0, bArr, i, iMin);
            e(iMin);
        }
        int iD = iMin;
        while (iD < i10 && iD != -1) {
            iD = d(bArr, i, i10, iD, z5);
        }
        if (iD != -1) {
            this.f31739e += (long) iD;
        }
        return iD != -1;
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int i11 = this.f31742h;
        int iD = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f31740f, 0, bArr, i, iMin);
            e(iMin);
            iD = iMin;
        }
        if (iD == 0) {
            hVar = this;
            iD = hVar.d(bArr, i, i10, 0, true);
        } else {
            hVar = this;
        }
        if (iD != -1) {
            hVar.f31739e += (long) iD;
        }
        return iD;
    }

    @Override // q4.l
    public final void readFully(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        h(bArr, i, i10, false);
    }

    @Override // q4.l
    public final boolean x(int i, boolean z5) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f31742h, i);
        e(iMin);
        int iD = iMin;
        while (iD < i && iD != -1) {
            byte[] bArr = this.f31736b;
            iD = d(bArr, -iD, Math.min(i, bArr.length + iD), iD, z5);
        }
        if (iD != -1) {
            this.f31739e += (long) iD;
        }
        return iD != -1;
    }

    @Override // q4.l
    public final boolean y(byte[] bArr, int i, int i10, boolean z5) {
        if (!a(i10, z5)) {
            return false;
        }
        System.arraycopy(this.f31740f, this.f31741g - i10, bArr, i, i10);
        return true;
    }

    @Override // q4.l
    public final long z() {
        return this.f31739e + ((long) this.f31741g);
    }
}
