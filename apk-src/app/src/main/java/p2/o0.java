package p2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f31040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Throwable finalException) {
        super(Integer.MAX_VALUE);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f31040b = finalException;
    }
}
