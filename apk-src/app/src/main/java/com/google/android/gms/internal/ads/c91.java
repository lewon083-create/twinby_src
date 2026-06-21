package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 extends h81 implements RunnableFuture {
    public volatile p81 i;

    public c91(Callable callable) {
        this.i = new b91(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        p81 p81Var;
        if (m() && (p81Var = this.i) != null) {
            p81Var.g();
        }
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        p81 p81Var = this.i;
        if (p81Var == null) {
            return super.h();
        }
        String string = p81Var.toString();
        return t.z.g(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        p81 p81Var = this.i;
        if (p81Var != null) {
            p81Var.run();
        }
        this.i = null;
    }
}
