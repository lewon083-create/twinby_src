package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t71 extends h81 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10522k = 0;
    public ed.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f10523j;

    public t71(ed.d dVar, Object obj) {
        dVar.getClass();
        this.i = dVar;
        this.f10523j = obj;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        o(this.i);
        this.i = null;
        this.f10523j = null;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        String strG;
        ed.d dVar = this.i;
        Object obj = this.f10523j;
        String strH = super.h();
        if (dVar != null) {
            String string = dVar.toString();
            strG = t.z.g(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strG = "";
        }
        if (obj == null) {
            if (strH != null) {
                return strG.concat(strH);
            }
            return null;
        }
        int length = strG.length();
        String string2 = obj.toString();
        return om1.n(new StringBuilder(string2.length() + length + 10 + 1), strG, "function=[", string2, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ed.d dVar = this.i;
        Object obj = this.f10523j;
        if (((this.f8952b instanceof a71) | (dVar == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (dVar.isCancelled()) {
            n(dVar);
            return;
        }
        try {
            try {
                Object objU = u(obj, vv.L(dVar));
                this.f10523j = null;
                t(objU);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    f(th2);
                } finally {
                    this.f10523j = null;
                }
            }
        } catch (Error e3) {
            f(e3);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            f(e7.getCause());
        } catch (Exception e10) {
            f(e10);
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Object obj2);
}
