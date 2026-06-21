package v7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.gms.internal.ads.b30;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34761e = l7.n.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f34762f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f34763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.l f34764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34765d = 0;

    public e(Context context, m7.l lVar) {
        this.f34763b = context.getApplicationContext();
        this.f34764c = lVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = c2.b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f34762f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.e.a():void");
    }

    public final boolean b() {
        b30 b30Var = this.f34764c.f28731c;
        b30Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f34761e;
        if (zIsEmpty) {
            l7.n.g().e(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f34763b, b30Var);
        l7.n.g().e(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f34761e;
        m7.l lVar = this.f34764c;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                m7.k.a(this.f34763b);
                l7.n.g().e(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e3) {
                    int i = this.f34765d + 1;
                    this.f34765d = i;
                    if (i >= 3) {
                        l7.n.g().f(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                        lVar.f28731c.getClass();
                        throw illegalStateException;
                    }
                    long j10 = ((long) i) * 300;
                    l7.n.g().e(str, "Retrying after " + j10, e3);
                    try {
                        Thread.sleep(((long) this.f34765d) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            lVar.Q();
        }
    }
}
