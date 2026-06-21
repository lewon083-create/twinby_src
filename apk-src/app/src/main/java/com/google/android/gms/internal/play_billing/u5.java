package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f14331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f14332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x5 f14333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14334d;

    public final void finalize() {
        x5 x5Var;
        w5 w5Var = this.f14332b;
        if (w5Var != null) {
            v5 v5Var = w5Var.f14355c;
            if (!v5Var.isDone()) {
                if (t5.f14318g.w(v5Var, null, new q3(new d1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f14331a)), 2)))) {
                    t5.d(v5Var);
                }
            }
        }
        if (this.f14334d || (x5Var = this.f14333c) == null) {
            return;
        }
        x5Var.i(null);
    }
}
