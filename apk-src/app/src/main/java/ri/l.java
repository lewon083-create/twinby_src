package ri;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobInfo f32358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JobScheduler f32359e;

    public l(Context context, ComponentName componentName, int i) {
        super(componentName);
        b(i);
        this.f32358d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.f32359e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // ri.m
    public final void a(Intent intent) {
        this.f32359e.enqueue(this.f32358d, ma.e.f(intent));
    }
}
