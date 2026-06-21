package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 extends z61 {
    @Override // com.google.android.gms.internal.ads.z61
    public final /* synthetic */ void t(Object obj) {
        n((ed.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.z61
    public final Object u(Object obj, Throwable th2) {
        z71 z71Var = (z71) obj;
        ed.d dVarA = z71Var.a(th2);
        if (dVarA != null) {
            return dVarA;
        }
        throw new NullPointerException(gr.P("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", z71Var));
    }
}
