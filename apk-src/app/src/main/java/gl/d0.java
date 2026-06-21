package gl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f20182b = errorCode;
    }
}
