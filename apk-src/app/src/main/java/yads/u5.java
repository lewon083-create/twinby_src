package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f43558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f43559b;

    public u5(v5 v5Var, Map map) {
        this.f43558a = v5Var;
        this.f43559b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.f43558a == u5Var.f43558a && Intrinsics.a(this.f43559b, u5Var.f43559b);
    }

    public final int hashCode() {
        return this.f43559b.hashCode() + (this.f43558a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f43558a + ", reportParameters=" + this.f43559b + ")";
    }
}
