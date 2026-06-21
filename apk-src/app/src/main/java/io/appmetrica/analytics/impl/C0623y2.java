package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0623y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0598x2 f25062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f25063b;

    public C0623y2(EnumC0598x2 enumC0598x2, Boolean bool) {
        this.f25062a = enumC0598x2;
        this.f25063b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0623y2.class == obj.getClass()) {
            C0623y2 c0623y2 = (C0623y2) obj;
            if (this.f25062a != c0623y2.f25062a) {
                return false;
            }
            Boolean bool = this.f25063b;
            if (bool != null) {
                return bool.equals(c0623y2.f25063b);
            }
            if (c0623y2.f25063b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC0598x2 enumC0598x2 = this.f25062a;
        int iHashCode = (enumC0598x2 != null ? enumC0598x2.hashCode() : 0) * 31;
        Boolean bool = this.f25063b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f25062a + ", mBackgroundRestricted=" + this.f25063b + '}';
    }
}
