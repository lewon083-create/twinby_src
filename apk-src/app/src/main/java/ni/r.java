package ni;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29478a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Object instance) {
        this(instance, null);
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public final boolean equals(Object obj) {
        T t10 = get();
        return t10 != 0 ? (obj instanceof r) && ((r) obj).get() == t10 : obj == this;
    }

    public final int hashCode() {
        return this.f29478a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object instance, ReferenceQueue referenceQueue) {
        super(instance, referenceQueue);
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f29478a = System.identityHashCode(instance);
    }
}
