package pa;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f31417b;

    public /* synthetic */ o0(p0 p0Var) {
        this.f31417b = p0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            p0 p0Var = this.f31417b;
            synchronized (p0Var.f31422a) {
                try {
                    m0 m0Var = (m0) message.obj;
                    n0 n0Var = (n0) p0Var.f31422a.get(m0Var);
                    if (n0Var != null && n0Var.f31408b.isEmpty()) {
                        if (n0Var.f31410d) {
                            m0 m0Var2 = n0Var.f31412f;
                            p0 p0Var2 = n0Var.f31414h;
                            p0Var2.f31424c.removeMessages(1, m0Var2);
                            p0Var2.f31425d.c(p0Var2.f31423b, n0Var);
                            n0Var.f31410d = false;
                            n0Var.f31409c = 2;
                        }
                        p0Var.f31422a.remove(m0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        p0 p0Var3 = this.f31417b;
        synchronized (p0Var3.f31422a) {
            try {
                m0 m0Var3 = (m0) message.obj;
                n0 n0Var2 = (n0) p0Var3.f31422a.get(m0Var3);
                if (n0Var2 != null && n0Var2.f31409c == 3) {
                    String strValueOf = String.valueOf(m0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = n0Var2.f31413g;
                    if (componentName == null) {
                        componentName = m0Var3.f31401c;
                    }
                    if (componentName == null) {
                        String str = m0Var3.f31400b;
                        c0.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    n0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
