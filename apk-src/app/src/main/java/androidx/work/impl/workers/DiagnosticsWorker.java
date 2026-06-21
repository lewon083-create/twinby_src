package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.consent_sdk.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l7.m;
import l7.n;
import m7.l;
import pe.a;
import r3.b;
import t.z;
import u7.d;
import u7.f;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1795h = n.i("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(b bVar, b bVar2, f fVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d dVarM = fVar.m(jVar.f34330a);
            Integer numValueOf = dVarM != null ? Integer.valueOf(dVarM.f34318b) : null;
            String str2 = jVar.f34330a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bVar.f32188c;
            l6.j jVarD = l6.j.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                jVarD.i(1);
            } else {
                jVarD.j(1, str2);
            }
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(jVarD);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                jVarD.k();
                ArrayList arrayListA = bVar2.A(jVar.f34330a);
                String strJoin = TextUtils.join(StringUtils.COMMA, arrayList2);
                String strJoin2 = TextUtils.join(StringUtils.COMMA, arrayListA);
                String str3 = jVar.f34330a;
                String str4 = jVar.f34332c;
                switch (jVar.f34331b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sbJ = z.j("\n", str3, "\t ", str4, "\t ");
                a.r(numValueOf, "\t ", str, "\t ", sbJ);
                sb2.append(om1.n(sbJ, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th2) {
                cursorG.close();
                jVarD.k();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() throws Throwable {
        l6.j jVar;
        int iO;
        int iO2;
        int iO3;
        int iO4;
        int iO5;
        int iO6;
        int iO7;
        int iO8;
        int iO9;
        int iO10;
        int iO11;
        f fVar;
        b bVar;
        b bVar2;
        int i;
        WorkDatabase workDatabase = l.O(getApplicationContext()).f28732d;
        c cVarN = workDatabase.n();
        b bVarL = workDatabase.l();
        b bVarO = workDatabase.o();
        f fVarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        cVarN.getClass();
        l6.j jVarD = l6.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        jVarD.h(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarN.f13337a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            iO = k3.f.o(cursorG, "required_network_type");
            iO2 = k3.f.o(cursorG, "requires_charging");
            iO3 = k3.f.o(cursorG, "requires_device_idle");
            iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            iO8 = k3.f.o(cursorG, "content_uri_triggers");
            iO9 = k3.f.o(cursorG, "id");
            iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            iO11 = k3.f.o(cursorG, "worker_class_name");
            jVar = jVarD;
        } catch (Throwable th2) {
            th = th2;
            jVar = jVarD;
        }
        try {
            int iO12 = k3.f.o(cursorG, "input_merger_class_name");
            int iO13 = k3.f.o(cursorG, "input");
            int iO14 = k3.f.o(cursorG, "output");
            int iO15 = k3.f.o(cursorG, "initial_delay");
            int iO16 = k3.f.o(cursorG, "interval_duration");
            int iO17 = k3.f.o(cursorG, "flex_duration");
            int iO18 = k3.f.o(cursorG, "run_attempt_count");
            int iO19 = k3.f.o(cursorG, "backoff_policy");
            int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
            int iO21 = k3.f.o(cursorG, "period_start_time");
            int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
            int iO23 = k3.f.o(cursorG, "schedule_requested_at");
            int iO24 = k3.f.o(cursorG, "run_in_foreground");
            int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
            int i10 = iO14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iO9);
                int i11 = iO9;
                String string2 = cursorG.getString(iO11);
                int i12 = iO11;
                l7.c cVar = new l7.c();
                int i13 = iO;
                cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                cVar.f28012b = cursorG.getInt(iO2) != 0;
                cVar.f28013c = cursorG.getInt(iO3) != 0;
                cVar.f28014d = cursorG.getInt(iO4) != 0;
                cVar.f28015e = cursorG.getInt(iO5) != 0;
                int i14 = iO2;
                int i15 = iO3;
                cVar.f28016f = cursorG.getLong(iO6);
                cVar.f28017g = cursorG.getLong(iO7);
                cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                j jVar2 = new j(string, string2);
                jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                jVar2.f34333d = cursorG.getString(iO12);
                jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                int i16 = i10;
                jVar2.f34335f = l7.f.a(cursorG.getBlob(i16));
                int i17 = iO10;
                int i18 = iO15;
                jVar2.f34336g = cursorG.getLong(i18);
                int i19 = iO16;
                int i20 = iO12;
                jVar2.f34337h = cursorG.getLong(i19);
                int i21 = iO4;
                int i22 = iO17;
                jVar2.i = cursorG.getLong(i22);
                int i23 = iO18;
                jVar2.f34339k = cursorG.getInt(i23);
                int i24 = iO19;
                int i25 = iO13;
                jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(i24));
                int i26 = iO20;
                jVar2.f34341m = cursorG.getLong(i26);
                int i27 = iO21;
                jVar2.f34342n = cursorG.getLong(i27);
                int i28 = iO22;
                jVar2.f34343o = cursorG.getLong(i28);
                int i29 = iO23;
                jVar2.f34344p = cursorG.getLong(i29);
                int i30 = iO24;
                jVar2.f34345q = cursorG.getInt(i30) != 0;
                int i31 = iO25;
                jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(i31));
                jVar2.f34338j = cVar;
                arrayList.add(jVar2);
                iO18 = i23;
                iO12 = i20;
                iO16 = i19;
                iO21 = i27;
                iO4 = i21;
                i10 = i16;
                iO24 = i30;
                iO2 = i14;
                iO15 = i18;
                iO13 = i25;
                iO17 = i22;
                iO19 = i24;
                iO22 = i28;
                iO20 = i26;
                iO11 = i12;
                iO = i13;
                iO25 = i31;
                iO23 = i29;
                iO10 = i17;
                iO9 = i11;
                iO3 = i15;
            }
            cursorG.close();
            jVar.k();
            ArrayList arrayListC = cVarN.c();
            ArrayList arrayListA = cVarN.a();
            boolean zIsEmpty = arrayList.isEmpty();
            String str = f1795h;
            if (zIsEmpty) {
                fVar = fVarK;
                bVar = bVarL;
                bVar2 = bVarO;
                i = 0;
            } else {
                i = 0;
                n.g().h(str, "Recently completed work:\n\n", new Throwable[0]);
                fVar = fVarK;
                bVar = bVarL;
                bVar2 = bVarO;
                n.g().h(str, a(bVar, bVar2, fVar, arrayList), new Throwable[0]);
            }
            if (!arrayListC.isEmpty()) {
                n.g().h(str, "Running work:\n\n", new Throwable[i]);
                n.g().h(str, a(bVar, bVar2, fVar, arrayListC), new Throwable[i]);
            }
            if (!arrayListA.isEmpty()) {
                n.g().h(str, "Enqueued work:\n\n", new Throwable[i]);
                n.g().h(str, a(bVar, bVar2, fVar, arrayListA), new Throwable[i]);
            }
            return new l7.l(l7.f.f28023c);
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            jVar.k();
            throw th;
        }
    }
}
