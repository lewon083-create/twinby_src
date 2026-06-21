package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ou1 {

    @NotNull
    public static final nu1 Companion = new nu1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qk.a[] f41729f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f41733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41734e;

    static {
        uk.a1 a1Var = uk.a1.f34493a;
        f41729f = new qk.a[]{null, null, null, new uk.g0(a1Var, com.google.android.gms.internal.auth.g.q(a1Var)), null};
    }

    public /* synthetic */ ou1(int i, long j10, String str, String str2, Map map, String str3) {
        if (31 != (i & 31)) {
            uk.o0.e(i, 31, mu1.f41015a.getDescriptor());
            throw null;
        }
        this.f41730a = j10;
        this.f41731b = str;
        this.f41732c = str2;
        this.f41733d = map;
        this.f41734e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou1)) {
            return false;
        }
        ou1 ou1Var = (ou1) obj;
        return this.f41730a == ou1Var.f41730a && Intrinsics.a(this.f41731b, ou1Var.f41731b) && Intrinsics.a(this.f41732c, ou1Var.f41732c) && Intrinsics.a(this.f41733d, ou1Var.f41733d) && Intrinsics.a(this.f41734e, ou1Var.f41734e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f41732c, k4.a(this.f41731b, Long.hashCode(this.f41730a) * 31, 31), 31);
        Map map = this.f41733d;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f41734e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        long j10 = this.f41730a;
        String str = this.f41731b;
        String str2 = this.f41732c;
        Map map = this.f41733d;
        String str3 = this.f41734e;
        StringBuilder sb2 = new StringBuilder("MobileAdsNetworkRequestLog(timestamp=");
        sb2.append(j10);
        sb2.append(", method=");
        sb2.append(str);
        sb2.append(", url=");
        sb2.append(str2);
        sb2.append(", headers=");
        sb2.append(map);
        return t.z.g(sb2, ", body=", str3, ")");
    }

    public ou1(long j10, String str, String str2, Map map, String str3) {
        this.f41730a = j10;
        this.f41731b = str;
        this.f41732c = str2;
        this.f41733d = map;
        this.f41734e = str3;
    }
}
