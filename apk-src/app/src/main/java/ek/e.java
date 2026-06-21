package ek;

import java.util.Iterator;
import kotlin.collections.a0;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Sequence, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f16395a = new e();

    @Override // ek.d
    public final Sequence a(int i) {
        return f16395a;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return a0.f27474b;
    }

    @Override // ek.d
    public final Sequence take() {
        return f16395a;
    }
}
