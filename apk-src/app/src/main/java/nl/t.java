package nl;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f29572a = new s(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f29573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f29574c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f29573b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f29574c = atomicReferenceArr;
    }

    public static final void a(s segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f29570f != null || segment.f29571g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f29568d) {
            return;
        }
        AtomicReference atomicReference = f29574c[(int) (Thread.currentThread().getId() & (((long) f29573b) - 1))];
        s sVar = f29572a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return;
        }
        int i = sVar2 != null ? sVar2.f29567c : 0;
        if (i >= 65536) {
            atomicReference.set(sVar2);
            return;
        }
        segment.f29570f = sVar2;
        segment.f29566b = 0;
        segment.f29567c = i + 8192;
        atomicReference.set(segment);
    }

    public static final s b() {
        AtomicReference atomicReference = f29574c[(int) (Thread.currentThread().getId() & (((long) f29573b) - 1))];
        s sVar = f29572a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new s();
        }
        if (sVar2 == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(sVar2.f29570f);
        sVar2.f29570f = null;
        sVar2.f29567c = 0;
        return sVar2;
    }
}
