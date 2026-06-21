package qk;

import kotlin.jvm.internal.Intrinsics;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public e(int i) {
        super(o.i(i, "An unknown field for index "));
    }
}
