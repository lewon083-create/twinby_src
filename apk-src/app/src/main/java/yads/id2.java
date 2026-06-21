package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class id2 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sl0 f39502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f39503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f39504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f39505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jd2 f39506f;

    public id2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final jd2 a(int i) {
        boolean z5;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f39503c = handler;
        this.f39502b = new sl0(handler);
        synchronized (this) {
            z5 = false;
            this.f39503c.obtainMessage(1, i, 0).sendToTarget();
            while (this.f39506f == null && this.f39505e == null && this.f39504d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f39505e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f39504d;
        if (error != null) {
            throw error;
        }
        jd2 jd2Var = this.f39506f;
        jd2Var.getClass();
        return jd2Var;
    }

    public final void b(int i) {
        this.f39502b.getClass();
        this.f39502b.a(i);
        this.f39506f = new jd2(this, this.f39502b.a(), i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    this.f39502b.getClass();
                    this.f39502b.b();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    kh1.b("PlaceholderSurface", kh1.a("Failed to initialize placeholder surface", e3));
                    this.f39505e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e7) {
                kh1.b("PlaceholderSurface", kh1.a("Failed to initialize placeholder surface", e7));
                this.f39504d = e7;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
