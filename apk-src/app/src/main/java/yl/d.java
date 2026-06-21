package yl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45761b;

    public d(int i, String str) {
        this.f45760a = i;
        this.f45761b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45760a == dVar.f45760a && Intrinsics.a(this.f45761b, dVar.f45761b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f45760a) * 31;
        String str = this.f45761b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VKError(errorCode=" + this.f45760a + ", errorMsg=" + this.f45761b + ")";
    }
}
