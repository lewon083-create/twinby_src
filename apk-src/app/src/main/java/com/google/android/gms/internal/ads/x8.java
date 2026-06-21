package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12073h;

    public void a(byte[] bArr, int i, int i10) {
        if (this.f12067b) {
            int i11 = this.f12070e;
            int i12 = (i + 1) - i11;
            if (i12 >= i10) {
                this.f12070e = (i10 - i) + i11;
            } else {
                this.f12068c = ((bArr[i12] & 192) >> 6) == 0;
                this.f12067b = false;
            }
        }
    }

    public void b(int i, long j10, boolean z5) {
        com.google.android.gms.internal.measurement.h5.r(this.f12072g != -9223372036854775807L);
        if (this.f12069d == 182 && z5 && this.f12066a) {
            ((q4.a0) this.f12073h).f(this.f12072g, this.f12068c ? 1 : 0, (int) (j10 - this.f12071f), i, null);
        }
        if (this.f12069d != 179) {
            this.f12071f = j10;
        }
    }

    public void c(byte[] bArr, int i, int i10) {
        if (this.f12067b) {
            int i11 = this.f12070e;
            int i12 = (i + 1) - i11;
            if (i12 >= i10) {
                this.f12070e = (i10 - i) + i11;
            } else {
                this.f12068c = ((bArr[i12] & 192) >> 6) == 0;
                this.f12067b = false;
            }
        }
    }

    public void d(int i, long j10, boolean z5) {
        ix.k0(this.f12072g != -9223372036854775807L);
        if (this.f12069d == 182 && z5 && this.f12066a) {
            ((w2) this.f12073h).c(this.f12072g, this.f12068c ? 1 : 0, (int) (j10 - this.f12071f), i, null);
        }
        if (this.f12069d != 179) {
            this.f12071f = j10;
        }
    }
}
