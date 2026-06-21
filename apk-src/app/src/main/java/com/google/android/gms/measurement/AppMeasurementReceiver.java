package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import d3.a;
import ob.l1;
import ob.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m7.a f14420c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f14420c == null) {
            this.f14420c = new m7.a(8, this);
        }
        m7.a aVar = this.f14420c;
        aVar.getClass();
        s0 s0Var = l1.r(context, null, null).f30265g;
        l1.k(s0Var);
        if (intent == null) {
            s0Var.f30413j.f("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        s0Var.f30418o.g(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                s0Var.f30413j.f("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        s0Var.f30418o.f("Starting wakeful intent.");
        ((AppMeasurementReceiver) aVar.f28696c).getClass();
        SparseArray sparseArray = a.f15556a;
        synchronized (sparseArray) {
            try {
                int i = a.f15557b;
                int i10 = i + 1;
                a.f15557b = i10;
                if (i10 <= 0) {
                    a.f15557b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
