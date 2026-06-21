package yads;

import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sm3 {
    public static ee3 a(lm3 lm3Var) {
        if (lm3Var instanceof am0) {
            return de3.a((am0) lm3Var);
        }
        if (lm3Var instanceof nb2) {
            return de3.a();
        }
        h82 h82Var = lm3Var.f40609b;
        if (h82Var == null) {
            return de3.a(lm3Var.getMessage());
        }
        int i = h82Var.f39069a;
        if (i >= 500) {
            return de3.b();
        }
        return de3.b(a0.u.k(i, "Network Error.  Code: ", ".") + " Data: \n" + new String(h82Var.f39070b, Charsets.UTF_8));
    }
}
