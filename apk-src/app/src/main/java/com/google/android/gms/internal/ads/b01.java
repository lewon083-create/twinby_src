package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 implements k01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd f3540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i21 f3541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3542e;

    public b01(jd jdVar, Map map, ux0 ux0Var, j21 j21Var) {
        this.f3539b = map;
        this.f3540c = jdVar;
        this.f3541d = j21Var.a(112);
        this.f3542e = ux0Var.M();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        wd wdVar;
        try {
            try {
                this.f3541d.a();
                ed.d dVar = (ed.d) this.f3539b.get("gs");
                if (dVar != null && (wdVar = (wd) dVar.get(this.f3542e, TimeUnit.MILLISECONDS)) != null) {
                    jd jdVar = this.f3540c;
                    synchronized (jdVar) {
                        de deVarZ0 = wdVar.z0();
                        jdVar.b();
                        ((wd) jdVar.f9560c).n0(deVarZ0);
                        long jW0 = wdVar.w0();
                        jdVar.b();
                        ((wd) jdVar.f9560c).W(jW0);
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e3) {
                this.f3541d.b(e3);
            }
            this.f3541d.c();
            return null;
        } catch (Throwable th2) {
            this.f3541d.c();
            throw th2;
        }
    }
}
