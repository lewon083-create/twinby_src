package p2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String message, int i) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
