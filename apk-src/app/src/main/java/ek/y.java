package ek;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f16432b;

    public y(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f16431a = sequence;
        this.f16432b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new x(this);
    }
}
