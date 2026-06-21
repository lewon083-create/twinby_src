package o7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l7.n;
import l7.o;
import m7.l;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m7.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29786e = n.i("CommandHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f29788c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29789d = new Object();

    public b(Context context) {
        this.f29787b = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        synchronized (this.f29789d) {
            try {
                m7.b bVar = (m7.b) this.f29788c.remove(str);
                if (bVar != null) {
                    bVar.c(str, z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Intent intent, int i, g gVar) {
        boolean z5;
        String action = intent.getAction();
        int i10 = 3;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            n.g().e(f29786e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f29787b;
            d dVar = new d(context, i, gVar);
            q7.c cVar = dVar.f29793b;
            ArrayList<j> arrayListD = gVar.f29810f.f28732d.n().d();
            String str = c.f29790a;
            Iterator it = arrayListD.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                l7.c cVar2 = ((j) it.next()).f34338j;
                z10 |= cVar2.f28014d;
                z11 |= cVar2.f28012b;
                z12 |= cVar2.f28015e;
                z13 |= cVar2.f28011a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1775a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            cVar.b(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (j jVar : arrayListD) {
                String str3 = jVar.f34330a;
                if (jCurrentTimeMillis >= jVar.a() && (!jVar.b() || cVar.a(str3))) {
                    arrayList.add(jVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((j) it2.next()).f34330a;
                Intent intentA = a(context, str4);
                n.g().e(d.f29791c, pe.a.f("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new ac.a(gVar, intentA, dVar.f29792a, i10));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n.g().e(f29786e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            gVar.f29810f.R();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n.g().f(f29786e, pe.a.f("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f29787b;
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n nVarG = n.g();
            String str5 = f29786e;
            nVarG.e(str5, om1.k("Handling schedule work for ", string), new Throwable[0]);
            l lVar = gVar.f29810f;
            WorkDatabase workDatabase = lVar.f28732d;
            workDatabase.c();
            try {
                j jVarH = workDatabase.n().h(string);
                if (jVarH == null) {
                    n.g().j(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    return;
                }
                if (o.a(jVarH.f34331b)) {
                    n.g().j(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    return;
                }
                long jA = jVarH.a();
                if (jVarH.b()) {
                    n.g().e(str5, "Opportunistically setting an alarm for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, lVar, string, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new ac.a(gVar, intent3, i, 3));
                } else {
                    n.g().e(str5, "Setting up Alarms for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, lVar, string, jA);
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f29789d) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    n nVarG2 = n.g();
                    String str6 = f29786e;
                    nVarG2.e(str6, "Handing delay met for " + string2, new Throwable[0]);
                    if (this.f29788c.containsKey(string2)) {
                        n.g().e(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    } else {
                        e eVar = new e(this.f29787b, i, string2, gVar);
                        this.f29788c.put(string2, eVar);
                        eVar.b();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                n.g().j(f29786e, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            n.g().e(f29786e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c(string3, z14);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        n.g().e(f29786e, om1.k("Handing stopWork work for ", string4), new Throwable[0]);
        gVar.f29810f.T(string4);
        Context context3 = this.f29787b;
        l lVar2 = gVar.f29810f;
        String str7 = a.f29785a;
        u7.f fVarK = lVar2.f28732d.k();
        u7.d dVarM = fVarK.m(string4);
        if (dVarM != null) {
            a.a(context3, string4, dVarM.f34318b);
            z5 = false;
            n.g().e(a.f29785a, pe.a.f("Removing SystemIdInfo for workSpecId (", string4, ")"), new Throwable[0]);
            fVarK.t(string4);
        } else {
            z5 = false;
        }
        gVar.c(string4, z5);
    }
}
