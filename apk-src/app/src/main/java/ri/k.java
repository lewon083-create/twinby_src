package ri;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends JobServiceEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.plugins.firebase.messaging.a f32355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobParameters f32357c;

    public k(io.flutter.plugins.firebase.messaging.a aVar) {
        super(aVar);
        this.f32356b = new Object();
        this.f32355a = aVar;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f32357c = jobParameters;
        this.f32355a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        ka.k kVar = this.f32355a.f25776d;
        if (kVar != null) {
            ((io.flutter.plugins.firebase.messaging.a) kVar.f27326e).c();
        }
        synchronized (this.f32356b) {
            this.f32357c = null;
        }
        return true;
    }
}
