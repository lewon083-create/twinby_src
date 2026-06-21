package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f7510b;

    public lg0(int i, int i10) {
        switch (i10) {
            case 1:
                this.f7510b = new long[i];
                break;
            default:
                this.f7510b = new long[i];
                break;
        }
    }

    public void a(long j10) {
        int i = this.f7509a;
        long[] jArr = this.f7510b;
        if (i == jArr.length) {
            this.f7510b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f7510b;
        int i10 = this.f7509a;
        this.f7509a = i10 + 1;
        jArr2[i10] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f7509a + jArr.length;
        long[] jArr2 = this.f7510b;
        if (length > jArr2.length) {
            this.f7510b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f7510b, this.f7509a, jArr.length);
        this.f7509a = length;
    }

    public long c(int i) {
        if (i >= 0 && i < this.f7509a) {
            return this.f7510b[i];
        }
        StringBuilder sbM = l7.o.m(i, "Invalid index ", ", size is ");
        sbM.append(this.f7509a);
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public void d() {
        int i = this.f7509a;
        long[] jArr = this.f7510b;
        if (i == jArr.length) {
            this.f7510b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f7510b;
        int i10 = this.f7509a;
        this.f7509a = i10 + 1;
        jArr2[i10] = 0;
    }

    public void e(long[] jArr) {
        int i = this.f7509a;
        int length = jArr.length;
        int i10 = i + length;
        long[] jArr2 = this.f7510b;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.f7510b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.f7510b, this.f7509a, length);
        this.f7509a = i10;
    }

    public long f(int i) {
        if (i >= 0 && i < this.f7509a) {
            return this.f7510b[i];
        }
        int i10 = this.f7509a;
        throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i10).length()), i, "Invalid index ", i10, ", size is "));
    }
}
