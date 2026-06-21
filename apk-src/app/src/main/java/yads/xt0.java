package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44799a;

    public xt0(String str) {
        this.f44799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt0) && Intrinsics.a(this.f44799a, ((xt0) obj).f44799a);
    }

    public final int hashCode() {
        return this.f44799a.hashCode();
    }

    public final String toString() {
        return pe.a.f("FeedSessionData(value=", this.f44799a, ")");
    }
}
