package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements ny1, vw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n90 f10088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ly1 f10089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx1 f10090d;

    public rx1(tx1 tx1Var, Object obj) {
        this.f10090d = tx1Var;
        this.f10088b = new n90(27, (CopyOnWriteArrayList) tx1Var.f8490c.f8249d, null, false);
        this.f10089c = new ly1((CopyOnWriteArrayList) tx1Var.f8491d.f7676c, (hy1) null);
        this.f10087a = obj;
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void a(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        if (c(hy1Var)) {
            n90 n90Var = this.f10088b;
            d(ey1Var, hy1Var);
            n90Var.getClass();
            n90Var.q(new ky1(n90Var, zx1Var, ey1Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void b(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var, IOException iOException, boolean z5) {
        if (c(hy1Var)) {
            n90 n90Var = this.f10088b;
            d(ey1Var, hy1Var);
            n90Var.getClass();
            n90Var.q(new yv0(n90Var, zx1Var, ey1Var, iOException, z5));
        }
    }

    public final boolean c(hy1 hy1Var) {
        hy1 hy1VarV;
        Object obj = this.f10087a;
        tx1 tx1Var = this.f10090d;
        if (hy1Var != null) {
            hy1VarV = tx1Var.v(obj, hy1Var);
            if (hy1VarV == null) {
                return false;
            }
        } else {
            hy1VarV = null;
        }
        tx1Var.u(obj);
        n90 n90Var = this.f10088b;
        n90Var.getClass();
        if (!Objects.equals((hy1) n90Var.f8248c, hy1VarV)) {
            this.f10088b = new n90(27, (CopyOnWriteArrayList) tx1Var.f8490c.f8249d, hy1VarV, false);
        }
        ly1 ly1Var = this.f10089c;
        ly1Var.getClass();
        if (Objects.equals((hy1) ly1Var.f7675b, hy1VarV)) {
            return true;
        }
        this.f10089c = new ly1((CopyOnWriteArrayList) tx1Var.f8491d.f7676c, hy1VarV);
        return true;
    }

    public final void d(ey1 ey1Var, hy1 hy1Var) {
        long j10 = ey1Var.f5142c;
        tx1 tx1Var = this.f10090d;
        Object obj = this.f10087a;
        tx1Var.w(j10, obj);
        tx1Var.w(ey1Var.f5143d, obj);
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void f(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        if (c(hy1Var)) {
            n90 n90Var = this.f10088b;
            d(ey1Var, hy1Var);
            n90Var.getClass();
            n90Var.q(new ky1(n90Var, zx1Var, ey1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void p(int i, hy1 hy1Var, ey1 ey1Var) {
        if (c(hy1Var)) {
            n90 n90Var = this.f10088b;
            d(ey1Var, hy1Var);
            n90Var.getClass();
            n90Var.q(new ly1(n90Var, ey1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void q(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var, int i10) {
        if (c(hy1Var)) {
            n90 n90Var = this.f10088b;
            d(ey1Var, hy1Var);
            n90Var.getClass();
            n90Var.q(new fc(n90Var, zx1Var, ey1Var, i10));
        }
    }
}
