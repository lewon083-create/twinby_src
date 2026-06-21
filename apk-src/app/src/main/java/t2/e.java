package t2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33403a;

    public e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33403a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Intrinsics.a(this.f33403a, ((e) obj).f33403a);
    }

    public final int hashCode() {
        return this.f33403a.hashCode();
    }

    public final String toString() {
        return this.f33403a;
    }
}
