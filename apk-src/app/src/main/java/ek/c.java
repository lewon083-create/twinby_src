package ek;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Sequence, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16394b;

    public c(Sequence sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f16393a = sequence;
        this.f16394b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // ek.d
    public final Sequence a(int i) {
        int i10 = this.f16394b + i;
        return i10 < 0 ? new c(this, i) : new c(this.f16393a, i10);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // ek.d
    public final Sequence take() {
        int i = this.f16394b;
        int i10 = i + 50;
        return i10 < 0 ? new w(this) : new v(this.f16393a, i, i10);
    }
}
