package ek;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements Sequence, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16426c;

    public v(Sequence sequence, int i, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f16424a = sequence;
        this.f16425b = i;
        this.f16426c = i10;
        if (i < 0) {
            throw new IllegalArgumentException(l7.o.i(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(l7.o.i(i10, "endIndex should be non-negative, but is ").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(a0.u.j(i10, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // ek.d
    public final Sequence a(int i) {
        int i10 = this.f16426c;
        int i11 = this.f16425b;
        return i >= i10 - i11 ? e.f16395a : new v(this.f16424a, i11 + i, i10);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // ek.d
    public final Sequence take() {
        int i = this.f16426c;
        int i10 = this.f16425b;
        if (50 >= i - i10) {
            return this;
        }
        return new v(this.f16424a, i10, i10 + 50);
    }
}
