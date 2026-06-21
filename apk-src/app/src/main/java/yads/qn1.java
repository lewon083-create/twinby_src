package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj1 f42350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd3 f42351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42352c;

    public qn1(qj1 qj1Var, vd3 vd3Var, List list) {
        this.f42350a = qj1Var;
        this.f42351b = vd3Var;
        this.f42352c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn1)) {
            return false;
        }
        qn1 qn1Var = (qn1) obj;
        return Intrinsics.a(this.f42350a, qn1Var.f42350a) && Intrinsics.a(this.f42351b, qn1Var.f42351b) && Intrinsics.a(this.f42352c, qn1Var.f42352c);
    }

    public final int hashCode() {
        qj1 qj1Var = this.f42350a;
        int iHashCode = (qj1Var == null ? 0 : qj1Var.hashCode()) * 31;
        vd3 vd3Var = this.f42351b;
        int iHashCode2 = (iHashCode + (vd3Var == null ? 0 : vd3Var.hashCode())) * 31;
        List list = this.f42352c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        qj1 qj1Var = this.f42350a;
        vd3 vd3Var = this.f42351b;
        List list = this.f42352c;
        StringBuilder sb2 = new StringBuilder("MediaValue(media=");
        sb2.append(qj1Var);
        sb2.append(", video=");
        sb2.append(vd3Var);
        sb2.append(", imageValues=");
        return t.z.h(sb2, list, ")");
    }
}
