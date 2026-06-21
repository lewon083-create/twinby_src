package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ru1 {

    @NotNull
    public static final qu1 Companion = new qu1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qk.a[] f42727e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f42729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42731d;

    static {
        uk.a1 a1Var = uk.a1.f34493a;
        f42727e = new qk.a[]{null, null, new uk.g0(a1Var, com.google.android.gms.internal.auth.g.q(a1Var)), null};
    }

    public /* synthetic */ ru1(int i, long j10, Integer num, Map map, String str) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, pu1.f42067a.getDescriptor());
            throw null;
        }
        this.f42728a = j10;
        this.f42729b = num;
        this.f42730c = map;
        this.f42731d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru1)) {
            return false;
        }
        ru1 ru1Var = (ru1) obj;
        return this.f42728a == ru1Var.f42728a && Intrinsics.a(this.f42729b, ru1Var.f42729b) && Intrinsics.a(this.f42730c, ru1Var.f42730c) && Intrinsics.a(this.f42731d, ru1Var.f42731d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f42728a) * 31;
        Integer num = this.f42729b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.f42730c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f42731d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f42728a + ", statusCode=" + this.f42729b + ", headers=" + this.f42730c + ", body=" + this.f42731d + ")";
    }

    public ru1(long j10, Integer num, Map map, String str) {
        this.f42728a = j10;
        this.f42729b = num;
        this.f42730c = map;
        this.f42731d = str;
    }
}
