package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z61 implements c71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45268a;

    public z61(String str) {
        this.f45268a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && Intrinsics.a(this.f45268a, ((z61) obj).f45268a);
    }

    public final int hashCode() {
        return this.f45268a.hashCode();
    }

    public final String toString() {
        return pe.a.f("Failure(message=", this.f45268a, ")");
    }
}
