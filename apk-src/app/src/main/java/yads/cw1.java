package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cw1 {
    public static dw1 a(String str) {
        for (dw1 dw1Var : dw1.values()) {
            if (Intrinsics.a(dw1Var.f37906b, str)) {
                return dw1Var;
            }
        }
        return dw1.f37904d;
    }
}
