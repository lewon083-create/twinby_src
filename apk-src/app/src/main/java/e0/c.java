package e0;

import a0.q2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f15881a;

    public c(q2 unsupportedUseCase) {
        Intrinsics.checkNotNullParameter(unsupportedUseCase, "unsupportedUseCase");
        this.f15881a = unsupportedUseCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f15881a, ((c) obj).f15881a);
    }

    public final int hashCode() {
        return this.f15881a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.f15881a + ')';
    }
}
