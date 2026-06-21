package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 implements zq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3858a;

    public br0(String str) {
        this.f3858a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof br0) {
            return this.f3858a.equals(((br0) obj).f3858a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3858a.hashCode();
    }

    public final String toString() {
        return this.f3858a;
    }
}
