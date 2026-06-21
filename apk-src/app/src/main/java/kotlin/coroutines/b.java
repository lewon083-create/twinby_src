package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f27495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f27496c;

    public b(f baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f27495b = safeCast;
        this.f27496c = baseKey instanceof b ? ((b) baseKey).f27496c : baseKey;
    }
}
