package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39990b;

    public jv(int i, String str) {
        this.f39989a = str;
        this.f39990b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return Intrinsics.a(this.f39989a, jvVar.f39989a) && this.f39990b == jvVar.f39990b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39990b) + (this.f39989a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.f39989a + ", sizeInPx=" + this.f39990b + ")";
    }
}
