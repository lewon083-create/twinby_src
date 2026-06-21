package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class as1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36849c;

    public as1(long j10, String str, List list) {
        this.f36847a = str;
        this.f36848b = list;
        this.f36849c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as1)) {
            return false;
        }
        as1 as1Var = (as1) obj;
        return Intrinsics.a(this.f36847a, as1Var.f36847a) && Intrinsics.a(this.f36848b, as1Var.f36848b) && this.f36849c == as1Var.f36849c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36849c) + eb.a(this.f36848b, this.f36847a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f36847a;
        List list = this.f36848b;
        long j10 = this.f36849c;
        StringBuilder sb2 = new StringBuilder("MediationPrefetchAdUnitSettings(adUnitId=");
        sb2.append(str);
        sb2.append(", networks=");
        sb2.append(list);
        sb2.append(", loadTimeoutMillis=");
        return pe.a.h(sb2, j10, ")");
    }
}
