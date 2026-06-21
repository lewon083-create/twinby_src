package la;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28083c;

    public /* synthetic */ j(int i, Object obj) {
        this.f28082b = i;
        this.f28083c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f28082b) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                k kVar = (k) this.f28083c;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f28088f.get(i);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        kVar.f28088f.remove(i);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new c7.k("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f28094e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new c7.k("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                t0 t0Var = (t0) this.f28083c;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (t0Var.f27180c) {
                    throw null;
                }
        }
    }
}
