package ij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c0 f21332c = new c0(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f21333b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.f21333b & 65535, ((d0) obj).f21333b & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f21333b == ((d0) obj).f21333b;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f21333b);
    }

    public final String toString() {
        return String.valueOf(this.f21333b & 65535);
    }
}
