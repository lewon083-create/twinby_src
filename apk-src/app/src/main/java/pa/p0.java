package pa;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.kw0;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f31420g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static p0 f31421h;
    public static HandlerThread i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f31422a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile kw0 f31424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.a f31425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31427f;

    public p0(Context context, Looper looper) {
        o0 o0Var = new o0(this);
        this.f31423b = context.getApplicationContext();
        kw0 kw0Var = new kw0(looper, o0Var, 4);
        Looper.getMainLooper();
        this.f31424c = kw0Var;
        this.f31425d = ta.a.b();
        this.f31426e = 5000L;
        this.f31427f = 300000L;
    }

    public static p0 a(Context context) {
        synchronized (f31420g) {
            try {
                if (f31421h == null) {
                    f31421h = new p0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f31421h;
    }

    public final ma.b b(m0 m0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ma.b bVarA;
        HashMap map = this.f31422a;
        synchronized (map) {
            try {
                n0 n0Var = (n0) map.get(m0Var);
                if (executor == null) {
                    executor = null;
                }
                if (n0Var == null) {
                    n0Var = new n0(this, m0Var);
                    n0Var.f31408b.put(serviceConnection, serviceConnection);
                    bVarA = n0Var.a(str, executor);
                    map.put(m0Var, n0Var);
                } else {
                    this.f31424c.removeMessages(0, m0Var);
                    if (n0Var.f31408b.containsKey(serviceConnection)) {
                        String string = m0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    n0Var.f31408b.put(serviceConnection, serviceConnection);
                    int i10 = n0Var.f31409c;
                    if (i10 == 1) {
                        serviceConnection.onServiceConnected(n0Var.f31413g, n0Var.f31411e);
                    } else if (i10 == 2) {
                        bVarA = n0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (n0Var.f31410d) {
                    return ma.b.f28759g;
                }
                if (bVarA == null) {
                    bVarA = new ma.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(m0 m0Var, ServiceConnection serviceConnection) {
        c0.j(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f31422a;
        synchronized (map) {
            try {
                n0 n0Var = (n0) map.get(m0Var);
                if (n0Var == null) {
                    String string = m0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!n0Var.f31408b.containsKey(serviceConnection)) {
                    String string2 = m0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                n0Var.f31408b.remove(serviceConnection);
                if (n0Var.f31408b.isEmpty()) {
                    this.f31424c.sendMessageDelayed(this.f31424c.obtainMessage(0, m0Var), this.f31426e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
