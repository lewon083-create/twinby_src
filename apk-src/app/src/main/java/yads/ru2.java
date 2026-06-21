package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ru2 implements tu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f42732a;

    public ru2(l4 l4Var) {
        this.f42732a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru2) && Intrinsics.a(this.f42732a, ((ru2) obj).f42732a);
    }

    public final int hashCode() {
        return this.f42732a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f42732a + ")";
    }
}
