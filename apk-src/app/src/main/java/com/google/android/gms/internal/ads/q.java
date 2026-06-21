package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy1 f9244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public az1 f9245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f9246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f9248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f9250h;
    public final /* synthetic */ oq0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(oq0 oq0Var, Looper looper, wy1 wy1Var, az1 az1Var, long j10) {
        super(looper);
        Objects.requireNonNull(oq0Var);
        this.i = oq0Var;
        this.f9244b = wy1Var;
        this.f9245c = az1Var;
    }

    public final void a(boolean z5) {
        this.f9250h = z5;
        this.f9246d = null;
        if (hasMessages(1)) {
            this.f9249g = true;
            removeMessages(1);
            if (!z5) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f9249g = true;
                    this.f9244b.f11931g = true;
                    Thread thread = this.f9248f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z5) {
            this.i.f8763d = null;
            SystemClock.elapsedRealtime();
            az1 az1Var = this.f9245c;
            az1Var.getClass();
            az1Var.d(this.f9244b, true);
            this.f9245c = null;
        }
    }

    public final void b() {
        zx1 zx1Var;
        SystemClock.elapsedRealtime();
        az1 az1Var = this.f9245c;
        az1Var.getClass();
        int i = this.f9247e;
        wy1 wy1Var = this.f9244b;
        ql1 ql1Var = wy1Var.f11926b;
        if (i == 0) {
            Uri uri = wy1Var.f11933j.f4544a;
            Map map = Collections.EMPTY_MAP;
            zx1Var = new zx1();
        } else {
            Uri uri2 = ql1Var.f9550c;
            zx1Var = new zx1();
        }
        n90 n90Var = az1Var.f3499e;
        n90Var.q(new fc(n90Var, zx1Var, new ey1(-1, null, cq0.r(wy1Var.i), cq0.r(az1Var.B)), i));
        this.f9246d = null;
        oq0 oq0Var = this.i;
        q qVar = (q) oq0Var.f8763d;
        qVar.getClass();
        ((x) oq0Var.f8762c).execute(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        o oVar;
        o2 o2Var;
        if (this.f9250h) {
            return;
        }
        int i = message.what;
        int i10 = 1;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        oq0 oq0Var = this.i;
        oq0Var.f8763d = null;
        SystemClock.elapsedRealtime();
        az1 az1Var = this.f9245c;
        az1Var.getClass();
        if (this.f9249g) {
            az1Var.d(this.f9244b, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                az1Var.i(this.f9244b);
                return;
            } catch (RuntimeException e3) {
                rs.H("LoadTask", "Unexpected exception handling load completed", e3);
                this.i.f8764e = new t(e3);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f9246d = iOException;
        int i12 = this.f9247e;
        this.f9247e = i12 + 1;
        wy1 wy1Var = this.f9244b;
        Uri uri = wy1Var.f11926b.f9550c;
        zx1 zx1Var = new zx1();
        String str = cq0.f4293a;
        if ((iOException instanceof eb) || (iOException instanceof FileNotFoundException) || (iOException instanceof lg1) || (iOException instanceof t)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof t91) && ((t91) cause).f10564b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i12 * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            oVar = oq0.f8760h;
        } else {
            int iW = az1Var.w();
            int i13 = iW > az1Var.M ? 1 : 0;
            if (az1Var.I || !((o2Var = az1Var.A) == null || o2Var.h() == -9223372036854775807L)) {
                az1Var.M = iW;
            } else {
                boolean z5 = az1Var.f3516w;
                if (!z5 || az1Var.r()) {
                    az1Var.F = z5;
                    az1Var.J = 0L;
                    az1Var.M = 0;
                    for (fz1 fz1Var : az1Var.f3513t) {
                        fz1Var.k(false);
                    }
                    wy1Var.f11930f.f4793b = 0L;
                    wy1Var.i = 0L;
                    i10 = 1;
                    wy1Var.f11932h = true;
                    wy1Var.f11935l = false;
                } else {
                    az1Var.L = true;
                    oVar = oq0.f8759g;
                }
            }
            oVar = new o(i13, jMin, false);
        }
        int i14 = oVar.f8527a;
        int i15 = (i14 == 0 || i14 == i10) ? i10 : 0;
        n90 n90Var = az1Var.f3499e;
        n90Var.q(new yv0(n90Var, zx1Var, new ey1(-1, null, cq0.r(wy1Var.i), cq0.r(az1Var.B)), iOException, i15 ^ 1));
        int i16 = oVar.f8527a;
        if (i16 == 3) {
            oq0Var.f8764e = this.f9246d;
            return;
        }
        if (i16 != 2) {
            if (i16 == 1) {
                this.f9247e = 1;
            }
            long jMin2 = oVar.f8528b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f9247e - 1) * 1000, 5000);
            }
            oq0 oq0Var2 = this.i;
            ix.k0(((q) oq0Var2.f8763d) == null);
            oq0Var2.f8763d = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        try {
            synchronized (this) {
                z5 = this.f9249g;
                this.f9248f = Thread.currentThread();
            }
            if (!z5) {
                wy1 wy1Var = this.f9244b;
                String simpleName = wy1Var.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    wy1Var.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f9248f = null;
                Thread.interrupted();
            }
            if (this.f9250h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            if (this.f9250h) {
                return;
            }
            obtainMessage(3, e3).sendToTarget();
        } catch (Exception e7) {
            if (this.f9250h) {
                return;
            }
            rs.H("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new t(e7)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f9250h) {
                return;
            }
            rs.H("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new t(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f9250h) {
                rs.H("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
