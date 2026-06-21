package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38404a;

    public f90(String str) {
        this.f38404a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && Intrinsics.a(this.f38404a, ((f90) obj).f38404a);
    }

    public final int hashCode() {
        return this.f38404a.hashCode();
    }

    public final String toString() {
        return pe.a.f("OnWarningButtonClick(waring=", this.f38404a, ")");
    }
}
