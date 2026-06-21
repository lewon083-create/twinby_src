package m7;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.ads.b30;
import com.twinby.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l7.n;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k3.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static l f28727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static l f28728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f28729m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30 f28731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f28732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x7.b f28733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f28734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f28735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.d f28736h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f28737j;

    static {
        n.i("WorkManagerImpl");
        f28727k = null;
        f28728l = null;
        f28729m = new Object();
    }

    public l(Context context, b30 b30Var, x7.b bVar) {
        l6.f fVar;
        Executor executor;
        String str;
        boolean z5 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        v7.i iVar = (v7.i) bVar.f35977b;
        int i = WorkDatabase.f1766k;
        byte b2 = 0;
        if (z5) {
            fVar = new l6.f(applicationContext, null);
            fVar.f27963g = true;
        } else {
            String str2 = k.f28725a;
            l6.f fVar2 = new l6.f(applicationContext, "androidx.work.workdb");
            fVar2.f27962f = new a4.b(applicationContext, b2);
            fVar = fVar2;
        }
        fVar.f27960d = iVar;
        g gVar = new g();
        if (fVar.f27959c == null) {
            fVar.f27959c = new ArrayList();
        }
        fVar.f27959c.add(gVar);
        fVar.a(j.f28718a);
        fVar.a(new i(applicationContext, 2, 3));
        fVar.a(j.f28719b);
        fVar.a(j.f28720c);
        fVar.a(new i(applicationContext, 5, 6));
        fVar.a(j.f28721d);
        fVar.a(j.f28722e);
        fVar.a(j.f28723f);
        fVar.a(new i(applicationContext));
        fVar.a(new i(applicationContext, 10, 11));
        fVar.a(j.f28724g);
        fVar.f27964h = false;
        fVar.i = true;
        Context context2 = fVar.f27958b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = fVar.f27960d;
        if (executor2 == null && fVar.f27961e == null) {
            com.yandex.div.core.dagger.b bVar2 = n.a.f28959c;
            fVar.f27961e = bVar2;
            fVar.f27960d = bVar2;
        } else if (executor2 != null && fVar.f27961e == null) {
            fVar.f27961e = executor2;
        } else if (executor2 == null && (executor = fVar.f27961e) != null) {
            fVar.f27960d = executor;
        }
        if (fVar.f27962f == null) {
            fVar.f27962f = new y(26);
        }
        String str3 = fVar.f27957a;
        q6.a aVar = fVar.f27962f;
        ge.c cVar = fVar.f27965j;
        ArrayList arrayList = fVar.f27959c;
        boolean z10 = fVar.f27963g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        char c8 = (activityManager == null || activityManager.isLowRamDevice()) ? (char) 2 : (char) 3;
        Executor executor3 = fVar.f27960d;
        Executor executor4 = fVar.f27961e;
        boolean z11 = fVar.f27964h;
        boolean z12 = fVar.i;
        l6.a aVar2 = new l6.a();
        aVar2.f27940c = aVar;
        aVar2.f27941d = context2;
        aVar2.f27942e = str3;
        aVar2.f27943f = cVar;
        aVar2.f27944g = executor3;
        aVar2.f27945h = executor4;
        aVar2.f27938a = z11;
        aVar2.f27939b = z12;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            l6.g gVar2 = (l6.g) Class.forName(str).newInstance();
            q6.b bVarE = gVar2.e(aVar2);
            gVar2.f27969c = bVarE;
            boolean z13 = c8 == 3;
            bVarE.setWriteAheadLoggingEnabled(z13);
            gVar2.f27973g = arrayList;
            gVar2.f27968b = executor3;
            new ArrayDeque();
            gVar2.f27971e = z10;
            gVar2.f27972f = z13;
            WorkDatabase workDatabase = (WorkDatabase) gVar2;
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(b30Var.f3571e, 0);
            synchronized (n.class) {
                n.f28050d = nVar;
            }
            String str5 = e.f28708a;
            p7.b bVar3 = new p7.b(applicationContext2, this);
            v7.g.a(applicationContext2, SystemJobService.class, true);
            n.g().e(e.f28708a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List listAsList = Arrays.asList(bVar3, new n7.b(applicationContext2, b30Var, bVar, this));
            c cVar2 = new c(context, b30Var, bVar, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f28730b = applicationContext3;
            this.f28731c = b30Var;
            this.f28733e = bVar;
            this.f28732d = workDatabase;
            this.f28734f = listAsList;
            this.f28735g = cVar2;
            this.f28736h = new m4.d(workDatabase);
            this.i = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f28733e.b(new v7.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static l O(Context context) {
        l lVar;
        Object obj = f28729m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    lVar = f28727k;
                    if (lVar == null) {
                        lVar = f28728l;
                    }
                }
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (lVar != null) {
            return lVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void P(Context context, b30 b30Var) {
        synchronized (f28729m) {
            try {
                l lVar = f28727k;
                if (lVar != null && f28728l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (lVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f28728l == null) {
                        ExecutorService executorService = (ExecutorService) b30Var.f3568b;
                        x7.b bVar = new x7.b();
                        bVar.f35978c = new Handler(Looper.getMainLooper());
                        bVar.f35979d = new j0.e(3, bVar);
                        bVar.f35977b = new v7.i(executorService);
                        f28728l = new l(applicationContext, b30Var, bVar);
                    }
                    f28727k = f28728l;
                }
            } finally {
            }
        }
    }

    public final void Q() {
        synchronized (f28729m) {
            try {
                this.i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f28737j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f28737j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void R() {
        ArrayList arrayListE;
        String str = p7.b.f31248f;
        Context context = this.f28730b;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = p7.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                p7.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f28732d;
        com.google.android.gms.internal.consent_sdk.c cVarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarN.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) cVarN.i;
        r6.f fVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            fVarA.f32265e.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(fVarA);
            e.a(this.f28731c, workDatabase, this.f28734f);
        } catch (Throwable th2) {
            workDatabase_Impl.f();
            eVar.c(fVarA);
            throw th2;
        }
    }

    public final void S(String str, bb.e eVar) {
        aa.y yVar = new aa.y(28);
        yVar.f721c = this;
        yVar.f722d = str;
        yVar.f723e = eVar;
        this.f28733e.b(yVar);
    }

    public final void T(String str) {
        this.f28733e.b(new v7.j(this, str, false));
    }
}
