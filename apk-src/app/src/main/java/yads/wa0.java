package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wa0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f44325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f44326d;

    public wa0(String str, String str2, List list, List list2) {
        this.f44323a = str;
        this.f44324b = str2;
        this.f44325c = list;
        this.f44326d = list2;
    }

    @Override // yads.m0
    public final String a() {
        return this.f44323a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return Intrinsics.a(this.f44323a, wa0Var.f44323a) && Intrinsics.a(this.f44324b, wa0Var.f44324b) && Intrinsics.a(this.f44325c, wa0Var.f44325c) && Intrinsics.a(this.f44326d, wa0Var.f44326d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f44324b, this.f44323a.hashCode() * 31, 31);
        List list = this.f44325c;
        return this.f44326d.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.f44323a;
        String str2 = this.f44324b;
        return gf.a.l(t.z.j("DeeplinkAction(actionType=", str, ", fallbackUrl=", str2, ", fallbackTrackingUrls="), this.f44325c, ", preferredPackages=", this.f44326d, ")");
    }
}
