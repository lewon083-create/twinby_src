package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc0 f43995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f43995b = zc0Var;
    }

    public final boolean a(Message message, jl1 jl1Var) {
        long jMin;
        wc0 wc0Var = (wc0) message.obj;
        if (!wc0Var.f44335b) {
            return false;
        }
        int i = wc0Var.f44337d + 1;
        wc0Var.f44337d = i;
        if (i > this.f43995b.f45357j.a(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable yc0Var = jl1Var.getCause() instanceof IOException ? (IOException) jl1Var.getCause() : new yc0(jl1Var.getCause());
        ae0 ae0Var = this.f43995b.f45357j;
        int i10 = wc0Var.f44337d;
        ae0Var.getClass();
        if ((yc0Var instanceof qb2) || (yc0Var instanceof FileNotFoundException) || (yc0Var instanceof q11) || (yc0Var instanceof gg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = q30.f42159c;
        while (yc0Var != null) {
            if ((yc0Var instanceof q30) && ((q30) yc0Var).f42160b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            yc0Var = yc0Var.getCause();
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f43994a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMin);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objA;
        wc0 wc0Var = (wc0) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                objA = this.f43995b.f45359l.a((on0) wc0Var.f44336c);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                zc0 zc0Var = this.f43995b;
                objA = zc0Var.f45359l.a(zc0Var.f45360m, (ln0) wc0Var.f44336c);
            }
        } catch (jl1 e3) {
            boolean zA = a(message, e3);
            objA = e3;
            if (zA) {
                return;
            }
        } catch (Exception e7) {
            kh1.d("DefaultDrmSession", kh1.a("Key/provisioning request produced an unexpected exception. Not retrying.", e7));
            objA = e7;
        }
        ae0 ae0Var = this.f43995b.f45357j;
        long j10 = wc0Var.f44334a;
        ae0Var.getClass();
        synchronized (this) {
            try {
                if (!this.f43994a) {
                    this.f43995b.f45361n.obtainMessage(message.what, Pair.create(wc0Var.f44336c, objA)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
