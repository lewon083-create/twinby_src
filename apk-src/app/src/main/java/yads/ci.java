package yads;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ci extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(long j10) {
        super(1);
        this.f37400b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(j7.a.f(obj).getTimestamp() > this.f37400b);
    }
}
