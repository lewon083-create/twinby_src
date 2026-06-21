package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0326m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f24336f;

    public C0326m4(C0276k4 c0276k4) {
        this.f24331a = c0276k4.f24198a;
        this.f24332b = c0276k4.f24199b;
        this.f24333c = c0276k4.f24200c;
        this.f24334d = c0276k4.f24201d;
        this.f24335e = c0276k4.f24202e;
        this.f24336f = c0276k4.f24203f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0326m4.class == obj.getClass()) {
            C0326m4 c0326m4 = (C0326m4) obj;
            if (this.f24331a != c0326m4.f24331a || this.f24332b != c0326m4.f24332b || this.f24333c != c0326m4.f24333c || this.f24334d != c0326m4.f24334d || this.f24335e != c0326m4.f24335e) {
                return false;
            }
            Boolean bool = this.f24336f;
            Boolean bool2 = c0326m4.f24336f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((this.f24331a ? 1 : 0) * 31) + (this.f24332b ? 1 : 0)) * 31) + (this.f24333c ? 1 : 0)) * 31) + (this.f24334d ? 1 : 0)) * 31) + (this.f24335e ? 1 : 0)) * 31;
        Boolean bool = this.f24336f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f24331a + ", featuresCollectingEnabled=" + this.f24332b + ", googleAid=" + this.f24333c + ", simInfo=" + this.f24334d + ", huaweiOaid=" + this.f24335e + ", sslPinning=" + this.f24336f + '}';
    }
}
