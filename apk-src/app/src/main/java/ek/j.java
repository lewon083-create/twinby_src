package ek;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f16411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f16412b;

    public j(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f16411a = getInitialValue;
        this.f16412b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i(this);
    }
}
