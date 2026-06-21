package ij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r f21353c = new r(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f21354b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.f21354b & 255, ((s) obj).f21354b & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f21354b == ((s) obj).f21354b;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f21354b);
    }

    public final String toString() {
        return String.valueOf(this.f21354b & 255);
    }
}
