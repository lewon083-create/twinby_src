package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40455a;

    public l90(String str) {
        this.f40455a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l90) && Intrinsics.a(this.f40455a, ((l90) obj).f40455a);
    }

    public final int hashCode() {
        return this.f40455a.hashCode() + 562735108;
    }

    public final String toString() {
        return pe.a.f("Warning(title=Warning, message=", this.f40455a, ")");
    }
}
