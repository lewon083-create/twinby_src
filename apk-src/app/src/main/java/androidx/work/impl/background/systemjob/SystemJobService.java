package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import bb.e;
import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;
import java.util.HashMap;
import l7.n;
import m7.b;
import m7.c;
import m7.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1780d = n.i("SystemJobService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f1781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1782c = new HashMap();

    @Override // m7.b
    public final void c(String str, boolean z5) {
        JobParameters jobParameters;
        n.g().e(f1780d, om1.x(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f1782c) {
            jobParameters = (JobParameters) this.f1782c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z5);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l lVarO = l.O(getApplicationContext());
            this.f1781b = lVarO;
            lVarO.f28735g.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            n.g().j(f1780d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f1781b;
        if (lVar != null) {
            lVar.f28735g.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f1781b == null) {
            n.g().e(f1780d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            n.g().f(f1780d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1782c) {
            try {
                if (this.f1782c.containsKey(string)) {
                    n.g().e(f1780d, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                n.g().e(f1780d, "onStartJob for " + string, new Throwable[0]);
                this.f1782c.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                e eVar = new e(15);
                if (jobParameters.getTriggeredContentUris() != null) {
                    eVar.f2020d = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    eVar.f2019c = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    eVar.f2021e = jobParameters.getNetwork();
                }
                this.f1781b.S(string, eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.f1781b == null) {
            n.g().e(f1780d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            n.g().f(f1780d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        n.g().e(f1780d, om1.k("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f1782c) {
            this.f1782c.remove(string);
        }
        this.f1781b.T(string);
        c cVar = this.f1781b.f28735g;
        synchronized (cVar.f28707l) {
            zContains = cVar.f28705j.contains(string);
        }
        return !zContains;
    }
}
