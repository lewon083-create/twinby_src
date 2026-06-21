package m4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.measurement.h5;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f28660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f28662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f28663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f28665h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f28666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f28667k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i, long j10) {
        super(looper);
        this.f28667k = nVar;
        this.f28660c = kVar;
        this.f28662e = iVar;
        this.f28659b = i;
        this.f28661d = j10;
    }

    public final void a(boolean z5) {
        this.f28666j = z5;
        this.f28663f = null;
        if (hasMessages(1)) {
            this.i = true;
            removeMessages(1);
            if (!z5) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.i = true;
                    this.f28660c.d();
                    Thread thread = this.f28665h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z5) {
            this.f28667k.f28672c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f28662e;
            iVar.getClass();
            iVar.m(this.f28660c, jElapsedRealtime, jElapsedRealtime - this.f28661d, true);
            this.f28662e = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f28661d;
        i iVar = this.f28662e;
        iVar.getClass();
        iVar.o(this.f28660c, jElapsedRealtime, j10, this.f28664g);
        this.f28663f = null;
        n nVar = this.f28667k;
        n4.a aVar = nVar.f28671b;
        j jVar = nVar.f28672c;
        jVar.getClass();
        aVar.execute(jVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f28666j) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f28667k.f28672c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f28661d;
        i iVar = this.f28662e;
        iVar.getClass();
        if (this.i) {
            iVar.m(this.f28660c, jElapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                iVar.e(this.f28660c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e3) {
                m3.b.f("LoadTask", "Unexpected exception handling load completed", e3);
                this.f28667k.f28673d = new m(e3);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f28663f = iOException;
        int i11 = this.f28664g + 1;
        this.f28664g = i11;
        com.google.android.gms.internal.ads.o oVarI = iVar.i(this.f28660c, jElapsedRealtime, j10, iOException, i11);
        int i12 = oVarI.f8527a;
        if (i12 == 3) {
            this.f28667k.f28673d = this.f28663f;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f28664g = 1;
            }
            long jMin = oVarI.f8528b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f28664g - 1) * 1000, 5000);
            }
            n nVar = this.f28667k;
            h5.r(nVar.f28672c == null);
            nVar.f28672c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
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
                z5 = this.i;
                this.f28665h = Thread.currentThread();
            }
            if (!z5) {
                Trace.beginSection("load:".concat(this.f28660c.getClass().getSimpleName()));
                try {
                    this.f28660c.load();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f28665h = null;
                Thread.interrupted();
            }
            if (this.f28666j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            if (this.f28666j) {
                return;
            }
            obtainMessage(3, e3).sendToTarget();
        } catch (Exception e7) {
            if (this.f28666j) {
                return;
            }
            m3.b.f("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new m(e7)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f28666j) {
                return;
            }
            m3.b.f("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new m(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f28666j) {
                m3.b.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
