package p7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l7.c;
import l7.n;
import l7.o;
import m7.d;
import m7.l;
import t.z;
import u7.j;
import v7.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f31248f = n.i("SystemJobScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f31250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f31251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f31252e;

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f31249b = context;
        this.f31251d = lVar;
        this.f31250c = jobScheduler;
        this.f31252e = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th2) {
            n.g().f(f31248f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            n.g().f(f31248f, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // m7.d
    public final void a(j... jVarArr) {
        int iO;
        l lVar = this.f31251d;
        WorkDatabase workDatabase = lVar.f28732d;
        f fVar = new f(0, workDatabase);
        for (j jVar : jVarArr) {
            workDatabase.c();
            try {
                j jVarH = workDatabase.n().h(jVar.f34330a);
                String str = f31248f;
                if (jVarH == null) {
                    n.g().j(str, "Skipping scheduling " + jVar.f34330a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (jVarH.f34331b != 1) {
                    n.g().j(str, "Skipping scheduling " + jVar.f34330a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    u7.d dVarM = workDatabase.k().m(jVar.f34330a);
                    if (dVarM != null) {
                        iO = dVarM.f34318b;
                    } else {
                        lVar.f28731c.getClass();
                        iO = fVar.o(lVar.f28731c.f3572f);
                    }
                    if (dVarM == null) {
                        lVar.f28732d.k().p(new u7.d(jVar.f34330a, iO));
                    }
                    f(jVar, iO);
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // m7.d
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // m7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f31249b
            android.app.job.JobScheduler r1 = r8.f31250c
            java.util.ArrayList r0 = e(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L74
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L74
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            c(r1, r2)
            goto L55
        L69:
            m7.l r0 = r8.f31251d
            androidx.work.impl.WorkDatabase r0 = r0.f28732d
            u7.f r0 = r0.k()
            r0.t(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.b.d(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(j jVar, int i) {
        int i10;
        JobScheduler jobScheduler = this.f31250c;
        a aVar = this.f31252e;
        aVar.getClass();
        c cVar = jVar.f34338j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.f34330a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, aVar.f31247a).setRequiresCharging(cVar.f28012b).setRequiresDeviceIdle(cVar.f28013c).setExtras(persistableBundle);
        int i11 = cVar.f28011a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || i11 != 6) {
            int iM = z.m(i11);
            if (iM == 0) {
                i10 = 0;
            } else if (iM == 1) {
                i10 = 1;
            } else if (iM != 2) {
                i10 = 3;
                if (iM != 3) {
                    i10 = 4;
                    if (iM != 4 || i12 < 26) {
                        n.g().e(a.f31246b, "API version too low. Cannot convert network type value ".concat(o.y(i11)), new Throwable[0]);
                        i10 = 1;
                    }
                }
            } else {
                i10 = 2;
            }
            extras.setRequiredNetworkType(i10);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f28013c) {
            extras.setBackoffCriteria(jVar.f34341m, jVar.f34340l == 2 ? 0 : 1);
        }
        long jMax = Math.max(jVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!jVar.f34345q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f28018h.f28021a.size() > 0) {
            for (l7.d dVar : cVar.f28018h.f28021a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f28019a, dVar.f28020b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f28016f);
            extras.setTriggerContentMaxDelay(cVar.f28017g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f28014d);
            extras.setRequiresStorageNotLow(cVar.f28015e);
        }
        byte b2 = jVar.f34339k > 0;
        if (c2.b.b() && jVar.f34345q && b2 == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        n nVarG = n.g();
        String str = jVar.f34330a;
        String str2 = f31248f;
        nVarG.e(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                n.g().j(str2, "Unable to schedule work ID " + jVar.f34330a, new Throwable[0]);
                if (jVar.f34345q && jVar.f34346r == 1) {
                    jVar.f34345q = false;
                    n.g().e(str2, "Scheduling a non-expedited job (work ID " + jVar.f34330a + ")", new Throwable[0]);
                    f(jVar, i);
                }
            }
        } catch (IllegalStateException e3) {
            ArrayList arrayListE = e(this.f31249b, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            l lVar = this.f31251d;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(lVar.f28732d.n().d().size()), Integer.valueOf(lVar.f28731c.f3573g));
            n.g().f(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e3);
        } catch (Throwable th2) {
            n.g().f(str2, "Unable to schedule " + jVar, th2);
        }
    }
}
