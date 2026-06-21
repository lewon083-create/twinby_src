package oj;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends c implements n {
    private final int arity;

    public i(int i, mj.a aVar) {
        super(aVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @Override // oj.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        g0.f27511a.getClass();
        String strA = h0.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
