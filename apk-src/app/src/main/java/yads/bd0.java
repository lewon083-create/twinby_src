package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bd0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd0 f36995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(gd0 gd0Var, Looper looper) {
        super(looper);
        this.f36995a = gd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (zc0 zc0Var : this.f36995a.f38718m) {
            if (Arrays.equals(zc0Var.f45368u, bArr)) {
                if (message.what == 2 && zc0Var.f45353e == 0 && zc0Var.f45362o == 4) {
                    int i = lb3.f40466a;
                    zc0Var.a(false);
                    return;
                }
                return;
            }
        }
    }
}
