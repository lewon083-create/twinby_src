package dl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IOException f15875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f15876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f15875b = firstConnectException;
        this.f15876c = firstConnectException;
    }
}
