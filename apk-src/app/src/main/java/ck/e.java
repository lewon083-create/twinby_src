package ck;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final d f2380f = new d(null);

    static {
        new e((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        char c8 = this.f2373b;
        char c9 = this.f2374c;
        if (Intrinsics.d(c8, c9) > 0) {
            e eVar = (e) obj;
            if (Intrinsics.d(eVar.f2373b, eVar.f2374c) > 0) {
                return true;
            }
        }
        e eVar2 = (e) obj;
        return c8 == eVar2.f2373b && c9 == eVar2.f2374c;
    }

    public final int hashCode() {
        char c8 = this.f2373b;
        char c9 = this.f2374c;
        if (Intrinsics.d(c8, c9) > 0) {
            return -1;
        }
        return (c8 * 31) + c9;
    }

    public final String toString() {
        return this.f2373b + ".." + this.f2374c;
    }
}
