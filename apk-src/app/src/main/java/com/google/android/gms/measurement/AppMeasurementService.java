package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import d3.a;
import k6.c;
import ni.i;
import ob.g3;
import ob.l1;
import ob.r1;
import ob.s0;
import ob.z3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements g3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f14421b;

    @Override // ob.g3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // ob.g3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f15556a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f15556a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ob.g3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final i d() {
        if (this.f14421b == null) {
            this.f14421b = new i(4, this);
        }
        return this.f14421b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i iVarD = d();
        iVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new r1(z3.C((Service) iVarD.f29407c));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        i iVarD = d();
        if (intent == null) {
            iVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) iVarD.f29407c;
        s0 s0Var = l1.r(service, null, null).f30265g;
        l1.k(s0Var);
        String action = intent.getAction();
        s0Var.f30418o.h(Integer.valueOf(i10), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        c cVar = new c(iVarD, i10, s0Var, intent);
        z3 z3VarC = z3.C(service);
        z3VarC.e().L(new k0.i(iVarD, z3VarC, cVar));
        return 2;
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
}
