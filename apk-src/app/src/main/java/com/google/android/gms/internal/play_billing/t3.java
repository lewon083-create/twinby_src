package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 implements w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e3 f14314b = new e3(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14315a;

    public t3(w3... w3VarArr) {
        this.f14315a = w3VarArr;
    }

    public void a(int i, Object obj, f4 f4Var) throws androidx.datastore.preferences.protobuf.m {
        x2 x2Var = (x2) this.f14315a;
        x2Var.Y(i, 3);
        f4Var.h((q2) obj, x2Var.f14365c);
        x2Var.Y(i, 4);
    }

    public void b(int i, Object obj, f4 f4Var) throws androidx.datastore.preferences.protobuf.m {
        q2 q2Var = (q2) obj;
        x2 x2Var = (x2) this.f14315a;
        x2Var.a0((i << 3) | 2);
        x2Var.a0(q2Var.a(f4Var));
        f4Var.h(q2Var, x2Var.f14365c);
    }

    @Override // com.google.android.gms.internal.play_billing.w3
    public e4 c(Class cls) {
        for (int i = 0; i < 2; i++) {
            w3 w3Var = ((w3[]) this.f14315a)[i];
            if (w3Var.d(cls)) {
                return w3Var.c(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.w3
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((w3[]) this.f14315a)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    public t3() {
        c4 c4Var = c4.f14151c;
        t3 t3Var = new t3(e3.f14169b, f14314b);
        Charset charset = l3.f14238a;
        this.f14315a = t3Var;
    }

    public t3(x2 x2Var) {
        Charset charset = l3.f14238a;
        this.f14315a = x2Var;
        x2Var.f14365c = this;
    }
}
