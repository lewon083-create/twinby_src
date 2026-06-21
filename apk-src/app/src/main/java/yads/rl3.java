package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42631a;

    public rl3(ArrayList arrayList) {
        this.f42631a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl3) && Intrinsics.a(this.f42631a, ((rl3) obj).f42631a);
    }

    public final int hashCode() {
        return this.f42631a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f42631a + ")";
    }
}
