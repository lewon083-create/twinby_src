package la;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.kw0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28084b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Messenger f28085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l6.i f28086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f28087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f28088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f28089g;

    public k(m mVar) {
        this.f28089g = mVar;
        kw0 kw0Var = new kw0(Looper.getMainLooper(), new j(0, this), 3);
        Looper.getMainLooper();
        this.f28085c = new Messenger(kw0Var);
        this.f28087e = new ArrayDeque();
        this.f28088f = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f28084b;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f28084b = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f28084b = 4;
            ta.a.b().c((Context) this.f28089g.f28099d, this);
            c7.k kVar = new c7.k(str, securityException);
            Iterator it = this.f28087e.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(kVar);
            }
            this.f28087e.clear();
            for (int i10 = 0; i10 < this.f28088f.size(); i10++) {
                ((l) this.f28088f.valueAt(i10)).b(kVar);
            }
            this.f28088f.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f28084b == 2 && this.f28087e.isEmpty() && this.f28088f.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f28084b = 3;
                ta.a.b().c((Context) this.f28089g.f28099d, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(l lVar) {
        int i = this.f28084b;
        if (i != 0) {
            if (i == 1) {
                this.f28087e.add(lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f28087e.add(lVar);
            ((ScheduledExecutorService) this.f28089g.f28100e).execute(new i(this, 0));
            return true;
        }
        this.f28087e.add(lVar);
        c0.l(this.f28084b == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f28084b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ta.a.b().a((Context) this.f28089g.f28099d, intent, this, 1)) {
                ((ScheduledExecutorService) this.f28089g.f28100e).schedule(new i(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e3) {
            b("Unable to bind to service", e3);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f28089g.f28100e).execute(new k0.i(14, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f28089g.f28100e).execute(new i(this, 2));
    }
}
