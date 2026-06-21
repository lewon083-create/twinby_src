package a3;

import kotlin.jvm.internal.Intrinsics;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f418b = fragment;
    }
}
