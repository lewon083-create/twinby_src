package ek;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Sequence, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16427a;

    public w(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f16427a = sequence;
    }

    @Override // ek.d
    public final Sequence a(int i) {
        return i >= 50 ? e.f16395a : new v(this.f16427a, i, 50);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // ek.d
    public final Sequence take() {
        return this;
    }
}
