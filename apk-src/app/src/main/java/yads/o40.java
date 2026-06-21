package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o40 implements p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka0 f41460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41461b;

    public o40(ka0 ka0Var, List list) {
        this.f41460a = ka0Var;
        this.f41461b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return Intrinsics.a(this.f41460a, o40Var.f41460a) && Intrinsics.a(this.f41461b, o40Var.f41461b);
    }

    public final int hashCode() {
        ka0 ka0Var = this.f41460a;
        return this.f41461b.hashCode() + ((ka0Var == null ? 0 : ka0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.f41460a + ", cpmFloors=" + this.f41461b + ")";
    }
}
