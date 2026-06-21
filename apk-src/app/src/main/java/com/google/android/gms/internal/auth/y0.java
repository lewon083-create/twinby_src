package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public static final x0 a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        x0 x0Var2 = (x0) obj2;
        if (!x0Var2.isEmpty()) {
            if (!x0Var.f13306b) {
                if (x0Var.isEmpty()) {
                    x0Var = new x0();
                } else {
                    x0 x0Var3 = new x0(x0Var);
                    x0Var3.f13306b = true;
                    x0Var = x0Var3;
                }
            }
            x0Var.a();
            if (!x0Var2.isEmpty()) {
                x0Var.putAll(x0Var2);
            }
        }
        return x0Var;
    }
}
