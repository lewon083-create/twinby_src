package o4;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import j3.y0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f29623c;

    public h(i iVar, b4.m mVar) {
        this.f29623c = iVar;
        Handler handlerO = m3.z.o(this);
        this.f29622b = handlerO;
        mVar.B(this, handlerO);
    }

    public final void a(long j10) {
        Surface surface;
        i iVar = this.f29623c;
        v vVar = iVar.L0;
        if (this != iVar.f29633d2 || iVar.P == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            iVar.f1952w0 = true;
            return;
        }
        try {
            iVar.A0(j10);
            y0 y0Var = iVar.f29651q1;
            if (!y0Var.equals(y0.f26415d) && !y0Var.equals(iVar.f29652r1)) {
                iVar.f29652r1 = y0Var;
                vVar.b(y0Var);
            }
            iVar.f1956y0.f11457f++;
            r rVar = iVar.O0;
            boolean z5 = rVar.f29688e != 3;
            rVar.f29688e = 3;
            rVar.f29694l.getClass();
            rVar.f29690g = m3.z.M(SystemClock.elapsedRealtime());
            if (z5 && (surface = iVar.f29627a1) != null) {
                Handler handler = vVar.f29700a;
                if (handler != null) {
                    handler.post(new io.sentry.android.core.n(vVar, surface, SystemClock.elapsedRealtime(), 2));
                }
                iVar.f29632d1 = true;
            }
            iVar.f0(j10);
        } catch (s3.i e3) {
            iVar.f1954x0 = e3;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i10 = message.arg2;
        String str = m3.z.f28608a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i10)));
        return true;
    }
}
