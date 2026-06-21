package ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f30350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j3 f30351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f30352g;

    public p3(z3 z3Var) {
        super(z3Var);
        this.f30350e = (AlarmManager) ((l1) this.f15951b).f30260b.getSystemService("alarm");
    }

    @Override // ob.u3
    public final void F() {
        AlarmManager alarmManager = this.f30350e;
        if (alarmManager != null) {
            Context context = ((l1) this.f15951b).f30260b;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.e0.f13711a));
        }
        I();
    }

    public final void G() {
        D();
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30418o.f("Unscheduling upload");
        AlarmManager alarmManager = this.f30350e;
        if (alarmManager != null) {
            Context context = l1Var.f30260b;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.e0.f13711a));
        }
        H().c();
        I();
    }

    public final o H() {
        if (this.f30351f == null) {
            this.f30351f = new j3(this, this.f30373c.f30615m, 1);
        }
        return this.f30351f;
    }

    public final void I() {
        JobScheduler jobScheduler = (JobScheduler) ((l1) this.f15951b).f30260b.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(J());
        }
    }

    public final int J() {
        if (this.f30352g == null) {
            this.f30352g = Integer.valueOf("measurement".concat(String.valueOf(((l1) this.f15951b).f30260b.getPackageName())).hashCode());
        }
        return this.f30352g.intValue();
    }
}
