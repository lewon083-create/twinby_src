package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ax implements w83 {
    public static ix b(tg1 tg1Var, sw swVar) {
        int iOrdinal;
        String str = swVar.f43103b;
        if (str == null) {
            return null;
        }
        try {
            iOrdinal = swVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (iOrdinal == 0) {
            return new ex(((vg1) tg1Var).c(str));
        }
        if (iOrdinal == 1) {
            return new fx(((vg1) tg1Var).c(str));
        }
        if (iOrdinal == 2) {
            return new dx(((vg1) tg1Var).a(str, false));
        }
        if (iOrdinal == 3) {
            return new gx(((vg1) tg1Var).c(str));
        }
        if (iOrdinal == 4) {
            return new hx(((vg1) tg1Var).c(str));
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new ij.j();
    }

    @Override // yads.w83
    public final ix a(tg1 tg1Var, String str) {
        sw swVar;
        vg1 vg1Var = (vg1) tg1Var;
        if (!vg1Var.a(str)) {
            str = null;
        }
        if (str != null) {
            sw.f43101d.getClass();
            sw[] swVarArrValues = sw.values();
            int length = swVarArrValues.length;
            for (int i = 0; i < length; i++) {
                swVar = swVarArrValues[i];
                if (Intrinsics.a(swVar.f43103b, str)) {
                    break;
                }
            }
            swVar = null;
        } else {
            swVar = null;
        }
        if (swVar != null) {
            return b(vg1Var, swVar);
        }
        return null;
    }

    @Override // yads.w83
    public final ix a(tg1 tg1Var, sw swVar) {
        String str = swVar.f43103b;
        if (str == null || !((vg1) tg1Var).a(str)) {
            swVar = null;
        }
        if (swVar != null) {
            return b(tg1Var, swVar);
        }
        return null;
    }
}
