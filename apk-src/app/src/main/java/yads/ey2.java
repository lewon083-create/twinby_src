package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ey2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38295a;

    public ey2(String str) {
        this.f38295a = str;
    }

    public final String a() {
        return this.f38295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2) && Intrinsics.a(this.f38295a, ((ey2) obj).f38295a);
    }

    public final int hashCode() {
        return this.f38295a.hashCode();
    }

    public final String toString() {
        return pe.a.f("SessionParameters(token=", this.f38295a, ")");
    }
}
