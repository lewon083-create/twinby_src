package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0222i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24034b;

    public C0222i0(String str, long j10) {
        this.f24033a = str;
        this.f24034b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0222i0.class == obj.getClass()) {
            C0222i0 c0222i0 = (C0222i0) obj;
            if (this.f24034b != c0222i0.f24034b) {
                return false;
            }
            String str = this.f24033a;
            String str2 = c0222i0.f24033a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24033a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f24034b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
