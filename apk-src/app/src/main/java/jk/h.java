package jk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f26712a;

    public h(Throwable th2) {
        this.f26712a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Intrinsics.a(this.f26712a, ((h) obj).f26712a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f26712a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // jk.i
    public final String toString() {
        return "Closed(" + this.f26712a + ')';
    }
}
