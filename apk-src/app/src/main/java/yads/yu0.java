package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yu0 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu0 f45151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(zu0 zu0Var) {
        super(0);
        this.f45151b = zu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zu0 zu0Var = this.f45151b;
        Sequence sequence = zu0Var.f45538c;
        Sequence elements = zu0Var.f45539d;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {sequence, elements};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Intrinsics.checkNotNullParameter(elements2, "<this>");
        ek.p pVar = new ek.p(1, elements2);
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return ek.u.d(new ek.h(pVar, new ch.a(2), new ch.a(1)), "&", xu0.f44806b, 30);
    }
}
