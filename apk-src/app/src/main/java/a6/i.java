package a6;

import com.google.android.gms.internal.measurement.j4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f470b;

    public i(b latestEvent) {
        Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
        this.f470b = latestEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && Intrinsics.a(this.f470b, ((i) obj).f470b);
    }

    public final int hashCode() {
        return this.f470b.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f470b + ", direction=-1)";
    }
}
