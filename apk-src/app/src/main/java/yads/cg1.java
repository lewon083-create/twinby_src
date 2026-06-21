package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cg1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dg1 f37383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ag1 f37385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f37386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f37388h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f37389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hg1 f37390k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(hg1 hg1Var, Looper looper, dg1 dg1Var, ag1 ag1Var, int i, long j10) {
        super(looper);
        this.f37390k = hg1Var;
        this.f37383c = dg1Var;
        this.f37385e = ag1Var;
        this.f37382b = i;
        this.f37384d = j10;
    }

    public final void a(boolean z5) {
        this.f37389j = z5;
        this.f37386f = null;
        if (hasMessages(0)) {
            this.i = true;
            removeMessages(0);
            if (!z5) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.i = true;
                    this.f37383c.b();
                    Thread thread = this.f37388h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z5) {
            this.f37390k.f39174b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ag1 ag1Var = this.f37385e;
            ag1Var.getClass();
            ag1Var.a(this.f37383c, jElapsedRealtime, jElapsedRealtime - this.f37384d, true);
            this.f37385e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f37389j) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f37386f = null;
            hg1 hg1Var = this.f37390k;
            ExecutorService executorService = hg1Var.f39173a;
            cg1 cg1Var = hg1Var.f39174b;
            cg1Var.getClass();
            executorService.execute(cg1Var);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.f37390k.f39174b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f37384d;
        ag1 ag1Var = this.f37385e;
        ag1Var.getClass();
        if (this.i) {
            ag1Var.a(this.f37383c, jElapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            try {
                ag1Var.a(this.f37383c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e3) {
                kh1.b("LoadTask", kh1.a("Unexpected exception handling load completed", e3));
                this.f37390k.f39175c = new gg1(e3);
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f37386f = iOException;
        int i11 = this.f37387g + 1;
        this.f37387g = i11;
        bg1 bg1VarA = ag1Var.a(this.f37383c, jElapsedRealtime, j10, iOException, i11);
        int i12 = bg1VarA.f37011a;
        if (i12 == 3) {
            this.f37390k.f39175c = this.f37386f;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f37387g = 1;
            }
            long jMin = bg1VarA.f37012b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f37387g - 1) * 1000, 5000);
            }
            hg1 hg1Var2 = this.f37390k;
            if (hg1Var2.f39174b != null) {
                throw new IllegalStateException();
            }
            hg1Var2.f39174b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f37386f = null;
                hg1Var2.f39173a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        try {
            synchronized (this) {
                z5 = this.i;
                this.f37388h = Thread.currentThread();
            }
            if (!z5) {
                g73.a("load:".concat(this.f37383c.getClass().getSimpleName()));
                try {
                    this.f37383c.a();
                    g73.a();
                } catch (Throwable th2) {
                    g73.a();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f37388h = null;
                Thread.interrupted();
            }
            if (this.f37389j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e3) {
            if (this.f37389j) {
                return;
            }
            obtainMessage(2, e3).sendToTarget();
        } catch (Exception e7) {
            if (this.f37389j) {
                return;
            }
            kh1.b("LoadTask", kh1.a("Unexpected exception loading stream", e7));
            obtainMessage(2, new gg1(e7)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f37389j) {
                return;
            }
            kh1.b("LoadTask", kh1.a("OutOfMemory error loading stream", e10));
            obtainMessage(2, new gg1(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f37389j) {
                kh1.b("LoadTask", kh1.a("Unexpected error loading stream", e11));
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
