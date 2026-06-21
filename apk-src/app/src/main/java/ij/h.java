package ij;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static g a(i mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            return new p(initializer, null, 2, null);
        }
        if (iOrdinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            o oVar = new o();
            oVar.f21345b = initializer;
            oVar.f21346c = b0.f21327a;
            return oVar;
        }
        if (iOrdinal != 2) {
            throw new j();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        g0 g0Var = new g0();
        g0Var.f21335b = initializer;
        g0Var.f21336c = b0.f21327a;
        return g0Var;
    }

    public static p b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new p(initializer, null, 2, null);
    }
}
