package ob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JobScheduler f30329d;

    @Override // ob.f0
    public final boolean F() {
        return true;
    }

    public final void G(long j10) {
        l1 l1Var = (l1) this.f15951b;
        D();
        C();
        JobScheduler jobScheduler = this.f30329d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(l1Var.f30260b.getPackageName())).hashCode()) != null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30418o.f("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iH = H();
        if (iH != 2) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30418o.g(om1.D(iH), "[sgtm] Not eligible for Scion upload");
            return;
        }
        s0 s0Var3 = l1Var.f30265g;
        l1.k(s0Var3);
        s0Var3.f30418o.g(Long.valueOf(j10), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(l1Var.f30260b.getPackageName())).hashCode(), new ComponentName(l1Var.f30260b, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f30329d;
        pa.c0.i(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        s0 s0Var4 = l1Var.f30265g;
        l1.k(s0Var4);
        s0Var4.f30418o.g(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int H() {
        l1 l1Var = (l1) this.f15951b;
        D();
        C();
        if (this.f30329d == null) {
            return 7;
        }
        Boolean boolO = l1Var.f30263e.O("google_analytics_sgtm_upload_enabled");
        if (!(boolO == null ? false : boolO.booleanValue())) {
            return 8;
        }
        if (l1Var.q().f30252k < 119000) {
            return 6;
        }
        if (e4.V(l1Var.f30260b)) {
            return !l1Var.n().J() ? 5 : 2;
        }
        return 3;
    }
}
