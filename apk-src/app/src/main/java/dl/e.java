package dl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f15832a = obj;
    }
}
