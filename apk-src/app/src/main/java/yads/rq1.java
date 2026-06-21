package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42698d = "com.yandex.mobile.ads.mediation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr1 f42700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42701c;

    public rq1(String str, jr1 jr1Var, List list) {
        this.f42699a = str;
        this.f42700b = jr1Var;
        this.f42701c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq1)) {
            return false;
        }
        rq1 rq1Var = (rq1) obj;
        return Intrinsics.a(this.f42699a, rq1Var.f42699a) && this.f42700b == rq1Var.f42700b && Intrinsics.a(this.f42701c, rq1Var.f42701c);
    }

    public final int hashCode() {
        return this.f42701c.hashCode() + ((this.f42700b.hashCode() + (this.f42699a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f42699a;
        jr1 jr1Var = this.f42700b;
        List list = this.f42701c;
        StringBuilder sb2 = new StringBuilder("MediationNetwork(name=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(jr1Var);
        sb2.append(", adapters=");
        return t.z.h(sb2, list, ")");
    }
}
