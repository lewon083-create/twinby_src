package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class au0 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3417a;

    public au0(int i) {
        this.f3417a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au0) && this.f3417a == ((au0) obj).f3417a;
    }

    public final int hashCode() {
        return this.f3417a;
    }

    public final String toString() {
        int i = this.f3417a;
        return l7.o.j(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
