package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12298c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12299d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12301f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12302g = -9223372036854775807L;
    public float i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f12304j = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12300e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12303h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12305k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12306l = -9223372036854775807L;

    public /* synthetic */ xs1(long j10, long j11) {
        this.f12296a = j10;
        this.f12297b = j11;
    }

    public final void a() {
        long j10 = this.f12303h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f12297b;
        this.f12303h = j11;
        long j12 = this.f12302g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f12303h = j12;
        }
        this.f12304j = -9223372036854775807L;
    }

    public final long b() {
        return this.f12303h;
    }

    public final void c() {
        long j10;
        long j11 = this.f12298c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f12299d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f12301f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f12302g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f12300e == j10) {
            return;
        }
        this.f12300e = j10;
        this.f12303h = j10;
        this.f12305k = -9223372036854775807L;
        this.f12306l = -9223372036854775807L;
        this.f12304j = -9223372036854775807L;
    }
}
