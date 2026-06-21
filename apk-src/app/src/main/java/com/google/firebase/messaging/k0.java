package com.google.firebase.messaging;

import a0.d1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f14847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f14849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f14850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14851g;

    public k0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new d8.x("Firebase-FirebaseInstanceIdServiceConnection", 2));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14849e = new ArrayDeque();
        this.f14851g = false;
        Context applicationContext = context.getApplicationContext();
        this.f14846b = applicationContext;
        this.f14847c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f14848d = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f14849e.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                i0 i0Var = this.f14850f;
                if (i0Var == null || !i0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f14850f.a((j0) this.f14849e.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized sb.m b(Intent intent) {
        j0 j0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            j0Var = new j0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14848d;
            j0Var.f14844b.f32858a.b(scheduledThreadPoolExecutor, new a0.a0(7, scheduledThreadPoolExecutor.schedule(new d1(12, j0Var), 20L, TimeUnit.SECONDS)));
            this.f14849e.add(j0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return j0Var.f14844b.f32858a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f14851g);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f14851g) {
            return;
        }
        this.f14851g = true;
        try {
            if (ta.a.b().a(this.f14846b, this.f14847c, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e3);
        }
        this.f14851g = false;
        while (true) {
            ArrayDeque arrayDeque = this.f14849e;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((j0) arrayDeque.poll()).f14844b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f14851g = false;
            if (iBinder instanceof i0) {
                this.f14850f = (i0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f14849e;
            while (!arrayDeque.isEmpty()) {
                ((j0) arrayDeque.poll()).f14844b.d(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
