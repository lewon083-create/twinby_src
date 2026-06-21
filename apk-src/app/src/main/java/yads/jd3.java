package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jd3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce1 f39839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f39841d;

    public jd3(String str, ce1 ce1Var, String str2, HashMap map) {
        this.f39838a = str;
        this.f39839b = ce1Var;
        this.f39840c = str2;
        this.f39841d = map;
    }

    @Override // yads.yj3
    public final Map a() {
        return Collections.unmodifiableMap(this.f39841d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd3)) {
            return false;
        }
        jd3 jd3Var = (jd3) obj;
        return Intrinsics.a(this.f39838a, jd3Var.f39838a) && Intrinsics.a(this.f39839b, jd3Var.f39839b) && Intrinsics.a(this.f39840c, jd3Var.f39840c) && Intrinsics.a(this.f39841d, jd3Var.f39841d);
    }

    public final int hashCode() {
        int iHashCode = this.f39838a.hashCode() * 31;
        ce1 ce1Var = this.f39839b;
        int iHashCode2 = (iHashCode + (ce1Var == null ? 0 : ce1Var.hashCode())) * 31;
        String str = this.f39840c;
        return this.f39841d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f39838a + ", javaScriptResource=" + this.f39839b + ", parameters=" + this.f39840c + ", events=" + this.f39841d + ")";
    }
}
