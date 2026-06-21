package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.gms.internal.consent_sdk.c;
import e1.r;
import e1.y;
import i9.a;
import java.util.concurrent.Executor;
import x7.b;
import y8.j;
import y8.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2525b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        b bVarA = j.a();
        bVarA.d(string);
        bVarA.f35979d = a.b(i);
        if (string2 != null) {
            bVarA.f35978c = Base64.decode(string2, 0);
        }
        c cVar = q.a().f36572d;
        ((Executor) cVar.f13341e).execute(new r(cVar, bVarA.a(), i10, new y(6, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
