package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10292c;

    public sh(long j10, String str, int i) {
        this.f10290a = j10;
        this.f10291b = str;
        this.f10292c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return shVar.f10290a == this.f10290a && shVar.f10292c == this.f10292c;
    }

    public final int hashCode() {
        return (int) this.f10290a;
    }
}
