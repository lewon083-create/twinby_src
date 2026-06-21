package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er0 f40182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40185e;

    public kf1(List list, er0 er0Var, List list2, String str, long j10) {
        this.f40181a = list;
        this.f40182b = er0Var;
        this.f40183c = list2;
        this.f40184d = str;
        this.f40185e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf1)) {
            return false;
        }
        kf1 kf1Var = (kf1) obj;
        return Intrinsics.a(this.f40181a, kf1Var.f40181a) && Intrinsics.a(this.f40182b, kf1Var.f40182b) && Intrinsics.a(this.f40183c, kf1Var.f40183c) && Intrinsics.a(this.f40184d, kf1Var.f40184d) && this.f40185e == kf1Var.f40185e;
    }

    public final int hashCode() {
        List list = this.f40181a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        er0 er0Var = this.f40182b;
        int iA = eb.a(this.f40183c, (iHashCode + (er0Var == null ? 0 : er0Var.hashCode())) * 31, 31);
        String str = this.f40184d;
        return Long.hashCode(this.f40185e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        List list = this.f40181a;
        er0 er0Var = this.f40182b;
        List list2 = this.f40183c;
        String str = this.f40184d;
        long j10 = this.f40185e;
        StringBuilder sb2 = new StringBuilder("Link(actions=");
        sb2.append(list);
        sb2.append(", falseClick=");
        sb2.append(er0Var);
        sb2.append(", trackingUrls=");
        sb2.append(list2);
        sb2.append(", url=");
        sb2.append(str);
        sb2.append(", clickableDelay=");
        return pe.a.h(sb2, j10, ")");
    }
}
