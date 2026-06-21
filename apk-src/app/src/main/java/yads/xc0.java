package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc0 f44639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f44639a = zc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.f44639a.a(obj, obj2);
            return;
        }
        zc0 zc0Var = this.f44639a;
        if (obj == zc0Var.f45371x) {
            if (zc0Var.f45362o == 2 || zc0Var.e()) {
                zc0Var.f45371x = null;
                if (obj2 instanceof Exception) {
                    ((ed0) zc0Var.f45351c).a((Exception) obj2, false);
                    return;
                }
                try {
                    zc0Var.f45350b.c((byte[]) obj2);
                    ed0 ed0Var = (ed0) zc0Var.f45351c;
                    ed0Var.f38072b = null;
                    r51 r51VarA = r51.a((Collection) ed0Var.f38071a);
                    ed0Var.f38071a.clear();
                    o51 o51VarListIterator = r51VarA.listIterator(0);
                    while (o51VarListIterator.hasNext()) {
                        zc0 zc0Var2 = (zc0) o51VarListIterator.next();
                        if (zc0Var2.f()) {
                            zc0Var2.a(true);
                        }
                    }
                } catch (Exception e3) {
                    ((ed0) zc0Var.f45351c).a(e3, true);
                }
            }
        }
    }
}
