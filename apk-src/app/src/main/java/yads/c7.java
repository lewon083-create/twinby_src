package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37304c;

    public c7(List list, int i, int i10) {
        this.f37302a = list;
        this.f37303b = i;
        this.f37304c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return Intrinsics.a(this.f37302a, c7Var.f37302a) && this.f37303b == c7Var.f37303b && this.f37304c == c7Var.f37304c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37304c) + qd3.a(this.f37303b, this.f37302a.hashCode() * 31, 31);
    }

    public final String toString() {
        List list = this.f37302a;
        int i = this.f37303b;
        int i10 = this.f37304c;
        StringBuilder sb2 = new StringBuilder("AdPod(items=");
        sb2.append(list);
        sb2.append(", closableAdPosition=");
        sb2.append(i);
        sb2.append(", rewardAdPosition=");
        return t.z.d(i10, ")", sb2);
    }
}
