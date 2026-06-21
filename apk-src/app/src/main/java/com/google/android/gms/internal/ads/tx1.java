package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tx1 extends nx1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f10747h = new HashMap();
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public em1 f10748j;

    @Override // com.google.android.gms.internal.ads.nx1
    public final void g() {
        for (sx1 sx1Var : this.f10747h.values()) {
            sx1Var.f10432a.o(sx1Var.f10433b);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void i() {
        for (sx1 sx1Var : this.f10747h.values()) {
            sx1Var.f10432a.p(sx1Var.f10433b);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public void j() {
        HashMap map = this.f10747h;
        for (sx1 sx1Var : map.values()) {
            nx1 nx1Var = sx1Var.f10432a;
            nx1Var.q(sx1Var.f10433b);
            rx1 rx1Var = sx1Var.f10434c;
            nx1Var.l(rx1Var);
            nx1Var.m(rx1Var);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public void r() {
        Iterator it = this.f10747h.values().iterator();
        while (it.hasNext()) {
            ((sx1) it.next()).f10432a.r();
        }
    }

    public abstract void s(Object obj, nx1 nx1Var, ci ciVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.iy1, com.google.android.gms.internal.ads.qx1] */
    public final void t(final Integer num, nx1 nx1Var) {
        HashMap map = this.f10747h;
        ix.o(!map.containsKey(num));
        ?? r12 = new iy1() { // from class: com.google.android.gms.internal.ads.qx1
            @Override // com.google.android.gms.internal.ads.iy1
            public final /* synthetic */ void a(nx1 nx1Var2, ci ciVar) {
                this.f9636a.s(num, nx1Var2, ciVar);
            }
        };
        rx1 rx1Var = new rx1(this, num);
        map.put(num, new sx1(nx1Var, r12, rx1Var));
        Handler handler = this.i;
        handler.getClass();
        n90 n90Var = nx1Var.f8490c;
        n90Var.getClass();
        ((CopyOnWriteArrayList) n90Var.f8249d).add(new jy1(handler, rx1Var));
        this.i.getClass();
        ly1 ly1Var = nx1Var.f8491d;
        ly1Var.getClass();
        ((CopyOnWriteArrayList) ly1Var.f7676c).add(new uw1(rx1Var));
        em1 em1Var = this.f10748j;
        fv1 fv1Var = this.f8494g;
        fv1Var.getClass();
        nx1Var.n(r12, em1Var, fv1Var);
        if (this.f8489b.isEmpty()) {
            nx1Var.p(r12);
        }
    }

    public abstract hy1 v(Object obj, hy1 hy1Var);

    public void u(Object obj) {
    }

    public void w(long j10, Object obj) {
    }
}
