package pa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f31408b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31409c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f31411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f31412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComponentName f31413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p0 f31414h;

    public n0(p0 p0Var, m0 m0Var) {
        this.f31414h = p0Var;
        this.f31412f = m0Var;
    }

    public final ma.b a(String str, Executor executor) throws Throwable {
        p0 p0Var;
        ta.a aVar;
        Context context;
        m0 m0Var;
        try {
            Intent intentA = e0.a(this.f31414h.f31423b, this.f31412f);
            this.f31409c = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ua.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                p0Var = this.f31414h;
                aVar = p0Var.f31425d;
                context = p0Var.f31423b;
                m0Var = this.f31412f;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                this.f31410d = zD;
                if (zD) {
                    p0Var.f31424c.sendMessageDelayed(p0Var.f31424c.obtainMessage(1, m0Var), p0Var.f31427f);
                    ma.b bVar = ma.b.f28759g;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                this.f31409c = 2;
                try {
                    p0Var.f31425d.c(p0Var.f31423b, this);
                } catch (IllegalArgumentException unused) {
                }
                ma.b bVar2 = new ma.b(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th4;
            }
        } catch (d0 e3) {
            return e3.f31325b;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p0 p0Var = this.f31414h;
        synchronized (p0Var.f31422a) {
            try {
                p0Var.f31424c.removeMessages(1, this.f31412f);
                this.f31411e = iBinder;
                this.f31413g = componentName;
                Iterator it = this.f31408b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f31409c = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p0 p0Var = this.f31414h;
        synchronized (p0Var.f31422a) {
            try {
                p0Var.f31424c.removeMessages(1, this.f31412f);
                this.f31411e = null;
                this.f31413g = componentName;
                Iterator it = this.f31408b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f31409c = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
