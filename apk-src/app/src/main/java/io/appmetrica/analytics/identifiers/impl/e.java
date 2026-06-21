package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f21917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f21918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21919c = new Object();

    public e(Intent intent, String str) {
        this.f21917a = intent;
    }

    public final void a(Context context) {
        synchronized (this.f21919c) {
            this.f21918b = null;
            this.f21919c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f21919c) {
            this.f21918b = null;
            this.f21919c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f21919c) {
            this.f21919c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f21919c) {
            this.f21918b = iBinder;
            this.f21919c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f21919c) {
            this.f21918b = null;
            this.f21919c.notifyAll();
        }
    }
}
