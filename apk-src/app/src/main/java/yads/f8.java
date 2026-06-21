package yads;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f38397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f38398h;

    public f8(boolean z5, boolean z10, String str, long j10, int i, boolean z11, Set set, Map map) {
        this.f38391a = z5;
        this.f38392b = z10;
        this.f38393c = str;
        this.f38394d = j10;
        this.f38395e = i;
        this.f38396f = z11;
        this.f38397g = set;
        this.f38398h = map;
    }

    public final boolean a() {
        return this.f38391a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f38391a == f8Var.f38391a && this.f38392b == f8Var.f38392b && Intrinsics.a(this.f38393c, f8Var.f38393c) && this.f38394d == f8Var.f38394d && this.f38395e == f8Var.f38395e && this.f38396f == f8Var.f38396f && Intrinsics.a(this.f38397g, f8Var.f38397g) && Intrinsics.a(this.f38398h, f8Var.f38398h);
    }

    public final int hashCode() {
        return this.f38398h.hashCode() + ((this.f38397g.hashCode() + ((Boolean.hashCode(this.f38396f) + qd3.a(this.f38395e, l7.o.d(this.f38394d, k4.a(this.f38393c, (Boolean.hashCode(this.f38392b) + (Boolean.hashCode(this.f38391a) * 31)) * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f38391a + ", debug=" + this.f38392b + ", apiKey=" + this.f38393c + ", validationTimeoutInSec=" + this.f38394d + ", usagePercent=" + this.f38395e + ", blockAdOnInternalError=" + this.f38396f + ", enabledAdUnits=" + this.f38397g + ", adNetworksCustomParameters=" + this.f38398h + ")";
    }
}
