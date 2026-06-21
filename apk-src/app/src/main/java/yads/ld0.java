package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ld0 implements oq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30 f40503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40505d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40508g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f40506e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40502a = new byte[4096];

    static {
        io0.a("goog.exo.extractor");
    }

    public ld0(p30 p30Var, long j10, long j11) {
        this.f40503b = p30Var;
        this.f40505d = j10;
        this.f40504c = j11;
    }

    public final boolean a(boolean z5, int i) {
        int i10 = this.f40507f + i;
        byte[] bArr = this.f40506e;
        if (i10 > bArr.length) {
            int i11 = lb3.f40466a;
            this.f40506e = Arrays.copyOf(this.f40506e, Math.max(65536 + i10, Math.min(bArr.length * 2, i10 + 524288)));
        }
        int iA = this.f40508g - this.f40507f;
        while (iA < i) {
            boolean z10 = z5;
            int i12 = i;
            iA = a(this.f40506e, this.f40507f, i12, iA, z10);
            if (iA == -1) {
                return false;
            }
            this.f40508g = this.f40507f + iA;
            i = i12;
            z5 = z10;
        }
        this.f40507f += i;
        return true;
    }

    @Override // yads.oq0
    public final void b(int i) {
        a(false, i);
    }

    @Override // yads.oq0
    public final long c() {
        return this.f40505d + ((long) this.f40507f);
    }

    public final void d(int i) {
        int i10 = this.f40508g - i;
        this.f40508g = i10;
        this.f40507f = 0;
        byte[] bArr = this.f40506e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i10);
        this.f40506e = bArr2;
    }

    @Override // yads.oq0
    public final long getLength() {
        return this.f40504c;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int i11 = this.f40508g;
        int iA = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f40506e, 0, bArr, i, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            ld0Var = this;
            iA = ld0Var.a(bArr, i, i10, 0, true);
        } else {
            ld0Var = this;
        }
        if (iA != -1) {
            ld0Var.f40505d += (long) iA;
        }
        return iA;
    }

    @Override // yads.oq0
    public final void readFully(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        a(bArr, i, i10, false);
    }

    public final int b(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int iMin;
        int i11 = this.f40507f + i10;
        byte[] bArr2 = this.f40506e;
        if (i11 > bArr2.length) {
            int i12 = lb3.f40466a;
            this.f40506e = Arrays.copyOf(this.f40506e, Math.max(65536 + i11, Math.min(bArr2.length * 2, i11 + 524288)));
        }
        int i13 = this.f40508g;
        int i14 = this.f40507f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            ld0Var = this;
            iMin = ld0Var.a(this.f40506e, i14, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            ld0Var.f40508g += iMin;
        } else {
            ld0Var = this;
            iMin = Math.min(i10, i15);
        }
        System.arraycopy(ld0Var.f40506e, ld0Var.f40507f, bArr, i, iMin);
        ld0Var.f40507f += iMin;
        return iMin;
    }

    public final int c(int i) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int iMin = Math.min(this.f40508g, i);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f40502a;
            ld0Var = this;
            iMin = ld0Var.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            ld0Var = this;
        }
        if (iMin != -1) {
            ld0Var.f40505d += (long) iMin;
        }
        return iMin;
    }

    @Override // yads.oq0
    public final long a() {
        return this.f40505d;
    }

    @Override // yads.oq0
    public final void a(byte[] bArr, int i, int i10) {
        b(bArr, i, i10, false);
    }

    @Override // yads.oq0
    public final boolean a(byte[] bArr, int i, int i10, boolean z5) throws EOFException, InterruptedIOException {
        int iA;
        int i11 = this.f40508g;
        if (i11 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f40506e, 0, bArr, i, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i10 && iA != -1) {
            iA = a(bArr, i, i10, iA, z5);
        }
        if (iA != -1) {
            this.f40505d += (long) iA;
        }
        return iA != -1;
    }

    @Override // yads.oq0
    public final boolean b(byte[] bArr, int i, int i10, boolean z5) {
        if (!a(z5, i10)) {
            return false;
        }
        System.arraycopy(this.f40506e, this.f40507f - i10, bArr, i, i10);
        return true;
    }

    @Override // yads.oq0
    public final void b() {
        this.f40507f = 0;
    }

    @Override // yads.oq0
    public final void a(int i) {
        int iMin = Math.min(this.f40508g, i);
        d(iMin);
        int iA = iMin;
        while (iA < i && iA != -1) {
            iA = a(this.f40502a, -iA, Math.min(i, this.f40502a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f40505d += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i, int i10, int i11, boolean z5) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i12 = this.f40503b.read(bArr, i + i11, i10 - i11);
            if (i12 != -1) {
                return i11 + i12;
            }
            if (i11 == 0 && z5) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
