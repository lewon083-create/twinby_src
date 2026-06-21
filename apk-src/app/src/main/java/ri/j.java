package ri;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobWorkItem f32353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f32354b;

    public j(k kVar, JobWorkItem jobWorkItem) {
        this.f32354b = kVar;
        this.f32353a = jobWorkItem;
    }

    @Override // ri.i
    public final void a() {
        synchronized (this.f32354b.f32356b) {
            JobParameters jobParameters = this.f32354b.f32357c;
            if (jobParameters != null) {
                try {
                    jobParameters.completeWork(this.f32353a);
                } catch (IllegalArgumentException e3) {
                    Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e3);
                } catch (SecurityException e7) {
                    Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e7);
                }
            }
        }
    }

    @Override // ri.i
    public final Intent getIntent() {
        return this.f32353a.getIntent();
    }
}
