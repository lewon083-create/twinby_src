package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class od2 {

    @NotNull
    public static final nd2 Companion = new nd2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f41517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f41518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f41519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f41520e;

    public /* synthetic */ od2(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f41516a = null;
        } else {
            this.f41516a = num;
        }
        if ((i & 2) == 0) {
            this.f41517b = null;
        } else {
            this.f41517b = num2;
        }
        if ((i & 4) == 0) {
            this.f41518c = null;
        } else {
            this.f41518c = num3;
        }
        if ((i & 8) == 0) {
            this.f41519d = null;
        } else {
            this.f41519d = num4;
        }
        if ((i & 16) == 0) {
            this.f41520e = null;
        } else {
            this.f41520e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od2)) {
            return false;
        }
        od2 od2Var = (od2) obj;
        return Intrinsics.a(this.f41516a, od2Var.f41516a) && Intrinsics.a(this.f41517b, od2Var.f41517b) && Intrinsics.a(this.f41518c, od2Var.f41518c) && Intrinsics.a(this.f41519d, od2Var.f41519d) && Intrinsics.a(this.f41520e, od2Var.f41520e);
    }

    public final int hashCode() {
        Integer num = this.f41516a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f41517b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f41518c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f41519d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f41520e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f41516a;
        Integer num2 = this.f41517b;
        Integer num3 = this.f41518c;
        Integer num4 = this.f41519d;
        Integer num5 = this.f41520e;
        StringBuilder sbO = com.google.android.gms.internal.ads.om1.o("PlayBackOptimizationConfig(minBufferMs=", ", maxBufferMs=", num, num2, ", bufferForPlaybackMs=");
        gf.a.t(sbO, num3, ", bufferForPlaybackAfterRebufferMs=", num4, ", targetBufferBytes=");
        return a0.u.m(sbO, num5, ")");
    }
}
