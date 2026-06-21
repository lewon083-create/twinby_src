package o7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import l7.n;
import m7.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29785a = n.i("Alarms");

    public static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.g().e(f29785a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j10) {
        int iIntValue;
        WorkDatabase workDatabase = lVar.f28732d;
        u7.f fVarK = workDatabase.k();
        u7.d dVarM = fVarK.m(str);
        if (dVarM != null) {
            a(context, str, dVarM.f34318b);
            int i = dVarM.f34318b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        synchronized (v7.f.class) {
            workDatabase.c();
            try {
                Long lZ = workDatabase.j().z("next_alarm_manager_id");
                iIntValue = lZ != null ? lZ.intValue() : 0;
                workDatabase.j().C(new u7.c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        fVarK.p(new u7.d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
