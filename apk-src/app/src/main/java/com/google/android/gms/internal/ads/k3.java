package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f7099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f7100c;

    public k3(int i) {
        this.f7098a = i;
        switch (i) {
            case 1:
                this.f7099b = new tk0(4);
                this.f7100c = new r2(-1, -1, "image/webp");
                break;
            default:
                this.f7099b = new tk0(4);
                this.f7100c = new r2(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        switch (this.f7098a) {
            case 0:
                v1 v1Var = (v1) a2Var;
                v1Var.b(4, false);
                tk0 tk0Var = this.f7099b;
                tk0Var.y(4);
                v1Var.R(tk0Var.f10641a, 0, 4, false);
                if (tk0Var.P() == 1718909296) {
                    tk0Var.y(4);
                    v1Var.R(tk0Var.f10641a, 0, 4, false);
                    if (tk0Var.P() == 1635150182) {
                    }
                }
                break;
            default:
                tk0 tk0Var2 = this.f7099b;
                tk0Var2.y(4);
                v1 v1Var2 = (v1) a2Var;
                v1Var2.R(tk0Var2.f10641a, 0, 4, false);
                if (tk0Var2.P() == 1380533830) {
                    v1Var2.b(4, false);
                    tk0Var2.y(4);
                    v1Var2.R(tk0Var2.f10641a, 0, 4, false);
                    if (tk0Var2.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        switch (this.f7098a) {
            case 0:
                this.f7100c.b(b2Var);
                break;
            default:
                this.f7100c.b(b2Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
        int i = this.f7098a;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        switch (this.f7098a) {
            case 0:
                this.f7100c.d(j10, j11);
                break;
            default:
                this.f7100c.d(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) {
        switch (this.f7098a) {
        }
        return this.f7100c.e(a2Var, e2Var);
    }

    private final void f() {
    }

    private final void g() {
    }
}
