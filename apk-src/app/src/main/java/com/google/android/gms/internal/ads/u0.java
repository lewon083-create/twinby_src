package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10772c;

    public /* synthetic */ u0(int i) {
        this.f10770a = i;
        this.f10771b = -9223372036854775807L;
        this.f10772c = -9223372036854775807L;
    }

    public void a(long j10) {
        if (j10 >= 0) {
            this.f10772c = j10;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
    }

    public String toString() {
        switch (this.f10770a) {
            case 4:
                return this.f10771b + "/" + this.f10772c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u0(int i, long j10, long j11) {
        this.f10770a = i;
        this.f10771b = j10;
        this.f10772c = j11;
    }

    public u0(u0 u0Var) {
        this.f10770a = 3;
        this.f10771b = u0Var.f10771b;
        this.f10772c = u0Var.f10772c;
    }

    public u0() {
        this.f10770a = 2;
        this.f10771b = 60L;
        this.f10772c = he.g.i;
    }
}
