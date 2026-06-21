package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class an1 extends OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f3332g = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3335d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3337f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3333b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3334c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f3336e = new byte[128];

    public final synchronized bn1 a() {
        try {
            int i = this.f3337f;
            byte[] bArr = this.f3336e;
            if (i >= bArr.length) {
                this.f3334c.add(new zm1(this.f3336e));
                this.f3336e = f3332g;
            } else if (i > 0) {
                this.f3334c.add(new zm1(Arrays.copyOf(bArr, i)));
            }
            this.f3335d += this.f3337f;
            this.f3337f = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return bn1.C(this.f3334c);
    }

    public final void b(int i) {
        this.f3334c.add(new zm1(this.f3336e));
        int length = this.f3335d + this.f3336e.length;
        this.f3335d = length;
        this.f3336e = new byte[Math.max(this.f3333b, Math.max(i, length >>> 1))];
        this.f3337f = 0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f3335d + this.f3337f;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f3337f == this.f3336e.length) {
                b(1);
            }
            byte[] bArr = this.f3336e;
            int i10 = this.f3337f;
            this.f3337f = i10 + 1;
            bArr[i10] = (byte) i;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        byte[] bArr2 = this.f3336e;
        int length = bArr2.length;
        int i11 = this.f3337f;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f3337f += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i12);
        int i13 = i10 - i12;
        b(i13);
        System.arraycopy(bArr, i + i12, this.f3336e, 0, i13);
        this.f3337f = i13;
    }
}
