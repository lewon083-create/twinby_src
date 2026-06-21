package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r82 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static r82 f42513e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f42514a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f42515b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42516c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42517d = 0;

    public r82(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new q82(this), intentFilter);
    }

    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return lb3.f40466a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final int a() {
        int i;
        synchronized (this.f42516c) {
            i = this.f42517d;
        }
        return i;
    }

    public final /* synthetic */ void a(p82 p82Var) {
        ((zl.g) p82Var).a(a());
    }

    public final void a(int i) {
        synchronized (this.f42516c) {
            try {
                if (this.f42517d == i) {
                    return;
                }
                this.f42517d = i;
                for (WeakReference weakReference : this.f42515b) {
                    p82 p82Var = (p82) weakReference.get();
                    if (p82Var != null) {
                        ((zl.g) p82Var).a(i);
                    } else {
                        this.f42515b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(p82 p82Var) {
        for (WeakReference weakReference : this.f42515b) {
            if (weakReference.get() == null) {
                this.f42515b.remove(weakReference);
            }
        }
        this.f42515b.add(new WeakReference(p82Var));
        this.f42514a.post(new zl.n(4, this, p82Var));
    }

    public static synchronized r82 a(Context context) {
        try {
            if (f42513e == null) {
                f42513e = new r82(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42513e;
    }
}
