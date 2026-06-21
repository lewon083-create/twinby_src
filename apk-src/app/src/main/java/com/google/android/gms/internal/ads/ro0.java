package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10008d;

    public ro0(int i) {
        switch (i) {
            case 1:
                this.f10005a = new long[10];
                this.f10006b = new Object[10];
                break;
            default:
                this.f10005a = new long[10];
                this.f10006b = new Object[10];
                break;
        }
    }

    public synchronized void a(long j10, Object obj) {
        if (this.f10008d > 0) {
            if (j10 <= this.f10005a[((this.f10007c + r0) - 1) % this.f10006b.length]) {
                synchronized (this) {
                    this.f10007c = 0;
                    this.f10008d = 0;
                    Arrays.fill(this.f10006b, (Object) null);
                }
            }
        }
        b();
        int i = this.f10007c;
        int i10 = this.f10008d;
        Object[] objArr = this.f10006b;
        int length = (i + i10) % objArr.length;
        this.f10005a[length] = j10;
        objArr[length] = obj;
        this.f10008d = i10 + 1;
    }

    public void b() {
        int length = this.f10006b.length;
        if (this.f10008d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i10 = this.f10007c;
        int i11 = length - i10;
        System.arraycopy(this.f10005a, i10, jArr, 0, i11);
        System.arraycopy(this.f10006b, this.f10007c, objArr, 0, i11);
        int i12 = this.f10007c;
        if (i12 > 0) {
            System.arraycopy(this.f10005a, 0, jArr, i11, i12);
            System.arraycopy(this.f10006b, 0, objArr, i11, this.f10007c);
        }
        this.f10005a = jArr;
        this.f10006b = objArr;
        this.f10007c = 0;
    }

    public synchronized Object c() {
        return this.f10008d == 0 ? null : e();
    }

    public synchronized Object d(long j10) {
        Object objE;
        objE = null;
        while (this.f10008d > 0 && j10 - this.f10005a[this.f10007c] >= 0) {
            objE = e();
        }
        return objE;
    }

    public Object e() {
        com.google.android.gms.internal.measurement.h5.r(this.f10008d > 0);
        Object[] objArr = this.f10006b;
        int i = this.f10007c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f10007c = (i + 1) % objArr.length;
        this.f10008d--;
        return obj;
    }

    public synchronized int f() {
        return this.f10008d;
    }

    public synchronized void g(long j10, Object obj) {
        try {
            if (this.f10008d > 0) {
                if (j10 <= this.f10005a[((this.f10007c + r0) - 1) % this.f10006b.length]) {
                    synchronized (this) {
                        this.f10007c = 0;
                        this.f10008d = 0;
                        Arrays.fill(this.f10006b, (Object) null);
                    }
                }
            }
            int length = this.f10006b.length;
            if (this.f10008d >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i10 = this.f10007c;
                int i11 = length - i10;
                System.arraycopy(this.f10005a, i10, jArr, 0, i11);
                System.arraycopy(this.f10006b, this.f10007c, objArr, 0, i11);
                int i12 = this.f10007c;
                if (i12 > 0) {
                    System.arraycopy(this.f10005a, 0, jArr, i11, i12);
                    System.arraycopy(this.f10006b, 0, objArr, i11, this.f10007c);
                }
                this.f10005a = jArr;
                this.f10006b = objArr;
                this.f10007c = 0;
            }
            int i13 = this.f10007c;
            int i14 = this.f10008d;
            Object[] objArr2 = this.f10006b;
            int length2 = (i13 + i14) % objArr2.length;
            this.f10005a[length2] = j10;
            objArr2[length2] = obj;
            this.f10008d = i14 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int h() {
        return this.f10008d;
    }

    public synchronized Object i() {
        if (this.f10008d == 0) {
            return null;
        }
        return k();
    }

    public synchronized Object j(long j10) {
        Object objK;
        objK = null;
        while (this.f10008d > 0 && j10 - this.f10005a[this.f10007c] >= 0) {
            objK = k();
        }
        return objK;
    }

    public Object k() {
        ix.k0(this.f10008d > 0);
        Object[] objArr = this.f10006b;
        int i = this.f10007c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f10007c = (i + 1) % objArr.length;
        this.f10008d--;
        return obj;
    }
}
