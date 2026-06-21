package yads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cl1 implements ek1, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f37425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl1 f37426c;

    public cl1(dl1 dl1Var, fk1 fk1Var) {
        this.f37426c = dl1Var;
        Handler handlerA = lb3.a((Handler.Callback) this);
        this.f37425b = handlerA;
        fk1Var.a(this, handlerA);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i10 = message.arg2;
        int i11 = lb3.f40466a;
        long j10 = ((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i10));
        dl1 dl1Var = this.f37426c;
        if (this == dl1Var.f37814n1) {
            if (j10 == Long.MAX_VALUE) {
                dl1Var.f41590z0 = true;
            } else {
                try {
                    dl1Var.b(j10);
                    dl1Var.D();
                    dl1Var.B0.f41855e++;
                    dl1Var.V0 = true;
                    if (!dl1Var.T0) {
                        dl1Var.T0 = true;
                        dl1Var.I0.a(dl1Var.P0);
                        dl1Var.R0 = true;
                    }
                    dl1Var.a(j10);
                } catch (qn0 e3) {
                    this.f37426c.A0 = e3;
                }
            }
        }
        return true;
    }
}
