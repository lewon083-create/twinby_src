package pk;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import mk.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f31523e;

    public i(long j10, i iVar, int i) {
        super(j10, iVar, i);
        this.f31523e = new AtomicReferenceArray(h.f31522f);
    }

    @Override // mk.r
    public final int g() {
        return h.f31522f;
    }

    @Override // mk.r
    public final void h(int i, CoroutineContext coroutineContext) {
        this.f31523e.set(i, h.f31521e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f28938c + ", hashCode=" + hashCode() + ']';
    }
}
