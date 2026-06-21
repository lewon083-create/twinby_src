package androidx.work.impl.foreground;

import aa.y;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.x;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import l7.n;
import m7.l;
import t7.b;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1784g = n.i("SystemFgService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f1785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f1787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationManager f1788f;

    public final void a() {
        this.f1785c = new Handler(Looper.getMainLooper());
        this.f1788f = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f1787e = bVar;
        if (bVar.f33536j != null) {
            n.g().f(b.f33528k, "A callback already exists.", new Throwable[0]);
        } else {
            bVar.f33536j = this;
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1787e.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        boolean z5 = this.f1786d;
        String str = f1784g;
        if (z5) {
            n.g().h(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1787e.g();
            a();
            this.f1786d = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f1787e;
        l lVar = bVar.f33529b;
        String str2 = b.f33528k;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            n.g().h(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = lVar.f28732d;
            ((x7.b) bVar.f33530c).b(new y(27, bVar, workDatabase, stringExtra, false));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n.g().h(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            lVar.getClass();
            lVar.f28733e.b(new a(lVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.g().h(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = bVar.f33536j;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f1786d = true;
        n.g().e(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
