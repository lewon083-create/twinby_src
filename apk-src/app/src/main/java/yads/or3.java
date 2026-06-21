package yads;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class or3 implements ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f41691a;

    public or3(j5 j5Var) {
        this.f41691a = j5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof or3) && Intrinsics.a(((or3) obj).f41691a, this.f41691a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f41691a.f39727b;
    }

    public final int hashCode() {
        return this.f41691a.f39727b.hashCode();
    }
}
