package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class go3 implements io3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw1 f38841a;

    public go3(hw1 hw1Var) {
        this.f38841a = hw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go3) && Intrinsics.a(this.f38841a, ((go3) obj).f38841a);
    }

    public final int hashCode() {
        hw1 hw1Var = this.f38841a;
        if (hw1Var == null) {
            return 0;
        }
        return hw1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.f38841a + ")";
    }
}
