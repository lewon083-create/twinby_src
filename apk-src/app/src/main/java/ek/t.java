package ek;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.p implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f16423b = new t();

    public t() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable p02 = (Iterable) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.iterator();
    }
}
