package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk0 f12917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12918c;

    public /* synthetic */ z9(g gVar, gk0 gk0Var) {
        Objects.requireNonNull(gVar);
        this.f12918c = gVar;
        this.f12917b = gk0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yg wgVar;
        rs.f("Install Referrer service connected.");
        int i = xg.f12146b;
        if (iBinder == null) {
            wgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            wgVar = iInterfaceQueryLocalInterface instanceof yg ? (yg) iInterfaceQueryLocalInterface : new wg(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
        }
        g gVar = this.f12918c;
        gVar.f5555e = wgVar;
        gVar.f5552b = 2;
        this.f12917b.e(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rs.m("Install Referrer service disconnected.");
        g gVar = this.f12918c;
        gVar.f5555e = null;
        gVar.f5552b = 0;
    }
}
