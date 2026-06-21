package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class au1 implements bu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36862a;

    public au1(List list) {
        this.f36862a = list;
    }

    public final List a() {
        return this.f36862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au1) && Intrinsics.a(this.f36862a, ((au1) obj).f36862a);
    }

    public final int hashCode() {
        return this.f36862a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.f36862a + ")";
    }
}
