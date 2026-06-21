package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wl1 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final yl1 c() {
        if (this instanceof yl1) {
            return (yl1) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final am1 e() {
        if (this instanceof am1) {
            return (am1) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            nm1 nm1Var = new nm1(new jm1(sb2));
            nm1Var.i = 1;
            lm1.f7577a.getClass();
            km1.N(nm1Var, this);
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
