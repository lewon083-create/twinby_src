package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 extends t5 {
    public final /* synthetic */ w5 i;

    public v5(w5 w5Var) {
        this.i = w5Var;
    }

    @Override // com.google.android.gms.internal.play_billing.t5
    public final String b() {
        u5 u5Var = (u5) this.i.f14354b.get();
        return u5Var == null ? "Completer object has been garbage collected, future will fail soon" : pe.a.f("tag=[", String.valueOf(u5Var.f14331a), "]");
    }
}
