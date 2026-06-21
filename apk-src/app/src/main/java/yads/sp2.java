package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qp2 f43039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final op2 f43040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f43041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rp2 f43043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f43044g;

    public sp2(Context context, qp2 qp2Var) {
        op2 op2Var = nj0.f41259h;
        this.f43038a = context.getApplicationContext();
        this.f43039b = qp2Var;
        this.f43040c = op2Var;
        this.f43041d = lb3.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f43044g = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.f43044g.post(new t.a0(28, this));
    }

    public final /* synthetic */ void b() {
        int iA = this.f43040c.a(this.f43038a);
        if (this.f43042e != iA) {
            this.f43042e = iA;
            this.f43041d.post(new a1.q(this, iA, 11));
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.f43040c.f41677b & 1) != 0) {
            if (lb3.f40466a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f43038a.getSystemService("connectivity");
                connectivityManager.getClass();
                rp2 rp2Var = new rp2(this);
                this.f43043f = rp2Var;
                connectivityManager.registerDefaultNetworkCallback(rp2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.f43040c.f41677b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.f43040c.f41677b & 4) != 0) {
            if (lb3.f40466a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.f43040c.f41677b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f43038a.registerReceiver(new pp2(this), intentFilter, null, this.f43041d);
        return this.f43042e;
    }

    public final void a(int i) {
        ((nj0) ((yi.f0) this.f43039b).f45657c).a(this, i);
    }
}
