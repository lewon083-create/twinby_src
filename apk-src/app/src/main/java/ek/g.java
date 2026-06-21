package ek;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f16403c;

    public g(Sequence sequence, boolean z5, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f16401a = sequence;
        this.f16402b = z5;
        this.f16403c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
