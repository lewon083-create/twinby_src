package com.google.android.gms.measurement;

import aa.y;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.m1;
import java.util.Objects;
import l7.b;
import ni.i;
import ob.b3;
import ob.g3;
import ob.s0;
import ob.z3;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements g3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f14419b;

    @Override // ob.g3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // ob.g3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final i d() {
        if (this.f14419b == null) {
            this.f14419b = new i(4, this);
        }
        return this.f14419b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f29407c).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f29407c).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        i iVarD = d();
        Service service = (Service) iVarD.f29407c;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            c0.i(string);
            z3 z3VarC = z3.C(service);
            s0 s0VarB = z3VarC.b();
            b bVar = z3VarC.f30615m.f30262d;
            s0VarB.f30418o.g(string, "Local AppMeasurementJobService called. action");
            z3VarC.e().L(new k0.i(iVarD, z3VarC, new y(iVarD, s0VarB, jobParameters, 25)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        c0.i(string);
        m1 m1VarE = m1.e(service, null);
        b3 b3Var = new b3(1, iVarD, jobParameters, false);
        m1VarE.getClass();
        m1VarE.c(new a1(m1VarE, b3Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // ob.g3
    public final void b(Intent intent) {
    }
}
