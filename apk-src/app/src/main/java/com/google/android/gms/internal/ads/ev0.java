package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f5079f;

    public final fv0 a() {
        String str;
        if (this.f5079f == 63 && (str = this.f5074a) != null) {
            return new fv0(str, this.f5075b, this.f5076c, this.f5077d, this.f5078e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f5074a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f5079f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f5079f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f5079f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f5079f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f5079f & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f5079f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
