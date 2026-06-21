package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f3982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3983h;

    public c0(int i) {
        switch (i) {
            case 1:
                this.f3982g = new boolean[15];
                break;
            default:
                this.f3982g = new boolean[15];
                break;
        }
    }

    public boolean a() {
        return this.f3979d > 15 && this.f3983h == 0;
    }

    public void b(long j10) {
        long j11 = this.f3979d;
        if (j11 == 0) {
            this.f3976a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f3976a;
            this.f3977b = j12;
            this.f3981f = j12;
            this.f3980e = 1L;
        } else {
            long j13 = j10 - this.f3978c;
            int i = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f3977b);
            boolean[] zArr = this.f3982g;
            if (jAbs <= 1000000) {
                this.f3980e++;
                this.f3981f += j13;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f3983h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f3983h++;
            }
        }
        this.f3979d++;
        this.f3978c = j10;
    }

    public void c() {
        this.f3979d = 0L;
        this.f3980e = 0L;
        this.f3981f = 0L;
        this.f3983h = 0;
        Arrays.fill(this.f3982g, false);
    }

    public void d() {
        this.f3979d = 0L;
        this.f3980e = 0L;
        this.f3981f = 0L;
        this.f3983h = 0;
        Arrays.fill(this.f3982g, false);
    }

    public boolean e() {
        return this.f3979d > 15 && this.f3983h == 0;
    }

    public void f(long j10) {
        long j11 = this.f3979d;
        if (j11 == 0) {
            this.f3976a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f3976a;
            this.f3977b = j12;
            this.f3981f = j12;
            this.f3980e = 1L;
        } else {
            long j13 = j10 - this.f3978c;
            long jAbs = Math.abs(j13 - this.f3977b);
            int i = (int) (j11 % 15);
            boolean[] zArr = this.f3982g;
            if (jAbs <= 1000000) {
                this.f3980e++;
                this.f3981f += j13;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f3983h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f3983h++;
            }
        }
        this.f3979d++;
        this.f3978c = j10;
    }
}
