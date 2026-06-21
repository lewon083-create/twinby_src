package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39352a;

    public hx(String str) {
        super(0);
        this.f39352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && Intrinsics.a(this.f39352a, ((hx) obj).f39352a);
    }

    public final int hashCode() {
        String str = this.f39352a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return pe.a.f("VendorConsents(value=", this.f39352a, ")");
    }
}
