package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5453e;

    public fv0(String str, boolean z5, boolean z10, long j10, long j11) {
        this.f5449a = str;
        this.f5450b = z5;
        this.f5451c = z10;
        this.f5452d = j10;
        this.f5453e = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return this.f5449a.equals(fv0Var.f5449a) && this.f5450b == fv0Var.f5450b && this.f5451c == fv0Var.f5451c && this.f5452d == fv0Var.f5452d && this.f5453e == fv0Var.f5453e;
    }

    public final int hashCode() {
        return ((((((((((((this.f5449a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f5450b ? 1237 : 1231)) * 1000003) ^ (true != this.f5451c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f5452d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f5453e);
    }

    public final String toString() {
        boolean z5 = this.f5450b;
        int length = String.valueOf(z5).length();
        boolean z10 = this.f5451c;
        int length2 = String.valueOf(z10).length();
        long j10 = this.f5452d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f5453e;
        int length4 = String.valueOf(j11).length();
        String str = this.f5449a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z5);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z10);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j10);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }
}
