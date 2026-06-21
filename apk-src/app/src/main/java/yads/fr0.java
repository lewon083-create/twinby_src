package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f38535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f38537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final er0 f38538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f38539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f38540f;

    public fr0(e00 e00Var, long j10, h1 h1Var, er0 er0Var, Map map, c cVar) {
        this.f38535a = e00Var;
        this.f38536b = j10;
        this.f38537c = h1Var;
        this.f38538d = er0Var;
        this.f38539e = map;
        this.f38540f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr0)) {
            return false;
        }
        fr0 fr0Var = (fr0) obj;
        return this.f38535a == fr0Var.f38535a && this.f38536b == fr0Var.f38536b && this.f38537c == fr0Var.f38537c && Intrinsics.a(this.f38538d, fr0Var.f38538d) && Intrinsics.a(this.f38539e, fr0Var.f38539e) && Intrinsics.a(this.f38540f, fr0Var.f38540f);
    }

    public final int hashCode() {
        int iHashCode = (this.f38537c.hashCode() + l7.o.d(this.f38536b, this.f38535a.hashCode() * 31, 31)) * 31;
        er0 er0Var = this.f38538d;
        int iHashCode2 = (this.f38539e.hashCode() + ((iHashCode + (er0Var == null ? 0 : er0Var.hashCode())) * 31)) * 31;
        c cVar = this.f38540f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f38535a + ", startTime=" + this.f38536b + ", activityInteractionType=" + this.f38537c + ", falseClick=" + this.f38538d + ", reportData=" + this.f38539e + ", abExperiments=" + this.f38540f + ")";
    }
}
