package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0019a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23400c;

    public C0019a4(String str, Integer num, String str2) {
        this.f23398a = str;
        this.f23399b = num;
        this.f23400c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0019a4.class == obj.getClass()) {
            C0019a4 c0019a4 = (C0019a4) obj;
            if (!this.f23398a.equals(c0019a4.f23398a)) {
                return false;
            }
            Integer num = this.f23399b;
            if (num == null ? c0019a4.f23399b != null : !num.equals(c0019a4.f23399b)) {
                return false;
            }
            String str = this.f23400c;
            String str2 = c0019a4.f23400c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23398a.hashCode() * 31;
        Integer num = this.f23399b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f23400c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
