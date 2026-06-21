package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w21 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi0 f11603b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yi0 yi0Var = this.f11603b;
        ((fa1) yi0Var.f12625e).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        yi0Var.i(new th0(16, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yi0 yi0Var = this.f11603b;
        ((fa1) yi0Var.f12625e).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        yi0Var.i(new kr0(11, this));
    }
}
