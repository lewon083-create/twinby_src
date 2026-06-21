package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z61 extends h81 implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f12897l = 0;
    public ed.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f12898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f12899k;

    public z61(ed.d dVar, Class cls, Object obj) {
        dVar.getClass();
        this.i = dVar;
        this.f12898j = cls;
        this.f12899k = obj;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        o(this.i);
        this.i = null;
        this.f12898j = null;
        this.f12899k = null;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        String strG;
        ed.d dVar = this.i;
        Class cls = this.f12898j;
        Object obj = this.f12899k;
        String strH = super.h();
        if (dVar != null) {
            String string = dVar.toString();
            strG = t.z.g(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strG = "";
        }
        if (cls == null || obj == null) {
            if (strH != null) {
                return strG.concat(strH);
            }
            return null;
        }
        int length = strG.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        l7.o.t(sb2, strG, "exceptionType=[", string2, "], fallback=[");
        return a0.u.o(sb2, string3, "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ed.d dVar = this.i;
        Class cls = this.f12898j;
        Object obj = this.f12899k;
        if (((obj == null) || ((dVar == 0) | (cls == null))) || (this.f8952b instanceof a71)) {
            return;
        }
        this.i = null;
        try {
            th = dVar instanceof d91 ? ((d91) dVar).b() : null;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(dVar.getClass());
                String strValueOf2 = String.valueOf(e3.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                l7.o.t(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objL = th == null ? vv.L(dVar) : null;
        if (th == null) {
            e(objL);
            return;
        }
        if (!cls.isInstance(th)) {
            n(dVar);
            return;
        }
        try {
            Object objU = u(obj, th);
            this.f12898j = null;
            this.f12899k = null;
            t(objU);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                f(th3);
            } finally {
                this.f12898j = null;
                this.f12899k = null;
            }
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Throwable th2);
}
