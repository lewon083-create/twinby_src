package o7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import l7.n;
import m7.l;
import v7.k;
import v7.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m7.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f29805l = n.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.a f29807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f29808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.c f29809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f29810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f29811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f29812h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Intent f29813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SystemAlarmService f29814k;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f29806b = applicationContext;
        this.f29811g = new b(applicationContext);
        this.f29808d = new r();
        l lVarO = l.O(systemAlarmService);
        this.f29810f = lVarO;
        m7.c cVar = lVarO.f28735g;
        this.f29809e = cVar;
        this.f29807c = lVarO.f28733e;
        cVar.a(this);
        this.i = new ArrayList();
        this.f29813j = null;
        this.f29812h = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        n nVarG = n.g();
        String str = f29805l;
        nVarG.e(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.g().j(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.i) {
                try {
                    Iterator it = this.i.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.i) {
            try {
                boolean zIsEmpty = this.i.isEmpty();
                this.i.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f29812h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        String str2 = b.f29786e;
        Intent intent = new Intent(this.f29806b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z5);
        e(new ac.a(this, intent, 0, 3));
    }

    public final void d() {
        n.g().e(f29805l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f29809e.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f29808d.f34798a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f29814k = null;
    }

    public final void e(Runnable runnable) {
        this.f29812h.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = k.a(this.f29806b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f29810f.f28733e.b(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
