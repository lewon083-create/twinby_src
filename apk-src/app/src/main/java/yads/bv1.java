package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bv1 {

    @NotNull
    public static final av1 Companion = new av1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37154d;

    public /* synthetic */ bv1(int i, long j10, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, zu1.f45541a.getDescriptor());
            throw null;
        }
        this.f37151a = j10;
        this.f37152b = str;
        this.f37153c = str2;
        this.f37154d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1)) {
            return false;
        }
        bv1 bv1Var = (bv1) obj;
        return this.f37151a == bv1Var.f37151a && Intrinsics.a(this.f37152b, bv1Var.f37152b) && Intrinsics.a(this.f37153c, bv1Var.f37153c) && Intrinsics.a(this.f37154d, bv1Var.f37154d);
    }

    public final int hashCode() {
        return this.f37154d.hashCode() + k4.a(this.f37153c, k4.a(this.f37152b, Long.hashCode(this.f37151a) * 31, 31), 31);
    }

    public final String toString() {
        long j10 = this.f37151a;
        String str = this.f37152b;
        String str2 = this.f37153c;
        String str3 = this.f37154d;
        StringBuilder sb2 = new StringBuilder("MobileAdsSdkLog(timestamp=");
        sb2.append(j10);
        sb2.append(", type=");
        sb2.append(str);
        l7.o.t(sb2, ", tag=", str2, ", text=", str3);
        sb2.append(")");
        return sb2.toString();
    }

    public bv1(long j10, String str, String str2, String str3) {
        this.f37151a = j10;
        this.f37152b = str;
        this.f37153c = str2;
        this.f37154d = str3;
    }
}
