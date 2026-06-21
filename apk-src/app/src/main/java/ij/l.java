package ij;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f21340b;

    public l(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f21340b = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Intrinsics.a(this.f21340b, ((l) obj).f21340b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21340b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f21340b + ')';
    }
}
