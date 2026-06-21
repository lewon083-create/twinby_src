package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.x;
import java.util.HashMap;
import java.util.WeakHashMap;
import l7.n;
import o7.g;
import v7.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f1777e = n.i("SystemAlarmService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f1778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1779d;

    public final void a() {
        this.f1779d = true;
        n.g().e(f1777e, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f34778a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = k.f34779b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                n.g().j(k.f34778a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f1778c = gVar;
        if (gVar.f29814k != null) {
            n.g().f(g.f29805l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.f29814k = this;
        }
        this.f1779d = false;
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1779d = true;
        this.f1778c.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        if (this.f1779d) {
            n.g().h(f1777e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1778c.d();
            g gVar = new g(this);
            this.f1778c = gVar;
            if (gVar.f29814k != null) {
                n.g().f(g.f29805l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.f29814k = this;
            }
            this.f1779d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1778c.a(i10, intent);
        return 3;
    }
}
