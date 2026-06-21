package jk;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.p implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f26691b = new d(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        k kVar = (k) obj2;
        k kVar2 = e.f26692a;
        c cVar = kVar.f26714e;
        Intrinsics.b(cVar);
        return new k(jLongValue, kVar, cVar, 0);
    }
}
