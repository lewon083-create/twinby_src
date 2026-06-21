package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo2 f38662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eo2 f38663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eo2 f38664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eo2 f38665d;

    public g61(eo2 eo2Var, eo2 eo2Var2, eo2 eo2Var3, eo2 eo2Var4) {
        this.f38662a = eo2Var;
        this.f38663b = eo2Var2;
        this.f38664c = eo2Var3;
        this.f38665d = eo2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g61)) {
            return false;
        }
        g61 g61Var = (g61) obj;
        return this.f38662a == g61Var.f38662a && this.f38663b == g61Var.f38663b && this.f38664c == g61Var.f38664c && this.f38665d == g61Var.f38665d;
    }

    public final int hashCode() {
        return this.f38665d.hashCode() + ((this.f38664c.hashCode() + ((this.f38663b.hashCode() + (this.f38662a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f38662a + ", impressionTrackingStartReportType=" + this.f38663b + ", impressionTrackingFailureReportType=" + this.f38664c + ", forcedImpressionTrackingFailureReportType=" + this.f38665d + ")";
    }
}
